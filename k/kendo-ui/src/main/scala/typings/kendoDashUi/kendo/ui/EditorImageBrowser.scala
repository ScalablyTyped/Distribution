package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowser extends js.Object {
  var fileTypes: js.UndefOr[String] = js.undefined
  var messages: js.UndefOr[EditorImageBrowserMessages] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[EditorImageBrowserSchema] = js.undefined
  var transport: js.UndefOr[EditorImageBrowserTransport] = js.undefined
}

object EditorImageBrowser {
  @scala.inline
  def apply(
    fileTypes: String = null,
    messages: EditorImageBrowserMessages = null,
    path: String = null,
    schema: EditorImageBrowserSchema = null,
    transport: EditorImageBrowserTransport = null
  ): EditorImageBrowser = {
    val __obj = js.Dynamic.literal()
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (path != null) __obj.updateDynamic("path")(path)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[EditorImageBrowser]
  }
}

