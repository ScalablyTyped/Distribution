package typings.ionicCore.selectPopoverInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectPopoverOption extends js.Object {
  var checked: Boolean = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var disabled: Boolean = js.native
  var handler: js.UndefOr[js.Function0[Unit]] = js.native
  var text: String = js.native
  var value: String = js.native
}

object SelectPopoverOption {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, text: String, value: String): SelectPopoverOption = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPopoverOption]
  }
  @scala.inline
  implicit class SelectPopoverOptionOps[Self <: SelectPopoverOption] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setHandler(value: () => Unit): Self = this.set("handler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
  }
  
}

