package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConfig extends js.Object {
  
  /**
    * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when default_snat_status is disabled. When disabled is set to false, default IP
    * masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
    */
  var defaultSnatStatus: js.UndefOr[DefaultSnatStatus] = js.native
  
  /** Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod traffic visible for VPC network. */
  var enableIntraNodeVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The relative name of the Google Compute Engine network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected.
    * Example: projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Output only. The relative name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected. Example:
    * projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
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
    def setDefaultSnatStatus(value: DefaultSnatStatus): Self = this.set("defaultSnatStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSnatStatus: Self = this.set("defaultSnatStatus", js.undefined)
    
    @scala.inline
    def setEnableIntraNodeVisibility(value: Boolean): Self = this.set("enableIntraNodeVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIntraNodeVisibility: Self = this.set("enableIntraNodeVisibility", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
  }
}
