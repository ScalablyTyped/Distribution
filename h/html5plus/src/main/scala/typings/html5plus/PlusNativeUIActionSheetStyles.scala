package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，原生选择按钮框的样式参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIActionSheetStyles extends js.Object {
  /**
    * 选择框上的按钮，ActionButtonStyles对象数组
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var buttons: js.UndefOr[js.Array[PlusNativeUI]] = js.undefined
  /**
    * 取消按钮上显示的文字内容
    * 不设置此属性，则不显示取消按钮。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var cancel: js.UndefOr[String] = js.undefined
  /**
    * 选择按钮框的标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.undefined
}

object PlusNativeUIActionSheetStyles {
  @scala.inline
  def apply(buttons: js.Array[PlusNativeUI] = null, cancel: String = null, title: String = null): PlusNativeUIActionSheetStyles = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusNativeUIActionSheetStyles]
  }
}

