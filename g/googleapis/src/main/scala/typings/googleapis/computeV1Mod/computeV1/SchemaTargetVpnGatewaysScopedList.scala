package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetVpnGatewaysScopedList extends StObject {
  
  /**
    * [Output Only] A list of target VPN gateways contained in this scope.
    */
  var targetVpnGateways: js.UndefOr[js.Array[SchemaTargetVpnGateway]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaTargetVpnGatewaysScopedList {
  
  @scala.inline
  def apply(): SchemaTargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetVpnGatewaysScopedList]
  }
  
  @scala.inline
  implicit class SchemaTargetVpnGatewaysScopedListMutableBuilder[Self <: SchemaTargetVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetVpnGateways(value: js.Array[SchemaTargetVpnGateway]): Self = StObject.set(x, "targetVpnGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVpnGatewaysUndefined: Self = StObject.set(x, "targetVpnGateways", js.undefined)
    
    @scala.inline
    def setTargetVpnGatewaysVarargs(value: SchemaTargetVpnGateway*): Self = StObject.set(x, "targetVpnGateways", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
