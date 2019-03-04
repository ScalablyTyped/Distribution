package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSelectEvent extends SpreadsheetEvent {
  var range: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Range] = js.undefined
}

object SpreadsheetSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    range: kendoDashUiLib.kendoNs.spreadsheetNs.Range = null
  ): SpreadsheetSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetSelectEvent]
  }
}

