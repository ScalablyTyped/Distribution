package typings.materialSelectionControl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSelectionControlState extends js.Object {
  var checked: Boolean = js.native
  var disabled: Boolean = js.native
  var indeterminate: Boolean = js.native
  var value: js.UndefOr[String] = js.native
}

object MDCSelectionControlState {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, indeterminate: Boolean): MDCSelectionControlState = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCSelectionControlState]
  }
  @scala.inline
  implicit class MDCSelectionControlStateOps[Self <: MDCSelectionControlState] (val x: Self) extends AnyVal {
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
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

