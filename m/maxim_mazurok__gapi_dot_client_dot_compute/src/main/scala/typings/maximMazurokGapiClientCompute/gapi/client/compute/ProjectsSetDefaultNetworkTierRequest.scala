package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsSetDefaultNetworkTierRequest extends StObject {
  
  /** Default network tier to be set. */
  var networkTier: js.UndefOr[String] = js.native
}
object ProjectsSetDefaultNetworkTierRequest {
  
  @scala.inline
  def apply(): ProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsSetDefaultNetworkTierRequest]
  }
  
  @scala.inline
  implicit class ProjectsSetDefaultNetworkTierRequestMutableBuilder[Self <: ProjectsSetDefaultNetworkTierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
  }
}
