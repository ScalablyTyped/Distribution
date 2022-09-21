package typings.googleapis.notebooksV1Mod.notebooksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/notebooks/v1", "notebooks_v1.Resource$Projects$Locations$Runtimes")
@js.native
open class ResourceProjectsLocationsRuntimes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsRuntimesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRuntimesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsRuntimesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsRuntimesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRuntimesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Runtime in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.create({
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *     // Idempotent request UUID.
    *     requestId: 'placeholder-value',
    *     // Required. User-defined unique ID of this Runtime.
    *     runtimeId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessConfig": {},
    *       //   "createTime": "my_createTime",
    *       //   "healthState": "my_healthState",
    *       //   "metrics": {},
    *       //   "name": "my_name",
    *       //   "softwareConfig": {},
    *       //   "state": "my_state",
    *       //   "updateTime": "my_updateTime",
    *       //   "virtualMachine": {}
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
  def create(params: ParamsResourceProjectsLocationsRuntimesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRuntimesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsRuntimesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRuntimesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRuntimesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRuntimesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRuntimesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single Runtime.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.delete({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *     // Idempotent request UUID.
    *     requestId: 'placeholder-value',
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
  def delete(params: ParamsResourceProjectsLocationsRuntimesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRuntimesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRuntime] = js.native
  def get(callback: BodyResponseCallback[SchemaRuntime]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRuntime] = js.native
  def get(params: ParamsResourceProjectsLocationsRuntimesGet): GaxiosPromise[SchemaRuntime] = js.native
  def get(params: ParamsResourceProjectsLocationsRuntimesGet, callback: BodyResponseCallback[SchemaRuntime]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimesGet,
    options: BodyResponseCallback[Readable | SchemaRuntime],
    callback: BodyResponseCallback[Readable | SchemaRuntime]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRuntimesGet, options: MethodOptions): GaxiosPromise[SchemaRuntime] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuntime]
  ): Unit = js.native
  /**
    * Gets details of a single Runtime. The location must be a regional endpoint rather than zonal.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.get({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessConfig": {},
    *   //   "createTime": "my_createTime",
    *   //   "healthState": "my_healthState",
    *   //   "metrics": {},
    *   //   "name": "my_name",
    *   //   "softwareConfig": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "virtualMachine": {}
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
  def get(params: ParamsResourceProjectsLocationsRuntimesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRuntimesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRuntimesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsRuntimesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRuntimesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRuntimesList): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    callback: BodyResponseCallback[SchemaListRuntimesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    options: BodyResponseCallback[Readable | SchemaListRuntimesResponse],
    callback: BodyResponseCallback[Readable | SchemaListRuntimesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRuntimesList, options: MethodOptions): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRuntimesResponse]
  ): Unit = js.native
  /**
    * Lists Runtimes in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.list({
    *     // Maximum return size of the list call.
    *     pageSize: 'placeholder-value',
    *     // A previous returned page token that can be used to continue listing from the last result.
    *     pageToken: 'placeholder-value',
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "runtimes": [],
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
  def list(params: ParamsResourceProjectsLocationsRuntimesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsRuntimesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRuntimesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRuntimesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsRuntimesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRuntimesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update Notebook Runtime configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.patch({
    *     // Output only. The resource name of the runtime. Format: `projects/{project\}/locations/{location\}/runtimes/{runtimeId\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *     // Idempotent request UUID.
    *     requestId: 'placeholder-value',
    *     // Required. Specifies the path, relative to `Runtime`, of the field to update. For example, to change the software configuration kernels, the `update_mask` parameter would be specified as `software_config.kernels`, and the `PATCH` request body would specify the new value, as follows: { "software_config":{ "kernels": [{ 'repository': 'gcr.io/deeplearning-platform-release/pytorch-gpu', 'tag': 'latest' \}], \} \} Currently, only the following fields can be updated: - software_config.kernels - software_config.post_startup_script - software_config.custom_gpu_driver_path - software_config.idle_shutdown - software_config.idle_shutdown_timeout - software_config.disable_terminal
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessConfig": {},
    *       //   "createTime": "my_createTime",
    *       //   "healthState": "my_healthState",
    *       //   "metrics": {},
    *       //   "name": "my_name",
    *       //   "softwareConfig": {},
    *       //   "state": "my_state",
    *       //   "updateTime": "my_updateTime",
    *       //   "virtualMachine": {}
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
  def patch(params: ParamsResourceProjectsLocationsRuntimesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRuntimesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def refreshRuntimeTokenInternal(): GaxiosPromise[SchemaRefreshRuntimeTokenInternalResponse] = js.native
  def refreshRuntimeTokenInternal(callback: BodyResponseCallback[SchemaRefreshRuntimeTokenInternalResponse]): Unit = js.native
  def refreshRuntimeTokenInternal(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRefreshRuntimeTokenInternalResponse] = js.native
  def refreshRuntimeTokenInternal(params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal): GaxiosPromise[SchemaRefreshRuntimeTokenInternalResponse] = js.native
  def refreshRuntimeTokenInternal(
    params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal,
    callback: BodyResponseCallback[SchemaRefreshRuntimeTokenInternalResponse]
  ): Unit = js.native
  def refreshRuntimeTokenInternal(
    params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal,
    options: BodyResponseCallback[Readable | SchemaRefreshRuntimeTokenInternalResponse],
    callback: BodyResponseCallback[Readable | SchemaRefreshRuntimeTokenInternalResponse]
  ): Unit = js.native
  def refreshRuntimeTokenInternal(params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal, options: MethodOptions): GaxiosPromise[SchemaRefreshRuntimeTokenInternalResponse] = js.native
  def refreshRuntimeTokenInternal(
    params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRefreshRuntimeTokenInternalResponse]
  ): Unit = js.native
  /**
    * Gets an access token for the consumer service account that the customer attached to the runtime. Only accessible from the tenant instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *     await notebooks.projects.locations.runtimes.refreshRuntimeTokenInternal({
    *       // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *       name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "vmId": "my_vmId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessToken": "my_accessToken",
    *   //   "expireTime": "my_expireTime"
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
  def refreshRuntimeTokenInternal(
    params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def refreshRuntimeTokenInternal(
    params: ParamsResourceProjectsLocationsRuntimesRefreshruntimetokeninternal,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reportEvent(): GaxiosPromise[SchemaOperation] = js.native
  def reportEvent(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reportEvent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reportEvent(params: ParamsResourceProjectsLocationsRuntimesReportevent): GaxiosPromise[SchemaOperation] = js.native
  def reportEvent(
    params: ParamsResourceProjectsLocationsRuntimesReportevent,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reportEvent(
    params: ParamsResourceProjectsLocationsRuntimesReportevent,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def reportEvent(params: ParamsResourceProjectsLocationsRuntimesReportevent, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reportEvent(
    params: ParamsResourceProjectsLocationsRuntimesReportevent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Report and process a runtime event.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.reportEvent({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "event": {},
    *       //   "vmId": "my_vmId"
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
  def reportEvent(params: ParamsResourceProjectsLocationsRuntimesReportevent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reportEvent(
    params: ParamsResourceProjectsLocationsRuntimesReportevent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reset(): GaxiosPromise[SchemaOperation] = js.native
  def reset(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reset(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(params: ParamsResourceProjectsLocationsRuntimesReset): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceProjectsLocationsRuntimesReset,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reset(
    params: ParamsResourceProjectsLocationsRuntimesReset,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def reset(params: ParamsResourceProjectsLocationsRuntimesReset, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceProjectsLocationsRuntimesReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Resets a Managed Notebook Runtime.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.reset({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requestId": "my_requestId"
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
  def reset(params: ParamsResourceProjectsLocationsRuntimesReset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reset(
    params: ParamsResourceProjectsLocationsRuntimesReset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRuntimesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRuntimesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsRuntimesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRuntimesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsRuntimesStart): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsRuntimesStart,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def start(
    params: ParamsResourceProjectsLocationsRuntimesStart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsLocationsRuntimesStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsRuntimesStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts a Managed Notebook Runtime. Perform "Start" on GPU instances; "Resume" on CPU instances See: https://cloud.google.com/compute/docs/instances/stop-start-instance https://cloud.google.com/compute/docs/instances/suspend-resume-instance
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.start({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requestId": "my_requestId"
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
  def start(params: ParamsResourceProjectsLocationsRuntimesStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceProjectsLocationsRuntimesStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaOperation] = js.native
  def stop(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsRuntimesStop): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsRuntimesStop,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsRuntimesStop,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsRuntimesStop, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsRuntimesStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Stops a Managed Notebook Runtime. Perform "Stop" on GPU instances; "Suspend" on CPU instances See: https://cloud.google.com/compute/docs/instances/stop-start-instance https://cloud.google.com/compute/docs/instances/suspend-resume-instance
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.stop({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requestId": "my_requestId"
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
  def stop(params: ParamsResourceProjectsLocationsRuntimesStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsRuntimesStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def switch(): GaxiosPromise[SchemaOperation] = js.native
  def switch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def switch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def switch(params: ParamsResourceProjectsLocationsRuntimesSwitch): GaxiosPromise[SchemaOperation] = js.native
  def switch(
    params: ParamsResourceProjectsLocationsRuntimesSwitch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def switch(
    params: ParamsResourceProjectsLocationsRuntimesSwitch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def switch(params: ParamsResourceProjectsLocationsRuntimesSwitch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def switch(
    params: ParamsResourceProjectsLocationsRuntimesSwitch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Switch a Managed Notebook Runtime.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.switch({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/runtimes/{runtime_id\}`
    *     name: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acceleratorConfig": {},
    *       //   "machineType": "my_machineType",
    *       //   "requestId": "my_requestId"
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
  def switch(params: ParamsResourceProjectsLocationsRuntimesSwitch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def switch(
    params: ParamsResourceProjectsLocationsRuntimesSwitch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRuntimesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRuntimesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRuntimesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRuntimesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRuntimesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.runtimes.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/runtimes/my-runtime',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsRuntimesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRuntimesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
