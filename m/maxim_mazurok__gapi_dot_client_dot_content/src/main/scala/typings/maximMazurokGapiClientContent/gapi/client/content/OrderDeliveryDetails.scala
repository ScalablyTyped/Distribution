package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderDeliveryDetails extends StObject {
  
  /** The delivery address */
  var address: js.UndefOr[OrderAddress] = js.undefined
  
  /** The phone number of the person receiving the delivery. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object OrderDeliveryDetails {
  
  inline def apply(): OrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderDeliveryDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderDeliveryDetails] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: OrderAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
