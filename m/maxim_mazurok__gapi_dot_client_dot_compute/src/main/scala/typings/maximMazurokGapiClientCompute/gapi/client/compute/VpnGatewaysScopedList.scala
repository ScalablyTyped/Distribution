package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewaysScopedList extends StObject {
  
  /** [Output Only] A list of VPN gateways contained in this scope. */
  var vpnGateways: js.UndefOr[js.Array[VpnGateway]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object VpnGatewaysScopedList {
  
  inline def apply(): VpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewaysScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnGatewaysScopedList] (val x: Self) extends AnyVal {
    
    inline def setVpnGateways(value: js.Array[VpnGateway]): Self = StObject.set(x, "vpnGateways", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewaysUndefined: Self = StObject.set(x, "vpnGateways", js.undefined)
    
    inline def setVpnGatewaysVarargs(value: VpnGateway*): Self = StObject.set(x, "vpnGateways", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
