package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsSourcesFindingsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * When compare_duration is set, the ListFindingsResult's "state_change"
    * attribute is updated to indicate whether the finding had its state
    * changed, the finding's state remained unchanged, or if the finding was
    * added in any state during the compare_duration period of time that
    * precedes the read_time. This is the time between (read_time -
    * compare_duration) and read_time.  The state_change value is derived based
    * on the presence and state of the finding at the two points in time.
    * Intermediate state changes between the two times don't affect the result.
    * For example, the results aren't affected if the finding is made inactive
    * and then active again.  Possible "state_change" values when
    * compare_duration is specified:  * "CHANGED":   indicates that the finding
    * was present at the start of                  compare_duration, but
    * changed its state at read_time. * "UNCHANGED": indicates that the finding
    * was present at the start of                  compare_duration and did not
    * change state at read_time. * "ADDED":     indicates that the finding was
    * not present at the start                  of compare_duration, but was
    * present at read_time.  If compare_duration is not specified, then the
    * only possible state_change is "UNUSED", which will be the state_change
    * set for all findings present at read_time.
    */
  var compareDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  A field mask to specify the Finding fields to be listed in the
    * response. An empty field mask will list all fields.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * Expression that defines the filter to apply across findings. The
    * expression is a list of one or more restrictions combined via logical
    * operators `AND` and `OR`. Parentheses are supported, and `OR` has higher
    * precedence than `AND`.  Restrictions have the form `<field> <operator>
    * <value>` and may have a `-` character in front of them to indicate
    * negation. Examples include:   * name  * source_properties.a_property  *
    * security_marks.marks.marka  The supported operators are:  * `=` for all
    * value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning
    * substring matching, for strings.  The supported value types are:  *
    * string literals in quotes. * integer literals without quotes. * boolean
    * literals `true` and `false` without quotes.  The following field and
    * operator combinations are supported: name | `=` parent | '=', ':'
    * resource_name | '=', ':' state | '=', ':' category | '=', ':'
    * external_uri | '=', ':' event_time | `>`, `<`, `>=`, `<=` security_marks
    * | '=', ':' source_properties | '=', ':', `>`, `<`, `>=`, `<=`  For
    * example, `source_properties.size = 100` is a valid filter string.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Expression that defines what fields and order to use for sorting. The
    * string value should follow SQL syntax: comma separated list of fields.
    * For example: "name,resource_properties.a_property". The default sorting
    * order is ascending. To specify descending order for a field, a suffix "
    * desc" should be appended to the field name. For example: "name
    * desc,source_properties.a_property". Redundant space characters in the
    * syntax are insignificant. "name desc,source_properties.a_property" and "
    * name     desc  ,   source_properties.a_property  " are equivalent.  The
    * following fields are supported: name parent state category resource_name
    * event_time source_properties security_marks
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListFindingsResponse`; indicates that
    * this is a continuation of a prior `ListFindings` call, and that the
    * system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the source the findings belong to. Its format is
    * "organizations/[organization_id]/sources/[source_id]". To list across all
    * sources provide a source_id of `-`. For example:
    * organizations/123/sources/-
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Time used as a reference point when filtering findings. The filter is
    * limited to findings existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API's version of NOW.
    */
  var readTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsSourcesFindingsList {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsSourcesFindingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSourcesFindingsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsSourcesFindingsListMutableBuilder[Self <: ParamsResourceOrganizationsSourcesFindingsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCompareDuration(value: String): Self = StObject.set(x, "compareDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareDurationUndefined: Self = StObject.set(x, "compareDuration", js.undefined)
    
    @scala.inline
    def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
