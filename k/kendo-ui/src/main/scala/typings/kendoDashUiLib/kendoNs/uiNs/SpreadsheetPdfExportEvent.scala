package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPdfExportEvent extends SpreadsheetEvent {
  var promise: js.UndefOr[kendoDashUiLib.JQueryPromise[_]] = js.undefined
}

object SpreadsheetPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Spreadsheet,
    promise: kendoDashUiLib.JQueryPromise[_] = null
  ): SpreadsheetPdfExportEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[SpreadsheetPdfExportEvent]
  }
}

