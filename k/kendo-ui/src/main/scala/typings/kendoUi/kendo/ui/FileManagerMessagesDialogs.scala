package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerMessagesDialogs extends StObject {
  
  var deleteConfirm: js.UndefOr[FileManagerMessagesDialogsDeleteConfirm] = js.undefined
  
  var moveConfirm: js.UndefOr[FileManagerMessagesDialogsMoveConfirm] = js.undefined
  
  var renamePrompt: js.UndefOr[FileManagerMessagesDialogsRenamePrompt] = js.undefined
  
  var upload: js.UndefOr[FileManagerMessagesDialogsUpload] = js.undefined
}
object FileManagerMessagesDialogs {
  
  @scala.inline
  def apply(): FileManagerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesDialogs]
  }
  
  @scala.inline
  implicit class FileManagerMessagesDialogsMutableBuilder[Self <: FileManagerMessagesDialogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteConfirm(value: FileManagerMessagesDialogsDeleteConfirm): Self = StObject.set(x, "deleteConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteConfirmUndefined: Self = StObject.set(x, "deleteConfirm", js.undefined)
    
    @scala.inline
    def setMoveConfirm(value: FileManagerMessagesDialogsMoveConfirm): Self = StObject.set(x, "moveConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveConfirmUndefined: Self = StObject.set(x, "moveConfirm", js.undefined)
    
    @scala.inline
    def setRenamePrompt(value: FileManagerMessagesDialogsRenamePrompt): Self = StObject.set(x, "renamePrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenamePromptUndefined: Self = StObject.set(x, "renamePrompt", js.undefined)
    
    @scala.inline
    def setUpload(value: FileManagerMessagesDialogsUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
