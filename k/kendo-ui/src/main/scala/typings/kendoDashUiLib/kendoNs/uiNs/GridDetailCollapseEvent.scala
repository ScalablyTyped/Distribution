package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailCollapseEvent extends GridEvent {
  var detailRow: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var masterRow: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object GridDetailCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    detailRow: kendoDashUiLib.JQuery = null,
    masterRow: kendoDashUiLib.JQuery = null
  ): GridDetailCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow)
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow)
    __obj.asInstanceOf[GridDetailCollapseEvent]
  }
}

