package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailInitEvent extends GridEvent {
  var data: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.ObservableObject] = js.undefined
  var detailCell: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var detailRow: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var masterRow: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object GridDetailInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Grid,
    data: kendoDashUiLib.kendoNs.dataNs.ObservableObject = null,
    detailCell: kendoDashUiLib.JQuery = null,
    detailRow: kendoDashUiLib.JQuery = null,
    masterRow: kendoDashUiLib.JQuery = null
  ): GridDetailInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (detailCell != null) __obj.updateDynamic("detailCell")(detailCell)
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow)
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow)
    __obj.asInstanceOf[GridDetailInitEvent]
  }
}

