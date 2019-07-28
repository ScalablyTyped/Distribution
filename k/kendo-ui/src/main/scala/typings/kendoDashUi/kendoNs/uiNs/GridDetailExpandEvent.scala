package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailExpandEvent extends GridEvent {
  var detailRow: js.UndefOr[JQuery] = js.undefined
  var masterRow: js.UndefOr[JQuery] = js.undefined
}

object GridDetailExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    detailRow: JQuery = null,
    masterRow: JQuery = null
  ): GridDetailExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow)
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow)
    __obj.asInstanceOf[GridDetailExpandEvent]
  }
}

