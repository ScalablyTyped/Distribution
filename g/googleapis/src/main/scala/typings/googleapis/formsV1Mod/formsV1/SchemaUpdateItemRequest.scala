package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateItemRequest extends StObject {
  
  /**
    * Required. New values for the item. Note that item and question IDs are used if they are provided (and are in the field mask). If an ID is blank (and in the field mask) a new ID is generated. This means you can modify an item by getting the form via forms.get, modifying your local copy of that item to be how you want it, and using UpdateItemRequest to write it back, with the IDs being the same (or not in the field mask).
    */
  var item: js.UndefOr[SchemaItem] = js.undefined
  
  /**
    * Required. The location identifying the item to update.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * Required. Only values named in this mask are changed.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateItemRequest {
  
  inline def apply(): SchemaUpdateItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateItemRequest]
  }
  
  extension [Self <: SchemaUpdateItemRequest](x: Self) {
    
    inline def setItem(value: SchemaItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
