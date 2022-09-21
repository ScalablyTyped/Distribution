package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequest extends StObject {
  
  /**
    * Create a new item.
    */
  var createItem: js.UndefOr[SchemaCreateItemRequest] = js.undefined
  
  /**
    * Delete an item.
    */
  var deleteItem: js.UndefOr[SchemaDeleteItemRequest] = js.undefined
  
  /**
    * Move an item to a specified location.
    */
  var moveItem: js.UndefOr[SchemaMoveItemRequest] = js.undefined
  
  /**
    * Update Form's Info.
    */
  var updateFormInfo: js.UndefOr[SchemaUpdateFormInfoRequest] = js.undefined
  
  /**
    * Update an item.
    */
  var updateItem: js.UndefOr[SchemaUpdateItemRequest] = js.undefined
  
  /**
    * Updates the Form's settings.
    */
  var updateSettings: js.UndefOr[SchemaUpdateSettingsRequest] = js.undefined
}
object SchemaRequest {
  
  inline def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  extension [Self <: SchemaRequest](x: Self) {
    
    inline def setCreateItem(value: SchemaCreateItemRequest): Self = StObject.set(x, "createItem", value.asInstanceOf[js.Any])
    
    inline def setCreateItemUndefined: Self = StObject.set(x, "createItem", js.undefined)
    
    inline def setDeleteItem(value: SchemaDeleteItemRequest): Self = StObject.set(x, "deleteItem", value.asInstanceOf[js.Any])
    
    inline def setDeleteItemUndefined: Self = StObject.set(x, "deleteItem", js.undefined)
    
    inline def setMoveItem(value: SchemaMoveItemRequest): Self = StObject.set(x, "moveItem", value.asInstanceOf[js.Any])
    
    inline def setMoveItemUndefined: Self = StObject.set(x, "moveItem", js.undefined)
    
    inline def setUpdateFormInfo(value: SchemaUpdateFormInfoRequest): Self = StObject.set(x, "updateFormInfo", value.asInstanceOf[js.Any])
    
    inline def setUpdateFormInfoUndefined: Self = StObject.set(x, "updateFormInfo", js.undefined)
    
    inline def setUpdateItem(value: SchemaUpdateItemRequest): Self = StObject.set(x, "updateItem", value.asInstanceOf[js.Any])
    
    inline def setUpdateItemUndefined: Self = StObject.set(x, "updateItem", js.undefined)
    
    inline def setUpdateSettings(value: SchemaUpdateSettingsRequest): Self = StObject.set(x, "updateSettings", value.asInstanceOf[js.Any])
    
    inline def setUpdateSettingsUndefined: Self = StObject.set(x, "updateSettings", js.undefined)
  }
}
