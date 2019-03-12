package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetExcelImportEvent extends SpreadsheetEvent {
  var file: js.UndefOr[stdLib.Blob | stdLib.File] = js.undefined
  var progress: js.UndefOr[kendoDashUiLib.JQueryPromise[_]] = js.undefined
}

object SpreadsheetExcelImportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    file: stdLib.Blob | stdLib.File = null,
    progress: kendoDashUiLib.JQueryPromise[_] = null
  ): SpreadsheetExcelImportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[SpreadsheetExcelImportEvent]
  }
}

