package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkConfig reports the relative names of network &amp; subnetwork.
  */
@js.native
trait SchemaNetworkConfig extends js.Object {
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
  implicit class SchemaNetworkConfigOps[Self <: SchemaNetworkConfig] (val x: Self) extends AnyVal {
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

