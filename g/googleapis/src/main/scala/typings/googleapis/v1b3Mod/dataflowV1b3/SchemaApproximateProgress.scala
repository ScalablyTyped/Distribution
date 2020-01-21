package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Obsolete in favor of ApproximateReportedProgress and
  * ApproximateSplitRequest.
  */
@js.native
trait SchemaApproximateProgress extends js.Object {
  /**
    * Obsolete.
    */
  var percentComplete: js.UndefOr[Double] = js.native
  /**
    * Obsolete.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
  /**
    * Obsolete.
    */
  var remainingTime: js.UndefOr[String] = js.native
}

object SchemaApproximateProgress {
  @scala.inline
  def apply(
    percentComplete: Int | Double = null,
    position: SchemaPosition = null,
    remainingTime: String = null
  ): SchemaApproximateProgress = {
    val __obj = js.Dynamic.literal()
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (remainingTime != null) __obj.updateDynamic("remainingTime")(remainingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApproximateProgress]
  }
}

