package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件关闭的动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewAnimationTypeClose extends js.Object {
  /**
    * 自动选择动画效果
    * 自动选择显示窗口相对于的动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var auto: js.UndefOr[String] = js.undefined
  /**
    * 从不透明到透明逐渐隐藏动画
    * 页面从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-out`: js.UndefOr[String] = js.undefined
  /**
    * 无动画
    * 立即关闭页面，无任何动画效果。
    * 	此效果忽略动画时间参数，立即关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.undefined
  /**
    * 从右侧平移出栈动画效果
    * 页面从屏幕右侧滑出消失，同时上一个页面带阴影效果从屏幕左侧滑入显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-out`: js.UndefOr[String] = js.undefined
  /**
    * 竖向向下侧滑出屏幕动画
    * 页面从屏幕中竖向向下侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-bottom`: js.UndefOr[String] = js.undefined
  /**
    * 横向向左侧滑出屏幕动画
    * 页面从屏幕中横向向左侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-left`: js.UndefOr[String] = js.undefined
  /**
    * 横向向右侧滑出屏幕动画
    * 页面从屏幕中横向向右侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-right`: js.UndefOr[String] = js.undefined
  /**
    * 竖向向上侧滑出屏幕动画
    * 页面从屏幕中竖向向上侧滑动到屏幕外关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-out-top`: js.UndefOr[String] = js.undefined
  /**
    * 从大逐渐缩小并且从不透明到透明逐渐隐藏关闭动画
    * 页面逐渐向页面中心缩小并且从不透明到透明逐渐隐藏关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-in`: js.UndefOr[String] = js.undefined
  /**
    * 从大逐渐缩小关闭动画
    * 页面逐渐向页面中心缩小关闭。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-in`: js.UndefOr[String] = js.undefined
}

object PlusWebviewAnimationTypeClose {
  @scala.inline
  def apply(
    auto: String = null,
    `fade-out`: String = null,
    none: String = null,
    `pop-out`: String = null,
    `slide-out-bottom`: String = null,
    `slide-out-left`: String = null,
    `slide-out-right`: String = null,
    `slide-out-top`: String = null,
    `zoom-fade-in`: String = null,
    `zoom-in`: String = null
  ): PlusWebviewAnimationTypeClose = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto)
    if (`fade-out` != null) __obj.updateDynamic("fade-out")(`fade-out`)
    if (none != null) __obj.updateDynamic("none")(none)
    if (`pop-out` != null) __obj.updateDynamic("pop-out")(`pop-out`)
    if (`slide-out-bottom` != null) __obj.updateDynamic("slide-out-bottom")(`slide-out-bottom`)
    if (`slide-out-left` != null) __obj.updateDynamic("slide-out-left")(`slide-out-left`)
    if (`slide-out-right` != null) __obj.updateDynamic("slide-out-right")(`slide-out-right`)
    if (`slide-out-top` != null) __obj.updateDynamic("slide-out-top")(`slide-out-top`)
    if (`zoom-fade-in` != null) __obj.updateDynamic("zoom-fade-in")(`zoom-fade-in`)
    if (`zoom-in` != null) __obj.updateDynamic("zoom-in")(`zoom-in`)
    __obj.asInstanceOf[PlusWebviewAnimationTypeClose]
  }
}

