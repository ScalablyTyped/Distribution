package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsSetDefaultNetworkTierRequest extends js.Object {
  /**
    * Default network tier to be set.
    */
  var networkTier: js.UndefOr[String] = js.native
}

object SchemaProjectsSetDefaultNetworkTierRequest {
  @scala.inline
  def apply(networkTier: String = null): SchemaProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    if (networkTier != null) __obj.updateDynamic("networkTier")(networkTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectsSetDefaultNetworkTierRequest]
  }
}

