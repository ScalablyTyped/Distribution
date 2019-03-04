package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSaveEvent extends GridEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object GridSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    container: kendoDashUiLib.JQuery = null,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null,
    values: js.Any = null
  ): GridSaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (model != null) __obj.updateDynamic("model")(model)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GridSaveEvent]
  }
}

