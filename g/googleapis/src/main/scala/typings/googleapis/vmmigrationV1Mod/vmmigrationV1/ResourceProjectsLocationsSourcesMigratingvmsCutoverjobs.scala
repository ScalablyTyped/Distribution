package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vmmigration/v1", "vmmigration_v1.Resource$Projects$Locations$Sources$Migratingvms$Cutoverjobs")
@js.native
open class ResourceProjectsLocationsSourcesMigratingvmsCutoverjobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaOperation] = js.native
  def cancel(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancel(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel): GaxiosPromise[SchemaOperation] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Initiates the cancellation of a running cutover job.
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
    * const vmmigration = google.vmmigration('v1');
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
    *     await vmmigration.projects.locations.sources.migratingVms.cutoverJobs.cancel(
    *       {
    *         // Required. The cutover job id
    *         name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm/cutoverJobs/my-cutoverJob',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
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
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Initiates a Cutover of a specific migrating VM. The returned LRO is completed when the cutover job resource is created and the job is initiated.
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
    * const vmmigration = google.vmmigration('v1');
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
    *     await vmmigration.projects.locations.sources.migratingVms.cutoverJobs.create(
    *       {
    *         // Required. The cutover job identifier.
    *         cutoverJobId: 'placeholder-value',
    *         // Required. The Cutover's parent.
    *         parent:
    *           'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *         // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *         requestId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "computeEngineTargetDetails": {},
    *           //   "createTime": "my_createTime",
    *           //   "endTime": "my_endTime",
    *           //   "error": {},
    *           //   "name": "my_name",
    *           //   "progressPercent": 0,
    *           //   "state": "my_state",
    *           //   "stateMessage": "my_stateMessage",
    *           //   "stateTime": "my_stateTime"
    *           // }
    *         },
    *       }
    *     );
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
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCutoverJob] = js.native
  def get(callback: BodyResponseCallback[SchemaCutoverJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCutoverJob] = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet): GaxiosPromise[SchemaCutoverJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet,
    callback: BodyResponseCallback[SchemaCutoverJob]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet,
    options: BodyResponseCallback[Readable | SchemaCutoverJob],
    callback: BodyResponseCallback[Readable | SchemaCutoverJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet, options: MethodOptions): GaxiosPromise[SchemaCutoverJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCutoverJob]
  ): Unit = js.native
  /**
    * Gets details of a single CutoverJob.
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
    * const vmmigration = google.vmmigration('v1');
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
    *     await vmmigration.projects.locations.sources.migratingVms.cutoverJobs.get({
    *       // Required. The name of the CutoverJob.
    *       name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm/cutoverJobs/my-cutoverJob',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "computeEngineTargetDetails": {},
    *   //   "createTime": "my_createTime",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "name": "my_name",
    *   //   "progressPercent": 0,
    *   //   "state": "my_state",
    *   //   "stateMessage": "my_stateMessage",
    *   //   "stateTime": "my_stateTime"
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
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCutoverJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCutoverJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCutoverJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList): GaxiosPromise[SchemaListCutoverJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList,
    callback: BodyResponseCallback[SchemaListCutoverJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList,
    options: BodyResponseCallback[Readable | SchemaListCutoverJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCutoverJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList, options: MethodOptions): GaxiosPromise[SchemaListCutoverJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCutoverJobsResponse]
  ): Unit = js.native
  /**
    * Lists CutoverJobs of a given migrating VM.
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
    * const vmmigration = google.vmmigration('v1');
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
    *     await vmmigration.projects.locations.sources.migratingVms.cutoverJobs.list({
    *       // Optional. The filter request.
    *       filter: 'placeholder-value',
    *       // Optional. the order by fields for the result.
    *       orderBy: 'placeholder-value',
    *       // Optional. The maximum number of cutover jobs to return. The service may return fewer than this value. If unspecified, at most 500 cutover jobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Required. A page token, received from a previous `ListCutoverJobs` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCutoverJobs` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent, which owns this collection of migrating VMs.
    *       parent:
    *         'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cutoverJobs": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
