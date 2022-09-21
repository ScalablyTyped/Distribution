package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Organizations$Sources$Findings")
@js.native
open class ResourceOrganizationsSourcesFindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFinding] = js.native
  def create(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate): GaxiosPromise[SchemaFinding] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: BodyResponseCallback[Readable | SchemaFinding],
    callback: BodyResponseCallback[Readable | SchemaFinding]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsSourcesFindingsCreate, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesFindingsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
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
    * const securitycenter = google.securitycenter('v1');
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
    *       //   "access": {},
    *       //   "canonicalName": "my_canonicalName",
    *       //   "category": "my_category",
    *       //   "compliances": [],
    *       //   "connections": [],
    *       //   "contacts": {},
    *       //   "containers": [],
    *       //   "createTime": "my_createTime",
    *       //   "database": {},
    *       //   "description": "my_description",
    *       //   "eventTime": "my_eventTime",
    *       //   "exfiltration": {},
    *       //   "externalSystems": {},
    *       //   "externalUri": "my_externalUri",
    *       //   "findingClass": "my_findingClass",
    *       //   "iamBindings": [],
    *       //   "indicator": {},
    *       //   "kubernetes": {},
    *       //   "mitreAttack": {},
    *       //   "mute": "my_mute",
    *       //   "muteInitiator": "my_muteInitiator",
    *       //   "muteUpdateTime": "my_muteUpdateTime",
    *       //   "name": "my_name",
    *       //   "nextSteps": "my_nextSteps",
    *       //   "parent": "my_parent",
    *       //   "processes": [],
    *       //   "resourceName": "my_resourceName",
    *       //   "securityMarks": {},
    *       //   "severity": "my_severity",
    *       //   "sourceProperties": {},
    *       //   "state": "my_state",
    *       //   "vulnerability": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": {},
    *   //   "canonicalName": "my_canonicalName",
    *   //   "category": "my_category",
    *   //   "compliances": [],
    *   //   "connections": [],
    *   //   "contacts": {},
    *   //   "containers": [],
    *   //   "createTime": "my_createTime",
    *   //   "database": {},
    *   //   "description": "my_description",
    *   //   "eventTime": "my_eventTime",
    *   //   "exfiltration": {},
    *   //   "externalSystems": {},
    *   //   "externalUri": "my_externalUri",
    *   //   "findingClass": "my_findingClass",
    *   //   "iamBindings": [],
    *   //   "indicator": {},
    *   //   "kubernetes": {},
    *   //   "mitreAttack": {},
    *   //   "mute": "my_mute",
    *   //   "muteInitiator": "my_muteInitiator",
    *   //   "muteUpdateTime": "my_muteUpdateTime",
    *   //   "name": "my_name",
    *   //   "nextSteps": "my_nextSteps",
    *   //   "parent": "my_parent",
    *   //   "processes": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "severity": "my_severity",
    *   //   "sourceProperties": {},
    *   //   "state": "my_state",
    *   //   "vulnerability": {}
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
  
  var externalSystems: ResourceOrganizationsSourcesFindingsExternalsystems = js.native
  
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
    * Filters an organization or source's findings and groups them by their specified properties. To group across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id\}/sources/-/findings, /v1/folders/{folder_id\}/sources/-/findings, /v1/projects/{project_id\}/sources/-/findings
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
    * const securitycenter = google.securitycenter('v1');
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
    *     // Required. Name of the source to groupBy. Its format is "organizations/[organization_id]/sources/[source_id]", folders/[folder_id]/sources/[source_id], or projects/[project_id]/sources/[source_id]. To groupBy across all sources provide a source_id of `-`. For example: organizations/{organization_id\}/sources/-, folders/{folder_id\}/sources/-, or projects/{project_id\}/sources/-
    *     parent: 'organizations/my-organization/sources/my-source',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "compareDuration": "my_compareDuration",
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
    * Lists an organization or source's findings. To list across all sources provide a `-` as the source id. Example: /v1/organizations/{organization_id\}/sources/-/findings
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
    * const securitycenter = google.securitycenter('v1');
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
    *     // When compare_duration is set, the ListFindingsResult's "state_change" attribute is updated to indicate whether the finding had its state changed, the finding's state remained unchanged, or if the finding was added in any state during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence and state of the finding at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the finding is made inactive and then active again. Possible "state_change" values when compare_duration is specified: * "CHANGED": indicates that the finding was present and matched the given filter at the start of compare_duration, but changed its state at read_time. * "UNCHANGED": indicates that the finding was present and matched the given filter at the start of compare_duration and did not change state at read_time. * "ADDED": indicates that the finding did not match the given filter or was not present at the start of compare_duration, but was present at read_time. * "REMOVED": indicates that the finding was present and matched the filter at the start of compare_duration, but did not match the filter at read_time. If compare_duration is not specified, then the only possible state_change is "UNUSED", which will be the state_change set for all findings present at read_time.
    *     compareDuration: 'placeholder-value',
    *     // A field mask to specify the Finding fields to be listed in the response. An empty field mask will list all fields.
    *     fieldMask: 'placeholder-value',
    *     // Expression that defines the filter to apply across findings. The expression is a list of one or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. Examples include: * name * source_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `\>`, `<`, `\>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following field and operator combinations are supported: * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:` * external_uri: `=`, `:` * event_time: `=`, `\>`, `<`, `\>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `event_time = "2019-06-10T16:07:18-07:00"` `event_time = 1560208038000` * severity: `=`, `:` * workflow_state: `=`, `:` * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `\>`, `<`, `\>=`, `<=` For example, `source_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `source_properties.my_property : ""` Use a negated partial match on the empty string to filter based on a property not existing: `-source_properties.my_property : ""` * resource: * resource.name: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.type: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.display_name: `=`, `:`
    *     filter: 'placeholder-value',
    *     // Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: "name,resource_properties.a_property". The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be appended to the field name. For example: "name desc,source_properties.a_property". Redundant space characters in the syntax are insignificant. "name desc,source_properties.a_property" and " name desc , source_properties.a_property " are equivalent. The following fields are supported: name parent state category resource_name event_time source_properties security_marks.marks
    *     orderBy: 'placeholder-value',
    *     // The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListFindingsResponse`; indicates that this is a continuation of a prior `ListFindings` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the source the findings belong to. Its format is "organizations/[organization_id]/sources/[source_id], folders/[folder_id]/sources/[source_id], or projects/[project_id]/sources/[source_id]". To list across all sources provide a source_id of `-`. For example: organizations/{organization_id\}/sources/-, folders/{folder_id\}/sources/- or projects/{projects_id\}/sources/-
    *     parent: 'organizations/my-organization/sources/my-source',
    *     // Time used as a reference point when filtering findings. The filter is limited to findings existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
    *     readTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "listFindingsResults": [],
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
  
  def patch(): GaxiosPromise[SchemaFinding] = js.native
  def patch(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch): GaxiosPromise[SchemaFinding] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: BodyResponseCallback[Readable | SchemaFinding],
    callback: BodyResponseCallback[Readable | SchemaFinding]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsSourcesFindingsPatch, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesFindingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
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
    * const securitycenter = google.securitycenter('v1');
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
    *     // The FieldMask to use when updating the finding resource. This field should not be specified when creating a finding. When updating a finding, an empty mask is treated as updating all mutable fields and replacing source_properties. Individual source_properties can be added/updated by using "source_properties." in the field mask.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "access": {},
    *       //   "canonicalName": "my_canonicalName",
    *       //   "category": "my_category",
    *       //   "compliances": [],
    *       //   "connections": [],
    *       //   "contacts": {},
    *       //   "containers": [],
    *       //   "createTime": "my_createTime",
    *       //   "database": {},
    *       //   "description": "my_description",
    *       //   "eventTime": "my_eventTime",
    *       //   "exfiltration": {},
    *       //   "externalSystems": {},
    *       //   "externalUri": "my_externalUri",
    *       //   "findingClass": "my_findingClass",
    *       //   "iamBindings": [],
    *       //   "indicator": {},
    *       //   "kubernetes": {},
    *       //   "mitreAttack": {},
    *       //   "mute": "my_mute",
    *       //   "muteInitiator": "my_muteInitiator",
    *       //   "muteUpdateTime": "my_muteUpdateTime",
    *       //   "name": "my_name",
    *       //   "nextSteps": "my_nextSteps",
    *       //   "parent": "my_parent",
    *       //   "processes": [],
    *       //   "resourceName": "my_resourceName",
    *       //   "securityMarks": {},
    *       //   "severity": "my_severity",
    *       //   "sourceProperties": {},
    *       //   "state": "my_state",
    *       //   "vulnerability": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": {},
    *   //   "canonicalName": "my_canonicalName",
    *   //   "category": "my_category",
    *   //   "compliances": [],
    *   //   "connections": [],
    *   //   "contacts": {},
    *   //   "containers": [],
    *   //   "createTime": "my_createTime",
    *   //   "database": {},
    *   //   "description": "my_description",
    *   //   "eventTime": "my_eventTime",
    *   //   "exfiltration": {},
    *   //   "externalSystems": {},
    *   //   "externalUri": "my_externalUri",
    *   //   "findingClass": "my_findingClass",
    *   //   "iamBindings": [],
    *   //   "indicator": {},
    *   //   "kubernetes": {},
    *   //   "mitreAttack": {},
    *   //   "mute": "my_mute",
    *   //   "muteInitiator": "my_muteInitiator",
    *   //   "muteUpdateTime": "my_muteUpdateTime",
    *   //   "name": "my_name",
    *   //   "nextSteps": "my_nextSteps",
    *   //   "parent": "my_parent",
    *   //   "processes": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "severity": "my_severity",
    *   //   "sourceProperties": {},
    *   //   "state": "my_state",
    *   //   "vulnerability": {}
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
  
  def setMute(): GaxiosPromise[SchemaFinding] = js.native
  def setMute(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def setMute(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def setMute(params: ParamsResourceOrganizationsSourcesFindingsSetmute): GaxiosPromise[SchemaFinding] = js.native
  def setMute(
    params: ParamsResourceOrganizationsSourcesFindingsSetmute,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def setMute(
    params: ParamsResourceOrganizationsSourcesFindingsSetmute,
    options: BodyResponseCallback[Readable | SchemaFinding],
    callback: BodyResponseCallback[Readable | SchemaFinding]
  ): Unit = js.native
  def setMute(params: ParamsResourceOrganizationsSourcesFindingsSetmute, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def setMute(
    params: ParamsResourceOrganizationsSourcesFindingsSetmute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  /**
    * Updates the mute state of a finding.
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
    * const securitycenter = google.securitycenter('v1');
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
    *   const res = await securitycenter.organizations.sources.findings.setMute({
    *     // Required. The relative resource name of the finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/sources/{source_id\}/finding/{finding_id\}", "folders/{folder_id\}/sources/{source_id\}/finding/{finding_id\}", "projects/{project_id\}/sources/{source_id\}/finding/{finding_id\}".
    *     name: 'organizations/my-organization/sources/my-source/findings/my-finding',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "mute": "my_mute"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": {},
    *   //   "canonicalName": "my_canonicalName",
    *   //   "category": "my_category",
    *   //   "compliances": [],
    *   //   "connections": [],
    *   //   "contacts": {},
    *   //   "containers": [],
    *   //   "createTime": "my_createTime",
    *   //   "database": {},
    *   //   "description": "my_description",
    *   //   "eventTime": "my_eventTime",
    *   //   "exfiltration": {},
    *   //   "externalSystems": {},
    *   //   "externalUri": "my_externalUri",
    *   //   "findingClass": "my_findingClass",
    *   //   "iamBindings": [],
    *   //   "indicator": {},
    *   //   "kubernetes": {},
    *   //   "mitreAttack": {},
    *   //   "mute": "my_mute",
    *   //   "muteInitiator": "my_muteInitiator",
    *   //   "muteUpdateTime": "my_muteUpdateTime",
    *   //   "name": "my_name",
    *   //   "nextSteps": "my_nextSteps",
    *   //   "parent": "my_parent",
    *   //   "processes": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "severity": "my_severity",
    *   //   "sourceProperties": {},
    *   //   "state": "my_state",
    *   //   "vulnerability": {}
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
  def setMute(params: ParamsResourceOrganizationsSourcesFindingsSetmute, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMute(
    params: ParamsResourceOrganizationsSourcesFindingsSetmute,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setState(): GaxiosPromise[SchemaFinding] = js.native
  def setState(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def setState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate): GaxiosPromise[SchemaFinding] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: BodyResponseCallback[Readable | SchemaFinding],
    callback: BodyResponseCallback[Readable | SchemaFinding]
  ): Unit = js.native
  def setState(params: ParamsResourceOrganizationsSourcesFindingsSetstate, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def setState(
    params: ParamsResourceOrganizationsSourcesFindingsSetstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
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
    * const securitycenter = google.securitycenter('v1');
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
    *   //   "access": {},
    *   //   "canonicalName": "my_canonicalName",
    *   //   "category": "my_category",
    *   //   "compliances": [],
    *   //   "connections": [],
    *   //   "contacts": {},
    *   //   "containers": [],
    *   //   "createTime": "my_createTime",
    *   //   "database": {},
    *   //   "description": "my_description",
    *   //   "eventTime": "my_eventTime",
    *   //   "exfiltration": {},
    *   //   "externalSystems": {},
    *   //   "externalUri": "my_externalUri",
    *   //   "findingClass": "my_findingClass",
    *   //   "iamBindings": [],
    *   //   "indicator": {},
    *   //   "kubernetes": {},
    *   //   "mitreAttack": {},
    *   //   "mute": "my_mute",
    *   //   "muteInitiator": "my_muteInitiator",
    *   //   "muteUpdateTime": "my_muteUpdateTime",
    *   //   "name": "my_name",
    *   //   "nextSteps": "my_nextSteps",
    *   //   "parent": "my_parent",
    *   //   "processes": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "securityMarks": {},
    *   //   "severity": "my_severity",
    *   //   "sourceProperties": {},
    *   //   "state": "my_state",
    *   //   "vulnerability": {}
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
  
  def updateSecurityMarks(): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(callback: BodyResponseCallback[SchemaSecurityMarks]): Unit = js.native
  def updateSecurityMarks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: BodyResponseCallback[Readable | SchemaSecurityMarks],
    callback: BodyResponseCallback[Readable | SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks, options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceOrganizationsSourcesFindingsUpdatesecuritymarks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityMarks]
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
    * const securitycenter = google.securitycenter('v1');
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
    *       // The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time.
    *       startTime: 'placeholder-value',
    *       // The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to "marks", all marks will be replaced. Individual marks can be updated using "marks.".
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "canonicalName": "my_canonicalName",
    *         //   "marks": {},
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "canonicalName": "my_canonicalName",
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
