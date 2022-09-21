package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateItemRequest extends StObject {
  
  /**
    * Required. The item to create.
    */
  var item: js.UndefOr[SchemaItem] = js.undefined
  
  /**
    * Required. Where to place the new item.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaCreateItemRequest {
  
  inline def apply(): SchemaCreateItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateItemRequest]
  }
  
  extension [Self <: SchemaCreateItemRequest](x: Self) {
    
    inline def setItem(value: SchemaItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
