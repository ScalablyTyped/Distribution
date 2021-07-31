package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterStatus extends StObject {
  
  /** Best routes for this router's network. */
  var bestRoutes: js.UndefOr[js.Array[Route]] = js.undefined
  
  /** Best routes learned by this router. */
  var bestRoutesForRouter: js.UndefOr[js.Array[Route]] = js.undefined
  
  var bgpPeerStatus: js.UndefOr[js.Array[RouterStatusBgpPeerStatus]] = js.undefined
  
  var natStatus: js.UndefOr[js.Array[RouterStatusNatStatus]] = js.undefined
  
  /** URI of the network to which this router belongs. */
  var network: js.UndefOr[String] = js.undefined
}
object RouterStatus {
  
  @scala.inline
  def apply(): RouterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterStatus]
  }
  
  @scala.inline
  implicit class RouterStatusMutableBuilder[Self <: RouterStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestRoutes(value: js.Array[Route]): Self = StObject.set(x, "bestRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestRoutesForRouter(value: js.Array[Route]): Self = StObject.set(x, "bestRoutesForRouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestRoutesForRouterUndefined: Self = StObject.set(x, "bestRoutesForRouter", js.undefined)
    
    @scala.inline
    def setBestRoutesForRouterVarargs(value: Route*): Self = StObject.set(x, "bestRoutesForRouter", js.Array(value :_*))
    
    @scala.inline
    def setBestRoutesUndefined: Self = StObject.set(x, "bestRoutes", js.undefined)
    
    @scala.inline
    def setBestRoutesVarargs(value: Route*): Self = StObject.set(x, "bestRoutes", js.Array(value :_*))
    
    @scala.inline
    def setBgpPeerStatus(value: js.Array[RouterStatusBgpPeerStatus]): Self = StObject.set(x, "bgpPeerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpPeerStatusUndefined: Self = StObject.set(x, "bgpPeerStatus", js.undefined)
    
    @scala.inline
    def setBgpPeerStatusVarargs(value: RouterStatusBgpPeerStatus*): Self = StObject.set(x, "bgpPeerStatus", js.Array(value :_*))
    
    @scala.inline
    def setNatStatus(value: js.Array[RouterStatusNatStatus]): Self = StObject.set(x, "natStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatStatusUndefined: Self = StObject.set(x, "natStatus", js.undefined)
    
    @scala.inline
    def setNatStatusVarargs(value: RouterStatusNatStatus*): Self = StObject.set(x, "natStatus", js.Array(value :_*))
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
