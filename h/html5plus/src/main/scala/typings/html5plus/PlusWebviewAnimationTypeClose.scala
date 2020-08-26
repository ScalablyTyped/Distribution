package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件关闭的动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewAnimationTypeClose extends js.Object {
  /**
    * 自动选择动画效果
    * 自动选择显示窗口相对于的动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var auto: js.UndefOr[String] = js.native
  /**
    * 从不透明到透明逐渐隐藏动画
    * 页面从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-out`: js.UndefOr[String] = js.native
  /**
    * 无动画
    * 立即关闭页面，无任何动画效果。
    *     此效果忽略动画时间参数，立即关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.native
  /**
    * 从右侧平移出栈动画效果
    * 页面从屏幕右侧滑出消失，同时上一个页面带阴影效果从屏幕左侧滑入显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-out`: js.UndefOr[String] = js.native
  /**
    * 竖向向下侧滑出屏幕动画
    * 页面从屏幕中竖向向下侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-bottom`: js.UndefOr[String] = js.native
  /**
    * 横向向左侧滑出屏幕动画
    * 页面从屏幕中横向向左侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-left`: js.UndefOr[String] = js.native
  /**
    * 横向向右侧滑出屏幕动画
    * 页面从屏幕中横向向右侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-right`: js.UndefOr[String] = js.native
  /**
    * 竖向向上侧滑出屏幕动画
    * 页面从屏幕中竖向向上侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-top`: js.UndefOr[String] = js.native
  /**
    * 从大逐渐缩小并且从不透明到透明逐渐隐藏关闭动画
    * 页面逐渐向页面中心缩小并且从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-in`: js.UndefOr[String] = js.native
  /**
    * 从大逐渐缩小关闭动画
    * 页面逐渐向页面中心缩小关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-in`: js.UndefOr[String] = js.native
}

object PlusWebviewAnimationTypeClose {
  @scala.inline
  def apply(): PlusWebviewAnimationTypeClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewAnimationTypeClose]
  }
  @scala.inline
  implicit class PlusWebviewAnimationTypeCloseOps[Self <: PlusWebviewAnimationTypeClose] (val x: Self) extends AnyVal {
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
    def `setFade-out`(value: String): Self = this.set("fade-out", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFade-out`: Self = this.set("fade-out", js.undefined)
    @scala.inline
    def setNone(value: String): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
    @scala.inline
    def `setPop-out`(value: String): Self = this.set("pop-out", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePop-out`: Self = this.set("pop-out", js.undefined)
    @scala.inline
    def `setSlide-out-bottom`(value: String): Self = this.set("slide-out-bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-out-bottom`: Self = this.set("slide-out-bottom", js.undefined)
    @scala.inline
    def `setSlide-out-left`(value: String): Self = this.set("slide-out-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-out-left`: Self = this.set("slide-out-left", js.undefined)
    @scala.inline
    def `setSlide-out-right`(value: String): Self = this.set("slide-out-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-out-right`: Self = this.set("slide-out-right", js.undefined)
    @scala.inline
    def `setSlide-out-top`(value: String): Self = this.set("slide-out-top", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSlide-out-top`: Self = this.set("slide-out-top", js.undefined)
    @scala.inline
    def `setZoom-fade-in`(value: String): Self = this.set("zoom-fade-in", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZoom-fade-in`: Self = this.set("zoom-fade-in", js.undefined)
    @scala.inline
    def `setZoom-in`(value: String): Self = this.set("zoom-in", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZoom-in`: Self = this.set("zoom-in", js.undefined)
  }
  
}

