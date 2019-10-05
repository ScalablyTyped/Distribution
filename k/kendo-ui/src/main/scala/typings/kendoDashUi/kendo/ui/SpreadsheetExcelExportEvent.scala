package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.ooxml.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetExcelExportEvent extends SpreadsheetEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var workbook: js.UndefOr[Workbook] = js.undefined
}

object SpreadsheetExcelExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    data: js.Any = null,
    workbook: Workbook = null
  ): SpreadsheetExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (workbook != null) __obj.updateDynamic("workbook")(workbook)
    __obj.asInstanceOf[SpreadsheetExcelExportEvent]
  }
}

