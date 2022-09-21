package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOrderDeliveryDetails extends StObject {
  
  /** The delivery address */
  var address: js.UndefOr[TestOrderAddress] = js.undefined
  
  /** Whether the order is scheduled delivery order. */
  var isScheduledDelivery: js.UndefOr[Boolean] = js.undefined
  
  /** The phone number of the person receiving the delivery. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object TestOrderDeliveryDetails {
  
  inline def apply(): TestOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderDeliveryDetails]
  }
  
  extension [Self <: TestOrderDeliveryDetails](x: Self) {
    
    inline def setAddress(value: TestOrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIsScheduledDelivery(value: Boolean): Self = StObject.set(x, "isScheduledDelivery", value.asInstanceOf[js.Any])
    
    inline def setIsScheduledDeliveryUndefined: Self = StObject.set(x, "isScheduledDelivery", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
