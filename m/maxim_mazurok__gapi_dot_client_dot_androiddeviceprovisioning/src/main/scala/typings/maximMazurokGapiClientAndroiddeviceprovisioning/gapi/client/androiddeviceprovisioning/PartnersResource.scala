package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnersResource extends StObject {
  
  var customers: CustomersResource
  
  var devices: DevicesResource
  
  var vendors: VendorsResource
}
object PartnersResource {
  
  inline def apply(customers: CustomersResource, devices: DevicesResource, vendors: VendorsResource): PartnersResource = {
    val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], devices = devices.asInstanceOf[js.Any], vendors = vendors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnersResource]
  }
  
  extension [Self <: PartnersResource](x: Self) {
    
    inline def setCustomers(value: CustomersResource): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setDevices(value: DevicesResource): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setVendors(value: VendorsResource): Self = StObject.set(x, "vendors", value.asInstanceOf[js.Any])
  }
}
