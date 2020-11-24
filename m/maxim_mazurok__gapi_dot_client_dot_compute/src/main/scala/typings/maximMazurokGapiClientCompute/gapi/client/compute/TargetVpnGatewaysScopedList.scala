package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetVpnGatewaysScopedList extends js.Object {
  
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
  implicit class TargetVpnGatewaysScopedListOps[Self <: TargetVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    
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
    def setTargetVpnGatewaysVarargs(value: TargetVpnGateway*): Self = this.set("targetVpnGateways", js.Array(value :_*))
    
    @scala.inline
    def setTargetVpnGateways(value: js.Array[TargetVpnGateway]): Self = this.set("targetVpnGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVpnGateways: Self = this.set("targetVpnGateways", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
