package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口下拉刷新样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewPullToRefreshStyles extends js.Object {
  
  /**
    * 下拉刷新控件颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"为设置下拉属性控件为红色，默认值为"#2BD009"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * 在下拉可刷新状态时显示的内容
    * 支持以下属性：
    *     caption：在下拉可刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentdown: js.UndefOr[js.Any] = js.native
  
  /**
    * 在释放可刷新状态时显示的内容
    * 支持以下属性：
    *     caption：在释放可刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentover: js.UndefOr[js.Any] = js.native
  
  /**
    * 在正在刷新状态时显示的内容
    * 支持以下属性：
    *     caption：在正在刷新状态时下拉刷新控件上显示的标题内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var contentrefresh: js.UndefOr[js.Any] = js.native
  
  /**
    * 窗口的下拉刷新控件进入刷新状态的拉拽高度
    * 支持百分比，如"10%"；像素值，如"50px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * 下拉刷新控件的起始位置
    * 仅对"circle"样式下拉刷新控件有效，用于定义刷新控件下拉时的起始位置。
    *     相对于Webview的顶部偏移量，支持百分比，如"10%"；像素值，如"50px"。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var offset: js.UndefOr[String] = js.native
  
  /**
    * 窗口可下拉拖拽的范围
    * 支持百分比，如"10%"；像素值，如"50px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var range: js.UndefOr[String] = js.native
  
  /**
    * 下拉刷新样式
    * 用于定义下拉刷新风格样式，可取值：
    *     "default" - 经典下拉刷新样式（下拉拖动时页面内容跟随）；
    *     "circle" - 圆圈样式下拉刷新控件样式（下拉拖动时仅刷新控件跟随）。
    *     默认值为"default"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * 是否开启Webview窗口的下拉刷新功能
    * true表示开启窗口的下拉刷新功能；
    *     false表示关闭窗口的下拉刷新功能。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var support: js.UndefOr[Boolean] = js.native
}
object PlusWebviewWebviewPullToRefreshStyles {
  
  @scala.inline
  def apply(): PlusWebviewWebviewPullToRefreshStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewPullToRefreshStyles]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewPullToRefreshStylesOps[Self <: PlusWebviewWebviewPullToRefreshStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContentdown(value: js.Any): Self = this.set("contentdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentdown: Self = this.set("contentdown", js.undefined)
    
    @scala.inline
    def setContentover(value: js.Any): Self = this.set("contentover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentover: Self = this.set("contentover", js.undefined)
    
    @scala.inline
    def setContentrefresh(value: js.Any): Self = this.set("contentrefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentrefresh: Self = this.set("contentrefresh", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSupport(value: Boolean): Self = this.set("support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupport: Self = this.set("support", js.undefined)
  }
}
