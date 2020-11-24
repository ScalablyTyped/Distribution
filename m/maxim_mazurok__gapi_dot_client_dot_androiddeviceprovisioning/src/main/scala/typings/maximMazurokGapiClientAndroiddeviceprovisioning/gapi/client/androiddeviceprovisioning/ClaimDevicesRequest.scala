package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimDevicesRequest extends js.Object {
  
  /** Required. A list of device claims. */
  var claims: js.UndefOr[js.Array[PartnerClaim]] = js.native
}
object ClaimDevicesRequest {
  
  @scala.inline
  def apply(): ClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDevicesRequest]
  }
  
  @scala.inline
  implicit class ClaimDevicesRequestOps[Self <: ClaimDevicesRequest] (val x: Self) extends AnyVal {
    
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
    def setClaimsVarargs(value: PartnerClaim*): Self = this.set("claims", js.Array(value :_*))
    
    @scala.inline
    def setClaims(value: js.Array[PartnerClaim]): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
  }
}
