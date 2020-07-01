package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sequence conditions consist of one or more steps, where each step is
  * defined by one or more dimension/metric conditions. Multiple steps can be
  * combined with special sequence operators.
  */
@js.native
trait SchemaSequenceSegment extends js.Object {
  /**
    * If set, first step condition must match the first hit of the visitor (in
    * the date range).
    */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.native
  /**
    * The list of steps in the sequence.
    */
  var segmentSequenceSteps: js.UndefOr[js.Array[SchemaSegmentSequenceStep]] = js.native
}

object SchemaSequenceSegment {
  @scala.inline
  def apply(
    firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.undefined,
    segmentSequenceSteps: js.Array[SchemaSegmentSequenceStep] = null
  ): SchemaSequenceSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(firstStepShouldMatchFirstHit)) __obj.updateDynamic("firstStepShouldMatchFirstHit")(firstStepShouldMatchFirstHit.get.asInstanceOf[js.Any])
    if (segmentSequenceSteps != null) __obj.updateDynamic("segmentSequenceSteps")(segmentSequenceSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSequenceSegment]
  }
}

