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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Negativekeywordlists")
@js.native
open class ResourceAdvertisersNegativekeywordlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def create(callback: BodyResponseCallback[SchemaNegativeKeywordList]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def create(params: ParamsResourceAdvertisersNegativekeywordlistsCreate): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsCreate,
    callback: BodyResponseCallback[SchemaNegativeKeywordList]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsCreate,
    options: BodyResponseCallback[Readable | SchemaNegativeKeywordList],
    callback: BodyResponseCallback[Readable | SchemaNegativeKeywordList]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersNegativekeywordlistsCreate, options: MethodOptions): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNegativeKeywordList]
  ): Unit = js.native
  /**
    * Creates a new negative keyword list. Returns the newly created negative keyword list if successful.
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
    *   const res = await displayvideo.advertisers.negativeKeywordLists.create({
    *     // Required. The ID of the DV360 advertiser to which the negative keyword list will belong.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "negativeKeywordListId": "my_negativeKeywordListId",
    *       //   "targetedLineItemCount": "my_targetedLineItemCount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "negativeKeywordListId": "my_negativeKeywordListId",
    *   //   "targetedLineItemCount": "my_targetedLineItemCount"
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
  def create(params: ParamsResourceAdvertisersNegativekeywordlistsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersNegativekeywordlistsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdvertisersNegativekeywordlistsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisersNegativekeywordlistsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a negative keyword list given an advertiser ID and a negative keyword list ID.
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
    *   const res = await displayvideo.advertisers.negativeKeywordLists.delete({
    *     // Required. The ID of the DV360 advertiser to which the negative keyword list belongs.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the negative keyword list to delete.
    *     negativeKeywordListId: '[^/]+',
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
  def delete(params: ParamsResourceAdvertisersNegativekeywordlistsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdvertisersNegativekeywordlistsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def get(callback: BodyResponseCallback[SchemaNegativeKeywordList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def get(params: ParamsResourceAdvertisersNegativekeywordlistsGet): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def get(
    params: ParamsResourceAdvertisersNegativekeywordlistsGet,
    callback: BodyResponseCallback[SchemaNegativeKeywordList]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersNegativekeywordlistsGet,
    options: BodyResponseCallback[Readable | SchemaNegativeKeywordList],
    callback: BodyResponseCallback[Readable | SchemaNegativeKeywordList]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersNegativekeywordlistsGet, options: MethodOptions): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def get(
    params: ParamsResourceAdvertisersNegativekeywordlistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNegativeKeywordList]
  ): Unit = js.native
  /**
    * Gets a negative keyword list given an advertiser ID and a negative keyword list ID.
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
    *   const res = await displayvideo.advertisers.negativeKeywordLists.get({
    *     // Required. The ID of the DV360 advertiser to which the fetched negative keyword list belongs.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the negative keyword list to fetch.
    *     negativeKeywordListId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "negativeKeywordListId": "my_negativeKeywordListId",
    *   //   "targetedLineItemCount": "my_targetedLineItemCount"
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
  def get(params: ParamsResourceAdvertisersNegativekeywordlistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersNegativekeywordlistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNegativeKeywordListsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNegativeKeywordListsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNegativeKeywordListsResponse] = js.native
  def list(params: ParamsResourceAdvertisersNegativekeywordlistsList): GaxiosPromise[SchemaListNegativeKeywordListsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsList,
    callback: BodyResponseCallback[SchemaListNegativeKeywordListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsList,
    options: BodyResponseCallback[Readable | SchemaListNegativeKeywordListsResponse],
    callback: BodyResponseCallback[Readable | SchemaListNegativeKeywordListsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersNegativekeywordlistsList, options: MethodOptions): GaxiosPromise[SchemaListNegativeKeywordListsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNegativeKeywordListsResponse]
  ): Unit = js.native
  /**
    * Lists negative keyword lists based on a given advertiser id.
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
    *   const res = await displayvideo.advertisers.negativeKeywordLists.list({
    *     // Required. The ID of the DV360 advertiser to which the fetched negative keyword lists belong.
    *     advertiserId: '[^/]+',
    *     // Requested page size. Must be between `1` and `100`. Defaults to `100` if not set. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListNegativeKeywordLists` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "negativeKeywordLists": [],
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
  def list(params: ParamsResourceAdvertisersNegativekeywordlistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersNegativekeywordlistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var negativeKeywords: ResourceAdvertisersNegativekeywordlistsNegativekeywords = js.native
  
  def patch(): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def patch(callback: BodyResponseCallback[SchemaNegativeKeywordList]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def patch(params: ParamsResourceAdvertisersNegativekeywordlistsPatch): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def patch(
    params: ParamsResourceAdvertisersNegativekeywordlistsPatch,
    callback: BodyResponseCallback[SchemaNegativeKeywordList]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersNegativekeywordlistsPatch,
    options: BodyResponseCallback[Readable | SchemaNegativeKeywordList],
    callback: BodyResponseCallback[Readable | SchemaNegativeKeywordList]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersNegativekeywordlistsPatch, options: MethodOptions): GaxiosPromise[SchemaNegativeKeywordList] = js.native
  def patch(
    params: ParamsResourceAdvertisersNegativekeywordlistsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNegativeKeywordList]
  ): Unit = js.native
  /**
    * Updates a negative keyword list. Returns the updated negative keyword list if successful.
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
    *   const res = await displayvideo.advertisers.negativeKeywordLists.patch({
    *     // Required. The ID of the DV360 advertiser to which the negative keyword list belongs.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the negative keyword list. Assigned by the system.
    *     negativeKeywordListId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "negativeKeywordListId": "my_negativeKeywordListId",
    *       //   "targetedLineItemCount": "my_targetedLineItemCount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "negativeKeywordListId": "my_negativeKeywordListId",
    *   //   "targetedLineItemCount": "my_targetedLineItemCount"
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
  def patch(params: ParamsResourceAdvertisersNegativekeywordlistsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersNegativekeywordlistsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
