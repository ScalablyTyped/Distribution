package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewayStatusTunnel extends StObject {
  
  /** The VPN gateway interface this VPN tunnel is associated with. */
  var localGatewayInterface: js.UndefOr[Double] = js.native
  
  /** The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway. */
  var peerGatewayInterface: js.UndefOr[Double] = js.native
  
  /** URL reference to the VPN tunnel. */
  var tunnelUrl: js.UndefOr[String] = js.native
}
object VpnGatewayStatusTunnel {
  
  @scala.inline
  def apply(): VpnGatewayStatusTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayStatusTunnel]
  }
  
  @scala.inline
  implicit class VpnGatewayStatusTunnelMutableBuilder[Self <: VpnGatewayStatusTunnel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayInterface(value: Double): Self = StObject.set(x, "localGatewayInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayInterfaceUndefined: Self = StObject.set(x, "localGatewayInterface", js.undefined)
    
    @scala.inline
    def setPeerGatewayInterface(value: Double): Self = StObject.set(x, "peerGatewayInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerGatewayInterfaceUndefined: Self = StObject.set(x, "peerGatewayInterface", js.undefined)
    
    @scala.inline
    def setTunnelUrl(value: String): Self = StObject.set(x, "tunnelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUrlUndefined: Self = StObject.set(x, "tunnelUrl", js.undefined)
  }
}
