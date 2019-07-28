package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.spreadsheetNs.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetRenameSheetEvent extends SpreadsheetEvent {
  var newSheetName: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetRenameSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    newSheetName: String = null,
    sheet: Sheet = null
  ): SpreadsheetRenameSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetRenameSheetEvent]
  }
}

