package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsAssetsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * When compare_duration is set, the ListAssetResult's "state" attribute is
    * updated to indicate whether the asset was added, removed, or remained
    * present during the compare_duration period of time that precedes the
    * read_time. This is the time between (read_time - compare_duration) and
    * read_time.  The state value is derived based on the presence of the asset
    * at the two points in time. Intermediate state changes between the two
    * times don't affect the result. For example, the results aren't affected
    * if the asset is removed and re-created again.  Possible "state" values
    * when compare_duration is specified:  * "ADDED": indicates that the asset
    * was not present before              compare_duration, but present at
    * read_time. * "REMOVED": indicates that the asset was present at the start
    * of              compare_duration, but not present at read_time. *
    * "ACTIVE": indicates that the asset was present at both the start and the
    * end of the time period defined by              compare_duration and
    * read_time.  If compare_duration is not specified, then the only possible
    * state is "UNUSED", which indicates that the asset is present at
    * read_time.
    */
  var compareDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  A field mask to specify the ListAssetsResult fields to be
    * listed in the response. An empty field mask will list all fields.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * Expression that defines the filter to apply across assets. The expression
    * is a list of zero or more restrictions combined via logical operators
    * `AND` and `OR`. Parentheses are not supported, and `OR` has higher
    * precedence than `AND`.  Restrictions have the form `<field> <operator>
    * <value>` and may have a `-` character in front of them to indicate
    * negation. The fields map to those defined in the Asset resource. Examples
    * include:  * name * security_center_properties.resource_name *
    * resource_properties.a_property * security_marks.marks.marka  The
    * supported operators are:  * `=` for all value types. * `>`, `<`, `>=`,
    * `<=` for integer values. * `:`, meaning substring matching, for strings.
    * The supported value types are:  * string literals in quotes. * integer
    * literals without quotes. * boolean literals `true` and `false` without
    * quotes.  For example, `resource_properties.size = 100` is a valid filter
    * string.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Expression that defines what fields and order to use for sorting. The
    * string value should follow SQL syntax: comma separated list of fields.
    * For example: "name,resource_properties.a_property". The default sorting
    * order is ascending. To specify descending order for a field, a suffix "
    * desc" should be appended to the field name. For example: "name
    * desc,resource_properties.a_property". Redundant space characters in the
    * syntax are insignificant. "name desc,resource_properties.a_property" and
    * " name     desc  ,   resource_properties.a_property  " are equivalent.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListAssetsResponse`; indicates that this
    * is a continuation of a prior `ListAssets` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the organization assets should belong to. Its format is
    * "organizations/[organization_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Time used as a reference point when filtering assets. The filter is
    * limited to assets existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API's version of NOW.
    */
  var readTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsAssetsList {
  
  inline def apply(): ParamsResourceOrganizationsAssetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsAssetsList]
  }
  
  extension [Self <: ParamsResourceOrganizationsAssetsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCompareDuration(value: String): Self = StObject.set(x, "compareDuration", value.asInstanceOf[js.Any])
    
    inline def setCompareDurationUndefined: Self = StObject.set(x, "compareDuration", js.undefined)
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
