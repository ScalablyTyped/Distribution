package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentFilter extends StObject {
  
  /**
    * If true, match the complement of simple or sequence segment. For example, to match all visits not from "New York", we can define the segment as follows: "sessionSegment": {
    * "segmentFilters": [{ "simpleSegment" :{ "orFiltersForSegment": [{ "segmentFilterClauses":[{ "dimensionFilter": { "dimensionName": "ga:city", "expressions": ["New York"] } }] }] },
    * "not": "True" }] },
    */
  var not: js.UndefOr[Boolean] = js.native
  
  /**
    * Sequence conditions consist of one or more steps, where each step is defined by one or more dimension/metric conditions. Multiple steps can be combined with special sequence
    * operators.
    */
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.native
  
  /** A Simple segment conditions consist of one or more dimension/metric conditions that can be combined */
  var simpleSegment: js.UndefOr[SimpleSegment] = js.native
}
object SegmentFilter {
  
  @scala.inline
  def apply(): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilter]
  }
  
  @scala.inline
  implicit class SegmentFilterMutableBuilder[Self <: SegmentFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setSequenceSegment(value: SequenceSegment): Self = StObject.set(x, "sequenceSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceSegmentUndefined: Self = StObject.set(x, "sequenceSegment", js.undefined)
    
    @scala.inline
    def setSimpleSegment(value: SimpleSegment): Self = StObject.set(x, "simpleSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleSegmentUndefined: Self = StObject.set(x, "simpleSegment", js.undefined)
  }
}
