package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UsableSubnetwork resource returns the subnetwork name, its associated
  * network and the primary CIDR range.
  */
@js.native
trait SchemaUsableSubnetwork extends js.Object {
  /**
    * The range of internal addresses that are owned by this subnetwork.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Network Name. Example: projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Secondary IP ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaUsableSubnetworkSecondaryRange]] = js.native
  /**
    * A human readable status message representing the reasons for cases where
    * the caller cannot use the secondary ranges under the subnet. For example
    * if the secondary_ip_ranges is empty due to a permission issue, an
    * insufficient permission message will be given by status_message.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * Subnetwork Name. Example:
    * projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
}

object SchemaUsableSubnetwork {
  @scala.inline
  def apply(
    ipCidrRange: String = null,
    network: String = null,
    secondaryIpRanges: js.Array[SchemaUsableSubnetworkSecondaryRange] = null,
    statusMessage: String = null,
    subnetwork: String = null
  ): SchemaUsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (secondaryIpRanges != null) __obj.updateDynamic("secondaryIpRanges")(secondaryIpRanges.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsableSubnetwork]
  }
}

