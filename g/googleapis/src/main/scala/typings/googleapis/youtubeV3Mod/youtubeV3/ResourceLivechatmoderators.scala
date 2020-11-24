package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Livechatmoderators")
@js.native
class ResourceLivechatmoderators protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.liveChatModerators.delete
    * @desc Removes a chat moderator.
    * @alias youtube.liveChatModerators.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter identifies the chat moderator to remove. The value uniquely identifies both the moderator and the chat.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLivechatmoderatorsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLivechatmoderatorsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceLivechatmoderatorsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceLivechatmoderatorsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceLivechatmoderatorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.liveChatModerators.insert
    * @desc Adds a new moderator for the chat.
    * @alias youtube.liveChatModerators.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response returns. Set the parameter value to snippet.
    * @param {().LiveChatModerator} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaLiveChatModerator] = js.native
  def insert(callback: BodyResponseCallback[SchemaLiveChatModerator]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLiveChatModerator] = js.native
  def insert(params: ParamsResourceLivechatmoderatorsInsert): GaxiosPromise[SchemaLiveChatModerator] = js.native
  def insert(
    params: ParamsResourceLivechatmoderatorsInsert,
    callback: BodyResponseCallback[SchemaLiveChatModerator]
  ): Unit = js.native
  def insert(
    params: ParamsResourceLivechatmoderatorsInsert,
    options: BodyResponseCallback[SchemaLiveChatModerator],
    callback: BodyResponseCallback[SchemaLiveChatModerator]
  ): Unit = js.native
  def insert(params: ParamsResourceLivechatmoderatorsInsert, options: MethodOptions): GaxiosPromise[SchemaLiveChatModerator] = js.native
  def insert(
    params: ParamsResourceLivechatmoderatorsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiveChatModerator]
  ): Unit = js.native
  
  /**
    * youtube.liveChatModerators.list
    * @desc Lists moderators for a live chat.
    * @alias youtube.liveChatModerators.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.liveChatId The liveChatId parameter specifies the YouTube live chat for which the API should return moderators.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies the liveChatModerator resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLiveChatModeratorListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLiveChatModeratorListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLiveChatModeratorListResponse] = js.native
  def list(params: ParamsResourceLivechatmoderatorsList): GaxiosPromise[SchemaLiveChatModeratorListResponse] = js.native
  def list(
    params: ParamsResourceLivechatmoderatorsList,
    callback: BodyResponseCallback[SchemaLiveChatModeratorListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLivechatmoderatorsList,
    options: BodyResponseCallback[SchemaLiveChatModeratorListResponse],
    callback: BodyResponseCallback[SchemaLiveChatModeratorListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLivechatmoderatorsList, options: MethodOptions): GaxiosPromise[SchemaLiveChatModeratorListResponse] = js.native
  def list(
    params: ParamsResourceLivechatmoderatorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiveChatModeratorListResponse]
  ): Unit = js.native
}
