package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickupServicesPickupService extends js.Object {
  
  /** The name of the carrier (e.g., `"UPS"`). Always present. */
  var carrierName: js.UndefOr[String] = js.native
  
  /** The CLDR country code of the carrier (e.g., "US"). Always present. */
  var country: js.UndefOr[String] = js.native
  
  /** The name of the pickup service (e.g., `"Access point"`). Always present. */
  var serviceName: js.UndefOr[String] = js.native
}
object PickupServicesPickupService {
  
  @scala.inline
  def apply(): PickupServicesPickupService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickupServicesPickupService]
  }
  
  @scala.inline
  implicit class PickupServicesPickupServiceOps[Self <: PickupServicesPickupService] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
