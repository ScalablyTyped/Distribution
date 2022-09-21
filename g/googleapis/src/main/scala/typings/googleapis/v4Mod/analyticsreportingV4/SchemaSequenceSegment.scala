package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSequenceSegment extends StObject {
  
  /**
    * If set, first step condition must match the first hit of the visitor (in the date range).
    */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of steps in the sequence.
    */
  var segmentSequenceSteps: js.UndefOr[js.Array[SchemaSegmentSequenceStep]] = js.undefined
}
object SchemaSequenceSegment {
  
  inline def apply(): SchemaSequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSequenceSegment]
  }
  
  extension [Self <: SchemaSequenceSegment](x: Self) {
    
    inline def setFirstStepShouldMatchFirstHit(value: Boolean): Self = StObject.set(x, "firstStepShouldMatchFirstHit", value.asInstanceOf[js.Any])
    
    inline def setFirstStepShouldMatchFirstHitNull: Self = StObject.set(x, "firstStepShouldMatchFirstHit", null)
    
    inline def setFirstStepShouldMatchFirstHitUndefined: Self = StObject.set(x, "firstStepShouldMatchFirstHit", js.undefined)
    
    inline def setSegmentSequenceSteps(value: js.Array[SchemaSegmentSequenceStep]): Self = StObject.set(x, "segmentSequenceSteps", value.asInstanceOf[js.Any])
    
    inline def setSegmentSequenceStepsUndefined: Self = StObject.set(x, "segmentSequenceSteps", js.undefined)
    
    inline def setSegmentSequenceStepsVarargs(value: SchemaSegmentSequenceStep*): Self = StObject.set(x, "segmentSequenceSteps", js.Array(value*))
  }
}
