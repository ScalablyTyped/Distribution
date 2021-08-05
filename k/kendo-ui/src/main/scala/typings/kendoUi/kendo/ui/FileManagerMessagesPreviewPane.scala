package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerMessagesPreviewPane extends StObject {
  
  var created: js.UndefOr[String] = js.undefined
  
  var `extension`: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[String] = js.undefined
  
  var modified: js.UndefOr[String] = js.undefined
  
  var noFileSelected: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object FileManagerMessagesPreviewPane {
  
  inline def apply(): FileManagerMessagesPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesPreviewPane]
  }
  
  extension [Self <: FileManagerMessagesPreviewPane](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setNoFileSelected(value: String): Self = StObject.set(x, "noFileSelected", value.asInstanceOf[js.Any])
    
    inline def setNoFileSelectedUndefined: Self = StObject.set(x, "noFileSelected", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
