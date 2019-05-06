package typings
package atIonicCoreLib.distTypesComponentsSelectDashPopoverSelectDashPopoverDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPopoverOption extends js.Object {
  var checked: scala.Boolean
  var disabled: scala.Boolean
  var handler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var text: java.lang.String
  var value: java.lang.String
}

object SelectPopoverOption {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    disabled: scala.Boolean,
    text: java.lang.String,
    value: java.lang.String,
    handler: () => scala.Unit = null
  ): SelectPopoverOption = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, text = text, value = value)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    __obj.asInstanceOf[SelectPopoverOption]
  }
}

