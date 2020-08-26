package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件显示动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewAnimationTypeShow extends js.Object {
  /**
    * 自动选择动画效果
    * 自动选择动画效果，使用上次显示窗口设置的动画效果，如果是第一次显示则默认动画效果“none”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var auto: js.UndefOr[String] = js.native
  /**
    * 从透明到不透明逐渐显示效果
    * 页面从完全透明到不透明逐渐显示。
    *     对应关闭动画"fade-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-in`: js.UndefOr[String] = js.native
  /**
    * 无动画效果
    * 立即显示页面，无任何动画效果，页面显示默认的动画效果。
    *     此效果忽略动画时间参数，立即显示。
    *     对应关闭动画"none"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.native
  /**
    * 从右侧平移入栈动画效果
    * 页面从屏幕右侧滑入显示，同时上一个页面带阴影效果从屏幕左侧滑出隐藏。
    *     对应关闭动画"pop-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-in`: js.UndefOr[String] = js.native
  /**
    * 从下侧竖向滑动效果
    * 页面从屏幕下侧向上竖向滑动显示。
    *     对应关闭动画"slide-out-bottom"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-bottom`: js.UndefOr[String] = js.native
  /**
    * 从左侧横向滑动效果
    * 页面从屏幕左侧向右横向滑动显示。
    *     对应关闭动画"slide-out-left"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-left`: js.UndefOr[String] = js.native
  /**
    * 从右侧横向滑动效果
    * 页面从屏幕右侧外向内横向滑动显示。
    *     对应关闭动画"slide-out-right"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-right`: js.UndefOr[String] = js.native
  /**
    * 从上侧竖向滑动效果
    * 页面从屏幕上侧向下竖向滑动显示。
    *     对应关闭动画"slide-out-top"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-top`: js.UndefOr[String] = js.native
  /**
    * 从小到大逐渐放大并且从透明到不透明逐渐显示效果
    * 页面在屏幕中间从小到大逐渐放大并且从透明到不透明逐渐显示。
    *     对应关闭动画"zoom-fade-in"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-out`: js.UndefOr[String] = js.native
  /**
    * 从小到大逐渐放大显示效果
    * 页面在屏幕中间从小到大逐渐放大显示。
    *     对应关闭动画"zoom-in"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-out`: js.UndefOr[String] = js.native
}

object PlusWebviewAnimationTypeShow {
  @scala.inline
  def apply(): PlusWebviewAnimationTypeShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewAnimationTypeShow]
  }
  @scala.inline
  implicit class PlusWebviewAnimationTypeShowOps[Self <: PlusWebviewAnimationTypeShow] (val x: Self) extends AnyVal {
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
    def setAuto(value: String): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def `setFade-in`(value: String): Self = this.set("fade-in", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFade-in`: Self = this.set("fade-in", js.undefined)
    @scala.inline
    def setNone(value: String): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
    @scala.inline
    def `setPop-in`(value: String): Self = this.set("pop-in", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePop-in`: Self = this.set("pop-in", js.undefined)
    @scala.inline
    def `setSlide-in-bottom`(value: String): Self = this.set("slide-in-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-in-bottom`: Self = this.set("slide-in-bottom", js.undefined)
    @scala.inline
    def `setSlide-in-left`(value: String): Self = this.set("slide-in-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-in-left`: Self = this.set("slide-in-left", js.undefined)
    @scala.inline
    def `setSlide-in-right`(value: String): Self = this.set("slide-in-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-in-right`: Self = this.set("slide-in-right", js.undefined)
    @scala.inline
    def `setSlide-in-top`(value: String): Self = this.set("slide-in-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-in-top`: Self = this.set("slide-in-top", js.undefined)
    @scala.inline
    def `setZoom-fade-out`(value: String): Self = this.set("zoom-fade-out", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZoom-fade-out`: Self = this.set("zoom-fade-out", js.undefined)
    @scala.inline
    def `setZoom-out`(value: String): Self = this.set("zoom-out", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZoom-out`: Self = this.set("zoom-out", js.undefined)
  }
  
}

