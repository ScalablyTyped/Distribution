package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vmmigration/v1alpha1", "vmmigration_v1alpha1.Resource$Projects$Locations$Sources$Utilizationreports")
@js.native
open class ResourceProjectsLocationsSourcesUtilizationreports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new UtilizationReport.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.utilizationReports.create({
    *       // Required. The Utilization Report's parent.
    *       parent: 'projects/my-project/locations/my-location/sources/my-source',
    *       // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *       // Required. The ID to use for the report, which will become the final component of the reports's resource name. This value maximum length is 63 characters, and valid characters are /a-z-/. It must start with an english letter and must not end with a hyphen.
    *       utilizationReportId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "displayName": "my_displayName",
    *         //   "error": {},
    *         //   "frameEndTime": "my_frameEndTime",
    *         //   "name": "my_name",
    *         //   "state": "my_state",
    *         //   "stateTime": "my_stateTime",
    *         //   "timeFrame": "my_timeFrame",
    *         //   "vmCount": 0,
    *         //   "vms": [],
    *         //   "vmsCount": 0
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single Utilization Report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.utilizationReports.delete({
    *       // Required. The Utilization Report name.
    *       name: 'projects/my-project/locations/my-location/sources/my-source/utilizationReports/my-utilizationReport',
    *       // Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUtilizationReport] = js.native
  def get(callback: BodyResponseCallback[SchemaUtilizationReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUtilizationReport] = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet): GaxiosPromise[SchemaUtilizationReport] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet,
    callback: BodyResponseCallback[SchemaUtilizationReport]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet,
    options: BodyResponseCallback[Readable | SchemaUtilizationReport],
    callback: BodyResponseCallback[Readable | SchemaUtilizationReport]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet, options: MethodOptions): GaxiosPromise[SchemaUtilizationReport] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUtilizationReport]
  ): Unit = js.native
  /**
    * Gets a single Utilization Report.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.utilizationReports.get({
    *       // Required. The Utilization Report name.
    *       name: 'projects/my-project/locations/my-location/sources/my-source/utilizationReports/my-utilizationReport',
    *       // Optional. The level of details of the report. Defaults to FULL
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "error": {},
    *   //   "frameEndTime": "my_frameEndTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "stateTime": "my_stateTime",
    *   //   "timeFrame": "my_timeFrame",
    *   //   "vmCount": 0,
    *   //   "vms": [],
    *   //   "vmsCount": 0
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
  def get(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListUtilizationReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUtilizationReportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUtilizationReportsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList): GaxiosPromise[SchemaListUtilizationReportsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList,
    callback: BodyResponseCallback[SchemaListUtilizationReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList,
    options: BodyResponseCallback[Readable | SchemaListUtilizationReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListUtilizationReportsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList, options: MethodOptions): GaxiosPromise[SchemaListUtilizationReportsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUtilizationReportsResponse]
  ): Unit = js.native
  /**
    * Lists Utilization Reports of the given Source.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vmmigration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vmmigration = google.vmmigration('v1alpha1');
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
    *     await vmmigration.projects.locations.sources.utilizationReports.list({
    *       // Optional. The filter request.
    *       filter: 'placeholder-value',
    *       // Optional. the order by fields for the result.
    *       orderBy: 'placeholder-value',
    *       // Optional. The maximum number of reports to return. The service may return fewer than this value. If unspecified, at most 500 reports will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Required. A page token, received from a previous `ListUtilizationReports` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListUtilizationReports` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The Utilization Reports parent.
    *       parent: 'projects/my-project/locations/my-location/sources/my-source',
    *       // Optional. The level of details of each report. Defaults to BASIC.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": [],
    *   //   "utilizationReports": []
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
  def list(params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesUtilizationreportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
