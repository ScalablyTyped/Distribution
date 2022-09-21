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

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Playlists")
@js.native
open class ResourcePlaylists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlaylistsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlaylistsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePlaylistsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePlaylistsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePlaylistsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
    *   const res = await youtube.playlists.delete({
    *     id: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
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
  def delete(params: ParamsResourcePlaylistsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePlaylistsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(params: ParamsResourcePlaylistsInsert): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(params: ParamsResourcePlaylistsInsert, callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def insert(
    params: ParamsResourcePlaylistsInsert,
    options: BodyResponseCallback[Readable | SchemaPlaylist],
    callback: BodyResponseCallback[Readable | SchemaPlaylist]
  ): Unit = js.native
  def insert(params: ParamsResourcePlaylistsInsert, options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(
    params: ParamsResourcePlaylistsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylist]
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
    *       'https://www.googleapis.com/auth/youtubepartner',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.playlists.insert({
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    *     onBehalfOfContentOwnerChannel: 'placeholder-value',
    *     // The *part* parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentDetails": {},
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "localizations": {},
    *       //   "player": {},
    *       //   "snippet": {},
    *       //   "status": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentDetails": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "localizations": {},
    *   //   "player": {},
    *   //   "snippet": {},
    *   //   "status": {}
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
  def insert(params: ParamsResourcePlaylistsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePlaylistsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlaylistListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(params: ParamsResourcePlaylistsList): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(params: ParamsResourcePlaylistsList, callback: BodyResponseCallback[SchemaPlaylistListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlaylistsList,
    options: BodyResponseCallback[Readable | SchemaPlaylistListResponse],
    callback: BodyResponseCallback[Readable | SchemaPlaylistListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlaylistsList, options: MethodOptions): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(
    params: ParamsResourcePlaylistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylistListResponse]
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
    *   const res = await youtube.playlists.list({
    *     // Return the playlists owned by the specified channel ID.
    *     channelId: 'placeholder-value',
    *     // Returen content in specified language
    *     hl: 'placeholder-value',
    *     // Return the playlists with the given IDs for Stubby or Apiary.
    *     id: 'placeholder-value',
    *     // The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    *     maxResults: 'placeholder-value',
    *     // Return the playlists owned by the authenticated user.
    *     mine: 'placeholder-value',
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // This parameter can only be used in a properly authorized request. *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwnerChannel* parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    *     onBehalfOfContentOwnerChannel: 'placeholder-value',
    *     // The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    *     pageToken: 'placeholder-value',
    *     // The *part* parameter specifies a comma-separated list of one or more playlist resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlist resource, the snippet property contains properties like author, title, description, tags, and timeCreated. As such, if you set *part=snippet*, the API response will contain all of those properties.
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
  def list(params: ParamsResourcePlaylistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlaylistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPlaylist] = js.native
  def update(callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def update(params: ParamsResourcePlaylistsUpdate): GaxiosPromise[SchemaPlaylist] = js.native
  def update(params: ParamsResourcePlaylistsUpdate, callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def update(
    params: ParamsResourcePlaylistsUpdate,
    options: BodyResponseCallback[Readable | SchemaPlaylist],
    callback: BodyResponseCallback[Readable | SchemaPlaylist]
  ): Unit = js.native
  def update(params: ParamsResourcePlaylistsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def update(
    params: ParamsResourcePlaylistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylist]
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
    *   const res = await youtube.playlists.update({
    *     // *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    *     onBehalfOfContentOwner: 'placeholder-value',
    *     // The *part* parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. Note that this method will override the existing values for mutable properties that are contained in any parts that the request body specifies. For example, a playlist's description is contained in the snippet part, which must be included in the request body. If the request does not specify a value for the snippet.description property, the playlist's existing description will be deleted.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentDetails": {},
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "localizations": {},
    *       //   "player": {},
    *       //   "snippet": {},
    *       //   "status": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentDetails": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "localizations": {},
    *   //   "player": {},
    *   //   "snippet": {},
    *   //   "status": {}
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
  def update(params: ParamsResourcePlaylistsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePlaylistsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
