package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderPickupDetails extends StObject {
  
  /**
    * Address of the pickup location where the shipment should be sent. Note that `recipientName` in the address is the name of the business at the pickup location.
    */
  var address: js.UndefOr[SchemaOrderAddress] = js.undefined
  
  /**
    * Collectors authorized to pick up shipment from the pickup location.
    */
  var collectors: js.UndefOr[js.Array[SchemaOrderPickupDetailsCollector]] = js.undefined
  
  /**
    * ID of the pickup location.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderPickupDetails {
  
  inline def apply(): SchemaOrderPickupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPickupDetails]
  }
  
  extension [Self <: SchemaOrderPickupDetails](x: Self) {
    
    inline def setAddress(value: SchemaOrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCollectors(value: js.Array[SchemaOrderPickupDetailsCollector]): Self = StObject.set(x, "collectors", value.asInstanceOf[js.Any])
    
    inline def setCollectorsUndefined: Self = StObject.set(x, "collectors", js.undefined)
    
    inline def setCollectorsVarargs(value: SchemaOrderPickupDetailsCollector*): Self = StObject.set(x, "collectors", js.Array(value*))
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
