package typings.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSelectionControlState extends js.Object {
  var checked: Boolean
  var disabled: Boolean
  var indeterminate: Boolean
  var value: js.UndefOr[String] = js.undefined
}

object MDCSelectionControlState {
  @scala.inline
  def apply(checked: Boolean, disabled: Boolean, indeterminate: Boolean, value: String = null): MDCSelectionControlState = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, indeterminate = indeterminate)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MDCSelectionControlState]
  }
}

