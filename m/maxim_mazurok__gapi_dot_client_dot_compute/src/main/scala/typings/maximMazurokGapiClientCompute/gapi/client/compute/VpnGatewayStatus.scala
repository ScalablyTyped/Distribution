package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewayStatus extends js.Object {
  
  /** List of VPN connection for this VpnGateway. */
  var vpnConnections: js.UndefOr[js.Array[VpnGatewayStatusVpnConnection]] = js.native
}
object VpnGatewayStatus {
  
  @scala.inline
  def apply(): VpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayStatus]
  }
  
  @scala.inline
  implicit class VpnGatewayStatusOps[Self <: VpnGatewayStatus] (val x: Self) extends AnyVal {
    
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
    def setVpnConnectionsVarargs(value: VpnGatewayStatusVpnConnection*): Self = this.set("vpnConnections", js.Array(value :_*))
    
    @scala.inline
    def setVpnConnections(value: js.Array[VpnGatewayStatusVpnConnection]): Self = this.set("vpnConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnConnections: Self = this.set("vpnConnections", js.undefined)
  }
}
