package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupFindingsRequest extends StObject {
  
  /**
    * When compare_duration is set, the GroupResult&#39;s &quot;state_change&quot; attribute is updated to indicate whether the finding had its state changed, the finding&#39;s state remained unchanged, or if the finding was added during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence and state of the finding at the two points in time. Intermediate state changes between the two times don&#39;t affect the result. For example, the results aren&#39;t affected if the finding is made inactive and then active again. Possible &quot;state_change&quot; values when compare_duration is specified: * &quot;CHANGED&quot;: indicates that the finding was present and matched the given filter at the start of compare_duration, but changed its state at read_time. * &quot;UNCHANGED&quot;: indicates that the finding was present and matched the given filter at the start of compare_duration and did not change state at read_time. * &quot;ADDED&quot;: indicates that the finding did not match the given filter or was not present at the start of compare_duration, but was present at read_time. * &quot;REMOVED&quot;: indicates that the finding was present and matched the filter at the start of compare_duration, but did not match the filter at read_time. If compare_duration is not specified, then the only possible state_change is &quot;UNUSED&quot;, which will be the state_change set for all findings present at read_time. If this field is set then `state_change` must be a specified field in `group_by`.
    */
  var compareDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. Examples include: * name * source_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following field and operator combinations are supported: * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:` * external_uri: `=`, `:` * event_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `event_time = &quot;2019-06-10T16:07:18-07:00&quot;` `event_time = 1560208038000` * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=` For example, `source_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `source_properties.my_property : &quot;&quot;` Use a negated partial match on the empty string to filter based on a property not existing: `-source_properties.my_property : &quot;&quot;`
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Expression that defines what assets fields to use for grouping (including `state_change`). The string value should follow SQL syntax: comma separated list of fields. For example: &quot;parent,resource_name&quot;. The following fields are supported: * resource_name * category * state * parent The following fields are supported when compare_duration is set: * state_change
    */
  var groupBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The value returned by the last `GroupFindingsResponse`; indicates that this is a continuation of a prior `GroupFindings` call, and that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API&#39;s version of NOW.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupFindingsRequest {
  
  inline def apply(): SchemaGroupFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupFindingsRequest]
  }
  
  extension [Self <: SchemaGroupFindingsRequest](x: Self) {
    
    inline def setCompareDuration(value: String): Self = StObject.set(x, "compareDuration", value.asInstanceOf[js.Any])
    
    inline def setCompareDurationNull: Self = StObject.set(x, "compareDuration", null)
    
    inline def setCompareDurationUndefined: Self = StObject.set(x, "compareDuration", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByNull: Self = StObject.set(x, "groupBy", null)
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
