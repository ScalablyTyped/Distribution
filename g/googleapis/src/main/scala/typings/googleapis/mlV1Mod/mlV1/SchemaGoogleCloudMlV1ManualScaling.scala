package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for manually scaling a model.
  */
@js.native
trait SchemaGoogleCloudMlV1ManualScaling extends js.Object {
  /**
    * The number of nodes to allocate for this model. These nodes are always
    * up, starting from the time the model is deployed, so the cost of
    * operating this model will be proportional to `nodes` * number of hours
    * since last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudMlV1ManualScaling {
  @scala.inline
  def apply(nodes: js.UndefOr[Double] = js.undefined): SchemaGoogleCloudMlV1ManualScaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nodes)) __obj.updateDynamic("nodes")(nodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ManualScaling]
  }
}

