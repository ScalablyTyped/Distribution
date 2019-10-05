package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetCutEvent extends SpreadsheetEvent {
  var range: js.UndefOr[Range] = js.undefined
}

object SpreadsheetCutEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    range: Range = null
  ): SpreadsheetCutEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetCutEvent]
  }
}

