package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 确认对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIConfirmOptions extends js.Object {
  /**
    * 确认对话框上显示的按钮
    * 字符串数组，每项对应在确认对话框上显示一个按钮，用户点击后通过confirmCB返回用户点击按钮的在数组中的索引值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var buttons: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 确认对话框显示的标题
    * 如果不设置此属性值，则不显示标题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 对话框在屏幕中的垂直分享对齐方式
    * 可取值：
    * 		"top" - 表示垂直居顶对齐；
    * 		"center" - 表示垂直居中对齐；
    * 		"bottom" - 表示垂直居底对齐。
    * 	默认值为"center"（垂直居中对齐）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
}

object PlusNativeUIConfirmOptions {
  @scala.inline
  def apply(buttons: js.Array[_] = null, title: String = null, verticalAlign: String = null): PlusNativeUIConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeUIConfirmOptions]
  }
}

