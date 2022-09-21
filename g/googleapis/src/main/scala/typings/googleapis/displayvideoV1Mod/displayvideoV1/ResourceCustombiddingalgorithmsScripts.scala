package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Custombiddingalgorithms$Scripts")
@js.native
open class ResourceCustombiddingalgorithmsScripts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def create(callback: BodyResponseCallback[SchemaCustomBiddingScript]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def create(params: ParamsResourceCustombiddingalgorithmsScriptsCreate): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsScriptsCreate,
    callback: BodyResponseCallback[SchemaCustomBiddingScript]
  ): Unit = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsScriptsCreate,
    options: BodyResponseCallback[Readable | SchemaCustomBiddingScript],
    callback: BodyResponseCallback[Readable | SchemaCustomBiddingScript]
  ): Unit = js.native
  def create(params: ParamsResourceCustombiddingalgorithmsScriptsCreate, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsScriptsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomBiddingScript]
  ): Unit = js.native
  /**
    * Creates a new custom bidding script. Returns the newly created script if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.customBiddingAlgorithms.scripts.create({
    *     // The ID of the advertiser that owns the parent custom bidding algorithm.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the custom bidding algorithm that owns the script.
    *     customBiddingAlgorithmId: '[^/]+',
    *     // The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
    *     partnerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "active": false,
    *       //   "createTime": "my_createTime",
    *       //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *       //   "customBiddingScriptId": "my_customBiddingScriptId",
    *       //   "errors": [],
    *       //   "name": "my_name",
    *       //   "script": {},
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "active": false,
    *   //   "createTime": "my_createTime",
    *   //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *   //   "customBiddingScriptId": "my_customBiddingScriptId",
    *   //   "errors": [],
    *   //   "name": "my_name",
    *   //   "script": {},
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
  def create(params: ParamsResourceCustombiddingalgorithmsScriptsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsScriptsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomBiddingScript]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def get(params: ParamsResourceCustombiddingalgorithmsScriptsGet): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsScriptsGet,
    callback: BodyResponseCallback[SchemaCustomBiddingScript]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsScriptsGet,
    options: BodyResponseCallback[Readable | SchemaCustomBiddingScript],
    callback: BodyResponseCallback[Readable | SchemaCustomBiddingScript]
  ): Unit = js.native
  def get(params: ParamsResourceCustombiddingalgorithmsScriptsGet, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingScript] = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsScriptsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomBiddingScript]
  ): Unit = js.native
  /**
    * Gets a custom bidding script.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.customBiddingAlgorithms.scripts.get({
    *     // The ID of the advertiser that owns the parent custom bidding algorithm.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the custom bidding algorithm owns the script.
    *     customBiddingAlgorithmId: '[^/]+',
    *     // Required. The ID of the custom bidding script to fetch.
    *     customBiddingScriptId: '[^/]+',
    *     // The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "active": false,
    *   //   "createTime": "my_createTime",
    *   //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *   //   "customBiddingScriptId": "my_customBiddingScriptId",
    *   //   "errors": [],
    *   //   "name": "my_name",
    *   //   "script": {},
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
  def get(params: ParamsResourceCustombiddingalgorithmsScriptsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsScriptsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCustomBiddingScriptsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomBiddingScriptsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCustomBiddingScriptsResponse] = js.native
  def list(params: ParamsResourceCustombiddingalgorithmsScriptsList): GaxiosPromise[SchemaListCustomBiddingScriptsResponse] = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsScriptsList,
    callback: BodyResponseCallback[SchemaListCustomBiddingScriptsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsScriptsList,
    options: BodyResponseCallback[Readable | SchemaListCustomBiddingScriptsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCustomBiddingScriptsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustombiddingalgorithmsScriptsList, options: MethodOptions): GaxiosPromise[SchemaListCustomBiddingScriptsResponse] = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsScriptsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomBiddingScriptsResponse]
  ): Unit = js.native
  /**
    * Lists custom bidding scripts that belong to the given algorithm. The order is defined by the order_by parameter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.customBiddingAlgorithms.scripts.list({
    *     // The ID of the advertiser that owns the parent custom bidding algorithm.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the custom bidding algorithm owns the script.
    *     customBiddingAlgorithmId: '[^/]+',
    *     // Field by which to sort the list. Acceptable values are: * `createTime desc` (default) The default sorting order is descending. To specify ascending order for a field, the suffix "desc" should be removed. Example: `createTime`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCustomBiddingScripts` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customBiddingScripts": [],
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
  def list(params: ParamsResourceCustombiddingalgorithmsScriptsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsScriptsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
