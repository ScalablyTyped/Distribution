package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsSetDefaultNetworkTierRequest extends StObject {
  
  /** Default network tier to be set. */
  var networkTier: js.UndefOr[String] = js.undefined
}
object ProjectsSetDefaultNetworkTierRequest {
  
  inline def apply(): ProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsSetDefaultNetworkTierRequest]
  }
  
  extension [Self <: ProjectsSetDefaultNetworkTierRequest](x: Self) {
    
    inline def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    inline def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
  }
}
