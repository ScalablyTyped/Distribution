package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerMessagesPreviewPane extends StObject {
  
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
  implicit class FileManagerMessagesPreviewPaneMutableBuilder[Self <: FileManagerMessagesPreviewPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setNoFileSelected(value: String): Self = StObject.set(x, "noFileSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFileSelectedUndefined: Self = StObject.set(x, "noFileSelected", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
