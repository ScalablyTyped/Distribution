package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorImageBrowser extends js.Object {
  var fileTypes: js.UndefOr[String] = js.native
  var messages: js.UndefOr[EditorImageBrowserMessages] = js.native
  var path: js.UndefOr[String] = js.native
  var schema: js.UndefOr[EditorImageBrowserSchema] = js.native
  var transport: js.UndefOr[EditorImageBrowserTransport] = js.native
}

object EditorImageBrowser {
  @scala.inline
  def apply(): EditorImageBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowser]
  }
  @scala.inline
  implicit class EditorImageBrowserOps[Self <: EditorImageBrowser] (val x: Self) extends AnyVal {
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
    def setFileTypes(value: String): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    @scala.inline
    def setMessages(value: EditorImageBrowserMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSchema(value: EditorImageBrowserSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setTransport(value: EditorImageBrowserTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

