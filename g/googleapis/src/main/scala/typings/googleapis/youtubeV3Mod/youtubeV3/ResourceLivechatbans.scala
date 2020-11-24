package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Livechatbans")
@js.native
class ResourceLivechatbans protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.liveChatBans.delete
    * @desc Removes a chat ban.
    * @alias youtube.liveChatBans.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter identifies the chat ban to remove. The value uniquely identifies both the ban and the chat.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLivechatbansDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceLivechatbansDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceLivechatbansDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceLivechatbansDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceLivechatbansDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.liveChatBans.insert
    * @desc Adds a new ban to the chat.
    * @alias youtube.liveChatBans.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response returns. Set the parameter value to snippet.
    * @param {().LiveChatBan} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaLiveChatBan] = js.native
  def insert(callback: BodyResponseCallback[SchemaLiveChatBan]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLiveChatBan] = js.native
  def insert(params: ParamsResourceLivechatbansInsert): GaxiosPromise[SchemaLiveChatBan] = js.native
  def insert(params: ParamsResourceLivechatbansInsert, callback: BodyResponseCallback[SchemaLiveChatBan]): Unit = js.native
  def insert(
    params: ParamsResourceLivechatbansInsert,
    options: BodyResponseCallback[SchemaLiveChatBan],
    callback: BodyResponseCallback[SchemaLiveChatBan]
  ): Unit = js.native
  def insert(params: ParamsResourceLivechatbansInsert, options: MethodOptions): GaxiosPromise[SchemaLiveChatBan] = js.native
  def insert(
    params: ParamsResourceLivechatbansInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLiveChatBan]
  ): Unit = js.native
}
