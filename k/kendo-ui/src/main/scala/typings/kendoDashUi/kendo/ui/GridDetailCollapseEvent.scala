package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailCollapseEvent extends GridEvent {
  var detailRow: js.UndefOr[JQuery] = js.undefined
  var masterRow: js.UndefOr[JQuery] = js.undefined
}

object GridDetailCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    detailRow: JQuery = null,
    masterRow: JQuery = null
  ): GridDetailCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow)
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow)
    __obj.asInstanceOf[GridDetailCollapseEvent]
  }
}

