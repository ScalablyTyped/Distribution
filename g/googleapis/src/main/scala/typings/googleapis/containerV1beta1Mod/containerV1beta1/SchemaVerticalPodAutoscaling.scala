package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VerticalPodAutoscaling contains global, per-cluster information required by
  * Vertical Pod Autoscaler to automatically adjust the resources of pods
  * controlled by it.
  */
@js.native
trait SchemaVerticalPodAutoscaling extends js.Object {
  /**
    * Enables vertical pod autoscaling.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaVerticalPodAutoscaling {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaVerticalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVerticalPodAutoscaling]
  }
}

