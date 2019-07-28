package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.spreadsheetNs.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetChangeEvent extends SpreadsheetEvent {
  var range: js.UndefOr[Range] = js.undefined
}

object SpreadsheetChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    range: Range = null
  ): SpreadsheetChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetChangeEvent]
  }
}

