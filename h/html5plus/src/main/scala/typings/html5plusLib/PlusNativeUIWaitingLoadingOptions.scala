package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，原生等待对话框上loading图标自定义样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIWaitingLoadingOptions extends js.Object {
  /**
    * loading图标显示样式
    * 可取值：
    * 	"block"表示图标与文字分开两行显示，上面显示loading图标，下面显示文字；
    * 	"inline"表示loading图标与文字在同一行显示，左边显示loading图标，右边显示文字；
    * 	"none"表示不显示loading图标；
    * - block: 
    * 	loading图标与文字分开两行显示，上面显示loading图标，下面显示文字。
    * 								
    * - inline: 
    * 	loading图标与文字在同一行显示，左边显示loading图标，右边显示文字。
    * 								
    * - none: 
    * 	不显示loading图标。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var display: js.UndefOr[
    html5plusLib.html5plusLibStrings.block | html5plusLib.html5plusLibStrings.`inline` | html5plusLib.html5plusLibStrings.none
  ] = js.undefined
  /**
    * loading图标高度
    * 设置loading图标的高度（宽度等比率缩放），取值类型：像素值，如"14px"表示14像素高。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * loading图标路径
    * 自定义loading图标的路径，png格式，并且必须是本地资源地址；
    * 	loading图要求宽是高的整数倍，显示等待框时按照图片的高横向截取每帧刷新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * loading图每帧刷新间隔
    * 单位为ms（毫秒），默认值为100ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
}

object PlusNativeUIWaitingLoadingOptions {
  @scala.inline
  def apply(
    display: html5plusLib.html5plusLibStrings.block | html5plusLib.html5plusLibStrings.`inline` | html5plusLib.html5plusLibStrings.none = null,
    height: java.lang.String = null,
    icon: java.lang.String = null,
    interval: scala.Int | scala.Double = null
  ): PlusNativeUIWaitingLoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeUIWaitingLoadingOptions]
  }
}

