package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Playlistitems")
@js.native
class ResourcePlaylistitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.playlistItems.delete
    * @desc Deletes a playlist item.
    * @alias youtube.playlistItems.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube playlist item ID for the playlist item that is being deleted. In a playlistItem resource, the id property specifies the playlist item's ID.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlaylistitemsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlaylistitemsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePlaylistitemsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePlaylistitemsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePlaylistitemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.playlistItems.insert
    * @desc Adds a resource to a playlist.
    * @alias youtube.playlistItems.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
    * @param {().PlaylistItem} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPlaylistItem] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlaylistItem]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlaylistItem] = js.native
  def insert(params: ParamsResourcePlaylistitemsInsert): GaxiosPromise[SchemaPlaylistItem] = js.native
  def insert(params: ParamsResourcePlaylistitemsInsert, callback: BodyResponseCallback[SchemaPlaylistItem]): Unit = js.native
  def insert(
    params: ParamsResourcePlaylistitemsInsert,
    options: BodyResponseCallback[SchemaPlaylistItem],
    callback: BodyResponseCallback[SchemaPlaylistItem]
  ): Unit = js.native
  def insert(params: ParamsResourcePlaylistitemsInsert, options: MethodOptions): GaxiosPromise[SchemaPlaylistItem] = js.native
  def insert(
    params: ParamsResourcePlaylistitemsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylistItem]
  ): Unit = js.native
  
  /**
    * youtube.playlistItems.list
    * @desc Returns a collection of playlist items that match the API request
    * parameters. You can retrieve all of the playlist items in a specified
    * playlist or retrieve one or more playlist items by their unique IDs.
    * @alias youtube.playlistItems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The id parameter specifies a comma-separated list of one or more unique playlist item IDs.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more playlistItem resource properties that the API response will include.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlistItem resource, the snippet property contains numerous fields, including the title, description, position, and resourceId properties. As such, if you set part=snippet, the API response will contain all of those properties.
    * @param {string=} params.playlistId The playlistId parameter specifies the unique ID of the playlist for which you want to retrieve playlist items. Note that even though this is an optional parameter, every request to retrieve playlist items must specify a value for either the id parameter or the playlistId parameter.
    * @param {string=} params.videoId The videoId parameter specifies that the request should return only the playlist items that contain the specified video.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlaylistItemListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlaylistItemListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlaylistItemListResponse] = js.native
  def list(params: ParamsResourcePlaylistitemsList): GaxiosPromise[SchemaPlaylistItemListResponse] = js.native
  def list(
    params: ParamsResourcePlaylistitemsList,
    callback: BodyResponseCallback[SchemaPlaylistItemListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlaylistitemsList,
    options: BodyResponseCallback[SchemaPlaylistItemListResponse],
    callback: BodyResponseCallback[SchemaPlaylistItemListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlaylistitemsList, options: MethodOptions): GaxiosPromise[SchemaPlaylistItemListResponse] = js.native
  def list(
    params: ParamsResourcePlaylistitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylistItemListResponse]
  ): Unit = js.native
  
  /**
    * youtube.playlistItems.update
    * @desc Modifies a playlist item. For example, you could update the item's
    * position in the playlist.
    * @alias youtube.playlistItems.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a playlist item can specify a start time and end time, which identify the times portion of the video that should play when users watch the video in the playlist. If your request is updating a playlist item that sets these values, and the request's part parameter value includes the contentDetails part, the playlist item's start and end times will be updated to whatever value the request body specifies. If the request body does not specify values, the existing start and end times will be removed and replaced with the default settings.
    * @param {().PlaylistItem} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPlaylistItem] = js.native
  def update(callback: BodyResponseCallback[SchemaPlaylistItem]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlaylistItem] = js.native
  def update(params: ParamsResourcePlaylistitemsUpdate): GaxiosPromise[SchemaPlaylistItem] = js.native
  def update(params: ParamsResourcePlaylistitemsUpdate, callback: BodyResponseCallback[SchemaPlaylistItem]): Unit = js.native
  def update(
    params: ParamsResourcePlaylistitemsUpdate,
    options: BodyResponseCallback[SchemaPlaylistItem],
    callback: BodyResponseCallback[SchemaPlaylistItem]
  ): Unit = js.native
  def update(params: ParamsResourcePlaylistitemsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlaylistItem] = js.native
  def update(
    params: ParamsResourcePlaylistitemsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaylistItem]
  ): Unit = js.native
}
