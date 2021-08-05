package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 直播推流控件配置选项
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
trait PlusVideoLivePusherStyles extends StObject {
  
  /**
    * 宽高比
    * 可取值：3:4, 9:16。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  /**
    * 自动聚集
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `auto-focus`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否美颜
    * 可取值0、1，其中0表示不使用美颜，1表示不使用美颜。
    *     默认值为0(不使用美颜)。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var beauty: js.UndefOr[Double] = js.undefined
  
  /**
    * 开启摄像头
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-camera`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * LivePusher控件的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * LivePusher控件左上角的水平偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度；
    *         自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var left: js.UndefOr[String] = js.undefined
  
  /**
    * 推流视频模式
    * 可取值：SD（标清）, HD（高清）, FHD（超清）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * 是否静音
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * LivePusher控件在Webview窗口的布局模式
    * 可取值：
    *         "static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    *         "absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    *     默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * LivePusher控件左上角的垂直偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度；
    *         自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[String] = js.undefined
  
  /**
    * 推流地址
    * 支持RTMP协议。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * 是否美白
    * 可取值0、1、2、3、4、5，其中0表示不使用美白，其余值分别表示美白的程度，值越大美白程度越大。
    *     默认值为0（不使用美白）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var whiteness: js.UndefOr[Double] = js.undefined
  
  /**
    * LivePusher控件的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[String] = js.undefined
}
object PlusVideoLivePusherStyles {
  
  inline def apply(): PlusVideoLivePusherStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoLivePusherStyles]
  }
  
  extension [Self <: PlusVideoLivePusherStyles](x: Self) {
    
    inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def `setAuto-focus`(value: Boolean): Self = StObject.set(x, "auto-focus", value.asInstanceOf[js.Any])
    
    inline def `setAuto-focusUndefined`: Self = StObject.set(x, "auto-focus", js.undefined)
    
    inline def setBeauty(value: Double): Self = StObject.set(x, "beauty", value.asInstanceOf[js.Any])
    
    inline def setBeautyUndefined: Self = StObject.set(x, "beauty", js.undefined)
    
    inline def `setEnable-camera`(value: Boolean): Self = StObject.set(x, "enable-camera", value.asInstanceOf[js.Any])
    
    inline def `setEnable-cameraUndefined`: Self = StObject.set(x, "enable-camera", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWhiteness(value: Double): Self = StObject.set(x, "whiteness", value.asInstanceOf[js.Any])
    
    inline def setWhitenessUndefined: Self = StObject.set(x, "whiteness", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
