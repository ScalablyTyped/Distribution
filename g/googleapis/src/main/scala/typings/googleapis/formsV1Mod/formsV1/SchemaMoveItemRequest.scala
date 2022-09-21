package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveItemRequest extends StObject {
  
  /**
    * Required. The new location for the item.
    */
  var newLocation: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * Required. The location of the item to move.
    */
  var originalLocation: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaMoveItemRequest {
  
  inline def apply(): SchemaMoveItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveItemRequest]
  }
  
  extension [Self <: SchemaMoveItemRequest](x: Self) {
    
    inline def setNewLocation(value: SchemaLocation): Self = StObject.set(x, "newLocation", value.asInstanceOf[js.Any])
    
    inline def setNewLocationUndefined: Self = StObject.set(x, "newLocation", js.undefined)
    
    inline def setOriginalLocation(value: SchemaLocation): Self = StObject.set(x, "originalLocation", value.asInstanceOf[js.Any])
    
    inline def setOriginalLocationUndefined: Self = StObject.set(x, "originalLocation", js.undefined)
  }
}
