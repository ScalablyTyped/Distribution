package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sequence conditions consist of one or more steps, where each step is
  * defined by one or more dimension/metric conditions. Multiple steps can be
  * combined with special sequence operators.
  */
@js.native
trait SchemaSequenceSegment extends StObject {
  
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
  implicit class SchemaSequenceSegmentMutableBuilder[Self <: SchemaSequenceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstStepShouldMatchFirstHit(value: Boolean): Self = StObject.set(x, "firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstStepShouldMatchFirstHitUndefined: Self = StObject.set(x, "firstStepShouldMatchFirstHit", js.undefined)
    
    @scala.inline
    def setSegmentSequenceSteps(value: js.Array[SchemaSegmentSequenceStep]): Self = StObject.set(x, "segmentSequenceSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentSequenceStepsUndefined: Self = StObject.set(x, "segmentSequenceSteps", js.undefined)
    
    @scala.inline
    def setSegmentSequenceStepsVarargs(value: SchemaSegmentSequenceStep*): Self = StObject.set(x, "segmentSequenceSteps", js.Array(value :_*))
  }
}
