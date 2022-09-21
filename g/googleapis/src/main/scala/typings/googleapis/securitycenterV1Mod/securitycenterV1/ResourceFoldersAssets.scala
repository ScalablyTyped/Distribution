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

@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Resource$Folders$Assets")
@js.native
open class ResourceFoldersAssets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def group(): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(callback: BodyResponseCallback[SchemaGroupAssetsResponse]): Unit = js.native
  def group(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(params: ParamsResourceFoldersAssetsGroup): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(
    params: ParamsResourceFoldersAssetsGroup,
    callback: BodyResponseCallback[SchemaGroupAssetsResponse]
  ): Unit = js.native
  def group(
    params: ParamsResourceFoldersAssetsGroup,
    options: BodyResponseCallback[Readable | SchemaGroupAssetsResponse],
    callback: BodyResponseCallback[Readable | SchemaGroupAssetsResponse]
  ): Unit = js.native
  def group(params: ParamsResourceFoldersAssetsGroup, options: MethodOptions): GaxiosPromise[SchemaGroupAssetsResponse] = js.native
  def group(
    params: ParamsResourceFoldersAssetsGroup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupAssetsResponse]
  ): Unit = js.native
  /**
    * Filters an organization's assets and groups them by their specified properties.
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
    *   const res = await securitycenter.folders.assets.group({
    *     // Required. Name of the organization to groupBy. Its format is "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
    *     parent: 'folders/my-folder',
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
  def group(params: ParamsResourceFoldersAssetsGroup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def group(
    params: ParamsResourceFoldersAssetsGroup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(params: ParamsResourceFoldersAssetsList): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(params: ParamsResourceFoldersAssetsList, callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(
    params: ParamsResourceFoldersAssetsList,
    options: BodyResponseCallback[Readable | SchemaListAssetsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFoldersAssetsList, options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(
    params: ParamsResourceFoldersAssetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
  /**
    * Lists an organization's assets.
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
    *   const res = await securitycenter.folders.assets.list({
    *     // When compare_duration is set, the ListAssetsResult's "state_change" attribute is updated to indicate whether the asset was added, removed, or remained present during the compare_duration period of time that precedes the read_time. This is the time between (read_time - compare_duration) and read_time. The state_change value is derived based on the presence of the asset at the two points in time. Intermediate state changes between the two times don't affect the result. For example, the results aren't affected if the asset is removed and re-created again. Possible "state_change" values when compare_duration is specified: * "ADDED": indicates that the asset was not present at the start of compare_duration, but present at read_time. * "REMOVED": indicates that the asset was present at the start of compare_duration, but not present at read_time. * "ACTIVE": indicates that the asset was present at both the start and the end of the time period defined by compare_duration and read_time. If compare_duration is not specified, then the only possible state_change is "UNUSED", which will be the state_change set for all assets present at read_time.
    *     compareDuration: 'placeholder-value',
    *     // A field mask to specify the ListAssetsResult fields to be listed in the response. An empty field mask will list all fields.
    *     fieldMask: 'placeholder-value',
    *     // Expression that defines the filter to apply across assets. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the Asset resource. Examples include: * name * security_center_properties.resource_name * resource_properties.a_property * security_marks.marks.marka The supported operators are: * `=` for all value types. * `\>`, `<`, `\>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes. The following are the allowed field and operator combinations: * name: `=` * update_time: `=`, `\>`, `<`, `\>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `update_time = "2019-06-10T16:07:18-07:00"` `update_time = 1560208038000` * create_time: `=`, `\>`, `<`, `\>=`, `<=` Usage: This should be milliseconds since epoch or an RFC3339 string. Examples: `create_time = "2019-06-10T16:07:18-07:00"` `create_time = 1560208038000` * iam_policy.policy_blob: `=`, `:` * resource_properties: `=`, `:`, `\>`, `<`, `\>=`, `<=` * security_marks.marks: `=`, `:` * security_center_properties.resource_name: `=`, `:` * security_center_properties.resource_display_name: `=`, `:` * security_center_properties.resource_type: `=`, `:` * security_center_properties.resource_parent: `=`, `:` * security_center_properties.resource_parent_display_name: `=`, `:` * security_center_properties.resource_project: `=`, `:` * security_center_properties.resource_project_display_name: `=`, `:` * security_center_properties.resource_owners: `=`, `:` For example, `resource_properties.size = 100` is a valid filter string. Use a partial match on the empty string to filter based on a property existing: `resource_properties.my_property : ""` Use a negated partial match on the empty string to filter based on a property not existing: `-resource_properties.my_property : ""`
    *     filter: 'placeholder-value',
    *     // Expression that defines what fields and order to use for sorting. The string value should follow SQL syntax: comma separated list of fields. For example: "name,resource_properties.a_property". The default sorting order is ascending. To specify descending order for a field, a suffix " desc" should be appended to the field name. For example: "name desc,resource_properties.a_property". Redundant space characters in the syntax are insignificant. "name desc,resource_properties.a_property" and " name desc , resource_properties.a_property " are equivalent. The following fields are supported: name update_time resource_properties security_marks.marks security_center_properties.resource_name security_center_properties.resource_display_name security_center_properties.resource_parent security_center_properties.resource_parent_display_name security_center_properties.resource_project security_center_properties.resource_project_display_name security_center_properties.resource_type
    *     orderBy: 'placeholder-value',
    *     // The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListAssetsResponse`; indicates that this is a continuation of a prior `ListAssets` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the organization assets should belong to. Its format is "organizations/[organization_id], folders/[folder_id], or projects/[project_id]".
    *     parent: 'folders/my-folder',
    *     // Time used as a reference point when filtering assets. The filter is limited to assets existing at the supplied time and their values are those at that specific time. Absence of this field will default to the API's version of NOW.
    *     readTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "listAssetsResults": [],
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
  def list(params: ParamsResourceFoldersAssetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFoldersAssetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSecurityMarks(): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(callback: BodyResponseCallback[SchemaSecurityMarks]): Unit = js.native
  def updateSecurityMarks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(params: ParamsResourceFoldersAssetsUpdatesecuritymarks): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceFoldersAssetsUpdatesecuritymarks,
    callback: BodyResponseCallback[SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(
    params: ParamsResourceFoldersAssetsUpdatesecuritymarks,
    options: BodyResponseCallback[Readable | SchemaSecurityMarks],
    callback: BodyResponseCallback[Readable | SchemaSecurityMarks]
  ): Unit = js.native
  def updateSecurityMarks(params: ParamsResourceFoldersAssetsUpdatesecuritymarks, options: MethodOptions): GaxiosPromise[SchemaSecurityMarks] = js.native
  def updateSecurityMarks(
    params: ParamsResourceFoldersAssetsUpdatesecuritymarks,
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
    *   const res = await securitycenter.folders.assets.updateSecurityMarks({
    *     // The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/{organization_id\}/assets/{asset_id\}/securityMarks" "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}/securityMarks".
    *     name: 'folders/my-folder/assets/my-asset/securityMarks',
    *     // The time at which the updated SecurityMarks take effect. If not set uses current server time. Updates will be applied to the SecurityMarks that are active immediately preceding this time. Must be earlier or equal to the server time.
    *     startTime: 'placeholder-value',
    *     // The FieldMask to use when updating the security marks resource. The field mask must not contain duplicate fields. If empty or set to "marks", all marks will be replaced. Individual marks can be updated using "marks.".
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "canonicalName": "my_canonicalName",
    *       //   "marks": {},
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
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
  def updateSecurityMarks(params: ParamsResourceFoldersAssetsUpdatesecuritymarks, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSecurityMarks(
    params: ParamsResourceFoldersAssetsUpdatesecuritymarks,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
