package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpreadsheetExcelImportEvent extends SpreadsheetEvent {
  var file: js.UndefOr[stdLib.Blob | stdLib.File] = js.undefined
  var progress: js.UndefOr[kendoDashUiLib.JQueryPromise[_]] = js.undefined
}

