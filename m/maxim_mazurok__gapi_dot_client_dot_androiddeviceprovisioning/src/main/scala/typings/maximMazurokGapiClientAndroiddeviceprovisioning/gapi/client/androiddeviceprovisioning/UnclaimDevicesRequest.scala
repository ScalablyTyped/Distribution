package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnclaimDevicesRequest extends StObject {
  
  /** Required. The list of devices to unclaim. */
  var unclaims: js.UndefOr[js.Array[PartnerUnclaim]] = js.undefined
}
object UnclaimDevicesRequest {
  
  @scala.inline
  def apply(): UnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnclaimDevicesRequest]
  }
  
  @scala.inline
  implicit class UnclaimDevicesRequestMutableBuilder[Self <: UnclaimDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnclaims(value: js.Array[PartnerUnclaim]): Self = StObject.set(x, "unclaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclaimsUndefined: Self = StObject.set(x, "unclaims", js.undefined)
    
    @scala.inline
    def setUnclaimsVarargs(value: PartnerUnclaim*): Self = StObject.set(x, "unclaims", js.Array(value :_*))
  }
}
