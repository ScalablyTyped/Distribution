package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constraints applied to pods.
  */
@js.native
trait SchemaMaxPodsConstraint extends js.Object {
  /**
    * Constraint enforced on the max num of pods per node.
    */
  var maxPodsPerNode: js.UndefOr[String] = js.native
}

object SchemaMaxPodsConstraint {
  @scala.inline
  def apply(maxPodsPerNode: String = null): SchemaMaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    if (maxPodsPerNode != null) __obj.updateDynamic("maxPodsPerNode")(maxPodsPerNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaxPodsConstraint]
  }
}

