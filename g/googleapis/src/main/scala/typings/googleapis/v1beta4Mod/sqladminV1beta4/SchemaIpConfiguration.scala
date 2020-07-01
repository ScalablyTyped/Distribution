package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IP Management configuration.
  */
@js.native
trait SchemaIpConfiguration extends js.Object {
  /**
    * The list of external networks that are allowed to connect to the instance
    * using the IP. In CIDR notation, also known as &#39;slash&#39; notation
    * (e.g. 192.168.100.0/24).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SchemaAclEntry]] = js.native
  /**
    * Whether the instance should be assigned an IP address or not.
    */
  var ipv4Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The resource link for the VPC network from which the Cloud SQL instance
    * is accessible for private IP. For example,
    * /projects/myProject/global/networks/default. This setting can be updated,
    * but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String] = js.native
  /**
    * Whether SSL connections over IP should be enforced or not.
    */
  var requireSsl: js.UndefOr[Boolean] = js.native
}

object SchemaIpConfiguration {
  @scala.inline
  def apply(
    authorizedNetworks: js.Array[SchemaAclEntry] = null,
    ipv4Enabled: js.UndefOr[Boolean] = js.undefined,
    privateNetwork: String = null,
    requireSsl: js.UndefOr[Boolean] = js.undefined
  ): SchemaIpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (authorizedNetworks != null) __obj.updateDynamic("authorizedNetworks")(authorizedNetworks.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv4Enabled)) __obj.updateDynamic("ipv4Enabled")(ipv4Enabled.get.asInstanceOf[js.Any])
    if (privateNetwork != null) __obj.updateDynamic("privateNetwork")(privateNetwork.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSsl)) __obj.updateDynamic("requireSsl")(requireSsl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIpConfiguration]
  }
}

