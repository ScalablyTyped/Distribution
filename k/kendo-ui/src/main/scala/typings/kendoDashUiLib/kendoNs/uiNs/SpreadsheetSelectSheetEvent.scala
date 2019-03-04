package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSelectSheetEvent extends SpreadsheetEvent {
  var sheet: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Sheet] = js.undefined
}

object SpreadsheetSelectSheetEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = null
  ): SpreadsheetSelectSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetSelectSheetEvent]
  }
}

