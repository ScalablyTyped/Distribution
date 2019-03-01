package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetExcelExportEvent extends SpreadsheetEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var workbook: js.UndefOr[kendoDashUiLib.kendoNs.ooxmlNs.Workbook] = js.undefined
}

object SpreadsheetExcelExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    data: js.Any = null,
    workbook: kendoDashUiLib.kendoNs.ooxmlNs.Workbook = null
  ): SpreadsheetExcelExportEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (workbook != null) __obj.updateDynamic("workbook")(workbook)
    __obj.asInstanceOf[SpreadsheetExcelExportEvent]
  }
}

