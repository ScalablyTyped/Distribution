package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsAssetsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
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
  var compareDuration: js.UndefOr[String] = js.native
  /**
    * Optional.  A field mask to specify the ListAssetsResult fields to be
    * listed in the response. An empty field mask will list all fields.
    */
  var fieldMask: js.UndefOr[String] = js.native
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
  var filter: js.UndefOr[String] = js.native
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
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListAssetsResponse`; indicates that this
    * is a continuation of a prior `ListAssets` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Name of the organization assets should belong to. Its format is
    * "organizations/[organization_id]".
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Time used as a reference point when filtering assets. The filter is
    * limited to assets existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API's version of NOW.
    */
  var readTime: js.UndefOr[String] = js.native
}

object ParamsResourceOrganizationsAssetsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    compareDuration: String = null,
    fieldMask: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    readTime: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceOrganizationsAssetsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (compareDuration != null) __obj.updateDynamic("compareDuration")(compareDuration.asInstanceOf[js.Any])
    if (fieldMask != null) __obj.updateDynamic("fieldMask")(fieldMask.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceOrganizationsAssetsList]
  }
}

