package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for WorkerPool autoscaling.
  */
@js.native
trait SchemaAutoscalingSettings extends js.Object {
  /**
    * The algorithm to use for autoscaling.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * The maximum number of workers to cap scaling at.
    */
  var maxNumWorkers: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingSettings {
  @scala.inline
  def apply(algorithm: String = null, maxNumWorkers: Int | Double = null): SchemaAutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (maxNumWorkers != null) __obj.updateDynamic("maxNumWorkers")(maxNumWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingSettings]
  }
}

