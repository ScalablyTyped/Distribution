package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegmentFilter extends StObject {
  
  /**
    * If true, match the complement of simple or sequence segment. For example, to match all visits not from "New York", we can define the segment as follows: "sessionSegment": { "segmentFilters": [{ "simpleSegment" :{ "orFiltersForSegment": [{ "segmentFilterClauses":[{ "dimensionFilter": { "dimensionName": "ga:city", "expressions": ["New York"] \} \}] \}] \}, "not": "True" \}] \},
    */
  var not: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Sequence conditions consist of one or more steps, where each step is defined by one or more dimension/metric conditions. Multiple steps can be combined with special sequence operators.
    */
  var sequenceSegment: js.UndefOr[SchemaSequenceSegment] = js.undefined
  
  /**
    * A Simple segment conditions consist of one or more dimension/metric conditions that can be combined
    */
  var simpleSegment: js.UndefOr[SchemaSimpleSegment] = js.undefined
}
object SchemaSegmentFilter {
  
  inline def apply(): SchemaSegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentFilter]
  }
  
  extension [Self <: SchemaSegmentFilter](x: Self) {
    
    inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotNull: Self = StObject.set(x, "not", null)
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setSequenceSegment(value: SchemaSequenceSegment): Self = StObject.set(x, "sequenceSegment", value.asInstanceOf[js.Any])
    
    inline def setSequenceSegmentUndefined: Self = StObject.set(x, "sequenceSegment", js.undefined)
    
    inline def setSimpleSegment(value: SchemaSimpleSegment): Self = StObject.set(x, "simpleSegment", value.asInstanceOf[js.Any])
    
    inline def setSimpleSegmentUndefined: Self = StObject.set(x, "simpleSegment", js.undefined)
  }
}
