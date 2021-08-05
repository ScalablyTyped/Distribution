package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDevicesRequest extends StObject {
  
  /** Required. A list of device claims. */
  var claims: js.UndefOr[js.Array[PartnerClaim]] = js.undefined
}
object ClaimDevicesRequest {
  
  inline def apply(): ClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDevicesRequest]
  }
  
  extension [Self <: ClaimDevicesRequest](x: Self) {
    
    inline def setClaims(value: js.Array[PartnerClaim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClaimsVarargs(value: PartnerClaim*): Self = StObject.set(x, "claims", js.Array(value :_*))
  }
}
