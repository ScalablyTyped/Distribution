package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.ObservableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDetailInitEvent extends GridEvent {
  var data: js.UndefOr[ObservableObject] = js.undefined
  var detailCell: js.UndefOr[JQuery] = js.undefined
  var detailRow: js.UndefOr[JQuery] = js.undefined
  var masterRow: js.UndefOr[JQuery] = js.undefined
}

object GridDetailInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    data: ObservableObject = null,
    detailCell: JQuery = null,
    detailRow: JQuery = null,
    masterRow: JQuery = null
  ): GridDetailInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (detailCell != null) __obj.updateDynamic("detailCell")(detailCell)
    if (detailRow != null) __obj.updateDynamic("detailRow")(detailRow)
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow)
    __obj.asInstanceOf[GridDetailInitEvent]
  }
}

