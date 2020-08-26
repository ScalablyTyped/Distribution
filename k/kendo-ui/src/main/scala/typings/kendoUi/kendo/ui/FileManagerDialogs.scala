package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerDialogs extends js.Object {
  var deleteConfirm: js.UndefOr[js.Any] = js.native
  var moveConfirm: js.UndefOr[js.Any] = js.native
  var renamePrompt: js.UndefOr[js.Any] = js.native
  var upload: js.UndefOr[js.Any] = js.native
}

object FileManagerDialogs {
  @scala.inline
  def apply(): FileManagerDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDialogs]
  }
  @scala.inline
  implicit class FileManagerDialogsOps[Self <: FileManagerDialogs] (val x: Self) extends AnyVal {
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
    def setDeleteConfirm(value: js.Any): Self = this.set("deleteConfirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteConfirm: Self = this.set("deleteConfirm", js.undefined)
    @scala.inline
    def setMoveConfirm(value: js.Any): Self = this.set("moveConfirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveConfirm: Self = this.set("moveConfirm", js.undefined)
    @scala.inline
    def setRenamePrompt(value: js.Any): Self = this.set("renamePrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenamePrompt: Self = this.set("renamePrompt", js.undefined)
    @scala.inline
    def setUpload(value: js.Any): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
  
}

