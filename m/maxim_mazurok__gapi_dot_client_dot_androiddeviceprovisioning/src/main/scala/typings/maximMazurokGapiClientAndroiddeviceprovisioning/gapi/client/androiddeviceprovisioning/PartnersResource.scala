package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnersResource extends js.Object {
  
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
  implicit class PartnersResourceOps[Self <: PartnersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomers(value: CustomersResource): Self = this.set("customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevices(value: DevicesResource): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendors(value: VendorsResource): Self = this.set("vendors", value.asInstanceOf[js.Any])
  }
}
