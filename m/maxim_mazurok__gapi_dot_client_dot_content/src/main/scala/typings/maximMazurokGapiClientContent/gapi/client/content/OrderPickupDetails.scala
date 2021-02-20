package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPickupDetails extends StObject {
  
  /** Address of the pickup location where the shipment should be sent. Note that `recipientName` in the address is the name of the business at the pickup location. */
  var address: js.UndefOr[OrderAddress] = js.native
  
  /** Collectors authorized to pick up shipment from the pickup location. */
  var collectors: js.UndefOr[js.Array[OrderPickupDetailsCollector]] = js.native
  
  /** ID of the pickup location. */
  var locationId: js.UndefOr[String] = js.native
  
  /** The pickup type of this order. Acceptable values are: - "`merchantStore`" - "`merchantStoreCurbside`" - "`merchantStoreLocker`" - "`thirdPartyPickupPoint`" - "`thirdPartyLocker`" */
  var pickupType: js.UndefOr[String] = js.native
}
object OrderPickupDetails {
  
  @scala.inline
  def apply(): OrderPickupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPickupDetails]
  }
  
  @scala.inline
  implicit class OrderPickupDetailsMutableBuilder[Self <: OrderPickupDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: OrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCollectors(value: js.Array[OrderPickupDetailsCollector]): Self = StObject.set(x, "collectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectorsUndefined: Self = StObject.set(x, "collectors", js.undefined)
    
    @scala.inline
    def setCollectorsVarargs(value: OrderPickupDetailsCollector*): Self = StObject.set(x, "collectors", js.Array(value :_*))
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setPickupType(value: String): Self = StObject.set(x, "pickupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupTypeUndefined: Self = StObject.set(x, "pickupType", js.undefined)
  }
}
