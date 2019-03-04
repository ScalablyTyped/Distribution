package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetInsertRowEvent extends SpreadsheetEvent {
  var index: js.UndefOr[scala.Double] = js.undefined
  var sheet: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Sheet] = js.undefined
}

object SpreadsheetInsertRowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    index: scala.Int | scala.Double = null,
    sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = null
  ): SpreadsheetInsertRowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetInsertRowEvent]
  }
}

