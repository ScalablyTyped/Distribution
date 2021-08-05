package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCustomerService extends StObject {
  
  /** Customer service email. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Customer service phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /** Customer service URL. */
  var url: js.UndefOr[String] = js.undefined
}
object AccountCustomerService {
  
  inline def apply(): AccountCustomerService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCustomerService]
  }
  
  extension [Self <: AccountCustomerService](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
