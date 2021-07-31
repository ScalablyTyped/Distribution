package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequest extends StObject {
  
  /**
    * Required. [Resource name](https://cloud.google.com/apis/design/resource_names) of the customer. If you're using this API for your own organization, use `customers/my_customer` If
    * you're using this API to manage another organization, use `customers/{customer_id}`, where customer_id is the customer to whom the device belongs.
    */
  var customer: js.UndefOr[String] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequest {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequest]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequestMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1ApproveDeviceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
