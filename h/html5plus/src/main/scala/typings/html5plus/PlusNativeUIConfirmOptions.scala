package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 确认对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIConfirmOptions extends js.Object {
  /**
    * 确认对话框上显示的按钮
    * 字符串数组，每项对应在确认对话框上显示一个按钮，用户点击后通过confirmCB返回用户点击按钮的在数组中的索引值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var buttons: js.UndefOr[js.Array[_]] = js.native
  /**
    * 确认对话框显示的标题
    * 如果不设置此属性值，则不显示标题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 对话框在屏幕中的垂直分享对齐方式
    * 可取值：
    *         "top" - 表示垂直居顶对齐；
    *         "center" - 表示垂直居中对齐；
    *         "bottom" - 表示垂直居底对齐。
    *     默认值为"center"（垂直居中对齐）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var verticalAlign: js.UndefOr[String] = js.native
}

object PlusNativeUIConfirmOptions {
  @scala.inline
  def apply(): PlusNativeUIConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIConfirmOptions]
  }
  @scala.inline
  implicit class PlusNativeUIConfirmOptionsOps[Self <: PlusNativeUIConfirmOptions] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: js.Any*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[_]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}

