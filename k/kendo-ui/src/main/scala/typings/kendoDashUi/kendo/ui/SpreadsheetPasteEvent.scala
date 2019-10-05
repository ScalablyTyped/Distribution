package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPasteEvent extends SpreadsheetEvent {
  var clipboardContent: js.UndefOr[js.Any] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object SpreadsheetPasteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    clipboardContent: js.Any = null,
    range: Range = null
  ): SpreadsheetPasteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (clipboardContent != null) __obj.updateDynamic("clipboardContent")(clipboardContent)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetPasteEvent]
  }
}

