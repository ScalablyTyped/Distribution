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

@JSImport("googleapis/build/src/apis/vmmigration/v1", "vmmigration_v1.Resource$Projects$Locations$Sources$Migratingvms")
@js.native
open class ResourceProjectsLocationsSourcesMigratingvms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var cloneJobs: ResourceProjectsLocationsSourcesMigratingvmsClonejobs = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new MigratingVm in a given Source.
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
    *   const res = await vmmigration.projects.locations.sources.migratingVms.create({
    *     // Required. The migratingVm identifier.
    *     migratingVmId: 'placeholder-value',
    *     // Required. The MigratingVm's parent.
    *     parent: 'projects/my-project/locations/my-location/sources/my-source',
    *     // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "computeEngineTargetDefaults": {},
    *       //   "createTime": "my_createTime",
    *       //   "currentSyncInfo": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "error": {},
    *       //   "group": "my_group",
    *       //   "labels": {},
    *       //   "lastSync": {},
    *       //   "name": "my_name",
    *       //   "policy": {},
    *       //   "recentCloneJobs": [],
    *       //   "recentCutoverJobs": [],
    *       //   "sourceVmId": "my_sourceVmId",
    *       //   "state": "my_state",
    *       //   "stateTime": "my_stateTime",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
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
  def create(params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var cutoverJobs: ResourceProjectsLocationsSourcesMigratingvmsCutoverjobs = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single MigratingVm.
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
    *   const res = await vmmigration.projects.locations.sources.migratingVms.delete({
    *     // Required. The name of the MigratingVm.
    *     name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *   });
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
  def delete(params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def finalizeMigration(): GaxiosPromise[SchemaOperation] = js.native
  def finalizeMigration(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def finalizeMigration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def finalizeMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration): GaxiosPromise[SchemaOperation] = js.native
  def finalizeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def finalizeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def finalizeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def finalizeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Marks a migration as completed, deleting migration resources that are no longer being used. Only applicable after cutover is done.
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
    *     await vmmigration.projects.locations.sources.migratingVms.finalizeMigration(
    *       {
    *         // Required. The name of the MigratingVm.
    *         migratingVm:
    *           'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
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
  def finalizeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def finalizeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsFinalizemigration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMigratingVm] = js.native
  def get(callback: BodyResponseCallback[SchemaMigratingVm]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMigratingVm] = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet): GaxiosPromise[SchemaMigratingVm] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet,
    callback: BodyResponseCallback[SchemaMigratingVm]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet,
    options: BodyResponseCallback[Readable | SchemaMigratingVm],
    callback: BodyResponseCallback[Readable | SchemaMigratingVm]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet, options: MethodOptions): GaxiosPromise[SchemaMigratingVm] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMigratingVm]
  ): Unit = js.native
  /**
    * Gets details of a single MigratingVm.
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
    *   const res = await vmmigration.projects.locations.sources.migratingVms.get({
    *     // Required. The name of the MigratingVm.
    *     name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *     // Optional. The level of details of the migrating VM.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "computeEngineTargetDefaults": {},
    *   //   "createTime": "my_createTime",
    *   //   "currentSyncInfo": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "error": {},
    *   //   "group": "my_group",
    *   //   "labels": {},
    *   //   "lastSync": {},
    *   //   "name": "my_name",
    *   //   "policy": {},
    *   //   "recentCloneJobs": [],
    *   //   "recentCutoverJobs": [],
    *   //   "sourceVmId": "my_sourceVmId",
    *   //   "state": "my_state",
    *   //   "stateTime": "my_stateTime",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMigratingVmsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMigratingVmsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMigratingVmsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsList): GaxiosPromise[SchemaListMigratingVmsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsList,
    callback: BodyResponseCallback[SchemaListMigratingVmsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsList,
    options: BodyResponseCallback[Readable | SchemaListMigratingVmsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMigratingVmsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsList, options: MethodOptions): GaxiosPromise[SchemaListMigratingVmsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMigratingVmsResponse]
  ): Unit = js.native
  /**
    * Lists MigratingVms in a given Source.
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
    *   const res = await vmmigration.projects.locations.sources.migratingVms.list({
    *     // Optional. The filter request.
    *     filter: 'placeholder-value',
    *     // Optional. the order by fields for the result.
    *     orderBy: 'placeholder-value',
    *     // Optional. The maximum number of migrating VMs to return. The service may return fewer than this value. If unspecified, at most 500 migrating VMs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Required. A page token, received from a previous `ListMigratingVms` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListMigratingVms` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent, which owns this collection of MigratingVms.
    *     parent: 'projects/my-project/locations/my-location/sources/my-source',
    *     // Optional. The level of details of each migrating VM.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "migratingVms": [],
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
  def list(params: ParamsResourceProjectsLocationsSourcesMigratingvmsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the parameters of a single MigratingVm.
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
    *   const res = await vmmigration.projects.locations.sources.migratingVms.patch({
    *     // Output only. The identifier of the MigratingVm.
    *     name: 'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
    *     // A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *     // Field mask is used to specify the fields to be overwritten in the MigratingVm resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "computeEngineTargetDefaults": {},
    *       //   "createTime": "my_createTime",
    *       //   "currentSyncInfo": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "error": {},
    *       //   "group": "my_group",
    *       //   "labels": {},
    *       //   "lastSync": {},
    *       //   "name": "my_name",
    *       //   "policy": {},
    *       //   "recentCloneJobs": [],
    *       //   "recentCutoverJobs": [],
    *       //   "sourceVmId": "my_sourceVmId",
    *       //   "state": "my_state",
    *       //   "stateTime": "my_stateTime",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
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
  def patch(params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pauseMigration(): GaxiosPromise[SchemaOperation] = js.native
  def pauseMigration(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def pauseMigration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def pauseMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration): GaxiosPromise[SchemaOperation] = js.native
  def pauseMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def pauseMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def pauseMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def pauseMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Pauses a migration for a VM. If cycle tasks are running they will be cancelled, preserving source task data. Further replication cycles will not be triggered while the VM is paused.
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
    *     await vmmigration.projects.locations.sources.migratingVms.pauseMigration({
    *       // Required. The name of the MigratingVm.
    *       migratingVm:
    *         'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
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
  def pauseMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def pauseMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsPausemigration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resumeMigration(): GaxiosPromise[SchemaOperation] = js.native
  def resumeMigration(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resumeMigration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resumeMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration): GaxiosPromise[SchemaOperation] = js.native
  def resumeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resumeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def resumeMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resumeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Resumes a migration for a VM. When called on a paused migration, will start the process of uploading data and creating snapshots; when called on a completed cut-over migration, will update the migration to active state and start the process of uploading data and creating snapshots.
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
    *     await vmmigration.projects.locations.sources.migratingVms.resumeMigration({
    *       // Required. The name of the MigratingVm.
    *       migratingVm:
    *         'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
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
  def resumeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def resumeMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsResumemigration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startMigration(): GaxiosPromise[SchemaOperation] = js.native
  def startMigration(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startMigration(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration): GaxiosPromise[SchemaOperation] = js.native
  def startMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def startMigration(params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts migration for a VM. Starts the process of uploading data and creating snapshots, in replication cycles scheduled by the policy.
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
    *     await vmmigration.projects.locations.sources.migratingVms.startMigration({
    *       // Required. The name of the MigratingVm.
    *       migratingVm:
    *         'projects/my-project/locations/my-location/sources/my-source/migratingVms/my-migratingVm',
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
  def startMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def startMigration(
    params: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
