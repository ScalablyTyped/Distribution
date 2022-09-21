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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$History")
@js.native
open class ResourceUsersHistory protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHistoryResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(params: ParamsResourceUsersHistoryList): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(params: ParamsResourceUsersHistoryList, callback: BodyResponseCallback[SchemaListHistoryResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersHistoryList,
    options: BodyResponseCallback[Readable | SchemaListHistoryResponse],
    callback: BodyResponseCallback[Readable | SchemaListHistoryResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersHistoryList, options: MethodOptions): GaxiosPromise[SchemaListHistoryResponse] = js.native
  def list(
    params: ParamsResourceUsersHistoryList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHistoryResponse]
  ): Unit = js.native
  /**
    * Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing `historyId`).
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
    *       'https://www.googleapis.com/auth/gmail.metadata',
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
    *   const res = await gmail.users.history.list({
    *     // History types to be returned by the function
    *     historyTypes: 'placeholder-value',
    *     // Only return messages with a label matching the ID.
    *     labelId: 'placeholder-value',
    *     // Maximum number of history records to return. This field defaults to 100. The maximum allowed value for this field is 500.
    *     maxResults: 'placeholder-value',
    *     // Page token to retrieve a specific page of results in the list.
    *     pageToken: 'placeholder-value',
    *     // Required. Returns history records after the specified `startHistoryId`. The supplied `startHistoryId` should be obtained from the `historyId` of a message, thread, or previous `list` response. History IDs increase chronologically but are not contiguous with random gaps in between valid IDs. Supplying an invalid or out of date `startHistoryId` typically returns an `HTTP 404` error code. A `historyId` is typically valid for at least a week, but in some rare circumstances may be valid for only a few hours. If you receive an `HTTP 404` error response, your application should perform a full sync. If you receive no `nextPageToken` in the response, there are no updates to retrieve and you can store the returned `historyId` for a future request.
    *     startHistoryId: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "history": [],
    *   //   "historyId": "my_historyId",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceUsersHistoryList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersHistoryList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
