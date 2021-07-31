package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerMessagesViews extends StObject {
  
  var dateCreatedField: js.UndefOr[String] = js.undefined
  
  var dateModifiedField: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[String] = js.undefined
  
  var nameField: js.UndefOr[String] = js.undefined
  
  var sizeField: js.UndefOr[String] = js.undefined
  
  var typeField: js.UndefOr[String] = js.undefined
}
object FileManagerMessagesViews {
  
  @scala.inline
  def apply(): FileManagerMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesViews]
  }
  
  @scala.inline
  implicit class FileManagerMessagesViewsMutableBuilder[Self <: FileManagerMessagesViews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCreatedField(value: String): Self = StObject.set(x, "dateCreatedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedFieldUndefined: Self = StObject.set(x, "dateCreatedField", js.undefined)
    
    @scala.inline
    def setDateModifiedField(value: String): Self = StObject.set(x, "dateModifiedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateModifiedFieldUndefined: Self = StObject.set(x, "dateModifiedField", js.undefined)
    
    @scala.inline
    def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
    
    @scala.inline
    def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
    
    @scala.inline
    def setTypeField(value: String): Self = StObject.set(x, "typeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFieldUndefined: Self = StObject.set(x, "typeField", js.undefined)
  }
}
