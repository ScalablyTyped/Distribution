package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Commentthreads")
@js.native
open class ResourceCommentthreads protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insert(): GaxiosPromise[SchemaCommentThread] = js.native
  def insert(callback: BodyResponseCallback[SchemaCommentThread]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentThread] = js.native
  def insert(params: ParamsResourceCommentthreadsInsert): GaxiosPromise[SchemaCommentThread] = js.native
  def insert(params: ParamsResourceCommentthreadsInsert, callback: BodyResponseCallback[SchemaCommentThread]): Unit = js.native
  def insert(
    params: ParamsResourceCommentthreadsInsert,
    options: BodyResponseCallback[Readable | SchemaCommentThread],
    callback: BodyResponseCallback[Readable | SchemaCommentThread]
  ): Unit = js.native
  def insert(params: ParamsResourceCommentthreadsInsert, options: MethodOptions): GaxiosPromise[SchemaCommentThread] = js.native
  def insert(
    params: ParamsResourceCommentthreadsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentThread]
  ): Unit = js.native
  /**
    * Inserts a new resource into this collection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/youtube.force-ssl'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.commentThreads.insert({
    *     // The *part* parameter identifies the properties that the API response will include. Set the parameter value to snippet. The snippet part has a quota cost of 2 units.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "replies": {},
    *       //   "snippet": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "replies": {},
    *   //   "snippet": {}
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
  def insert(params: ParamsResourceCommentthreadsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCommentthreadsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCommentThreadListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentThreadListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentThreadListResponse] = js.native
  def list(params: ParamsResourceCommentthreadsList): GaxiosPromise[SchemaCommentThreadListResponse] = js.native
  def list(
    params: ParamsResourceCommentthreadsList,
    callback: BodyResponseCallback[SchemaCommentThreadListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCommentthreadsList,
    options: BodyResponseCallback[Readable | SchemaCommentThreadListResponse],
    callback: BodyResponseCallback[Readable | SchemaCommentThreadListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCommentthreadsList, options: MethodOptions): GaxiosPromise[SchemaCommentThreadListResponse] = js.native
  def list(
    params: ParamsResourceCommentthreadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentThreadListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of resources, possibly filtered.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/youtube.force-ssl'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.commentThreads.list({
    *     // Returns the comment threads of all videos of the channel and the channel comments as well.
    *     allThreadsRelatedToChannelId: 'placeholder-value',
    *     // Returns the comment threads for all the channel comments (ie does not include comments left on videos).
    *     channelId: 'placeholder-value',
    *     // Returns the comment threads with the given IDs for Stubby or Apiary.
    *     id: 'placeholder-value',
    *     // The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    *     maxResults: 'placeholder-value',
    *     // Limits the returned comment threads to those with the specified moderation status. Not compatible with the 'id' filter. Valid values: published, heldForReview, likelySpam.
    *     moderationStatus: 'placeholder-value',
    *
    *     order: 'placeholder-value',
    *     // The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    *     pageToken: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include.
    *     part: 'placeholder-value',
    *     // Limits the returned comment threads to those matching the specified key words. Not compatible with the 'id' filter.
    *     searchTerms: 'placeholder-value',
    *     // The requested text format for the returned comments.
    *     textFormat: 'placeholder-value',
    *     // Returns the comment threads of the specified video.
    *     videoId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "eventId": "my_eventId",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "pageInfo": {},
    *   //   "tokenPagination": {},
    *   //   "visitorId": "my_visitorId"
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
  def list(params: ParamsResourceCommentthreadsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCommentthreadsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
