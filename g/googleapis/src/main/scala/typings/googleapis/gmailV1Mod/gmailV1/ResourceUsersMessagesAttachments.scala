package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Messages$Attachments")
@js.native
class ResourceUsersMessagesAttachments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gmail.users.messages.attachments.get
    * @desc Gets the specified message attachment.
    * @alias gmail.users.messages.attachments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the attachment.
    * @param {string} params.messageId The ID of the message containing the attachment.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(callback: BodyResponseCallback[SchemaMessagePartBody]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(params: ParamsResourceUsersMessagesAttachmentsGet): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    callback: BodyResponseCallback[SchemaMessagePartBody]
  ): Unit = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    options: BodyResponseCallback[SchemaMessagePartBody],
    callback: BodyResponseCallback[SchemaMessagePartBody]
  ): Unit = js.native
  def get(params: ParamsResourceUsersMessagesAttachmentsGet, options: MethodOptions): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessagePartBody]
  ): Unit = js.native
}
