package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessagesPreviewPane extends js.Object {
  var created: js.UndefOr[String] = js.native
  var extension: js.UndefOr[String] = js.native
  var items: js.UndefOr[String] = js.native
  var modified: js.UndefOr[String] = js.native
  var noFileSelected: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
}

object FileManagerMessagesPreviewPane {
  @scala.inline
  def apply(): FileManagerMessagesPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesPreviewPane]
  }
  @scala.inline
  implicit class FileManagerMessagesPreviewPaneOps[Self <: FileManagerMessagesPreviewPane] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setItems(value: String): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    @scala.inline
    def setNoFileSelected(value: String): Self = this.set("noFileSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFileSelected: Self = this.set("noFileSelected", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

