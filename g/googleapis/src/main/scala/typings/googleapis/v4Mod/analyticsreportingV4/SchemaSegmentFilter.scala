package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SegmentFilter defines the segment to be either a simple or a sequence
  * segment. A simple segment condition contains dimension and metric
  * conditions to select the sessions or users. A sequence segment condition
  * can be used to select users or sessions based on sequential conditions.
  */
@js.native
trait SchemaSegmentFilter extends StObject {
  
  /**
    * If true, match the complement of simple or sequence segment. For example,
    * to match all visits not from &quot;New York&quot;, we can define the
    * segment as follows:        &quot;sessionSegment&quot;: {
    * &quot;segmentFilters&quot;: [{           &quot;simpleSegment&quot; :{
    * &quot;orFiltersForSegment&quot;: [{ &quot;segmentFilterClauses&quot;:[{
    * &quot;dimensionFilter&quot;: { &quot;dimensionName&quot;:
    * &quot;ga:city&quot;,                   &quot;expressions&quot;:
    * [&quot;New York&quot;]                 }               }]             }]
    * },           &quot;not&quot;: &quot;True&quot;         }]       },
    */
  var not: js.UndefOr[Boolean] = js.native
  
  /**
    * Sequence conditions consist of one or more steps, where each step is
    * defined by one or more dimension/metric conditions. Multiple steps can be
    * combined with special sequence operators.
    */
  var sequenceSegment: js.UndefOr[SchemaSequenceSegment] = js.native
  
  /**
    * A Simple segment conditions consist of one or more dimension/metric
    * conditions that can be combined
    */
  var simpleSegment: js.UndefOr[SchemaSimpleSegment] = js.native
}
object SchemaSegmentFilter {
  
  @scala.inline
  def apply(): SchemaSegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentFilter]
  }
  
  @scala.inline
  implicit class SchemaSegmentFilterMutableBuilder[Self <: SchemaSegmentFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setSequenceSegment(value: SchemaSequenceSegment): Self = StObject.set(x, "sequenceSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceSegmentUndefined: Self = StObject.set(x, "sequenceSegment", js.undefined)
    
    @scala.inline
    def setSimpleSegment(value: SchemaSimpleSegment): Self = StObject.set(x, "simpleSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleSegmentUndefined: Self = StObject.set(x, "simpleSegment", js.undefined)
  }
}
