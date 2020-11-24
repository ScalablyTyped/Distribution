package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerMessagesDialogs extends js.Object {
  
  var deleteConfirm: js.UndefOr[FileManagerMessagesDialogsDeleteConfirm] = js.native
  
  var moveConfirm: js.UndefOr[FileManagerMessagesDialogsMoveConfirm] = js.native
  
  var renamePrompt: js.UndefOr[FileManagerMessagesDialogsRenamePrompt] = js.native
  
  var upload: js.UndefOr[FileManagerMessagesDialogsUpload] = js.native
}
object FileManagerMessagesDialogs {
  
  @scala.inline
  def apply(): FileManagerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesDialogs]
  }
  
  @scala.inline
  implicit class FileManagerMessagesDialogsOps[Self <: FileManagerMessagesDialogs] (val x: Self) extends AnyVal {
    
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
    def setDeleteConfirm(value: FileManagerMessagesDialogsDeleteConfirm): Self = this.set("deleteConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteConfirm: Self = this.set("deleteConfirm", js.undefined)
    
    @scala.inline
    def setMoveConfirm(value: FileManagerMessagesDialogsMoveConfirm): Self = this.set("moveConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveConfirm: Self = this.set("moveConfirm", js.undefined)
    
    @scala.inline
    def setRenamePrompt(value: FileManagerMessagesDialogsRenamePrompt): Self = this.set("renamePrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenamePrompt: Self = this.set("renamePrompt", js.undefined)
    
    @scala.inline
    def setUpload(value: FileManagerMessagesDialogsUpload): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
}
