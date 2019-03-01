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
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var resizable: js.UndefOr[scala.Boolean | EditorResizable] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ EditorEvent, scala.Unit]] = js.undefined
  var serialization: js.UndefOr[EditorSerialization] = js.undefined
  var stylesheets: js.UndefOr[js.Any] = js.undefined
  var tools: js.UndefOr[js.Array[EditorTool]] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ EditorEvent, scala.Unit] = null,
    deserialization: EditorDeserialization = null,
    domain: java.lang.String = null,
    encoded: js.UndefOr[scala.Boolean] = js.undefined,
    execute: js.Function1[/* e */ EditorExecuteEvent, scala.Unit] = null,
    fileBrowser: EditorFileBrowser = null,
    imageBrowser: EditorImageBrowser = null,
    immutables: scala.Boolean | EditorImmutables = null,
    keydown: js.Function1[/* e */ EditorEvent, scala.Unit] = null,
    keyup: js.Function1[/* e */ EditorEvent, scala.Unit] = null,
    messages: EditorMessages = null,
    name: java.lang.String = null,
    paste: js.Function1[/* e */ EditorPasteEvent, scala.Unit] = null,
    pasteCleanup: EditorPasteCleanup = null,
    pdf: EditorPdf = null,
    pdfExport: js.Function1[/* e */ EditorPdfExportEvent, scala.Unit] = null,
    placeholder: java.lang.String = null,
    resizable: scala.Boolean | EditorResizable = null,
    select: js.Function1[/* e */ EditorEvent, scala.Unit] = null,
    serialization: EditorSerialization = null,
    stylesheets: js.Any = null,
    tools: js.Array[EditorTool] = null
  ): EditorOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (deserialization != null) __obj.updateDynamic("deserialization")(deserialization)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(encoded)) __obj.updateDynamic("encoded")(encoded)
    if (execute != null) __obj.updateDynamic("execute")(execute)
    if (fileBrowser != null) __obj.updateDynamic("fileBrowser")(fileBrowser)
    if (imageBrowser != null) __obj.updateDynamic("imageBrowser")(imageBrowser)
    if (immutables != null) __obj.updateDynamic("immutables")(immutables.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (pasteCleanup != null) __obj.updateDynamic("pasteCleanup")(pasteCleanup)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(pdfExport)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select)
    if (serialization != null) __obj.updateDynamic("serialization")(serialization)
    if (stylesheets != null) __obj.updateDynamic("stylesheets")(stylesheets)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[EditorOptions]
  }
}

