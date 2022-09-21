package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceSegment extends StObject {
  
  /** If set, first step condition must match the first hit of the visitor (in the date range). */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.undefined
  
  /** The list of steps in the sequence. */
  var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.undefined
}
object SequenceSegment {
  
  inline def apply(): SequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceSegment]
  }
  
  extension [Self <: SequenceSegment](x: Self) {
    
    inline def setFirstStepShouldMatchFirstHit(value: Boolean): Self = StObject.set(x, "firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
    
    inline def setFirstStepShouldMatchFirstHitUndefined: Self = StObject.set(x, "firstStepShouldMatchFirstHit", js.undefined)
    
    inline def setSegmentSequenceSteps(value: js.Array[SegmentSequenceStep]): Self = StObject.set(x, "segmentSequenceSteps", value.asInstanceOf[js.Any])
    
    inline def setSegmentSequenceStepsUndefined: Self = StObject.set(x, "segmentSequenceSteps", js.undefined)
    
    inline def setSegmentSequenceStepsVarargs(value: SegmentSequenceStep*): Self = StObject.set(x, "segmentSequenceSteps", js.Array(value*))
  }
}
