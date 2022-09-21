package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/memcache/v1beta2", "memcache_v1beta2.Resource$Projects$Locations$Instances")
@js.native
open class ResourceProjectsLocationsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def applyParameters(): GaxiosPromise[SchemaOperation] = js.native
  def applyParameters(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def applyParameters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applyParameters(params: ParamsResourceProjectsLocationsInstancesApplyparameters): GaxiosPromise[SchemaOperation] = js.native
  def applyParameters(
    params: ParamsResourceProjectsLocationsInstancesApplyparameters,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def applyParameters(
    params: ParamsResourceProjectsLocationsInstancesApplyparameters,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def applyParameters(params: ParamsResourceProjectsLocationsInstancesApplyparameters, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applyParameters(
    params: ParamsResourceProjectsLocationsInstancesApplyparameters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * `ApplyParameters` restarts the set of specified nodes in order to update them to the current set of parameters for the Memcached Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.applyParameters({
    *     // Required. Resource name of the Memcached instance for which parameter group updates should be applied.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "applyAll": false,
    *       //   "nodeIds": []
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
  def applyParameters(params: ParamsResourceProjectsLocationsInstancesApplyparameters, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def applyParameters(
    params: ParamsResourceProjectsLocationsInstancesApplyparameters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def applySoftwareUpdate(): GaxiosPromise[SchemaOperation] = js.native
  def applySoftwareUpdate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def applySoftwareUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applySoftwareUpdate(params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate): GaxiosPromise[SchemaOperation] = js.native
  def applySoftwareUpdate(
    params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def applySoftwareUpdate(
    params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def applySoftwareUpdate(params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applySoftwareUpdate(
    params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates software on the selected nodes of the Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.applySoftwareUpdate({
    *     // Required. Resource name of the Memcached instance for which software update should be applied.
    *     instance: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "applyAll": false,
    *       //   "nodeIds": []
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
  def applySoftwareUpdate(params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def applySoftwareUpdate(
    params: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Instance in a given location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.create({
    *     // Required. The logical name of the Memcached instance in the user project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the user project / location. If any of the above are not met, the API raises an invalid argument error.
    *     instanceId: 'placeholder-value',
    *     // Required. The resource name of the instance location using the form: `projects/{project_id\}/locations/{location_id\}` where `location_id` refers to a GCP region
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authorizedNetwork": "my_authorizedNetwork",
    *       //   "createTime": "my_createTime",
    *       //   "discoveryEndpoint": "my_discoveryEndpoint",
    *       //   "displayName": "my_displayName",
    *       //   "instanceMessages": [],
    *       //   "labels": {},
    *       //   "maintenancePolicy": {},
    *       //   "maintenanceSchedule": {},
    *       //   "memcacheFullVersion": "my_memcacheFullVersion",
    *       //   "memcacheNodes": [],
    *       //   "memcacheVersion": "my_memcacheVersion",
    *       //   "name": "my_name",
    *       //   "nodeConfig": {},
    *       //   "nodeCount": 0,
    *       //   "parameters": {},
    *       //   "state": "my_state",
    *       //   "updateAvailable": false,
    *       //   "updateTime": "my_updateTime",
    *       //   "zones": []
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
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.delete({
    *     // Required. Memcached instance resource name in the format: `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}` where `location_id` refers to a GCP region
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
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
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: BodyResponseCallback[Readable | SchemaInstance],
    callback: BodyResponseCallback[Readable | SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  /**
    * Gets details of a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.get({
    *     // Required. Memcached instance resource name in the format: `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}` where `location_id` refers to a GCP region
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorizedNetwork": "my_authorizedNetwork",
    *   //   "createTime": "my_createTime",
    *   //   "discoveryEndpoint": "my_discoveryEndpoint",
    *   //   "displayName": "my_displayName",
    *   //   "instanceMessages": [],
    *   //   "labels": {},
    *   //   "maintenancePolicy": {},
    *   //   "maintenanceSchedule": {},
    *   //   "memcacheFullVersion": "my_memcacheFullVersion",
    *   //   "memcacheNodes": [],
    *   //   "memcacheVersion": "my_memcacheVersion",
    *   //   "name": "my_name",
    *   //   "nodeConfig": {},
    *   //   "nodeCount": 0,
    *   //   "parameters": {},
    *   //   "state": "my_state",
    *   //   "updateAvailable": false,
    *   //   "updateTime": "my_updateTime",
    *   //   "zones": []
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
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstancesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: BodyResponseCallback[Readable | SchemaListInstancesResponse],
    callback: BodyResponseCallback[Readable | SchemaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  /**
    * Lists Instances in a given location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.list({
    *     // List filter. For example, exclude all Memcached instances with name as my-instance by specifying `"name != my-instance"`.
    *     filter: 'placeholder-value',
    *     // Sort results. Supported values are "name", "name desc" or "" (unsorted).
    *     orderBy: 'placeholder-value',
    *     // The maximum number of items to return. If not specified, a default value of 1000 will be used by the service. Regardless of the `page_size` value, the response may include a partial list and a caller should only rely on response's `next_page_token` to determine if there are more instances left to be queried.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the instance location using the form: `projects/{project_id\}/locations/{location_id\}` where `location_id` refers to a GCP region
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": [],
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
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates an existing Instance in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.patch({
    *     // Required. Unique name of the resource in this scope including project and location using the form: `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *     // Required. Mask of fields to update. * `displayName`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authorizedNetwork": "my_authorizedNetwork",
    *       //   "createTime": "my_createTime",
    *       //   "discoveryEndpoint": "my_discoveryEndpoint",
    *       //   "displayName": "my_displayName",
    *       //   "instanceMessages": [],
    *       //   "labels": {},
    *       //   "maintenancePolicy": {},
    *       //   "maintenanceSchedule": {},
    *       //   "memcacheFullVersion": "my_memcacheFullVersion",
    *       //   "memcacheNodes": [],
    *       //   "memcacheVersion": "my_memcacheVersion",
    *       //   "name": "my_name",
    *       //   "nodeConfig": {},
    *       //   "nodeCount": 0,
    *       //   "parameters": {},
    *       //   "state": "my_state",
    *       //   "updateAvailable": false,
    *       //   "updateTime": "my_updateTime",
    *       //   "zones": []
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
  def patch(params: ParamsResourceProjectsLocationsInstancesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsInstancesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rescheduleMaintenance(): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rescheduleMaintenance(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def rescheduleMaintenance(params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Performs the apply phase of the RescheduleMaintenance verb.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.rescheduleMaintenance(
    *     {
    *       // Required. Memcache instance resource name using the form: `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}` where `location_id` refers to a GCP region.
    *       instance:
    *         'projects/my-project/locations/my-location/instances/my-instance',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "rescheduleType": "my_rescheduleType",
    *         //   "scheduleTime": "my_scheduleTime"
    *         // }
    *       },
    *     }
    *   );
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
  def rescheduleMaintenance(
    params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def rescheduleMaintenance(
    params: ParamsResourceProjectsLocationsInstancesReschedulemaintenance,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateParameters(): GaxiosPromise[SchemaOperation] = js.native
  def updateParameters(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateParameters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateParameters(params: ParamsResourceProjectsLocationsInstancesUpdateparameters): GaxiosPromise[SchemaOperation] = js.native
  def updateParameters(
    params: ParamsResourceProjectsLocationsInstancesUpdateparameters,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateParameters(
    params: ParamsResourceProjectsLocationsInstancesUpdateparameters,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateParameters(params: ParamsResourceProjectsLocationsInstancesUpdateparameters, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateParameters(
    params: ParamsResourceProjectsLocationsInstancesUpdateparameters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the defined Memcached parameters for an existing instance. This method only stages the parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the Memcached instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/memcache.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const memcache = google.memcache('v1beta2');
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
    *   const res = await memcache.projects.locations.instances.updateParameters({
    *     // Required. Resource name of the Memcached instance for which the parameters should be updated.
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "parameters": {},
    *       //   "updateMask": "my_updateMask"
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
  def updateParameters(params: ParamsResourceProjectsLocationsInstancesUpdateparameters, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateParameters(
    params: ParamsResourceProjectsLocationsInstancesUpdateparameters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
