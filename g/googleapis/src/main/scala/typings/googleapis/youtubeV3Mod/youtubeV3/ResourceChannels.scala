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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Channels")
@js.native
open class ResourceChannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaChannelListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChannelListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannelListResponse] = js.native
  def list(params: ParamsResourceChannelsList): GaxiosPromise[SchemaChannelListResponse] = js.native
  def list(params: ParamsResourceChannelsList, callback: BodyResponseCallback[SchemaChannelListResponse]): Unit = js.native
  def list(
    params: ParamsResourceChannelsList,
    options: BodyResponseCallback[Readable | SchemaChannelListResponse],
    callback: BodyResponseCallback[Readable | SchemaChannelListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChannelsList, options: MethodOptions): GaxiosPromise[SchemaChannelListResponse] = js.native
  def list(
    params: ParamsResourceChannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannelListResponse]
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
    *       'https://www.googleapis.com/auth/youtubepartner-channel-audit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.channels.list({
    *     // Return the channels within the specified guide category ID.
    *     categoryId: 'placeholder-value',
    *     // Return the channel associated with a YouTube username.
    *     forUsername: 'placeholder-value',
    *     // Stands for "host language". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
    *     hl: 'placeholder-value',
    *     // Return the channels with the specified IDs.
    *     id: 'placeholder-value',
    *     // Return the channels managed by the authenticated user.
    *     managedByMe: 'placeholder-value',
    *     // The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    *     maxResults: 'placeholder-value',
    *     // Return the ids of channels owned by the authenticated user.
    *     mine: 'placeholder-value',
    *     // Return the channels subscribed to the authenticated user
    *     mySubscribers: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    *     pageToken: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more channel resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set *part=contentDetails*, the API response will also contain all of those nested properties.
    *     part: 'placeholder-value',
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
  def list(params: ParamsResourceChannelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceChannelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaChannel] = js.native
  def update(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def update(params: ParamsResourceChannelsUpdate): GaxiosPromise[SchemaChannel] = js.native
  def update(params: ParamsResourceChannelsUpdate, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def update(
    params: ParamsResourceChannelsUpdate,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def update(params: ParamsResourceChannelsUpdate, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def update(
    params: ParamsResourceChannelsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
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
    *   const res = await youtube.channels.update({
    *     // The *onBehalfOfContentOwner* parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *part* parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The API currently only allows the parameter value to be set to either brandingSettings or invideoPromotion. (You cannot update both of those parts with a single request.) Note that this method overrides the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "auditDetails": {},
    *       //   "brandingSettings": {},
    *       //   "contentDetails": {},
    *       //   "contentOwnerDetails": {},
    *       //   "conversionPings": {},
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "localizations": {},
    *       //   "snippet": {},
    *       //   "statistics": {},
    *       //   "status": {},
    *       //   "topicDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditDetails": {},
    *   //   "brandingSettings": {},
    *   //   "contentDetails": {},
    *   //   "contentOwnerDetails": {},
    *   //   "conversionPings": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "localizations": {},
    *   //   "snippet": {},
    *   //   "statistics": {},
    *   //   "status": {},
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
  def update(params: ParamsResourceChannelsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceChannelsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
