package typings.googleapis.fileV1Mod.fileV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Network configuration for the instance.
  */
@js.native
trait SchemaNetworkConfig extends js.Object {
  /**
    * Output only. IPv4 addresses in the format {octet 1}.{octet 2}.{octet
    * 3}.{octet 4} or IPv6 addresses in the format {block 1}:{block 2}:{block
    * 3}:{block 4}:{block 5}:{block 6}:{block 7}:{block 8}.
    */
  var ipAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Internet protocol versions for which the instance has IP addresses
    * assigned. For this version, only MODE_IPV4 is supported.
    */
  var modes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the Google Compute Engine [VPC
    * network](/compute/docs/networks-and-firewalls#networks) to which the
    * instance is connected.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * A /29 CIDR block in one of the [internal IP address
    * ranges](https://www.arin.net/knowledge/address_filters.html) that
    * identifies the range of IP addresses reserved for this instance. For
    * example, 10.0.0.0/29 or 192.168.0.0/29. The range you specify can&#39;t
    * overlap with either existing subnets or assigned IP address ranges for
    * other Cloud Filestore instances in the selected VPC network.
    */
  var reservedIpRange: js.UndefOr[String] = js.native
}

object SchemaNetworkConfig {
  @scala.inline
  def apply(
    ipAddresses: js.Array[String] = null,
    modes: js.Array[String] = null,
    network: String = null,
    reservedIpRange: String = null
  ): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    if (ipAddresses != null) __obj.updateDynamic("ipAddresses")(ipAddresses.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (reservedIpRange != null) __obj.updateDynamic("reservedIpRange")(reservedIpRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
}

