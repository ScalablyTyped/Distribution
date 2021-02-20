package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountBusinessInformation extends StObject {
  
  /** The address of the business. */
  var address: js.UndefOr[AccountAddress] = js.native
  
  /** The customer service information of the business. */
  var customerService: js.UndefOr[AccountCustomerService] = js.native
  
  /** The phone number of the business. */
  var phoneNumber: js.UndefOr[String] = js.native
}
object AccountBusinessInformation {
  
  @scala.inline
  def apply(): AccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBusinessInformation]
  }
  
  @scala.inline
  implicit class AccountBusinessInformationMutableBuilder[Self <: AccountBusinessInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: AccountAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCustomerService(value: AccountCustomerService): Self = StObject.set(x, "customerService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerServiceUndefined: Self = StObject.set(x, "customerService", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
