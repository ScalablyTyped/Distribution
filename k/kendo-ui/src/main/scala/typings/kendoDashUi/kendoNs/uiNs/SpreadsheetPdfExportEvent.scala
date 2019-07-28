package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPdfExportEvent extends SpreadsheetEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object SpreadsheetPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    promise: JQueryPromise[_] = null
  ): SpreadsheetPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[SpreadsheetPdfExportEvent]
  }
}

