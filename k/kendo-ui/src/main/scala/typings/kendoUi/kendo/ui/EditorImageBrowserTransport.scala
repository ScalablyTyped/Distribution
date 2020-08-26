package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorImageBrowserTransport extends js.Object {
  var create: js.UndefOr[String | EditorImageBrowserTransportCreate] = js.native
  var destroy: js.UndefOr[String | EditorImageBrowserTransportDestroy] = js.native
  var imageUrl: js.UndefOr[String | js.Function] = js.native
  var read: js.UndefOr[String | js.Function | EditorImageBrowserTransportRead] = js.native
  var thumbnailUrl: js.UndefOr[String | js.Function] = js.native
  var uploadUrl: js.UndefOr[String] = js.native
}

object EditorImageBrowserTransport {
  @scala.inline
  def apply(): EditorImageBrowserTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserTransport]
  }
  @scala.inline
  implicit class EditorImageBrowserTransportOps[Self <: EditorImageBrowserTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: String | EditorImageBrowserTransportCreate): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(value: String | EditorImageBrowserTransportDestroy): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setImageUrl(value: String | js.Function): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setRead(value: String | js.Function | EditorImageBrowserTransportRead): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setThumbnailUrl(value: String | js.Function): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
  }
  
}

