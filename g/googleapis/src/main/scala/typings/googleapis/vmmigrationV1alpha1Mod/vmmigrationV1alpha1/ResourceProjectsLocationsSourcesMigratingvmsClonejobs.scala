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

@JSImport("googleapis/build/src/apis/vmmigration/v1alpha1", "vmmigration_v1alpha1.Resource$Projects$Locations$Sources$Migratingvms$Clonejobs")
@js.native
open class ResourceProjectsLocationsSourcesMigratingvmsClonejobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaOperation] = js.native
  def cancel(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancel(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel): GaxiosPromise[SchemaOperation] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Initiates the cancellation of a running clone job.
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
    *     await vmmigration.projects.locations.sources.migratingVms.cloneJobs.cancel({
    *       // Required. The clone job id
    *       name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm/cloneJobs/my-cloneJob',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
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
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Initiates a Clone of a specific migrating VM.
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
    *     await vmmigration.projects.locations.sources.migratingVms.cloneJobs.create({
    *       // Required. The clone job identifier.
    *       cloneJobId: 'placeholder-value',
    *       // Required. The Clone's parent.
    *       parent:
    *         'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *       // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *       requestId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "computeEngineTargetDetails": {},
    *         //   "computeEngineVmDetails": {},
    *         //   "createTime": "my_createTime",
    *         //   "endTime": "my_endTime",
    *         //   "error": {},
    *         //   "name": "my_name",
    *         //   "state": "my_state",
    *         //   "stateTime": "my_stateTime",
    *         //   "steps": [],
    *         //   "targetDetails": {}
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
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCloneJob] = js.native
  def get(callback: BodyResponseCallback[SchemaCloneJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCloneJob] = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet): GaxiosPromise[SchemaCloneJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet,
    callback: BodyResponseCallback[SchemaCloneJob]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet,
    options: BodyResponseCallback[Readable | SchemaCloneJob],
    callback: BodyResponseCallback[Readable | SchemaCloneJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet, options: MethodOptions): GaxiosPromise[SchemaCloneJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCloneJob]
  ): Unit = js.native
  /**
    * Gets details of a single CloneJob.
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
    *     await vmmigration.projects.locations.sources.migratingVms.cloneJobs.get({
    *       // Required. The name of the CloneJob.
    *       name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm/cloneJobs/my-cloneJob',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "computeEngineTargetDetails": {},
    *   //   "computeEngineVmDetails": {},
    *   //   "createTime": "my_createTime",
    *   //   "endTime": "my_endTime",
    *   //   "error": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "stateTime": "my_stateTime",
    *   //   "steps": [],
    *   //   "targetDetails": {}
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
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCloneJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCloneJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCloneJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList): GaxiosPromise[SchemaListCloneJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList,
    callback: BodyResponseCallback[SchemaListCloneJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList,
    options: BodyResponseCallback[Readable | SchemaListCloneJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCloneJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList, options: MethodOptions): GaxiosPromise[SchemaListCloneJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCloneJobsResponse]
  ): Unit = js.native
  /**
    * Lists CloneJobs of a given migrating VM.
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
    *     await vmmigration.projects.locations.sources.migratingVms.cloneJobs.list({
    *       // Optional. The filter request.
    *       filter: 'placeholder-value',
    *       // Optional. the order by fields for the result.
    *       orderBy: 'placeholder-value',
    *       // Optional. The maximum number of clone jobs to return. The service may return fewer than this value. If unspecified, at most 500 clone jobs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Required. A page token, received from a previous `ListCloneJobs` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCloneJobs` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent, which owns this collection of source VMs.
    *       parent:
    *         'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloneJobs": [],
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
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
