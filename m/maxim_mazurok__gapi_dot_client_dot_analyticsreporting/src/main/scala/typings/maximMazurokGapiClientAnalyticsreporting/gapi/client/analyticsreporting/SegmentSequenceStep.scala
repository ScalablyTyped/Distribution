package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentSequenceStep extends StObject {
  
  /** Specifies if the step immediately precedes or can be any time before the next step. */
  var matchType: js.UndefOr[String] = js.undefined
  
  /** A sequence is specified with a list of Or grouped filters which are combined with `AND` operator. */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.undefined
}
object SegmentSequenceStep {
  
  inline def apply(): SegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSequenceStep]
  }
  
  extension [Self <: SegmentSequenceStep](x: Self) {
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
    
    inline def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
    
    inline def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value*))
  }
}
