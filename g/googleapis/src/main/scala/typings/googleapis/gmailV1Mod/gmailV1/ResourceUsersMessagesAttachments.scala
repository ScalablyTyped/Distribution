package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Messages$Attachments")
@js.native
open class ResourceUsersMessagesAttachments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(callback: BodyResponseCallback[SchemaMessagePartBody]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(params: ParamsResourceUsersMessagesAttachmentsGet): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    callback: BodyResponseCallback[SchemaMessagePartBody]
  ): Unit = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    options: BodyResponseCallback[Readable | SchemaMessagePartBody],
    callback: BodyResponseCallback[Readable | SchemaMessagePartBody]
  ): Unit = js.native
  def get(params: ParamsResourceUsersMessagesAttachmentsGet, options: MethodOptions): GaxiosPromise[SchemaMessagePartBody] = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessagePartBody]
  ): Unit = js.native
  /**
    * Gets the specified message attachment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.addons.current.message.action',
    *       'https://www.googleapis.com/auth/gmail.addons.current.message.readonly',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.messages.attachments.get({
    *     // The ID of the attachment.
    *     id: 'placeholder-value',
    *     // The ID of the message containing the attachment.
    *     messageId: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attachmentId": "my_attachmentId",
    *   //   "data": "my_data",
    *   //   "size": 0
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
  def get(params: ParamsResourceUsersMessagesAttachmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersMessagesAttachmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
