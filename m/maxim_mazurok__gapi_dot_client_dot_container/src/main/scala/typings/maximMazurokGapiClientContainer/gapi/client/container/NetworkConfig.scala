package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfig extends StObject {
  
  /**
    * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when default_snat_status is disabled. When disabled is set to false, default IP
    * masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
    */
  var defaultSnatStatus: js.UndefOr[DefaultSnatStatus] = js.undefined
  
  /** Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod traffic visible for VPC network. */
  var enableIntraNodeVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The relative name of the Google Compute Engine network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected.
    * Example: projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The relative name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected. Example:
    * projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.undefined
}
object NetworkConfig {
  
  @scala.inline
  def apply(): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfig]
  }
  
  @scala.inline
  implicit class NetworkConfigMutableBuilder[Self <: NetworkConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSnatStatus(value: DefaultSnatStatus): Self = StObject.set(x, "defaultSnatStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSnatStatusUndefined: Self = StObject.set(x, "defaultSnatStatus", js.undefined)
    
    @scala.inline
    def setEnableIntraNodeVisibility(value: Boolean): Self = StObject.set(x, "enableIntraNodeVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIntraNodeVisibilityUndefined: Self = StObject.set(x, "enableIntraNodeVisibility", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
