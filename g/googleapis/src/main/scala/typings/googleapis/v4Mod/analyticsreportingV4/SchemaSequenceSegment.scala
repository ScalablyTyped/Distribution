package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaSequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSequenceSegment]
  }
  
  @scala.inline
  implicit class SchemaSequenceSegmentOps[Self <: SchemaSequenceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirstStepShouldMatchFirstHit(value: Boolean): Self = this.set("firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstStepShouldMatchFirstHit: Self = this.set("firstStepShouldMatchFirstHit", js.undefined)
    
    @scala.inline
    def setSegmentSequenceStepsVarargs(value: SchemaSegmentSequenceStep*): Self = this.set("segmentSequenceSteps", js.Array(value :_*))
    
    @scala.inline
    def setSegmentSequenceSteps(value: js.Array[SchemaSegmentSequenceStep]): Self = this.set("segmentSequenceSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentSequenceSteps: Self = this.set("segmentSequenceSteps", js.undefined)
  }
}
