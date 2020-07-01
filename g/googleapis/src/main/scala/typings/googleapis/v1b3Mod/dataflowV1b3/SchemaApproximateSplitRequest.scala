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
    fractionConsumed: js.UndefOr[Double] = js.undefined,
    fractionOfRemainder: js.UndefOr[Double] = js.undefined,
    position: SchemaPosition = null
  ): SchemaApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fractionConsumed)) __obj.updateDynamic("fractionConsumed")(fractionConsumed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fractionOfRemainder)) __obj.updateDynamic("fractionOfRemainder")(fractionOfRemainder.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApproximateSplitRequest]
  }
}

