package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickupCarrierService extends js.Object {
  
  /** The name of the pickup carrier (e.g., `"UPS"`). Required. */
  var carrierName: js.UndefOr[String] = js.native
  
  /** The name of the pickup service (e.g., `"Access point"`). Required. */
  var serviceName: js.UndefOr[String] = js.native
}
object PickupCarrierService {
  
  @scala.inline
  def apply(): PickupCarrierService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickupCarrierService]
  }
  
  @scala.inline
  implicit class PickupCarrierServiceOps[Self <: PickupCarrierService] (val x: Self) extends AnyVal {
    
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
    def setCarrierName(value: String): Self = this.set("carrierName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierName: Self = this.set("carrierName", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
