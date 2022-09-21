package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories")
@js.native
open class ResourceProjectsHistories protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaHistory] = js.native
  def create(callback: BodyResponseCallback[SchemaHistory]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHistory] = js.native
  def create(params: ParamsResourceProjectsHistoriesCreate): GaxiosPromise[SchemaHistory] = js.native
  def create(params: ParamsResourceProjectsHistoriesCreate, callback: BodyResponseCallback[SchemaHistory]): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesCreate,
    options: BodyResponseCallback[Readable | SchemaHistory],
    callback: BodyResponseCallback[Readable | SchemaHistory]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsHistoriesCreate, options: MethodOptions): GaxiosPromise[SchemaHistory] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHistory]
  ): Unit = js.native
  /**
    * Creates a History. The returned History will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing project does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.create({
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *     // A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "historyId": "my_historyId",
    *       //   "name": "my_name",
    *       //   "testPlatform": "my_testPlatform"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "historyId": "my_historyId",
    *   //   "name": "my_name",
    *   //   "testPlatform": "my_testPlatform"
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
  def create(params: ParamsResourceProjectsHistoriesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var executions: ResourceProjectsHistoriesExecutions = js.native
  
  def get(): GaxiosPromise[SchemaHistory] = js.native
  def get(callback: BodyResponseCallback[SchemaHistory]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHistory] = js.native
  def get(params: ParamsResourceProjectsHistoriesGet): GaxiosPromise[SchemaHistory] = js.native
  def get(params: ParamsResourceProjectsHistoriesGet, callback: BodyResponseCallback[SchemaHistory]): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesGet,
    options: BodyResponseCallback[Readable | SchemaHistory],
    callback: BodyResponseCallback[Readable | SchemaHistory]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesGet, options: MethodOptions): GaxiosPromise[SchemaHistory] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHistory]
  ): Unit = js.native
  /**
    * Gets a History. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.get({
    *     // A History id. Required.
    *     historyId: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "historyId": "my_historyId",
    *   //   "name": "my_name",
    *   //   "testPlatform": "my_testPlatform"
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
  def get(params: ParamsResourceProjectsHistoriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListHistoriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHistoriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHistoriesResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesList): GaxiosPromise[SchemaListHistoriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesList,
    callback: BodyResponseCallback[SchemaListHistoriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesList,
    options: BodyResponseCallback[Readable | SchemaListHistoriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListHistoriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesList, options: MethodOptions): GaxiosPromise[SchemaListHistoriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHistoriesResponse]
  ): Unit = js.native
  /**
    * Lists Histories for a given Project. The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same modification time. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res = await toolresults.projects.histories.list({
    *     // If set, only return histories with the given name. Optional.
    *     filterByName: 'placeholder-value',
    *     // The maximum number of Histories to fetch. Default value: 20. The server will use this default if the field is not set or has a value of 0. Any value greater than 100 will be treated as 100. Optional.
    *     pageSize: 'placeholder-value',
    *     // A continuation token to resume the query at the next item. Optional.
    *     pageToken: 'placeholder-value',
    *     // A Project id. Required.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "histories": [],
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
  def list(params: ParamsResourceProjectsHistoriesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
