package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IntraNodeVisibilityConfig contains the desired config of the intra-node
  * visibility on this cluster.
  */
@js.native
trait SchemaIntraNodeVisibilityConfig extends js.Object {
  /**
    * Enables intra node visibility for this cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaIntraNodeVisibilityConfig {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaIntraNodeVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIntraNodeVisibilityConfig]
  }
}

