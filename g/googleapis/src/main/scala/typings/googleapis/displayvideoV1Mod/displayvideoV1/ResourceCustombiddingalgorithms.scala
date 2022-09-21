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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Custombiddingalgorithms")
@js.native
open class ResourceCustombiddingalgorithms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def create(callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def create(params: ParamsResourceCustombiddingalgorithmsCreate): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsCreate,
    callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsCreate,
    options: BodyResponseCallback[Readable | SchemaCustomBiddingAlgorithm],
    callback: BodyResponseCallback[Readable | SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  def create(params: ParamsResourceCustombiddingalgorithmsCreate, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  /**
    * Creates a new custom bidding algorithm. Returns the newly created custom bidding algorithm if successful.
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
    *   const res = await displayvideo.customBiddingAlgorithms.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *       //   "customBiddingAlgorithmState": "my_customBiddingAlgorithmState",
    *       //   "customBiddingAlgorithmType": "my_customBiddingAlgorithmType",
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "modelReadiness": [],
    *       //   "name": "my_name",
    *       //   "partnerId": "my_partnerId",
    *       //   "sharedAdvertiserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *   //   "customBiddingAlgorithmState": "my_customBiddingAlgorithmState",
    *   //   "customBiddingAlgorithmType": "my_customBiddingAlgorithmType",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "modelReadiness": [],
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "sharedAdvertiserIds": []
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
  def create(params: ParamsResourceCustombiddingalgorithmsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustombiddingalgorithmsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def get(params: ParamsResourceCustombiddingalgorithmsGet): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsGet,
    callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsGet,
    options: BodyResponseCallback[Readable | SchemaCustomBiddingAlgorithm],
    callback: BodyResponseCallback[Readable | SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  def get(params: ParamsResourceCustombiddingalgorithmsGet, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  /**
    * Gets a custom bidding algorithm.
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
    *   const res = await displayvideo.customBiddingAlgorithms.get({
    *     // The ID of the DV360 partner that has access to the custom bidding algorithm.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the custom bidding algorithm to fetch.
    *     customBiddingAlgorithmId: '[^/]+',
    *     // The ID of the DV360 partner that has access to the custom bidding algorithm.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *   //   "customBiddingAlgorithmState": "my_customBiddingAlgorithmState",
    *   //   "customBiddingAlgorithmType": "my_customBiddingAlgorithmType",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "modelReadiness": [],
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "sharedAdvertiserIds": []
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
  def get(params: ParamsResourceCustombiddingalgorithmsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustombiddingalgorithmsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCustomBiddingAlgorithmsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomBiddingAlgorithmsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCustomBiddingAlgorithmsResponse] = js.native
  def list(params: ParamsResourceCustombiddingalgorithmsList): GaxiosPromise[SchemaListCustomBiddingAlgorithmsResponse] = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsList,
    callback: BodyResponseCallback[SchemaListCustomBiddingAlgorithmsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsList,
    options: BodyResponseCallback[Readable | SchemaListCustomBiddingAlgorithmsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCustomBiddingAlgorithmsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustombiddingalgorithmsList, options: MethodOptions): GaxiosPromise[SchemaListCustomBiddingAlgorithmsResponse] = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomBiddingAlgorithmsResponse]
  ): Unit = js.native
  /**
    * Lists custom bidding algorithms that are accessible to the current user and can be used in bidding stratgies. The order is defined by the order_by parameter.
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
    *   const res = await displayvideo.customBiddingAlgorithms.list({
    *     // The ID of the DV360 advertiser that has access to the custom bidding algorithm.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by custom bidding algorithm fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND`. A sequence of restrictions * implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)` or `EQUALS (=)`. * The operator must be `CONTAINS (:)` for the following field: - `displayName` * The operator must be `EQUALS (=)` for the following field: - `customBiddingAlgorithmType` * For `displayName`, the value is a string. We return all custom bidding algorithms whose display_name contains such string. * For `customBiddingAlgorithmType`, the value is a string. We return all algorithms whose custom_bidding_algorithm_type is equal to the given type. Examples: * All custom bidding algorithms for which the display name contains "politics": `displayName:politics`. * All custom bidding algorithms for which the type is "SCRIPT_BASED": `customBiddingAlgorithmType=SCRIPT_BASED` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCustomBiddingAlgorithms` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *     // The ID of the DV360 partner that has access to the custom bidding algorithm.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customBiddingAlgorithms": [],
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
  def list(params: ParamsResourceCustombiddingalgorithmsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustombiddingalgorithmsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def patch(params: ParamsResourceCustombiddingalgorithmsPatch): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def patch(
    params: ParamsResourceCustombiddingalgorithmsPatch,
    callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCustombiddingalgorithmsPatch,
    options: BodyResponseCallback[Readable | SchemaCustomBiddingAlgorithm],
    callback: BodyResponseCallback[Readable | SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  def patch(params: ParamsResourceCustombiddingalgorithmsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingAlgorithm] = js.native
  def patch(
    params: ParamsResourceCustombiddingalgorithmsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomBiddingAlgorithm]
  ): Unit = js.native
  /**
    * Updates an existing custom bidding algorithm. Returns the updated custom bidding algorithm if successful.
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
    *   const res = await displayvideo.customBiddingAlgorithms.patch({
    *     // Output only. The unique ID of the custom bidding algorithm. Assigned by the system.
    *     customBiddingAlgorithmId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *       //   "customBiddingAlgorithmState": "my_customBiddingAlgorithmState",
    *       //   "customBiddingAlgorithmType": "my_customBiddingAlgorithmType",
    *       //   "displayName": "my_displayName",
    *       //   "entityStatus": "my_entityStatus",
    *       //   "modelReadiness": [],
    *       //   "name": "my_name",
    *       //   "partnerId": "my_partnerId",
    *       //   "sharedAdvertiserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "customBiddingAlgorithmId": "my_customBiddingAlgorithmId",
    *   //   "customBiddingAlgorithmState": "my_customBiddingAlgorithmState",
    *   //   "customBiddingAlgorithmType": "my_customBiddingAlgorithmType",
    *   //   "displayName": "my_displayName",
    *   //   "entityStatus": "my_entityStatus",
    *   //   "modelReadiness": [],
    *   //   "name": "my_name",
    *   //   "partnerId": "my_partnerId",
    *   //   "sharedAdvertiserIds": []
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
  def patch(params: ParamsResourceCustombiddingalgorithmsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustombiddingalgorithmsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var scripts: ResourceCustombiddingalgorithmsScripts = js.native
  
  def uploadScript(): GaxiosPromise[SchemaCustomBiddingScriptRef] = js.native
  def uploadScript(callback: BodyResponseCallback[SchemaCustomBiddingScriptRef]): Unit = js.native
  def uploadScript(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingScriptRef] = js.native
  def uploadScript(params: ParamsResourceCustombiddingalgorithmsUploadscript): GaxiosPromise[SchemaCustomBiddingScriptRef] = js.native
  def uploadScript(
    params: ParamsResourceCustombiddingalgorithmsUploadscript,
    callback: BodyResponseCallback[SchemaCustomBiddingScriptRef]
  ): Unit = js.native
  def uploadScript(
    params: ParamsResourceCustombiddingalgorithmsUploadscript,
    options: BodyResponseCallback[Readable | SchemaCustomBiddingScriptRef],
    callback: BodyResponseCallback[Readable | SchemaCustomBiddingScriptRef]
  ): Unit = js.native
  def uploadScript(params: ParamsResourceCustombiddingalgorithmsUploadscript, options: MethodOptions): GaxiosPromise[SchemaCustomBiddingScriptRef] = js.native
  def uploadScript(
    params: ParamsResourceCustombiddingalgorithmsUploadscript,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomBiddingScriptRef]
  ): Unit = js.native
  /**
    * Creates a custom bidding script reference object for a script file. The resulting reference object provides a resource path to which the script file should be uploaded. This reference object should be included in when creating a new custom bidding script object.
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
    *   const res = await displayvideo.customBiddingAlgorithms.uploadScript({
    *     // The ID of the advertiser that owns the parent custom bidding algorithm.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the custom bidding algorithm owns the script.
    *     customBiddingAlgorithmId: '[^/]+',
    *     // The ID of the partner that owns the parent custom bidding algorithm. Only this partner will have write access to this custom bidding script.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "resourceName": "my_resourceName"
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
  def uploadScript(params: ParamsResourceCustombiddingalgorithmsUploadscript, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def uploadScript(
    params: ParamsResourceCustombiddingalgorithmsUploadscript,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
