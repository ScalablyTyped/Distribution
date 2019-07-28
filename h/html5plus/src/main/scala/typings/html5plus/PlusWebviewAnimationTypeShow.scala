package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件显示动画效果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewAnimationTypeShow extends js.Object {
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
    * 	对应关闭动画"fade-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `fade-in`: js.UndefOr[String] = js.undefined
  /**
    * 无动画效果
    * 立即显示页面，无任何动画效果，页面显示默认的动画效果。
    * 	此效果忽略动画时间参数，立即显示。
    * 	对应关闭动画"none"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var none: js.UndefOr[String] = js.undefined
  /**
    * 从右侧平移入栈动画效果
    * 页面从屏幕右侧滑入显示，同时上一个页面带阴影效果从屏幕左侧滑出隐藏。
    * 	对应关闭动画"pop-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `pop-in`: js.UndefOr[String] = js.undefined
  /**
    * 从下侧竖向滑动效果
    * 页面从屏幕下侧向上竖向滑动显示。
    * 	对应关闭动画"slide-out-bottom"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-bottom`: js.UndefOr[String] = js.undefined
  /**
    * 从左侧横向滑动效果
    * 页面从屏幕左侧向右横向滑动显示。
    * 	对应关闭动画"slide-out-left"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-left`: js.UndefOr[String] = js.undefined
  /**
    * 从右侧横向滑动效果
    * 页面从屏幕右侧外向内横向滑动显示。
    * 	对应关闭动画"slide-out-right"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-right`: js.UndefOr[String] = js.undefined
  /**
    * 从上侧竖向滑动效果
    * 页面从屏幕上侧向下竖向滑动显示。
    * 	对应关闭动画"slide-out-top"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `slide-in-top`: js.UndefOr[String] = js.undefined
  /**
    * 从小到大逐渐放大并且从透明到不透明逐渐显示效果
    * 页面在屏幕中间从小到大逐渐放大并且从透明到不透明逐渐显示。
    * 	对应关闭动画"zoom-fade-in"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-fade-out`: js.UndefOr[String] = js.undefined
  /**
    * 从小到大逐渐放大显示效果
    * 页面在屏幕中间从小到大逐渐放大显示。
    * 	对应关闭动画"zoom-in"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `zoom-out`: js.UndefOr[String] = js.undefined
}

object PlusWebviewAnimationTypeShow {
  @scala.inline
  def apply(
    auto: String = null,
    `fade-in`: String = null,
    none: String = null,
    `pop-in`: String = null,
    `slide-in-bottom`: String = null,
    `slide-in-left`: String = null,
    `slide-in-right`: String = null,
    `slide-in-top`: String = null,
    `zoom-fade-out`: String = null,
    `zoom-out`: String = null
  ): PlusWebviewAnimationTypeShow = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto)
    if (`fade-in` != null) __obj.updateDynamic("fade-in")(`fade-in`)
    if (none != null) __obj.updateDynamic("none")(none)
    if (`pop-in` != null) __obj.updateDynamic("pop-in")(`pop-in`)
    if (`slide-in-bottom` != null) __obj.updateDynamic("slide-in-bottom")(`slide-in-bottom`)
    if (`slide-in-left` != null) __obj.updateDynamic("slide-in-left")(`slide-in-left`)
    if (`slide-in-right` != null) __obj.updateDynamic("slide-in-right")(`slide-in-right`)
    if (`slide-in-top` != null) __obj.updateDynamic("slide-in-top")(`slide-in-top`)
    if (`zoom-fade-out` != null) __obj.updateDynamic("zoom-fade-out")(`zoom-fade-out`)
    if (`zoom-out` != null) __obj.updateDynamic("zoom-out")(`zoom-out`)
    __obj.asInstanceOf[PlusWebviewAnimationTypeShow]
  }
}

