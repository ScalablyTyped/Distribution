package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.spreadsheetNs.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetRemoveSheetEvent extends SpreadsheetEvent {
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetRemoveSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    sheet: Sheet = null
  ): SpreadsheetRemoveSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetRemoveSheetEvent]
  }
}

