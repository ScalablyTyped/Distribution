package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkConfig reports the relative names of network &amp; subnetwork.
  */
@js.native
trait SchemaNetworkConfig extends js.Object {
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
  def apply(network: String = null, subnetwork: String = null): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
}

