package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations$Sources$Findings")
@js.native
open class ResourceOrganizationsSourcesFindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1Finding],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  /**
    * Creates a finding. The corresponding source must exist for finding creation to succeed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.sources.findings.create({
    *     // Required. Unique identifier provided by the client within the parent scope. It must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length.
    *     findingId: 'placeholder-value',
    *     // Required. Resource name of the new finding's parent. Its format should be "organizations/[organization_id]/sources/[source_id]".
    *     parent: 'organizations/my-organization/sources/my-source',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "category": "my_category",
    *       //   "createTime": "my_createTime",
    *       //   "eventTime": "my_eventTime",
    *       //   "externalUri": "my_externalUri",
    *       //   "name": "my_name",
    *       //   "parent": "my_parent",
    *       //   "resourceName": "my_resourceName",
    *       //   "securityMarks": {},
    *       //   "sourceProperties": {},
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "category": "my_category",
    *   //   "createTime": "my_createTime",
    *   //   "eventTime": "my_eventTime",
    *   //   "externalUri": "my_externalUri",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "sourceProperties": {},
    *   //   "state": "my_state"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def group(): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(callback: BodyResponseCallback[SchemaGroupFindingsResponse]): Unit = js.native
  def group(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(params: ParamsResourceOrganizationsSourcesFindingsGroup): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    callback: BodyResponseCallback[SchemaGroupFindingsResponse]
  ): Unit = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    options: BodyResponseCallback[Readable | SchemaGroupFindingsResponse],
    callback: BodyResponseCallback[Readable | SchemaGroupFindingsResponse]
  ): Unit = js.native
  def group(params: ParamsResourceOrganizationsSourcesFindingsGroup, options: MethodOptions): GaxiosPromise[SchemaGroupFindingsResponse] = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupFindingsResponse]
  ): Unit = js.native
  /**
    * Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example: /v1beta1/organizations/{organization_id\}/sources/-/findings
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.sources.findings.group({
    *     // Required. Name of the source to groupBy. Its format is "organizations/[organization_id]/sources/[source_id]". To groupBy across all sources provide a source_id of `-`. For example: organizations/{organization_id\}/sources/-
    *     parent: 'organizations/my-organization/sources/my-source',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filter": "my_filter",
    *       //   "groupBy": "my_groupBy",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "readTime": "my_readTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "groupByResults": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "readTime": "my_readTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def group(params: ParamsResourceOrganizationsSourcesFindingsGroup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def group(
    params: ParamsResourceOrganizationsSourcesFindingsGroup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFindingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(params: ParamsResourceOrganizationsSourcesFindingsList): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    options: BodyResponseCallback[Readable | SchemaListFindingsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsSourcesFindingsList, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  /**
    * Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1beta1/organizations/{organization_id\}/sources/-/findings
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.sources.findings.list({
    *     // Optional. A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
    *     fieldMask: 'placeholder-value',
    *     // Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are not supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. Examples include: * name * source_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `\>`, `<`, `\>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. For example, `source_properties.size = 100` is a valid filter string.
    *     filter: 'placeholder-value',
    *     // Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: "name,resource_properties.a_property". The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be appended to the field name. For example: "name desc,source_properties.a_property". Redundant space characters in the syntax are insignificant. "name desc,source_properties.a_property" and " name desc , source_properties.a_property " are equivalent.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListFindingsResponse`; indicates that this is a continuation of a prior `ListFindings` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the source the findings belong to. Its format is "organizations/[organization_id]/sources/[source_id]". To list across all sources provide a source_id of `-`. For example: organizations/{organization_id\}/sources/-
    *     parent: 'organizations/my-organization/sources/my-source',
    *     // Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
    *     readTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "findings": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "readTime": "my_readTime",
    *   //   "totalSize": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceOrganizationsSourcesFindingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesFindingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1Finding],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  /**
    * Creates or updates a finding. The corresponding source must exist for a finding creation to succeed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.sources.findings.patch({
    *     // The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}"
    *     name: 'organizations/my-organization/sources/my-source/findings/my-finding',
    *     // The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "category": "my_category",
    *       //   "createTime": "my_createTime",
    *       //   "eventTime": "my_eventTime",
    *       //   "externalUri": "my_externalUri",
    *       //   "name": "my_name",
    *       //   "parent": "my_parent",
    *       //   "resourceName": "my_resourceName",
    *       //   "securityMarks": {},
    *       //   "sourceProperties": {},
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "category": "my_category",
    *   //   "createTime": "my_createTime",
    *   //   "eventTime": "my_eventTime",
    *   //   "externalUri": "my_externalUri",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "sourceProperties": {},
    *   //   "state": "my_state"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setState(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def setState(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]): Unit = js.native
  def setState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1Finding],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1Finding] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  ): Unit = js.native
  /**
    * Updates the state of a finding.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await securitycenter.organizations.sources.findings.setState({
    *     // Required. The relative resource name of the finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/sources/{source_id\}/finding/{finding_id\}".
    *     name: 'organizations/my-organization/sources/my-source/findings/my-finding',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "startTime": "my_startTime",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "category": "my_category",
    *   //   "createTime": "my_createTime",
    *   //   "eventTime": "my_eventTime",
    *   //   "externalUri": "my_externalUri",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "sourceProperties": {},
    *   //   "state": "my_state"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSecurityMarks(): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks] = js.native
  def updateSecurityMarks(callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks]): Unit = js.native
  def updateSecurityMarks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks] = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks]
  ): Unit = js.native
  /**
    * Updates security marks.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await securitycenter.organizations.sources.findings.updateSecurityMarks({
    *       // The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/{organization_id\}/assets/{asset_id\}/securityMarks" "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}/securityMarks".
    *       name: 'organizations/my-organization/sources/my-source/findings/my-finding/securityMarks',
    *       // The time at which the updated SecurityMarks take effect.
    *       startTime: 'placeholder-value',
    *       // The FieldMask to use when updating the security marks resource.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "marks": {},
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "marks": {},
    *   //   "name": "my_name"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
