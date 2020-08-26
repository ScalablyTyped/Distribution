package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorFileBrowserTransport extends js.Object {
  var create: js.UndefOr[String | EditorFileBrowserTransportCreate] = js.native
  var destroy: js.UndefOr[String | EditorFileBrowserTransportDestroy] = js.native
  var fileUrl: js.UndefOr[String | js.Function] = js.native
  var read: js.UndefOr[String | js.Function | EditorFileBrowserTransportRead] = js.native
  var uploadUrl: js.UndefOr[String] = js.native
}

object EditorFileBrowserTransport {
  @scala.inline
  def apply(): EditorFileBrowserTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserTransport]
  }
  @scala.inline
  implicit class EditorFileBrowserTransportOps[Self <: EditorFileBrowserTransport] (val x: Self) extends AnyVal {
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
    def setCreate(value: String | EditorFileBrowserTransportCreate): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(value: String | EditorFileBrowserTransportDestroy): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setFileUrl(value: String | js.Function): Self = this.set("fileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileUrl: Self = this.set("fileUrl", js.undefined)
    @scala.inline
    def setRead(value: String | js.Function | EditorFileBrowserTransportRead): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
  }
  
}

