package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerMessagesViews extends StObject {
  
  var dateCreatedField: js.UndefOr[String] = js.undefined
  
  var dateModifiedField: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[String] = js.undefined
  
  var listViewLabel: js.UndefOr[String] = js.undefined
  
  var nameField: js.UndefOr[String] = js.undefined
  
  var sizeField: js.UndefOr[String] = js.undefined
  
  var typeField: js.UndefOr[String] = js.undefined
}
object FileManagerMessagesViews {
  
  inline def apply(): FileManagerMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesViews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileManagerMessagesViews] (val x: Self) extends AnyVal {
    
    inline def setDateCreatedField(value: String): Self = StObject.set(x, "dateCreatedField", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedFieldUndefined: Self = StObject.set(x, "dateCreatedField", js.undefined)
    
    inline def setDateModifiedField(value: String): Self = StObject.set(x, "dateModifiedField", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedFieldUndefined: Self = StObject.set(x, "dateModifiedField", js.undefined)
    
    inline def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setListViewLabel(value: String): Self = StObject.set(x, "listViewLabel", value.asInstanceOf[js.Any])
    
    inline def setListViewLabelUndefined: Self = StObject.set(x, "listViewLabel", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
    
    inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
    
    inline def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
    
    inline def setTypeField(value: String): Self = StObject.set(x, "typeField", value.asInstanceOf[js.Any])
    
    inline def setTypeFieldUndefined: Self = StObject.set(x, "typeField", js.undefined)
  }
}
