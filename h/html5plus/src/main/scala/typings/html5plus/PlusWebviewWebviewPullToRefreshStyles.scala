package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口下拉刷新样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewPullToRefreshStyles extends StObject {
  
  /**
    * 下拉刷新控件颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"为设置下拉属性控件为红色，默认值为"#2BD009"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * 在下拉可刷新状态时显示的内容
    * 支持以下属性：
    *     caption：在下拉可刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentdown: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 在释放可刷新状态时显示的内容
    * 支持以下属性：
    *     caption：在释放可刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentover: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 在正在刷新状态时显示的内容
    * 支持以下属性：
    *     caption：在正在刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentrefresh: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 窗口的下拉刷新控件进入刷新状态的拉拽高度
    * 支持百分比，如"10%"；像素值，如"50px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * 下拉刷新控件的起始位置
    * 仅对"circle"样式下拉刷新控件有效，用于定义刷新控件下拉时的起始位置。
    *     相对于Webview的顶部偏移量，支持百分比，如"10%"；像素值，如"50px"。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /**
    * 窗口可下拉拖拽的范围
    * 支持百分比，如"10%"；像素值，如"50px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var range: js.UndefOr[String] = js.undefined
  
  /**
    * 下拉刷新样式
    * 用于定义下拉刷新风格样式，可取值：
    *     "default" - 经典下拉刷新样式（下拉拖动时页面内容跟随）；
    *     "circle" - 圆圈样式下拉刷新控件样式（下拉拖动时仅刷新控件跟随）。
    *     默认值为"default"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * 是否开启Webview窗口的下拉刷新功能
    * true表示开启窗口的下拉刷新功能；
    *     false表示关闭窗口的下拉刷新功能。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var support: js.UndefOr[Boolean] = js.undefined
}
object PlusWebviewWebviewPullToRefreshStyles {
  
  inline def apply(): PlusWebviewWebviewPullToRefreshStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewPullToRefreshStyles]
  }
  
  extension [Self <: PlusWebviewWebviewPullToRefreshStyles](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentdown(value: js.Any): Self = StObject.set(x, "contentdown", value.asInstanceOf[js.Any])
    
    inline def setContentdownUndefined: Self = StObject.set(x, "contentdown", js.undefined)
    
    inline def setContentover(value: js.Any): Self = StObject.set(x, "contentover", value.asInstanceOf[js.Any])
    
    inline def setContentoverUndefined: Self = StObject.set(x, "contentover", js.undefined)
    
    inline def setContentrefresh(value: js.Any): Self = StObject.set(x, "contentrefresh", value.asInstanceOf[js.Any])
    
    inline def setContentrefreshUndefined: Self = StObject.set(x, "contentrefresh", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSupport(value: Boolean): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
  }
}
