package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the Cloud Run feature.
  */
@js.native
trait SchemaCloudRunConfig extends js.Object {
  /**
    * Whether Cloud Run addon is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaCloudRunConfig {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): SchemaCloudRunConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudRunConfig]
  }
}

