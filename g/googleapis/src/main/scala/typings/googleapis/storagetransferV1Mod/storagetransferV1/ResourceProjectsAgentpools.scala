package typings.googleapis.storagetransferV1Mod.storagetransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Projects$Agentpools")
@js.native
open class ResourceProjectsAgentpools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAgentPool] = js.native
  def create(callback: BodyResponseCallback[SchemaAgentPool]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAgentPool] = js.native
  def create(params: ParamsResourceProjectsAgentpoolsCreate): GaxiosPromise[SchemaAgentPool] = js.native
  def create(params: ParamsResourceProjectsAgentpoolsCreate, callback: BodyResponseCallback[SchemaAgentPool]): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentpoolsCreate,
    options: BodyResponseCallback[Readable | SchemaAgentPool],
    callback: BodyResponseCallback[Readable | SchemaAgentPool]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentpoolsCreate, options: MethodOptions): GaxiosPromise[SchemaAgentPool] = js.native
  def create(
    params: ParamsResourceProjectsAgentpoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAgentPool]
  ): Unit = js.native
  /**
    * Creates an agent pool resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
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
    *   const res = await storagetransfer.projects.agentPools.create({
    *     // Required. The ID of the agent pool to create. The `agent_pool_id` must meet the following requirements: * Length of 128 characters or less. * Not start with the string `goog`. * Start with a lowercase ASCII character, followed by: * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (`-`), periods (`.`), underscores (`_`), or tildes (`~`). * One or more numerals or lowercase ASCII characters. As expressed by the regular expression: `^(?!goog)[a-z]([a-z0-9-._~]*[a-z0-9])?$`.
    *     agentPoolId: 'placeholder-value',
    *     // Required. The ID of the Google Cloud project that owns the agent pool.
    *     projectId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bandwidthLimit": {},
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bandwidthLimit": {},
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def create(params: ParamsResourceProjectsAgentpoolsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAgentpoolsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentpoolsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentpoolsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentpoolsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentpoolsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentpoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an agent pool.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
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
    *   const res = await storagetransfer.projects.agentPools.delete({
    *     // Required. The name of the agent pool to delete.
    *     name: 'projects/my-project/agentPools/my-agentPool',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsAgentpoolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAgentpoolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAgentPool] = js.native
  def get(callback: BodyResponseCallback[SchemaAgentPool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAgentPool] = js.native
  def get(params: ParamsResourceProjectsAgentpoolsGet): GaxiosPromise[SchemaAgentPool] = js.native
  def get(params: ParamsResourceProjectsAgentpoolsGet, callback: BodyResponseCallback[SchemaAgentPool]): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentpoolsGet,
    options: BodyResponseCallback[Readable | SchemaAgentPool],
    callback: BodyResponseCallback[Readable | SchemaAgentPool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentpoolsGet, options: MethodOptions): GaxiosPromise[SchemaAgentPool] = js.native
  def get(
    params: ParamsResourceProjectsAgentpoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAgentPool]
  ): Unit = js.native
  /**
    * Gets an agent pool.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
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
    *   const res = await storagetransfer.projects.agentPools.get({
    *     // Required. The name of the agent pool to get.
    *     name: 'projects/my-project/agentPools/my-agentPool',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bandwidthLimit": {},
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsAgentpoolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAgentpoolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAgentPoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAgentPoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAgentPoolsResponse] = js.native
  def list(params: ParamsResourceProjectsAgentpoolsList): GaxiosPromise[SchemaListAgentPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentpoolsList,
    callback: BodyResponseCallback[SchemaListAgentPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentpoolsList,
    options: BodyResponseCallback[Readable | SchemaListAgentPoolsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAgentPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentpoolsList, options: MethodOptions): GaxiosPromise[SchemaListAgentPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentpoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAgentPoolsResponse]
  ): Unit = js.native
  /**
    * Lists agent pools.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
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
    *   const res = await storagetransfer.projects.agentPools.list({
    *     // An optional list of query parameters specified as JSON text in the form of: `{"agentPoolNames":["agentpool1","agentpool2",...]\}` Since `agentPoolNames` support multiple values, its values must be specified with array notation. When the filter is either empty or not provided, the list returns all agent pools for the project.
    *     filter: 'placeholder-value',
    *     // The list page size. The max allowed value is `256`.
    *     pageSize: 'placeholder-value',
    *     // The list page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The ID of the Google Cloud project that owns the job.
    *     projectId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentPools": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsAgentpoolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAgentpoolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAgentPool] = js.native
  def patch(callback: BodyResponseCallback[SchemaAgentPool]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAgentPool] = js.native
  def patch(params: ParamsResourceProjectsAgentpoolsPatch): GaxiosPromise[SchemaAgentPool] = js.native
  def patch(params: ParamsResourceProjectsAgentpoolsPatch, callback: BodyResponseCallback[SchemaAgentPool]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentpoolsPatch,
    options: BodyResponseCallback[Readable | SchemaAgentPool],
    callback: BodyResponseCallback[Readable | SchemaAgentPool]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentpoolsPatch, options: MethodOptions): GaxiosPromise[SchemaAgentPool] = js.native
  def patch(
    params: ParamsResourceProjectsAgentpoolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAgentPool]
  ): Unit = js.native
  /**
    * Updates an existing agent pool resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/storagetransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const storagetransfer = google.storagetransfer('v1');
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
    *   const res = await storagetransfer.projects.agentPools.patch({
    *     // Required. Specifies a unique string that identifies the agent pool. Format: `projects/{project_id\}/agentPools/{agent_pool_id\}`
    *     name: 'projects/my-project/agentPools/my-agentPool',
    *     // The [field mask] (https://developers.google.com/protocol-buffers/docs/reference/google.protobuf) of the fields in `agentPool` to update in this request. The following `agentPool` fields can be updated: * display_name * bandwidth_limit
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bandwidthLimit": {},
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bandwidthLimit": {},
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def patch(params: ParamsResourceProjectsAgentpoolsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAgentpoolsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
