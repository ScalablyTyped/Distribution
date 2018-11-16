package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditorOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ EditorEvent, scala.Unit]] = js.undefined
  var deserialization: js.UndefOr[EditorDeserialization] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var encoded: js.UndefOr[scala.Boolean] = js.undefined
  var execute: js.UndefOr[js.Function1[/* e */ EditorExecuteEvent, scala.Unit]] = js.undefined
  var fileBrowser: js.UndefOr[EditorFileBrowser] = js.undefined
  var imageBrowser: js.UndefOr[EditorImageBrowser] = js.undefined
  var immutables: js.UndefOr[scala.Boolean | EditorImmutables] = js.undefined
  var keydown: js.UndefOr[js.Function1[/* e */ EditorEvent, scala.Unit]] = js.undefined
  var keyup: js.UndefOr[js.Function1[/* e */ EditorEvent, scala.Unit]] = js.undefined
  var messages: js.UndefOr[EditorMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ EditorPasteEvent, scala.Unit]] = js.undefined
  var pasteCleanup: js.UndefOr[EditorPasteCleanup] = js.undefined
  var pdf: js.UndefOr[EditorPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ EditorPdfExportEvent, scala.Unit]] = js.undefined
  var resizable: js.UndefOr[scala.Boolean | EditorResizable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ EditorEvent, scala.Unit]] = js.undefined
  var serialization: js.UndefOr[EditorSerialization] = js.undefined
  var stylesheets: js.UndefOr[js.Any] = js.undefined
  var tools: js.UndefOr[js.Array[EditorTool]] = js.undefined
}

