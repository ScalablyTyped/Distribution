package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderDeliveryDetails extends StObject {
  
  /**
    * The delivery address
    */
  var address: js.UndefOr[SchemaTestOrderAddress] = js.undefined
  
  /**
    * Whether the order is scheduled delivery order.
    */
  var isScheduledDelivery: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestOrderDeliveryDetails {
  
  inline def apply(): SchemaTestOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderDeliveryDetails]
  }
  
  extension [Self <: SchemaTestOrderDeliveryDetails](x: Self) {
    
    inline def setAddress(value: SchemaTestOrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIsScheduledDelivery(value: Boolean): Self = StObject.set(x, "isScheduledDelivery", value.asInstanceOf[js.Any])
    
    inline def setIsScheduledDeliveryNull: Self = StObject.set(x, "isScheduledDelivery", null)
    
    inline def setIsScheduledDeliveryUndefined: Self = StObject.set(x, "isScheduledDelivery", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
