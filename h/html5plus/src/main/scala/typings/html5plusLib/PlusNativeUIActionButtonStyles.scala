package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，原生选择按钮框上按钮的样式参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIActionButtonStyles extends js.Object {
  /**
    * 按钮上显示的文字颜色
    * 可取值：
    * 	"#RRGGBB"格式字符串，如"#FF0000"表示文字颜色为红色；
    * 	"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮的样式
    * 可取值：
    * 	"destructive" - 表示警示按钮样式，默认文字颜色为红色；
    * 	"default" - 表示默认按钮样式。
    * 	默认值为"default"。
    * - destructive: 
    * 	警示按钮样式。
    * 								
    * - default: 
    * 	默认按钮样式。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var style: js.UndefOr[
    html5plusLib.html5plusLibStrings.destructive | html5plusLib.html5plusLibStrings.default
  ] = js.undefined
  /**
    * 按钮上显示的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlusNativeUIActionButtonStyles {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    style: html5plusLib.html5plusLibStrings.destructive | html5plusLib.html5plusLibStrings.default = null,
    title: java.lang.String = null
  ): PlusNativeUIActionButtonStyles = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusNativeUIActionButtonStyles]
  }
}

