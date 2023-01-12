package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderPickupDetails extends StObject {
  
  /** Address of the pickup location where the shipment should be sent. Note that `recipientName` in the address is the name of the business at the pickup location. */
  var address: js.UndefOr[OrderAddress] = js.undefined
  
  /** Collectors authorized to pick up shipment from the pickup location. */
  var collectors: js.UndefOr[js.Array[OrderPickupDetailsCollector]] = js.undefined
  
  /** ID of the pickup location. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /** The pickup type of this order. Acceptable values are: - "`merchantStore`" - "`merchantStoreCurbside`" - "`merchantStoreLocker`" - "`thirdPartyPickupPoint`" - "`thirdPartyLocker`" */
  var pickupType: js.UndefOr[String] = js.undefined
}
object OrderPickupDetails {
  
  inline def apply(): OrderPickupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPickupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderPickupDetails] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: OrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCollectors(value: js.Array[OrderPickupDetailsCollector]): Self = StObject.set(x, "collectors", value.asInstanceOf[js.Any])
    
    inline def setCollectorsUndefined: Self = StObject.set(x, "collectors", js.undefined)
    
    inline def setCollectorsVarargs(value: OrderPickupDetailsCollector*): Self = StObject.set(x, "collectors", js.Array(value*))
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setPickupType(value: String): Self = StObject.set(x, "pickupType", value.asInstanceOf[js.Any])
    
    inline def setPickupTypeUndefined: Self = StObject.set(x, "pickupType", js.undefined)
  }
}
