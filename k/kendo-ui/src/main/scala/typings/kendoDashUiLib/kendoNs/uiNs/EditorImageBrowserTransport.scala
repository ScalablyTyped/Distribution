package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserTransport extends js.Object {
  var create: js.UndefOr[java.lang.String | EditorImageBrowserTransportCreate] = js.undefined
  var destroy: js.UndefOr[java.lang.String | EditorImageBrowserTransportDestroy] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var read: js.UndefOr[java.lang.String | js.Function | EditorImageBrowserTransportRead] = js.undefined
  var thumbnailUrl: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var uploadUrl: js.UndefOr[java.lang.String] = js.undefined
}

object EditorImageBrowserTransport {
  @scala.inline
  def apply(
    create: java.lang.String | EditorImageBrowserTransportCreate = null,
    destroy: java.lang.String | EditorImageBrowserTransportDestroy = null,
    imageUrl: java.lang.String | js.Function = null,
    read: java.lang.String | js.Function | EditorImageBrowserTransportRead = null,
    thumbnailUrl: java.lang.String | js.Function = null,
    uploadUrl: java.lang.String = null
  ): EditorImageBrowserTransport = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl)
    __obj.asInstanceOf[EditorImageBrowserTransport]
  }
}

