package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnersResource extends StObject {
  
  var customers: CustomersResource = js.native
  
  var devices: DevicesResource = js.native
  
  var vendors: VendorsResource = js.native
}
object PartnersResource {
  
  @scala.inline
  def apply(customers: CustomersResource, devices: DevicesResource, vendors: VendorsResource): PartnersResource = {
    val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], vendors = vendors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnersResource]
  }
  
  @scala.inline
  implicit class PartnersResourceMutableBuilder[Self <: PartnersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomers(value: CustomersResource): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevices(value: DevicesResource): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendors(value: VendorsResource): Self = StObject.set(x, "vendors", value.asInstanceOf[js.Any])
  }
}
