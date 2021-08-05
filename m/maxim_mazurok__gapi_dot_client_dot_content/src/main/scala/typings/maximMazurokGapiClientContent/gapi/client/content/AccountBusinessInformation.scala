package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountBusinessInformation extends StObject {
  
  /** The address of the business. */
  var address: js.UndefOr[AccountAddress] = js.undefined
  
  /** The customer service information of the business. */
  var customerService: js.UndefOr[AccountCustomerService] = js.undefined
  
  /** The phone number of the business. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object AccountBusinessInformation {
  
  inline def apply(): AccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBusinessInformation]
  }
  
  extension [Self <: AccountBusinessInformation](x: Self) {
    
    inline def setAddress(value: AccountAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCustomerService(value: AccountCustomerService): Self = StObject.set(x, "customerService", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceUndefined: Self = StObject.set(x, "customerService", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
