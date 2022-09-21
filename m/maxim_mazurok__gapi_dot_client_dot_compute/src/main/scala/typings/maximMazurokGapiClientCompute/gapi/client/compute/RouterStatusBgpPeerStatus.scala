package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterStatusBgpPeerStatus extends StObject {
  
  /** Routes that were advertised to the remote BGP peer */
  var advertisedRoutes: js.UndefOr[js.Array[Route]] = js.undefined
  
  /** IP address of the local BGP interface. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /** URL of the VPN tunnel that this BGP peer controls. */
  var linkedVpnTunnel: js.UndefOr[String] = js.undefined
  
  /** Name of this BGP peer. Unique within the Routers resource. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Number of routes learned from the remote BGP Peer. */
  var numLearnedRoutes: js.UndefOr[Double] = js.undefined
  
  /** IP address of the remote BGP interface. */
  var peerIpAddress: js.UndefOr[String] = js.undefined
  
  /** BGP state as specified in RFC1771. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Status of the BGP peer: {UP, DOWN} */
  var status: js.UndefOr[String] = js.undefined
  
  /** Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds */
  var uptime: js.UndefOr[String] = js.undefined
  
  /** Time this session has been up, in seconds. Format: 145 */
  var uptimeSeconds: js.UndefOr[String] = js.undefined
}
object RouterStatusBgpPeerStatus {
  
  inline def apply(): RouterStatusBgpPeerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterStatusBgpPeerStatus]
  }
  
  extension [Self <: RouterStatusBgpPeerStatus](x: Self) {
    
    inline def setAdvertisedRoutes(value: js.Array[Route]): Self = StObject.set(x, "advertisedRoutes", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedRoutesUndefined: Self = StObject.set(x, "advertisedRoutes", js.undefined)
    
    inline def setAdvertisedRoutesVarargs(value: Route*): Self = StObject.set(x, "advertisedRoutes", js.Array(value*))
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setLinkedVpnTunnel(value: String): Self = StObject.set(x, "linkedVpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setLinkedVpnTunnelUndefined: Self = StObject.set(x, "linkedVpnTunnel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumLearnedRoutes(value: Double): Self = StObject.set(x, "numLearnedRoutes", value.asInstanceOf[js.Any])
    
    inline def setNumLearnedRoutesUndefined: Self = StObject.set(x, "numLearnedRoutes", js.undefined)
    
    inline def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUptime(value: String): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
    
    inline def setUptimeSeconds(value: String): Self = StObject.set(x, "uptimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setUptimeSecondsUndefined: Self = StObject.set(x, "uptimeSeconds", js.undefined)
    
    inline def setUptimeUndefined: Self = StObject.set(x, "uptime", js.undefined)
  }
}
