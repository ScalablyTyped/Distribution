package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkConfig reports the relative names of network &amp; subnetwork.
  */
@js.native
trait SchemaNetworkConfig extends StObject {
  
  /**
    * Whether Intra-node visibility is enabled for this cluster. This makes
    * same node pod to pod traffic visible for VPC network.
    */
  var enableIntraNodeVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The relative name of the Google Compute Engine
    * network(/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. Example:
    * projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Output only. The relative name of the Google Compute Engine
    * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
    * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
}
object SchemaNetworkConfig {
  
  @scala.inline
  def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  @scala.inline
  implicit class SchemaNetworkConfigMutableBuilder[Self <: SchemaNetworkConfig] (val x: Self) extends AnyVal {
    
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
