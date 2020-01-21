package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SegmentFilter defines the segment to be either a simple or a sequence
  * segment. A simple segment condition contains dimension and metric
  * conditions to select the sessions or users. A sequence segment condition
  * can be used to select users or sessions based on sequential conditions.
  */
@js.native
trait SchemaSegmentFilter extends js.Object {
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
  def apply(
    not: js.UndefOr[Boolean] = js.undefined,
    sequenceSegment: SchemaSequenceSegment = null,
    simpleSegment: SchemaSimpleSegment = null
  ): SchemaSegmentFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (sequenceSegment != null) __obj.updateDynamic("sequenceSegment")(sequenceSegment.asInstanceOf[js.Any])
    if (simpleSegment != null) __obj.updateDynamic("simpleSegment")(simpleSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegmentFilter]
  }
}

