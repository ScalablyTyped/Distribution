package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggestion by the service to the worker to dynamically split the
  * WorkItem.
  */
@js.native
trait SchemaApproximateSplitRequest extends js.Object {
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the
    * input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double] = js.native
  /**
    * The fraction of the remainder of work to split the work item at, from 0.0
    * (split at the current position) to 1.0 (end of the input).
    */
  var fractionOfRemainder: js.UndefOr[Double] = js.native
  /**
    * A Position at which to split the work item.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
}

object SchemaApproximateSplitRequest {
  @scala.inline
  def apply(
    fractionConsumed: Int | Double = null,
    fractionOfRemainder: Int | Double = null,
    position: SchemaPosition = null
  ): SchemaApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    if (fractionConsumed != null) __obj.updateDynamic("fractionConsumed")(fractionConsumed.asInstanceOf[js.Any])
    if (fractionOfRemainder != null) __obj.updateDynamic("fractionOfRemainder")(fractionOfRemainder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApproximateSplitRequest]
  }
}

