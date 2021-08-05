package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterStatus extends StObject {
  
  /**
    * Best routes for this router&#39;s network.
    */
  var bestRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.undefined
  
  /**
    * Best routes learned by this router.
    */
  var bestRoutesForRouter: js.UndefOr[js.Array[SchemaRoute]] = js.undefined
  
  var bgpPeerStatus: js.UndefOr[js.Array[SchemaRouterStatusBgpPeerStatus]] = js.undefined
  
  var natStatus: js.UndefOr[js.Array[SchemaRouterStatusNatStatus]] = js.undefined
  
  /**
    * URI of the network to which this router belongs.
    */
  var network: js.UndefOr[String] = js.undefined
}
object SchemaRouterStatus {
  
  inline def apply(): SchemaRouterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatus]
  }
  
  extension [Self <: SchemaRouterStatus](x: Self) {
    
    inline def setBestRoutes(value: js.Array[SchemaRoute]): Self = StObject.set(x, "bestRoutes", value.asInstanceOf[js.Any])
    
    inline def setBestRoutesForRouter(value: js.Array[SchemaRoute]): Self = StObject.set(x, "bestRoutesForRouter", value.asInstanceOf[js.Any])
    
    inline def setBestRoutesForRouterUndefined: Self = StObject.set(x, "bestRoutesForRouter", js.undefined)
    
    inline def setBestRoutesForRouterVarargs(value: SchemaRoute*): Self = StObject.set(x, "bestRoutesForRouter", js.Array(value :_*))
    
    inline def setBestRoutesUndefined: Self = StObject.set(x, "bestRoutes", js.undefined)
    
    inline def setBestRoutesVarargs(value: SchemaRoute*): Self = StObject.set(x, "bestRoutes", js.Array(value :_*))
    
    inline def setBgpPeerStatus(value: js.Array[SchemaRouterStatusBgpPeerStatus]): Self = StObject.set(x, "bgpPeerStatus", value.asInstanceOf[js.Any])
    
    inline def setBgpPeerStatusUndefined: Self = StObject.set(x, "bgpPeerStatus", js.undefined)
    
    inline def setBgpPeerStatusVarargs(value: SchemaRouterStatusBgpPeerStatus*): Self = StObject.set(x, "bgpPeerStatus", js.Array(value :_*))
    
    inline def setNatStatus(value: js.Array[SchemaRouterStatusNatStatus]): Self = StObject.set(x, "natStatus", value.asInstanceOf[js.Any])
    
    inline def setNatStatusUndefined: Self = StObject.set(x, "natStatus", js.undefined)
    
    inline def setNatStatusVarargs(value: SchemaRouterStatusNatStatus*): Self = StObject.set(x, "natStatus", js.Array(value :_*))
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
