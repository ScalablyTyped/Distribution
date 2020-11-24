package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewaysScopedList extends js.Object {
  
  /** [Output Only] A list of VPN gateways contained in this scope. */
  var vpnGateways: js.UndefOr[js.Array[VpnGateway]] = js.native
  
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object VpnGatewaysScopedList {
  
  @scala.inline
  def apply(): VpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewaysScopedList]
  }
  
  @scala.inline
  implicit class VpnGatewaysScopedListOps[Self <: VpnGatewaysScopedList] (val x: Self) extends AnyVal {
    
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
    def setVpnGatewaysVarargs(value: VpnGateway*): Self = this.set("vpnGateways", js.Array(value :_*))
    
    @scala.inline
    def setVpnGateways(value: js.Array[VpnGateway]): Self = this.set("vpnGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnGateways: Self = this.set("vpnGateways", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
