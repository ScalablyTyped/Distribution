package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteItemRequest extends StObject {
  
  /**
    * Required. The location of the item to delete.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaDeleteItemRequest {
  
  inline def apply(): SchemaDeleteItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteItemRequest]
  }
  
  extension [Self <: SchemaDeleteItemRequest](x: Self) {
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
