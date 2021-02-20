package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Playlists")
@js.native
class ResourcePlaylists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.playlists.delete
    * @desc Deletes a playlist.
    * @alias youtube.playlists.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube playlist ID for the playlist that is being deleted. In a playlist resource, the id property specifies the playlist's ID.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlaylistsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlaylistsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePlaylistsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePlaylistsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePlaylistsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.playlists.insert
    * @desc Creates a playlist.
    * @alias youtube.playlists.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
    * @param {().Playlist} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(params: ParamsResourcePlaylistsInsert): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(params: ParamsResourcePlaylistsInsert, callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def insert(
    params: ParamsResourcePlaylistsInsert,
    options: BodyResponseCallback[SchemaPlaylist],
    callback: BodyResponseCallback[SchemaPlaylist]
  ): Unit = js.native
  def insert(params: ParamsResourcePlaylistsInsert, options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def insert(
    params: ParamsResourcePlaylistsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylist]
  ): Unit = js.native
  
  /**
    * youtube.playlists.list
    * @desc Returns a collection of playlists that match the API request
    * parameters. For example, you can retrieve all playlists that the
    * authenticated user owns, or you can retrieve one or more playlists by
    * their unique IDs.
    * @alias youtube.playlists.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.channelId This value indicates that the API should only return the specified channel's playlists.
    * @param {string=} params.hl The hl parameter should be used for filter out the properties that are not in the given language. Used for the snippet part.
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube playlist ID(s) for the resource(s) that are being retrieved. In a playlist resource, the id property specifies the playlist's YouTube playlist ID.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {boolean=} params.mine Set this parameter's value to true to instruct the API to only return playlists owned by the authenticated user.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more playlist resource properties that the API response will include.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlist resource, the snippet property contains properties like author, title, description, tags, and timeCreated. As such, if you set part=snippet, the API response will contain all of those properties.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlaylistListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(params: ParamsResourcePlaylistsList): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(params: ParamsResourcePlaylistsList, callback: BodyResponseCallback[SchemaPlaylistListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlaylistsList,
    options: BodyResponseCallback[SchemaPlaylistListResponse],
    callback: BodyResponseCallback[SchemaPlaylistListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlaylistsList, options: MethodOptions): GaxiosPromise[SchemaPlaylistListResponse] = js.native
  def list(
    params: ParamsResourcePlaylistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylistListResponse]
  ): Unit = js.native
  
  /**
    * youtube.playlists.update
    * @desc Modifies a playlist. For example, you could change a playlist's
    * title, description, or privacy status.
    * @alias youtube.playlists.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  Note that this method will override the existing values for mutable properties that are contained in any parts that the request body specifies. For example, a playlist's description is contained in the snippet part, which must be included in the request body. If the request does not specify a value for the snippet.description property, the playlist's existing description will be deleted.
    * @param {().Playlist} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPlaylist] = js.native
  def update(callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def update(params: ParamsResourcePlaylistsUpdate): GaxiosPromise[SchemaPlaylist] = js.native
  def update(params: ParamsResourcePlaylistsUpdate, callback: BodyResponseCallback[SchemaPlaylist]): Unit = js.native
  def update(
    params: ParamsResourcePlaylistsUpdate,
    options: BodyResponseCallback[SchemaPlaylist],
    callback: BodyResponseCallback[SchemaPlaylist]
  ): Unit = js.native
  def update(params: ParamsResourcePlaylistsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlaylist] = js.native
  def update(
    params: ParamsResourcePlaylistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylist]
  ): Unit = js.native
}
