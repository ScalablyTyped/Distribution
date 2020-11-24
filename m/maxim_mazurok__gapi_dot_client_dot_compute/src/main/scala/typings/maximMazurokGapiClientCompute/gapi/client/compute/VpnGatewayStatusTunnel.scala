package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewayStatusTunnel extends js.Object {
  
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
  implicit class VpnGatewayStatusTunnelOps[Self <: VpnGatewayStatusTunnel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocalGatewayInterface(value: Double): Self = this.set("localGatewayInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayInterface: Self = this.set("localGatewayInterface", js.undefined)
    
    @scala.inline
    def setPeerGatewayInterface(value: Double): Self = this.set("peerGatewayInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerGatewayInterface: Self = this.set("peerGatewayInterface", js.undefined)
    
    @scala.inline
    def setTunnelUrl(value: String): Self = this.set("tunnelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunnelUrl: Self = this.set("tunnelUrl", js.undefined)
  }
}
