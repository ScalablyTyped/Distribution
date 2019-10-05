package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowser extends js.Object {
  var fileTypes: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[EditorFileBrowserMessages] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[EditorFileBrowserSchema] = js.undefined
  var transport: js.UndefOr[EditorFileBrowserTransport] = js.undefined
}

object EditorFileBrowser {
  @scala.inline
  def apply(
    fileTypes: String = null,
    messages: EditorFileBrowserMessages = null,
    path: String = null,
    schema: EditorFileBrowserSchema = null,
    transport: EditorFileBrowserTransport = null
  ): EditorFileBrowser = {
    val __obj = js.Dynamic.literal()
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (path != null) __obj.updateDynamic("path")(path)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[EditorFileBrowser]
  }
}

