package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShippingsettingsGetSupportedPickupServicesResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedPickupServicesResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of supported pickup services. May be empty.
    */
  var pickupServices: js.UndefOr[js.Array[SchemaPickupServicesPickupService]] = js.undefined
}
object SchemaShippingsettingsGetSupportedPickupServicesResponse {
  
  inline def apply(): SchemaShippingsettingsGetSupportedPickupServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedPickupServicesResponse]
  }
  
  extension [Self <: SchemaShippingsettingsGetSupportedPickupServicesResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPickupServices(value: js.Array[SchemaPickupServicesPickupService]): Self = StObject.set(x, "pickupServices", value.asInstanceOf[js.Any])
    
    inline def setPickupServicesUndefined: Self = StObject.set(x, "pickupServices", js.undefined)
    
    inline def setPickupServicesVarargs(value: SchemaPickupServicesPickupService*): Self = StObject.set(x, "pickupServices", js.Array(value*))
  }
}
