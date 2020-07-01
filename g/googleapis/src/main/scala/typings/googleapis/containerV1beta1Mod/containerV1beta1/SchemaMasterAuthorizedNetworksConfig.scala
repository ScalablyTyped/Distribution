package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the master authorized networks feature. Enabled
  * master authorized networks will disallow all external traffic to access
  * Kubernetes master through HTTPS except traffic from the given CIDR blocks,
  * Google Compute Engine Public IPs and Google Prod IPs.
  */
@js.native
trait SchemaMasterAuthorizedNetworksConfig extends js.Object {
  /**
    * cidr_blocks define up to 10 external networks that could access
    * Kubernetes master through HTTPS.
    */
  var cidrBlocks: js.UndefOr[js.Array[SchemaCidrBlock]] = js.native
  /**
    * Whether or not master authorized networks is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaMasterAuthorizedNetworksConfig {
  @scala.inline
  def apply(cidrBlocks: js.Array[SchemaCidrBlock] = null, enabled: js.UndefOr[Boolean] = js.undefined): SchemaMasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMasterAuthorizedNetworksConfig]
  }
}

