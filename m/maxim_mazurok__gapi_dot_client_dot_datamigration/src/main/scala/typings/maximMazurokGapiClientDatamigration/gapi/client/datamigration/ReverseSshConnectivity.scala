package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseSshConnectivity extends js.Object {
  
  /** The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel. */
  var vm: js.UndefOr[String] = js.native
  
  /** Required. The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel. */
  var vmIp: js.UndefOr[String] = js.native
  
  /** Required. The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel. */
  var vmPort: js.UndefOr[Double] = js.native
  
  /** The name of the VPC to peer with the Cloud SQL private network. */
  var vpc: js.UndefOr[String] = js.native
}
object ReverseSshConnectivity {
  
  @scala.inline
  def apply(): ReverseSshConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseSshConnectivity]
  }
  
  @scala.inline
  implicit class ReverseSshConnectivityOps[Self <: ReverseSshConnectivity] (val x: Self) extends AnyVal {
    
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
    def setVm(value: String): Self = this.set("vm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVm: Self = this.set("vm", js.undefined)
    
    @scala.inline
    def setVmIp(value: String): Self = this.set("vmIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmIp: Self = this.set("vmIp", js.undefined)
    
    @scala.inline
    def setVmPort(value: Double): Self = this.set("vmPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmPort: Self = this.set("vmPort", js.undefined)
    
    @scala.inline
    def setVpc(value: String): Self = this.set("vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
}
