package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksUpdatePeeringRequest extends StObject {
  
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.undefined
}
object SchemaNetworksUpdatePeeringRequest {
  
  inline def apply(): SchemaNetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksUpdatePeeringRequest]
  }
  
  extension [Self <: SchemaNetworksUpdatePeeringRequest](x: Self) {
    
    inline def setNetworkPeering(value: SchemaNetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    inline def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
  }
}
