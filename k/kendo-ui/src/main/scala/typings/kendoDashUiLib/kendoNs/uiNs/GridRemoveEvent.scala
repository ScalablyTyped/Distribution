package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRemoveEvent extends GridEvent {
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
  var row: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object GridRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null,
    row: kendoDashUiLib.JQuery = null
  ): GridRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[GridRemoveEvent]
  }
}

