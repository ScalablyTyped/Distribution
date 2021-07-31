package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworksUpdatePeeringRequest extends StObject {
  
  var networkPeering: js.UndefOr[NetworkPeering] = js.undefined
}
object NetworksUpdatePeeringRequest {
  
  @scala.inline
  def apply(): NetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksUpdatePeeringRequest]
  }
  
  @scala.inline
  implicit class NetworksUpdatePeeringRequestMutableBuilder[Self <: NetworksUpdatePeeringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkPeering(value: NetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
  }
}
