package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewayStatus extends StObject {
  
  /** List of VPN connection for this VpnGateway. */
  var vpnConnections: js.UndefOr[js.Array[VpnGatewayStatusVpnConnection]] = js.undefined
}
object VpnGatewayStatus {
  
  @scala.inline
  def apply(): VpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayStatus]
  }
  
  @scala.inline
  implicit class VpnGatewayStatusMutableBuilder[Self <: VpnGatewayStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnections(value: js.Array[VpnGatewayStatusVpnConnection]): Self = StObject.set(x, "vpnConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionsUndefined: Self = StObject.set(x, "vpnConnections", js.undefined)
    
    @scala.inline
    def setVpnConnectionsVarargs(value: VpnGatewayStatusVpnConnection*): Self = StObject.set(x, "vpnConnections", js.Array(value :_*))
  }
}
