package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomerRequest extends StObject {
  
  /**
    * Required. The company data to populate the new customer. Must contain a value for `companyName` and at least one `owner_email` that's associated with a Google Account. The values
    * for `companyId` and `name` must be empty.
    */
  var customer: js.UndefOr[Company] = js.native
}
object CreateCustomerRequest {
  
  @scala.inline
  def apply(): CreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomerRequest]
  }
  
  @scala.inline
  implicit class CreateCustomerRequestMutableBuilder[Self <: CreateCustomerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: Company): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
