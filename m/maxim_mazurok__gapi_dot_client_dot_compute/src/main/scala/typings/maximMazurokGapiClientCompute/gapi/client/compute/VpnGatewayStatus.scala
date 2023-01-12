package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewayStatus extends StObject {
  
  /** List of VPN connection for this VpnGateway. */
  var vpnConnections: js.UndefOr[js.Array[VpnGatewayStatusVpnConnection]] = js.undefined
}
object VpnGatewayStatus {
  
  inline def apply(): VpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnGatewayStatus] (val x: Self) extends AnyVal {
    
    inline def setVpnConnections(value: js.Array[VpnGatewayStatusVpnConnection]): Self = StObject.set(x, "vpnConnections", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionsUndefined: Self = StObject.set(x, "vpnConnections", js.undefined)
    
    inline def setVpnConnectionsVarargs(value: VpnGatewayStatusVpnConnection*): Self = StObject.set(x, "vpnConnections", js.Array(value*))
  }
}
