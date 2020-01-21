package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration used for Asset Discovery runs.
  */
@js.native
trait SchemaAssetDiscoveryConfig extends js.Object {
  /**
    * The mode to use for filtering asset discovery.
    */
  var inclusionMode: js.UndefOr[String] = js.native
  /**
    * The project ids to use for filtering asset discovery.
    */
  var projectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAssetDiscoveryConfig {
  @scala.inline
  def apply(inclusionMode: String = null, projectIds: js.Array[String] = null): SchemaAssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    if (inclusionMode != null) __obj.updateDynamic("inclusionMode")(inclusionMode.asInstanceOf[js.Any])
    if (projectIds != null) __obj.updateDynamic("projectIds")(projectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAssetDiscoveryConfig]
  }
}

