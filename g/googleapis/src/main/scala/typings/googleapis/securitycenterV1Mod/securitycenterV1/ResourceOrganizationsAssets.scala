package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Organizations$Assets")
@js.native
class ResourceOrganizationsAssets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * securitycenter.organizations.assets.group
    * @desc Filters an organization's assets and  groups them by their
    * specified properties.
    * @alias securitycenter.organizations.assets.group
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the organization to groupBy. Its format is "organizations/[organization_id]".
    * @param {().GroupAssetsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def group(): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(callback: BodyResponseCallback[SchemaGroupAssetsResponse]): Unit = js.native
  def group(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(params: ParamsResourceOrganizationsAssetsGroup): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(
    params: ParamsResourceOrganizationsAssetsGroup,
    callback: BodyResponseCallback[SchemaGroupAssetsResponse]
  ): Unit = js.native
  def group(
    params: ParamsResourceOrganizationsAssetsGroup,
    options: BodyResponseCallback[SchemaGroupAssetsResponse],
    callback: BodyResponseCallback[SchemaGroupAssetsResponse]
  ): Unit = js.native
  def group(params: ParamsResourceOrganizationsAssetsGroup, options: MethodOptions): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(
    params: ParamsResourceOrganizationsAssetsGroup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupAssetsResponse]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.assets.list
    * @desc Lists an organization's assets.
    * @alias securitycenter.organizations.assets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.compareDuration When compare_duration is set, the ListAssetsResult's "state_change" attribute is updated to indicate whether the asset was added, removed, or remained present during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time.  The state_change value is derived based on the presence of the asset at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the asset is removed and re-created again.  Possible "state_change" values when compare_duration is specified:  * "ADDED":   indicates that the asset was not present at the start of                compare_duration, but present at read_time. * "REMOVED": indicates that the asset was present at the start of                compare_duration, but not present at read_time. * "ACTIVE":  indicates that the asset was present at both the                start and the end of the time period defined by                compare_duration and read_time.  If compare_duration is not specified, then the only possible state_change is "UNUSED",  which will be the state_change set for all assets present at read_time.
    * @param {string=} params.fieldMask Optional.  A field mask to specify the ListAssetsResult fields to be listed in the response. An empty field mask will list all fields.
    * @param {string=} params.filter Expression that defines the filter to apply across assets. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`.  Restrictions have the form `<field> <operator> <value>` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the Asset resource. Examples include:  * name * security_center_properties.resource_name * resource_properties.a_property * security_marks.marks.marka  The supported operators are:  * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings.  The supported value types are:  * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.  The following are the allowed field and operator combinations: name | `=` update_time | `>`, `<`, `>=`, `<=` iam_policy.policy_blob | '=', ':' resource_properties | '=', ':', `>`, `<`, `>=`, `<=` security_marks | '=', ':' security_center_properties.resource_name | '=', ':' security_center_properties.resource_type | '=', ':' security_center_properties.resource_parent | '=', ':' security_center_properties.resource_project | '=', ':' security_center_properties.resource_owners | '=', ':'  For example, `resource_properties.size = 100` is a valid filter string.
    * @param {string=} params.orderBy Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: "name,resource_properties.a_property". The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be appended to the field name. For example: "name desc,resource_properties.a_property". Redundant space characters in the syntax are insignificant. "name desc,resource_properties.a_property" and " name     desc  ,   resource_properties.a_property  " are equivalent.  The following fields are supported: name update_time resource_properties security_marks security_center_properties.resource_name security_center_properties.resource_parent security_center_properties.resource_project security_center_properties.resource_type
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    * @param {string=} params.pageToken The value returned by the last `ListAssetsResponse`; indicates that this is a continuation of a prior `ListAssets` call, and that the system should return the next page of data.
    * @param {string} params.parent Name of the organization assets should belong to. Its format is "organizations/[organization_id]".
    * @param {string=} params.readTime Time used as a reference point when filtering assets. The filter is limited to assets existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(params: ParamsResourceOrganizationsAssetsList): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsAssetsList,
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsAssetsList,
    options: BodyResponseCallback[SchemaListAssetsResponse],
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsAssetsList, options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsAssetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.assets.runDiscovery
    * @desc Runs asset discovery. The discovery is tracked with a long-running
    * operation.  This API can only be called with limited frequency for an
    * organization. If it is called too frequently the caller will receive a
    * TOO_MANY_REQUESTS error.
    * @alias securitycenter.organizations.assets.runDiscovery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the organization to run asset discovery for. Its format is "organizations/[organization_id]".
    * @param {().RunAssetDiscoveryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runDiscovery(): GaxiosPromise[SchemaOperation] = js.native
  def runDiscovery(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def runDiscovery(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def runDiscovery(params: ParamsResourceOrganizationsAssetsRundiscovery): GaxiosPromise[SchemaOperation] = js.native
  def runDiscovery(
    params: ParamsResourceOrganizationsAssetsRundiscovery,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def runDiscovery(
    params: ParamsResourceOrganizationsAssetsRundiscovery,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def runDiscovery(params: ParamsResourceOrganizationsAssetsRundiscovery, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def runDiscovery(
    params: ParamsResourceOrganizationsAssetsRundiscovery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.assets.updateSecurityMarks
    * @desc Updates security marks.
    * @alias securitycenter.organizations.assets.updateSecurityMarks
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/123/assets/456/securityMarks" "organizations/123/sources/456/findings/789/securityMarks".
    * @param {string=} params.startTime The time at which the updated SecurityMarks take effect. If not set uses current server time.  Updates will be applied to the SecurityMarks that are active immediately preceding this time.
    * @param {string=} params.updateMask The FieldMask to use when updating the security marks resource.  The field mask must not contain duplicate fields. If empty or set to "marks", all marks will be replaced.  Individual marks can be updated using "marks.<mark_key>".
    * @param {().SecurityMarks} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateSecurityMarks(): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(callback: BodyResponseCallback[SchemaSecurityMarks]): Unit = js.native
  def updateSecurityMarks(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsAssetsUpdatesecuritymarks): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsAssetsUpdatesecuritymarks,
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsAssetsUpdatesecuritymarks,
    options: BodyResponseCallback[SchemaSecurityMarks],
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsAssetsUpdatesecuritymarks, options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsAssetsUpdatesecuritymarks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
}
