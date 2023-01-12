package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一组用于定义页面或控件显示动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewAnimationTypeShow extends StObject {
  
  /**
    * 自动选择动画效果
    * 自动选择动画效果，使用上次显示窗口设置的动画效果，如果是第一次显示则默认动画效果“none”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var auto: js.UndefOr[String] = js.undefined
  
  /**
    * 从透明到不透明逐渐显示效果
    * 页面从完全透明到不透明逐渐显示。
    *     对应关闭动画"fade-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-in`: js.UndefOr[String] = js.undefined
  
  /**
    * 无动画效果
    * 立即显示页面，无任何动画效果，页面显示默认的动画效果。
    *     此效果忽略动画时间参数，立即显示。
    *     对应关闭动画"none"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.undefined
  
  /**
    * 从右侧平移入栈动画效果
    * 页面从屏幕右侧滑入显示，同时上一个页面带阴影效果从屏幕左侧滑出隐藏。
    *     对应关闭动画"pop-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-in`: js.UndefOr[String] = js.undefined
  
  /**
    * 从下侧竖向滑动效果
    * 页面从屏幕下侧向上竖向滑动显示。
    *     对应关闭动画"slide-out-bottom"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-bottom`: js.UndefOr[String] = js.undefined
  
  /**
    * 从左侧横向滑动效果
    * 页面从屏幕左侧向右横向滑动显示。
    *     对应关闭动画"slide-out-left"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-left`: js.UndefOr[String] = js.undefined
  
  /**
    * 从右侧横向滑动效果
    * 页面从屏幕右侧外向内横向滑动显示。
    *     对应关闭动画"slide-out-right"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-right`: js.UndefOr[String] = js.undefined
  
  /**
    * 从上侧竖向滑动效果
    * 页面从屏幕上侧向下竖向滑动显示。
    *     对应关闭动画"slide-out-top"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-top`: js.UndefOr[String] = js.undefined
  
  /**
    * 从小到大逐渐放大并且从透明到不透明逐渐显示效果
    * 页面在屏幕中间从小到大逐渐放大并且从透明到不透明逐渐显示。
    *     对应关闭动画"zoom-fade-in"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-out`: js.UndefOr[String] = js.undefined
  
  /**
    * 从小到大逐渐放大显示效果
    * 页面在屏幕中间从小到大逐渐放大显示。
    *     对应关闭动画"zoom-in"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-out`: js.UndefOr[String] = js.undefined
}
object PlusWebviewAnimationTypeShow {
  
  inline def apply(): PlusWebviewAnimationTypeShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewAnimationTypeShow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusWebviewAnimationTypeShow] (val x: Self) extends AnyVal {
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    inline def `setFade-in`(value: String): Self = StObject.set(x, "fade-in", value.asInstanceOf[js.Any])
    
    inline def `setFade-inUndefined`: Self = StObject.set(x, "fade-in", js.undefined)
    
    inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def `setPop-in`(value: String): Self = StObject.set(x, "pop-in", value.asInstanceOf[js.Any])
    
    inline def `setPop-inUndefined`: Self = StObject.set(x, "pop-in", js.undefined)
    
    inline def `setSlide-in-bottom`(value: String): Self = StObject.set(x, "slide-in-bottom", value.asInstanceOf[js.Any])
    
    inline def `setSlide-in-bottomUndefined`: Self = StObject.set(x, "slide-in-bottom", js.undefined)
    
    inline def `setSlide-in-left`(value: String): Self = StObject.set(x, "slide-in-left", value.asInstanceOf[js.Any])
    
    inline def `setSlide-in-leftUndefined`: Self = StObject.set(x, "slide-in-left", js.undefined)
    
    inline def `setSlide-in-right`(value: String): Self = StObject.set(x, "slide-in-right", value.asInstanceOf[js.Any])
    
    inline def `setSlide-in-rightUndefined`: Self = StObject.set(x, "slide-in-right", js.undefined)
    
    inline def `setSlide-in-top`(value: String): Self = StObject.set(x, "slide-in-top", value.asInstanceOf[js.Any])
    
    inline def `setSlide-in-topUndefined`: Self = StObject.set(x, "slide-in-top", js.undefined)
    
    inline def `setZoom-fade-out`(value: String): Self = StObject.set(x, "zoom-fade-out", value.asInstanceOf[js.Any])
    
    inline def `setZoom-fade-outUndefined`: Self = StObject.set(x, "zoom-fade-out", js.undefined)
    
    inline def `setZoom-out`(value: String): Self = StObject.set(x, "zoom-out", value.asInstanceOf[js.Any])
    
    inline def `setZoom-outUndefined`: Self = StObject.set(x, "zoom-out", js.undefined)
  }
}
