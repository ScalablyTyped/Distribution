package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerRequest extends StObject {
  
  /**
    * Required. The company data to populate the new customer. Must contain a value for `companyName` and at least one `owner_email` that's associated with a Google Account. The values
    * for `companyId` and `name` must be empty.
    */
  var customer: js.UndefOr[Company] = js.undefined
}
object CreateCustomerRequest {
  
  inline def apply(): CreateCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomerRequest]
  }
  
  extension [Self <: CreateCustomerRequest](x: Self) {
    
    inline def setCustomer(value: Company): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
