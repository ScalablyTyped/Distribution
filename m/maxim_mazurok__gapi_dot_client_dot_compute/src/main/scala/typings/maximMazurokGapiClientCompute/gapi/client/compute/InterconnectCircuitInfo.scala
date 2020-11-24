package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectCircuitInfo extends js.Object {
  
  /** Customer-side demarc ID for this circuit. */
  var customerDemarcId: js.UndefOr[String] = js.native
  
  /** Google-assigned unique ID for this circuit. Assigned at circuit turn-up. */
  var googleCircuitId: js.UndefOr[String] = js.native
  
  /** Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA. */
  var googleDemarcId: js.UndefOr[String] = js.native
}
object InterconnectCircuitInfo {
  
  @scala.inline
  def apply(): InterconnectCircuitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectCircuitInfo]
  }
  
  @scala.inline
  implicit class InterconnectCircuitInfoOps[Self <: InterconnectCircuitInfo] (val x: Self) extends AnyVal {
    
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
    def setCustomerDemarcId(value: String): Self = this.set("customerDemarcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerDemarcId: Self = this.set("customerDemarcId", js.undefined)
    
    @scala.inline
    def setGoogleCircuitId(value: String): Self = this.set("googleCircuitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleCircuitId: Self = this.set("googleCircuitId", js.undefined)
    
    @scala.inline
    def setGoogleDemarcId(value: String): Self = this.set("googleDemarcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleDemarcId: Self = this.set("googleDemarcId", js.undefined)
  }
}
