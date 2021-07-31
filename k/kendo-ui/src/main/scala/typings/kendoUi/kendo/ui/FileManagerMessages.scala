package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerMessages extends StObject {
  
  var dialogs: js.UndefOr[FileManagerMessagesDialogs] = js.undefined
  
  var previewPane: js.UndefOr[FileManagerMessagesPreviewPane] = js.undefined
  
  var toolbar: js.UndefOr[FileManagerMessagesToolbar] = js.undefined
  
  var views: js.UndefOr[FileManagerMessagesViews] = js.undefined
}
object FileManagerMessages {
  
  @scala.inline
  def apply(): FileManagerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessages]
  }
  
  @scala.inline
  implicit class FileManagerMessagesMutableBuilder[Self <: FileManagerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogs(value: FileManagerMessagesDialogs): Self = StObject.set(x, "dialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogsUndefined: Self = StObject.set(x, "dialogs", js.undefined)
    
    @scala.inline
    def setPreviewPane(value: FileManagerMessagesPreviewPane): Self = StObject.set(x, "previewPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewPaneUndefined: Self = StObject.set(x, "previewPane", js.undefined)
    
    @scala.inline
    def setToolbar(value: FileManagerMessagesToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setViews(value: FileManagerMessagesViews): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
