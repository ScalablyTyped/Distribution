package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Groupitems")
@js.native
open class ResourceGroupitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupitemsDelete): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupitemsDelete, callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: BodyResponseCallback[Readable | SchemaEmptyResponse],
    callback: BodyResponseCallback[Readable | SchemaEmptyResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupitemsDelete, options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmptyResponse]
  ): Unit = js.native
  /**
    * Removes an item from a group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groupItems.delete({
    *     // The `id` parameter specifies the YouTube group item ID of the group item that is being deleted.
    *     id: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": {}
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
  def delete(params: ParamsResourceGroupitemsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(callback: BodyResponseCallback[SchemaGroupItem]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(params: ParamsResourceGroupitemsInsert): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(params: ParamsResourceGroupitemsInsert, callback: BodyResponseCallback[SchemaGroupItem]): Unit = js.native
  def insert(
    params: ParamsResourceGroupitemsInsert,
    options: BodyResponseCallback[Readable | SchemaGroupItem],
    callback: BodyResponseCallback[Readable | SchemaGroupItem]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupitemsInsert, options: MethodOptions): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(
    params: ParamsResourceGroupitemsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupItem]
  ): Unit = js.native
  /**
    * Creates a group item.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groupItems.insert({
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "errors": {},
    *       //   "etag": "my_etag",
    *       //   "groupId": "my_groupId",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "resource": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": {},
    *   //   "etag": "my_etag",
    *   //   "groupId": "my_groupId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "resource": {}
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
  def insert(params: ParamsResourceGroupitemsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceGroupitemsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupItemsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(params: ParamsResourceGroupitemsList): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(params: ParamsResourceGroupitemsList, callback: BodyResponseCallback[SchemaListGroupItemsResponse]): Unit = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: BodyResponseCallback[Readable | SchemaListGroupItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaListGroupItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupitemsList, options: MethodOptions): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupItemsResponse]
  ): Unit = js.native
  /**
    * Returns a collection of group items that match the API request parameters.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtubeAnalytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtubeAnalytics = google.youtubeAnalytics('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *       'https://www.googleapis.com/auth/yt-analytics-monetary.readonly',
    *       'https://www.googleapis.com/auth/yt-analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtubeAnalytics.groupItems.list({
    *     // The `groupId` parameter specifies the unique ID of the group for which you want to retrieve group items.
    *     groupId: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels. The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errors": {},
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceGroupitemsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
