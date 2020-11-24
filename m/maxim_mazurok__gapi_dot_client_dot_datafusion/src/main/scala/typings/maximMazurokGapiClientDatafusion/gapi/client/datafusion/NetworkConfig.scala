package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfig extends js.Object {
  
  /** The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network. */
  var ipAllocation: js.UndefOr[String] = js.native
  
  /**
    * Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host
    * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
    */
  var network: js.UndefOr[String] = js.native
}
object NetworkConfig {
  
  @scala.inline
  def apply(): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfig]
  }
  
  @scala.inline
  implicit class NetworkConfigOps[Self <: NetworkConfig] (val x: Self) extends AnyVal {
    
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
    def setIpAllocation(value: String): Self = this.set("ipAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAllocation: Self = this.set("ipAllocation", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
  }
}
