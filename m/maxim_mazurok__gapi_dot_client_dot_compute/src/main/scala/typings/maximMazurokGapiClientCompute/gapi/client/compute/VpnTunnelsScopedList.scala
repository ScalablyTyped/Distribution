package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnTunnelsScopedList extends StObject {
  
  /** A list of VPN tunnels contained in this scope. */
  var vpnTunnels: js.UndefOr[js.Array[VpnTunnel]] = js.undefined
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object VpnTunnelsScopedList {
  
  @scala.inline
  def apply(): VpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelsScopedList]
  }
  
  @scala.inline
  implicit class VpnTunnelsScopedListMutableBuilder[Self <: VpnTunnelsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnTunnels(value: js.Array[VpnTunnel]): Self = StObject.set(x, "vpnTunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnTunnelsUndefined: Self = StObject.set(x, "vpnTunnels", js.undefined)
    
    @scala.inline
    def setVpnTunnelsVarargs(value: VpnTunnel*): Self = StObject.set(x, "vpnTunnels", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
