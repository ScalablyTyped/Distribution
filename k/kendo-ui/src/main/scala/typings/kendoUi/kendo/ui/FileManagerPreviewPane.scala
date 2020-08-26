package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerPreviewPane extends js.Object {
  var metaFields: js.UndefOr[js.Any] = js.native
  var multipleFilesTemplate: js.UndefOr[String | js.Function] = js.native
  var noFileTemplate: js.UndefOr[String | js.Function] = js.native
  var singleFileTemplate: js.UndefOr[String | js.Function] = js.native
}

object FileManagerPreviewPane {
  @scala.inline
  def apply(): FileManagerPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerPreviewPane]
  }
  @scala.inline
  implicit class FileManagerPreviewPaneOps[Self <: FileManagerPreviewPane] (val x: Self) extends AnyVal {
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
    def setMetaFields(value: js.Any): Self = this.set("metaFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaFields: Self = this.set("metaFields", js.undefined)
    @scala.inline
    def setMultipleFilesTemplate(value: String | js.Function): Self = this.set("multipleFilesTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleFilesTemplate: Self = this.set("multipleFilesTemplate", js.undefined)
    @scala.inline
    def setNoFileTemplate(value: String | js.Function): Self = this.set("noFileTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFileTemplate: Self = this.set("noFileTemplate", js.undefined)
    @scala.inline
    def setSingleFileTemplate(value: String | js.Function): Self = this.set("singleFileTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleFileTemplate: Self = this.set("singleFileTemplate", js.undefined)
  }
  
}

