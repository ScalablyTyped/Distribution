package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerDialogs extends StObject {
  
  var deleteConfirm: js.UndefOr[js.Any] = js.undefined
  
  var moveConfirm: js.UndefOr[js.Any] = js.undefined
  
  var renamePrompt: js.UndefOr[js.Any] = js.undefined
  
  var upload: js.UndefOr[js.Any] = js.undefined
}
object FileManagerDialogs {
  
  inline def apply(): FileManagerDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDialogs]
  }
  
  extension [Self <: FileManagerDialogs](x: Self) {
    
    inline def setDeleteConfirm(value: js.Any): Self = StObject.set(x, "deleteConfirm", value.asInstanceOf[js.Any])
    
    inline def setDeleteConfirmUndefined: Self = StObject.set(x, "deleteConfirm", js.undefined)
    
    inline def setMoveConfirm(value: js.Any): Self = StObject.set(x, "moveConfirm", value.asInstanceOf[js.Any])
    
    inline def setMoveConfirmUndefined: Self = StObject.set(x, "moveConfirm", js.undefined)
    
    inline def setRenamePrompt(value: js.Any): Self = StObject.set(x, "renamePrompt", value.asInstanceOf[js.Any])
    
    inline def setRenamePromptUndefined: Self = StObject.set(x, "renamePrompt", js.undefined)
    
    inline def setUpload(value: js.Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
