package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetVpnGatewaysScopedList extends StObject {
  
  /** [Output Only] A list of target VPN gateways contained in this scope. */
  var targetVpnGateways: js.UndefOr[js.Array[TargetVpnGateway]] = js.native
  
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetVpnGatewaysScopedList {
  
  @scala.inline
  def apply(): TargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetVpnGatewaysScopedList]
  }
  
  @scala.inline
  implicit class TargetVpnGatewaysScopedListMutableBuilder[Self <: TargetVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetVpnGateways(value: js.Array[TargetVpnGateway]): Self = StObject.set(x, "targetVpnGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVpnGatewaysUndefined: Self = StObject.set(x, "targetVpnGateways", js.undefined)
    
    @scala.inline
    def setTargetVpnGatewaysVarargs(value: TargetVpnGateway*): Self = StObject.set(x, "targetVpnGateways", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
