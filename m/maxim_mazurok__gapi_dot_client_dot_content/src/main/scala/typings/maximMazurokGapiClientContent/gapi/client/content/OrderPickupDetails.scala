package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPickupDetails extends js.Object {
  
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
  implicit class OrderPickupDetailsOps[Self <: OrderPickupDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: OrderAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCollectorsVarargs(value: OrderPickupDetailsCollector*): Self = this.set("collectors", js.Array(value :_*))
    
    @scala.inline
    def setCollectors(value: js.Array[OrderPickupDetailsCollector]): Self = this.set("collectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectors: Self = this.set("collectors", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setPickupType(value: String): Self = this.set("pickupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupType: Self = this.set("pickupType", js.undefined)
  }
}
