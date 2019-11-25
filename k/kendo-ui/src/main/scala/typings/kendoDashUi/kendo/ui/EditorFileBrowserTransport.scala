package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserTransport extends js.Object {
  var create: js.UndefOr[String | EditorFileBrowserTransportCreate] = js.undefined
  var destroy: js.UndefOr[String | EditorFileBrowserTransportDestroy] = js.undefined
  var fileUrl: js.UndefOr[String | js.Function] = js.undefined
  var read: js.UndefOr[String | js.Function | EditorFileBrowserTransportRead] = js.undefined
  var uploadUrl: js.UndefOr[String] = js.undefined
}

object EditorFileBrowserTransport {
  @scala.inline
  def apply(
    create: String | EditorFileBrowserTransportCreate = null,
    destroy: String | EditorFileBrowserTransportDestroy = null,
    fileUrl: String | js.Function = null,
    read: String | js.Function | EditorFileBrowserTransportRead = null,
    uploadUrl: String = null
  ): EditorFileBrowserTransport = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (fileUrl != null) __obj.updateDynamic("fileUrl")(fileUrl.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFileBrowserTransport]
  }
}

