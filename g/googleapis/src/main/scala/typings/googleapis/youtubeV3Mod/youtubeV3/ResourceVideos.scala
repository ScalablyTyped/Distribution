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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videos")
@js.native
open class ResourceVideos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceVideosDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceVideosDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceVideosDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceVideosDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceVideosDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a resource.
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
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videos.delete({
    *     id: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceVideosDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceVideosDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRating(): GaxiosPromise[SchemaVideoGetRatingResponse] = js.native
  def getRating(callback: BodyResponseCallback[SchemaVideoGetRatingResponse]): Unit = js.native
  def getRating(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoGetRatingResponse] = js.native
  def getRating(params: ParamsResourceVideosGetrating): GaxiosPromise[SchemaVideoGetRatingResponse] = js.native
  def getRating(
    params: ParamsResourceVideosGetrating,
    callback: BodyResponseCallback[SchemaVideoGetRatingResponse]
  ): Unit = js.native
  def getRating(
    params: ParamsResourceVideosGetrating,
    options: BodyResponseCallback[Readable | SchemaVideoGetRatingResponse],
    callback: BodyResponseCallback[Readable | SchemaVideoGetRatingResponse]
  ): Unit = js.native
  def getRating(params: ParamsResourceVideosGetrating, options: MethodOptions): GaxiosPromise[SchemaVideoGetRatingResponse] = js.native
  def getRating(
    params: ParamsResourceVideosGetrating,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoGetRatingResponse]
  ): Unit = js.native
  /**
    * Retrieves the ratings that the authorized user gave to a list of specified videos.
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
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videos.getRating({
    *     id: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "eventId": "my_eventId",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def getRating(params: ParamsResourceVideosGetrating, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getRating(
    params: ParamsResourceVideosGetrating,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaVideo] = js.native
  def insert(callback: BodyResponseCallback[SchemaVideo]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideo] = js.native
  def insert(params: ParamsResourceVideosInsert): GaxiosPromise[SchemaVideo] = js.native
  def insert(params: ParamsResourceVideosInsert, callback: BodyResponseCallback[SchemaVideo]): Unit = js.native
  def insert(
    params: ParamsResourceVideosInsert,
    options: BodyResponseCallback[Readable | SchemaVideo],
    callback: BodyResponseCallback[Readable | SchemaVideo]
  ): Unit = js.native
  def insert(params: ParamsResourceVideosInsert, options: MethodOptions): GaxiosPromise[SchemaVideo] = js.native
  def insert(
    params: ParamsResourceVideosInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideo]
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *       'https://www.googleapis.com/auth/youtube.upload',
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videos.insert({
    *     // Should auto-levels be applied to the upload.
    *     autoLevels: 'placeholder-value',
    *     // Notify the channel subscribers about the new video. As default, the notification is enabled.
    *     notifySubscribers: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    *     onBehalfOfContentOwnerChannel: 'placeholder-value',
    *     // The *part* parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. Note that not all parts contain properties that can be set when inserting or updating a video. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
    *     part: 'placeholder-value',
    *     // Should stabilize be applied to the upload.
    *     stabilize: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ageGating": {},
    *       //   "contentDetails": {},
    *       //   "etag": "my_etag",
    *       //   "fileDetails": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "liveStreamingDetails": {},
    *       //   "localizations": {},
    *       //   "monetizationDetails": {},
    *       //   "player": {},
    *       //   "processingDetails": {},
    *       //   "projectDetails": {},
    *       //   "recordingDetails": {},
    *       //   "snippet": {},
    *       //   "statistics": {},
    *       //   "status": {},
    *       //   "suggestions": {},
    *       //   "topicDetails": {}
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ageGating": {},
    *   //   "contentDetails": {},
    *   //   "etag": "my_etag",
    *   //   "fileDetails": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "liveStreamingDetails": {},
    *   //   "localizations": {},
    *   //   "monetizationDetails": {},
    *   //   "player": {},
    *   //   "processingDetails": {},
    *   //   "projectDetails": {},
    *   //   "recordingDetails": {},
    *   //   "snippet": {},
    *   //   "statistics": {},
    *   //   "status": {},
    *   //   "suggestions": {},
    *   //   "topicDetails": {}
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
  def insert(params: ParamsResourceVideosInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceVideosInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaVideoListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVideoListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoListResponse] = js.native
  def list(params: ParamsResourceVideosList): GaxiosPromise[SchemaVideoListResponse] = js.native
  def list(params: ParamsResourceVideosList, callback: BodyResponseCallback[SchemaVideoListResponse]): Unit = js.native
  def list(
    params: ParamsResourceVideosList,
    options: BodyResponseCallback[Readable | SchemaVideoListResponse],
    callback: BodyResponseCallback[Readable | SchemaVideoListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVideosList, options: MethodOptions): GaxiosPromise[SchemaVideoListResponse] = js.native
  def list(
    params: ParamsResourceVideosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoListResponse]
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
    *   const res = await youtube.videos.list({
    *     // Return the videos that are in the specified chart.
    *     chart: 'placeholder-value',
    *     // Stands for "host language". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
    *     hl: 'placeholder-value',
    *     // Return videos with the given ids.
    *     id: 'placeholder-value',
    *
    *     locale: 'placeholder-value',
    *
    *     maxHeight: 'placeholder-value',
    *     // The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    *     maxResults: 'placeholder-value',
    *     // Return the player with maximum height specified in
    *     maxWidth: 'placeholder-value',
    *     // Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE.
    *     myRating: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    *     pageToken: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more video resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set *part=snippet*, the API response will contain all of those properties.
    *     part: 'placeholder-value',
    *     // Use a chart that is specific to the specified region
    *     regionCode: 'placeholder-value',
    *     // Use chart that is specific to the specified video category
    *     videoCategoryId: 'placeholder-value',
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
  def list(params: ParamsResourceVideosList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVideosList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rate(): GaxiosPromise[Unit] = js.native
  def rate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def rate(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rate(params: ParamsResourceVideosRate): GaxiosPromise[Unit] = js.native
  def rate(params: ParamsResourceVideosRate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def rate(
    params: ParamsResourceVideosRate,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def rate(params: ParamsResourceVideosRate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rate(params: ParamsResourceVideosRate, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Adds a like or dislike rating to a video or removes a rating from a video.
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
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videos.rate({
    *     id: 'placeholder-value',
    *
    *     rating: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def rate(params: ParamsResourceVideosRate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rate(
    params: ParamsResourceVideosRate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reportAbuse(): GaxiosPromise[Unit] = js.native
  def reportAbuse(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reportAbuse(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reportAbuse(params: ParamsResourceVideosReportabuse): GaxiosPromise[Unit] = js.native
  def reportAbuse(params: ParamsResourceVideosReportabuse, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reportAbuse(
    params: ParamsResourceVideosReportabuse,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def reportAbuse(params: ParamsResourceVideosReportabuse, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reportAbuse(
    params: ParamsResourceVideosReportabuse,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Report abuse for a video.
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
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videos.reportAbuse({
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "comments": "my_comments",
    *       //   "language": "my_language",
    *       //   "reasonId": "my_reasonId",
    *       //   "secondaryReasonId": "my_secondaryReasonId",
    *       //   "videoId": "my_videoId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
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
  def reportAbuse(params: ParamsResourceVideosReportabuse, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reportAbuse(
    params: ParamsResourceVideosReportabuse,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaVideo] = js.native
  def update(callback: BodyResponseCallback[SchemaVideo]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideo] = js.native
  def update(params: ParamsResourceVideosUpdate): GaxiosPromise[SchemaVideo] = js.native
  def update(params: ParamsResourceVideosUpdate, callback: BodyResponseCallback[SchemaVideo]): Unit = js.native
  def update(
    params: ParamsResourceVideosUpdate,
    options: BodyResponseCallback[Readable | SchemaVideo],
    callback: BodyResponseCallback[Readable | SchemaVideo]
  ): Unit = js.native
  def update(params: ParamsResourceVideosUpdate, options: MethodOptions): GaxiosPromise[SchemaVideo] = js.native
  def update(
    params: ParamsResourceVideosUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideo]
  ): Unit = js.native
  /**
    * Updates an existing resource.
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
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.videos.update({
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *part* parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a video's privacy setting is contained in the status part. As such, if your request is updating a private video, and the request's part parameter value includes the status part, the video's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the video will revert to the default privacy setting. In addition, not all parts contain properties that can be set when inserting or updating a video. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ageGating": {},
    *       //   "contentDetails": {},
    *       //   "etag": "my_etag",
    *       //   "fileDetails": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "liveStreamingDetails": {},
    *       //   "localizations": {},
    *       //   "monetizationDetails": {},
    *       //   "player": {},
    *       //   "processingDetails": {},
    *       //   "projectDetails": {},
    *       //   "recordingDetails": {},
    *       //   "snippet": {},
    *       //   "statistics": {},
    *       //   "status": {},
    *       //   "suggestions": {},
    *       //   "topicDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ageGating": {},
    *   //   "contentDetails": {},
    *   //   "etag": "my_etag",
    *   //   "fileDetails": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "liveStreamingDetails": {},
    *   //   "localizations": {},
    *   //   "monetizationDetails": {},
    *   //   "player": {},
    *   //   "processingDetails": {},
    *   //   "projectDetails": {},
    *   //   "recordingDetails": {},
    *   //   "snippet": {},
    *   //   "statistics": {},
    *   //   "status": {},
    *   //   "suggestions": {},
    *   //   "topicDetails": {}
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
  def update(params: ParamsResourceVideosUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceVideosUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
