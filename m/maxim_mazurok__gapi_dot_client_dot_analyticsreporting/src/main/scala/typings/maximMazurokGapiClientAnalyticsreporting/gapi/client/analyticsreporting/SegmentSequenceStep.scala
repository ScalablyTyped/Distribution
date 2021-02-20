package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentSequenceStep extends StObject {
  
  /** Specifies if the step immediately precedes or can be any time before the next step. */
  var matchType: js.UndefOr[String] = js.native
  
  /** A sequence is specified with a list of Or grouped filters which are combined with `AND` operator. */
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.native
}
object SegmentSequenceStep {
  
  @scala.inline
  def apply(): SegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSequenceStep]
  }
  
  @scala.inline
  implicit class SegmentSequenceStepMutableBuilder[Self <: SegmentSequenceStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    @scala.inline
    def setOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = StObject.set(x, "orFiltersForSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrFiltersForSegmentUndefined: Self = StObject.set(x, "orFiltersForSegment", js.undefined)
    
    @scala.inline
    def setOrFiltersForSegmentVarargs(value: OrFiltersForSegment*): Self = StObject.set(x, "orFiltersForSegment", js.Array(value :_*))
  }
}
