package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Conversations$Messages")
@js.native
open class ResourceProjectsConversationsMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreate(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse] = js.native
  def batchCreate(params: ParamsResourceProjectsConversationsMessagesBatchcreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsConversationsMessagesBatchcreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsConversationsMessagesBatchcreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceProjectsConversationsMessagesBatchcreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsConversationsMessagesBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1BatchCreateMessagesResponse]
  ): Unit = js.native
  /**
    * Batch ingests messages to conversation. Customers can use this RPC to ingest historical messages to conversation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.conversations.messages.batchCreate({
    *     // Required. Resource identifier of the conversation to create message. Format: `projects//locations//conversations/`.
    *     parent: 'projects/my-project/conversations/my-conversation',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "messages": []
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
  def batchCreate(params: ParamsResourceProjectsConversationsMessagesBatchcreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceProjectsConversationsMessagesBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse] = js.native
  def list(params: ParamsResourceProjectsConversationsMessagesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationsMessagesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConversationsMessagesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConversationsMessagesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationsMessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListMessagesResponse]
  ): Unit = js.native
  /**
    * Lists messages that belong to a given conversation. `messages` are ordered by `create_time` in descending order. To fetch updates without duplication, send request with filter `create_time_epoch_microseconds \> [first item's create_time of previous request]` and empty page_token.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.conversations.messages.list({
    *     // Optional. Filter on message fields. Currently predicates on `create_time` and `create_time_epoch_microseconds` are supported. `create_time` only support milliseconds accuracy. E.g., `create_time_epoch_microseconds \> 1551790877964485` or `create_time \> "2017-01-15T01:30:15.01Z"`. For more information about filtering, see [API Filtering](https://aip.dev/160).
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the conversation to list messages for. Format: `projects//locations//conversations/`
    *     parent: 'projects/my-project/conversations/my-conversation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "messages": [],
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
  def list(params: ParamsResourceProjectsConversationsMessagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsConversationsMessagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
