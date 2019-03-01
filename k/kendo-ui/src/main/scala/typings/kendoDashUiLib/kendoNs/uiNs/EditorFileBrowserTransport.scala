package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserTransport extends js.Object {
  var create: js.UndefOr[java.lang.String | EditorFileBrowserTransportCreate] = js.undefined
  var destroy: js.UndefOr[java.lang.String | EditorFileBrowserTransportDestroy] = js.undefined
  var fileUrl: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var read: js.UndefOr[java.lang.String | js.Function | EditorFileBrowserTransportRead] = js.undefined
  var uploadUrl: js.UndefOr[java.lang.String] = js.undefined
}

object EditorFileBrowserTransport {
  @scala.inline
  def apply(
    create: java.lang.String | EditorFileBrowserTransportCreate = null,
    destroy: java.lang.String | EditorFileBrowserTransportDestroy = null,
    fileUrl: java.lang.String | js.Function = null,
    read: java.lang.String | js.Function | EditorFileBrowserTransportRead = null,
    uploadUrl: java.lang.String = null
  ): EditorFileBrowserTransport = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (fileUrl != null) __obj.updateDynamic("fileUrl")(fileUrl.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl)
    __obj.asInstanceOf[EditorFileBrowserTransport]
  }
}

