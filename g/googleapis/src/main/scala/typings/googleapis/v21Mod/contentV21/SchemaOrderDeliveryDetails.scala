package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderDeliveryDetails extends StObject {
  
  /**
    * The delivery address
    */
  var address: js.UndefOr[SchemaOrderAddress] = js.undefined
  
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderDeliveryDetails {
  
  inline def apply(): SchemaOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDeliveryDetails]
  }
  
  extension [Self <: SchemaOrderDeliveryDetails](x: Self) {
    
    inline def setAddress(value: SchemaOrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
