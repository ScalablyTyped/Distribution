package typings.materialSelectionControl.mod

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
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCSelectionControlState]
  }
}

