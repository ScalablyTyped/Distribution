package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetRenameSheetEvent extends SpreadsheetEvent {
  var newSheetName: js.UndefOr[java.lang.String] = js.undefined
  var sheet: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Sheet] = js.undefined
}

object SpreadsheetRenameSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    newSheetName: java.lang.String = null,
    sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = null
  ): SpreadsheetRenameSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetRenameSheetEvent]
  }
}

