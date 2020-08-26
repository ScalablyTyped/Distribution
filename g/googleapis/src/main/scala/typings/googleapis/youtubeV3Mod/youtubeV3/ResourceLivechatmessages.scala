package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Livechatmessages")
@js.native
class ResourceLivechatmessages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.liveChatMessages.delete
    * @desc Deletes a chat message.
    * @alias youtube.liveChatMessages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube chat message ID of the resource that is being deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLivechatmessagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLivechatmessagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceLivechatmessagesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceLivechatmessagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceLivechatmessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.liveChatMessages.insert
    * @desc Adds a message to a live chat.
    * @alias youtube.liveChatMessages.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes. It identifies the properties that the write operation will set as well as the properties that the API response will include. Set the parameter value to snippet.
    * @param {().LiveChatMessage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaLiveChatMessage] = js.native
  def insert(callback: BodyResponseCallback[SchemaLiveChatMessage]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLiveChatMessage] = js.native
  def insert(params: ParamsResourceLivechatmessagesInsert): GaxiosPromise[SchemaLiveChatMessage] = js.native
  def insert(
    params: ParamsResourceLivechatmessagesInsert,
    callback: BodyResponseCallback[SchemaLiveChatMessage]
  ): Unit = js.native
  def insert(
    params: ParamsResourceLivechatmessagesInsert,
    options: BodyResponseCallback[SchemaLiveChatMessage],
    callback: BodyResponseCallback[SchemaLiveChatMessage]
  ): Unit = js.native
  def insert(params: ParamsResourceLivechatmessagesInsert, options: MethodOptions): GaxiosPromise[SchemaLiveChatMessage] = js.native
  def insert(
    params: ParamsResourceLivechatmessagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiveChatMessage]
  ): Unit = js.native
  /**
    * youtube.liveChatMessages.list
    * @desc Lists live chat messages for a specific chat.
    * @alias youtube.liveChatMessages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.  If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
    * @param {string} params.liveChatId The liveChatId parameter specifies the ID of the chat whose messages will be returned.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of messages that should be returned in the result set.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies the liveChatComment resource parts that the API response will include. Supported values are id and snippet.
    * @param {integer=} params.profileImageSize The profileImageSize parameter specifies the size of the user profile pictures that should be returned in the result set. Default: 88.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLiveChatMessageListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLiveChatMessageListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLiveChatMessageListResponse] = js.native
  def list(params: ParamsResourceLivechatmessagesList): GaxiosPromise[SchemaLiveChatMessageListResponse] = js.native
  def list(
    params: ParamsResourceLivechatmessagesList,
    callback: BodyResponseCallback[SchemaLiveChatMessageListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLivechatmessagesList,
    options: BodyResponseCallback[SchemaLiveChatMessageListResponse],
    callback: BodyResponseCallback[SchemaLiveChatMessageListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLivechatmessagesList, options: MethodOptions): GaxiosPromise[SchemaLiveChatMessageListResponse] = js.native
  def list(
    params: ParamsResourceLivechatmessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiveChatMessageListResponse]
  ): Unit = js.native
}

