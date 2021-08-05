package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentFilter extends StObject {
  
  /**
    * If true, match the complement of simple or sequence segment. For example, to match all visits not from "New York", we can define the segment as follows: "sessionSegment": {
    * "segmentFilters": [{ "simpleSegment" :{ "orFiltersForSegment": [{ "segmentFilterClauses":[{ "dimensionFilter": { "dimensionName": "ga:city", "expressions": ["New York"] } }] }] },
    * "not": "True" }] },
    */
  var not: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sequence conditions consist of one or more steps, where each step is defined by one or more dimension/metric conditions. Multiple steps can be combined with special sequence
    * operators.
    */
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.undefined
  
  /** A Simple segment conditions consist of one or more dimension/metric conditions that can be combined */
  var simpleSegment: js.UndefOr[SimpleSegment] = js.undefined
}
object SegmentFilter {
  
  inline def apply(): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilter]
  }
  
  extension [Self <: SegmentFilter](x: Self) {
    
    inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setSequenceSegment(value: SequenceSegment): Self = StObject.set(x, "sequenceSegment", value.asInstanceOf[js.Any])
    
    inline def setSequenceSegmentUndefined: Self = StObject.set(x, "sequenceSegment", js.undefined)
    
    inline def setSimpleSegment(value: SimpleSegment): Self = StObject.set(x, "simpleSegment", value.asInstanceOf[js.Any])
    
    inline def setSimpleSegmentUndefined: Self = StObject.set(x, "simpleSegment", js.undefined)
  }
}
