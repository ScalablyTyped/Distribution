package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryPromise
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetExcelImportEvent extends SpreadsheetEvent {
  var file: js.UndefOr[Blob | File] = js.undefined
  var progress: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object SpreadsheetExcelImportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    file: Blob | File = null,
    progress: JQueryPromise[_] = null
  ): SpreadsheetExcelImportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetExcelImportEvent]
  }
}

