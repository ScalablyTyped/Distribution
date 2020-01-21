package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations$Sources$Findings")
@js.native
class ResourceOrganizationsSourcesFindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * securitycenter.organizations.sources.findings.create
    * @desc Creates a finding. The corresponding source must exist for finding
    * creation to succeed.
    * @alias securitycenter.organizations.sources.findings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.findingId Unique identifier provided by the client within the parent scope. It must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length.
    * @param {string} params.parent Resource name of the new finding's parent. Its format should be "organizations/[organization_id]/sources/[source_id]".
    * @param {().Finding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaFinding] = js.native
  def create(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate): GaxiosPromise[SchemaFinding] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: BodyResponseCallback[SchemaFinding],
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.group
    * @desc Filters an organization or source's findings and  groups them by
    * their specified properties.  To group across all sources provide a `-` as
    * the source id. Example: /v1beta1/organizations/123/sources/-/findings
    * @alias securitycenter.organizations.sources.findings.group
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the source to groupBy. Its format is "organizations/[organization_id]/sources/[source_id]". To groupBy across all sources provide a source_id of `-`. For example: organizations/123/sources/-
    * @param {().GroupFindingsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def group(): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(callback: BodyResponseCallback[SchemaGroupFindingsResponse]): Unit = js.native
  def group(params: ParamsResourceOrganizationsSourcesFindingsGroup): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    callback: BodyResponseCallback[SchemaGroupFindingsResponse]
  ): Unit = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    options: BodyResponseCallback[SchemaGroupFindingsResponse],
    callback: BodyResponseCallback[SchemaGroupFindingsResponse]
  ): Unit = js.native
  def group(params: ParamsResourceOrganizationsSourcesFindingsGroup, options: MethodOptions): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupFindingsResponse]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.list
    * @desc Lists an organization or source's findings.  To list across all
    * sources provide a `-` as the source id. Example:
    * /v1beta1/organizations/123/sources/-/findings
    * @alias securitycenter.organizations.sources.findings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fieldMask Optional.  A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
    * @param {string=} params.filter Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are not supported, and `OR` has higher precedence than `AND`.  Restrictions have the form `<field> <operator> <value>` and may have a `-` character in front of them to indicate negation. Examples include:   * name  * source_properties.a_property  * security_marks.marks.marka  The supported operators are:  * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings.  The supported value types are:  * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.  For example, `source_properties.size = 100` is a valid filter string.
    * @param {string=} params.orderBy Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: "name,resource_properties.a_property". The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be appended to the field name. For example: "name desc,source_properties.a_property". Redundant space characters in the syntax are insignificant. "name desc,source_properties.a_property" and " name     desc  ,   source_properties.a_property  " are equivalent.
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    * @param {string=} params.pageToken The value returned by the last `ListFindingsResponse`; indicates that this is a continuation of a prior `ListFindings` call, and that the system should return the next page of data.
    * @param {string} params.parent Name of the source the findings belong to. Its format is "organizations/[organization_id]/sources/[source_id]". To list across all sources provide a source_id of `-`. For example: organizations/123/sources/-
    * @param {string=} params.readTime Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFindingsResponse]): Unit = js.native
  def list(params: ParamsResourceOrganizationsSourcesFindingsList): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    options: BodyResponseCallback[SchemaListFindingsResponse],
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsSourcesFindingsList, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.patch
    * @desc Creates or updates a finding. The corresponding source must exist
    * for a finding creation to succeed.
    * @alias securitycenter.organizations.sources.findings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/sources/456/findings/789"
    * @param {string=} params.updateMask The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding.
    * @param {().Finding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaFinding] = js.native
  def patch(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch): GaxiosPromise[SchemaFinding] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: BodyResponseCallback[SchemaFinding],
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.setState
    * @desc Updates the state of a finding.
    * @alias securitycenter.organizations.sources.findings.setState
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/sources/456/finding/789".
    * @param {().SetFindingStateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setState(): GaxiosPromise[SchemaFinding] = js.native
  def setState(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate): GaxiosPromise[SchemaFinding] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: BodyResponseCallback[SchemaFinding],
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  /**
    * securitycenter.organizations.sources.findings.updateSecurityMarks
    * @desc Updates security marks.
    * @alias securitycenter.organizations.sources.findings.updateSecurityMarks
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/123/assets/456/securityMarks" "organizations/123/sources/456/findings/789/securityMarks".
    * @param {string=} params.startTime The time at which the updated SecurityMarks take effect.
    * @param {string=} params.updateMask The FieldMask to use when updating the security marks resource.
    * @param {().SecurityMarks} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateSecurityMarks(): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(callback: BodyResponseCallback[SchemaSecurityMarks]): Unit = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: BodyResponseCallback[SchemaSecurityMarks],
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks, options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
}

