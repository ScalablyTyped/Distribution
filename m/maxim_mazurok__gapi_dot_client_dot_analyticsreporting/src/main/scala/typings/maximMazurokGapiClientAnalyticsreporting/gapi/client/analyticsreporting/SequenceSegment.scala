package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceSegment extends StObject {
  
  /** If set, first step condition must match the first hit of the visitor (in the date range). */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.native
  
  /** The list of steps in the sequence. */
  var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.native
}
object SequenceSegment {
  
  @scala.inline
  def apply(): SequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceSegment]
  }
  
  @scala.inline
  implicit class SequenceSegmentMutableBuilder[Self <: SequenceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstStepShouldMatchFirstHit(value: Boolean): Self = StObject.set(x, "firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstStepShouldMatchFirstHitUndefined: Self = StObject.set(x, "firstStepShouldMatchFirstHit", js.undefined)
    
    @scala.inline
    def setSegmentSequenceSteps(value: js.Array[SegmentSequenceStep]): Self = StObject.set(x, "segmentSequenceSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentSequenceStepsUndefined: Self = StObject.set(x, "segmentSequenceSteps", js.undefined)
    
    @scala.inline
    def setSegmentSequenceStepsVarargs(value: SegmentSequenceStep*): Self = StObject.set(x, "segmentSequenceSteps", js.Array(value :_*))
  }
}
