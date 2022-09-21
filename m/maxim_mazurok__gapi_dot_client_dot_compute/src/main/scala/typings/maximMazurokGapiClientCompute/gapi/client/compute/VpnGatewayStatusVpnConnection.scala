package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewayStatusVpnConnection extends StObject {
  
  /** URL reference to the peer external VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway. */
  var peerExternalGateway: js.UndefOr[String] = js.undefined
  
  /** URL reference to the peer side VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway. */
  var peerGcpGateway: js.UndefOr[String] = js.undefined
  
  /** HighAvailabilityRequirementState for the VPN connection. */
  var state: js.UndefOr[VpnGatewayStatusHighAvailabilityRequirementState] = js.undefined
  
  /** List of VPN tunnels that are in this VPN connection. */
  var tunnels: js.UndefOr[js.Array[VpnGatewayStatusTunnel]] = js.undefined
}
object VpnGatewayStatusVpnConnection {
  
  inline def apply(): VpnGatewayStatusVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayStatusVpnConnection]
  }
  
  extension [Self <: VpnGatewayStatusVpnConnection](x: Self) {
    
    inline def setPeerExternalGateway(value: String): Self = StObject.set(x, "peerExternalGateway", value.asInstanceOf[js.Any])
    
    inline def setPeerExternalGatewayUndefined: Self = StObject.set(x, "peerExternalGateway", js.undefined)
    
    inline def setPeerGcpGateway(value: String): Self = StObject.set(x, "peerGcpGateway", value.asInstanceOf[js.Any])
    
    inline def setPeerGcpGatewayUndefined: Self = StObject.set(x, "peerGcpGateway", js.undefined)
    
    inline def setState(value: VpnGatewayStatusHighAvailabilityRequirementState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTunnels(value: js.Array[VpnGatewayStatusTunnel]): Self = StObject.set(x, "tunnels", value.asInstanceOf[js.Any])
    
    inline def setTunnelsUndefined: Self = StObject.set(x, "tunnels", js.undefined)
    
    inline def setTunnelsVarargs(value: VpnGatewayStatusTunnel*): Self = StObject.set(x, "tunnels", js.Array(value*))
  }
}
