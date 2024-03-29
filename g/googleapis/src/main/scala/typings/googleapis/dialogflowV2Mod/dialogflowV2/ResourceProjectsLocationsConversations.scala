package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Locations$Conversations")
@js.native
open class ResourceProjectsLocationsConversations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def complete(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def complete(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]): Unit = js.native
  def complete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def complete(params: ParamsResourceProjectsLocationsConversationsComplete): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def complete(
    params: ParamsResourceProjectsLocationsConversationsComplete,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  def complete(
    params: ParamsResourceProjectsLocationsConversationsComplete,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Conversation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  def complete(params: ParamsResourceProjectsLocationsConversationsComplete, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def complete(
    params: ParamsResourceProjectsLocationsConversationsComplete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  /**
    * Completes the specified conversation. Finished conversations are purged from the database after 30 days.
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
    * const dialogflow = google.dialogflow('v2');
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
    *   const res = await dialogflow.projects.locations.conversations.complete({
    *     // Required. Resource identifier of the conversation to close. Format: `projects//locations//conversations/`.
    *     name: 'projects/my-project/locations/my-location/conversations/my-conversation',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationProfile": "my_conversationProfile",
    *   //   "conversationStage": "my_conversationStage",
    *   //   "endTime": "my_endTime",
    *   //   "lifecycleState": "my_lifecycleState",
    *   //   "name": "my_name",
    *   //   "phoneNumber": {},
    *   //   "startTime": "my_startTime"
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
  def complete(params: ParamsResourceProjectsLocationsConversationsComplete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def complete(
    params: ParamsResourceProjectsLocationsConversationsComplete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def create(params: ParamsResourceProjectsLocationsConversationsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Conversation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsConversationsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  /**
    * Creates a new conversation. Conversations are auto-completed after 24 hours. Conversation Lifecycle: There are two stages during a conversation: Automated Agent Stage and Assist Stage. For Automated Agent Stage, there will be a dialogflow agent responding to user queries. For Assist Stage, there's no dialogflow agent responding to user queries. But we will provide suggestions which are generated from conversation. If Conversation.conversation_profile is configured for a dialogflow agent, conversation will start from `Automated Agent Stage`, otherwise, it will start from `Assist Stage`. And during `Automated Agent Stage`, once an Intent with Intent.live_agent_handoff is triggered, conversation will transfer to Assist Stage.
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
    * const dialogflow = google.dialogflow('v2');
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
    *   const res = await dialogflow.projects.locations.conversations.create({
    *     // Optional. Identifier of the conversation. Generally it's auto generated by Google. Only set it if you cannot wait for the response to return a auto-generated one to you. The conversation ID must be compliant with the regression fomula "a-zA-Z*" with the characters length in range of [3,64]. If the field is provided, the caller is resposible for 1. the uniqueness of the ID, otherwise the request will be rejected. 2. the consistency for whether to use custom ID or not under a project to better ensure uniqueness.
    *     conversationId: 'placeholder-value',
    *     // Required. Resource identifier of the project creating the conversation. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conversationProfile": "my_conversationProfile",
    *       //   "conversationStage": "my_conversationStage",
    *       //   "endTime": "my_endTime",
    *       //   "lifecycleState": "my_lifecycleState",
    *       //   "name": "my_name",
    *       //   "phoneNumber": {},
    *       //   "startTime": "my_startTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationProfile": "my_conversationProfile",
    *   //   "conversationStage": "my_conversationStage",
    *   //   "endTime": "my_endTime",
    *   //   "lifecycleState": "my_lifecycleState",
    *   //   "name": "my_name",
    *   //   "phoneNumber": {},
    *   //   "startTime": "my_startTime"
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
  def create(params: ParamsResourceProjectsLocationsConversationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def get(params: ParamsResourceProjectsLocationsConversationsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Conversation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConversationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Conversation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Conversation]
  ): Unit = js.native
  /**
    * Retrieves the specific conversation.
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
    * const dialogflow = google.dialogflow('v2');
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
    *   const res = await dialogflow.projects.locations.conversations.get({
    *     // Required. The name of the conversation. Format: `projects//locations//conversations/`.
    *     name: 'projects/my-project/locations/my-location/conversations/my-conversation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationProfile": "my_conversationProfile",
    *   //   "conversationStage": "my_conversationStage",
    *   //   "endTime": "my_endTime",
    *   //   "lifecycleState": "my_lifecycleState",
    *   //   "name": "my_name",
    *   //   "phoneNumber": {},
    *   //   "startTime": "my_startTime"
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
  def get(params: ParamsResourceProjectsLocationsConversationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConversationsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConversationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all conversations in the specified project.
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
    * const dialogflow = google.dialogflow('v2');
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
    *   const res = await dialogflow.projects.locations.conversations.list({
    *     // A filter expression that filters conversations listed in the response. In general, the expression must specify the field name, a comparison operator, and the value to use for filtering: - The value must be a string, a number, or a boolean. - The comparison operator must be either `=`,`!=`, `\>`, or `<`. - To filter on multiple expressions, separate the expressions with `AND` or `OR` (omitting both implies `AND`). - For clarity, expressions can be enclosed in parentheses. Only `lifecycle_state` can be filtered on in this way. For example, the following expression only returns `COMPLETED` conversations: `lifecycle_state = "COMPLETED"` For more information about filtering, see [API Filtering](https://aip.dev/160).
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project from which to list all conversation. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversations": [],
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
  def list(params: ParamsResourceProjectsLocationsConversationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var messages: ResourceProjectsLocationsConversationsMessages = js.native
  
  var participants: ResourceProjectsLocationsConversationsParticipants = js.native
}
