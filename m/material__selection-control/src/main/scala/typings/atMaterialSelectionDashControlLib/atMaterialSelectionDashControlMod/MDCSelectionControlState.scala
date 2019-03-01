package typings
package atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSelectionControlState extends js.Object {
  var checked: scala.Boolean
  var disabled: scala.Boolean
  var indeterminate: scala.Boolean
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MDCSelectionControlState {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    disabled: scala.Boolean,
    indeterminate: scala.Boolean,
    value: java.lang.String = null
  ): MDCSelectionControlState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("indeterminate")(indeterminate)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MDCSelectionControlState]
  }
}

