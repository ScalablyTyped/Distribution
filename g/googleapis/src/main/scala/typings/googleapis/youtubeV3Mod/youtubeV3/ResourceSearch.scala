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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Search")
@js.native
open class ResourceSearch protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaSearchListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSearchListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchListResponse] = js.native
  def list(params: ParamsResourceSearchList): GaxiosPromise[SchemaSearchListResponse] = js.native
  def list(params: ParamsResourceSearchList, callback: BodyResponseCallback[SchemaSearchListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSearchList,
    options: BodyResponseCallback[Readable | SchemaSearchListResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSearchList, options: MethodOptions): GaxiosPromise[SchemaSearchListResponse] = js.native
  def list(
    params: ParamsResourceSearchList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of search resources
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtube.readonly',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.search.list({
    *     // Filter on resources belonging to this channelId.
    *     channelId: 'placeholder-value',
    *     // Add a filter on the channel search.
    *     channelType: 'placeholder-value',
    *     // Filter on the livestream status of the videos.
    *     eventType: 'placeholder-value',
    *     // Search owned by a content owner.
    *     forContentOwner: 'placeholder-value',
    *     // Restrict the search to only retrieve videos uploaded using the project id of the authenticated user.
    *     forDeveloper: 'placeholder-value',
    *     // Search for the private videos of the authenticated user.
    *     forMine: 'placeholder-value',
    *     // Filter on location of the video
    *     location: 'placeholder-value',
    *     // Filter on distance from the location (specified above).
    *     locationRadius: 'placeholder-value',
    *     // The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    *     maxResults: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // Sort order of the results.
    *     order: 'placeholder-value',
    *     // The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    *     pageToken: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet.
    *     part: 'placeholder-value',
    *     // Filter on resources published after this date.
    *     publishedAfter: 'placeholder-value',
    *     // Filter on resources published before this date.
    *     publishedBefore: 'placeholder-value',
    *     // Textual search terms to match.
    *     q: 'placeholder-value',
    *     // Display the content as seen by viewers in this country.
    *     regionCode: 'placeholder-value',
    *     // Search related to a resource.
    *     relatedToVideoId: 'placeholder-value',
    *     // Return results relevant to this language.
    *     relevanceLanguage: 'placeholder-value',
    *     // Indicates whether the search results should include restricted content as well as standard content.
    *     safeSearch: 'placeholder-value',
    *     // Restrict results to a particular topic.
    *     topicId: 'placeholder-value',
    *     // Restrict results to a particular set of resource types from One Platform.
    *     type: 'placeholder-value',
    *     // Filter on the presence of captions on the videos.
    *     videoCaption: 'placeholder-value',
    *     // Filter on videos in a specific category.
    *     videoCategoryId: 'placeholder-value',
    *     // Filter on the definition of the videos.
    *     videoDefinition: 'placeholder-value',
    *     // Filter on 3d videos.
    *     videoDimension: 'placeholder-value',
    *     // Filter on the duration of the videos.
    *     videoDuration: 'placeholder-value',
    *     // Filter on embeddable videos.
    *     videoEmbeddable: 'placeholder-value',
    *     // Filter on the license of the videos.
    *     videoLicense: 'placeholder-value',
    *     // Filter on syndicated videos.
    *     videoSyndicated: 'placeholder-value',
    *     // Filter on videos of a specific type.
    *     videoType: 'placeholder-value',
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
    *   //   "prevPageToken": "my_prevPageToken",
    *   //   "regionCode": "my_regionCode",
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
  def list(params: ParamsResourceSearchList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSearchList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
