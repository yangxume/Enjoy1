package com.enjoy1.bitmap_cache;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);

        int memoryClass = am.getMemoryClass();
        int largeMemoryClass = am.getLargeMemoryClass();
        Log.e("xuyang", "onCreate memoryClass: "+memoryClass );
        Log.e("xuyang", "onCreate largeMemoryClass : "+largeMemoryClass );

        Bitmap bitmapWorld = BitmapFactory.decodeResource(getResources(), R.mipmap.world);
        int memory = bitmapWorld.getByteCount();

        Log.e("xuyang", "***dpi worldBitmap memory : "+memory/1024/1024 );

//        mipmap-hdpi worldBitmap memory : 98
//        mipmap-xhdpi worldBitmap memory : 55
//        mipmap-xxhdpi worldBitmap memory : 24
//        mipmap-xxxhdpi worldBitmap memory : 13

//        DateUtil.longToDateYMDHM(item.end_time)

        Date date = new Date(0); // 根据long类型的毫秒数生命一个date类型的时间
        Log.e("xuyang", "onCreate date: "+date);

        String format = new SimpleDateFormat("yyyy-MM-dd  HH:mm").format(date);

        Log.e("xuyang", "onCreate: "+format);
    }
}
