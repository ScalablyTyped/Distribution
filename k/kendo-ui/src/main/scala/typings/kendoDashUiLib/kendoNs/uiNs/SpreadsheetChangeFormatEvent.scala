package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetChangeFormatEvent extends SpreadsheetEvent {
  var range: js.UndefOr[kendoDashUiLib.kendoNs.spreadsheetNs.Range] = js.undefined
}

object SpreadsheetChangeFormatEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    range: kendoDashUiLib.kendoNs.spreadsheetNs.Range = null
  ): SpreadsheetChangeFormatEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetChangeFormatEvent]
  }
}

