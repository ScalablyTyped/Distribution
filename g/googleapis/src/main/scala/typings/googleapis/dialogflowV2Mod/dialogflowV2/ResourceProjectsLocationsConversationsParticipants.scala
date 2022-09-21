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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Locations$Conversations$Participants")
@js.native
open class ResourceProjectsLocationsConversationsParticipants protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def analyzeContent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse] = js.native
  def analyzeContent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse]): Unit = js.native
  def analyzeContent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse] = js.native
  def analyzeContent(params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse] = js.native
  def analyzeContent(
    params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse]
  ): Unit = js.native
  def analyzeContent(
    params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2AnalyzeContentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2AnalyzeContentResponse]
  ): Unit = js.native
  def analyzeContent(
    params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse] = js.native
  def analyzeContent(
    params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2AnalyzeContentResponse]
  ): Unit = js.native
  /**
    * Adds a text (chat, for example), or audio (phone recording, for example) message from a participant into the conversation. Note: Always use agent versions for production traffic sent to virtual agents. See [Versions and environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.analyzeContent(
    *       {
    *         // Required. The name of the participant this text comes from. Format: `projects//locations//conversations//participants/`.
    *         participant:
    *           'projects/my-project/locations/my-location/conversations/my-conversation/participants/my-participant',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "assistQueryParams": {},
    *           //   "cxParameters": {},
    *           //   "eventInput": {},
    *           //   "queryParams": {},
    *           //   "replyAudioConfig": {},
    *           //   "requestId": "my_requestId",
    *           //   "textInput": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "automatedAgentReply": {},
    *   //   "dtmfParameters": {},
    *   //   "endUserSuggestionResults": [],
    *   //   "humanAgentSuggestionResults": [],
    *   //   "message": {},
    *   //   "replyAudio": {},
    *   //   "replyText": "my_replyText"
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
  def analyzeContent(
    params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def analyzeContent(
    params: ParamsResourceProjectsLocationsConversationsParticipantsAnalyzecontent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def create(params: ParamsResourceProjectsLocationsConversationsParticipantsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsParticipantsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsParticipantsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Participant],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsConversationsParticipantsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsParticipantsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  /**
    * Creates a new participant in a conversation.
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.create({
    *       // Required. Resource identifier of the conversation adding the participant. Format: `projects//locations//conversations/`.
    *       parent:
    *         'projects/my-project/locations/my-location/conversations/my-conversation',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "documentsMetadataFilters": {},
    *         //   "name": "my_name",
    *         //   "role": "my_role",
    *         //   "sipRecordingMediaLabel": "my_sipRecordingMediaLabel"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documentsMetadataFilters": {},
    *   //   "name": "my_name",
    *   //   "role": "my_role",
    *   //   "sipRecordingMediaLabel": "my_sipRecordingMediaLabel"
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
  def create(
    params: ParamsResourceProjectsLocationsConversationsParticipantsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationsParticipantsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def get(params: ParamsResourceProjectsLocationsConversationsParticipantsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsParticipantsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsParticipantsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Participant],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConversationsParticipantsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsParticipantsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  /**
    * Retrieves a conversation participant.
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.get({
    *       // Required. The name of the participant. Format: `projects//locations//conversations//participants/`.
    *       name: 'projects/my-project/locations/my-location/conversations/my-conversation/participants/my-participant',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documentsMetadataFilters": {},
    *   //   "name": "my_name",
    *   //   "role": "my_role",
    *   //   "sipRecordingMediaLabel": "my_sipRecordingMediaLabel"
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
  def get(params: ParamsResourceProjectsLocationsConversationsParticipantsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationsParticipantsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListParticipantsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListParticipantsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListParticipantsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConversationsParticipantsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListParticipantsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsParticipantsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListParticipantsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsParticipantsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListParticipantsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListParticipantsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConversationsParticipantsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListParticipantsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsParticipantsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListParticipantsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all participants in the specified conversation.
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.list({
    *       // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. The next_page_token value returned from a previous list request.
    *       pageToken: 'placeholder-value',
    *       // Required. The conversation to list all participants from. Format: `projects//locations//conversations/`.
    *       parent:
    *         'projects/my-project/locations/my-location/conversations/my-conversation',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "participants": []
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
  def list(params: ParamsResourceProjectsLocationsConversationsParticipantsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationsParticipantsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def patch(params: ParamsResourceProjectsLocationsConversationsParticipantsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsParticipantsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsParticipantsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Participant],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsConversationsParticipantsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Participant] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsParticipantsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Participant]
  ): Unit = js.native
  /**
    * Updates the specified participant.
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.patch({
    *       // Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
    *       name: 'projects/my-project/locations/my-location/conversations/my-conversation/participants/my-participant',
    *       // Required. The mask to specify which fields to update.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "documentsMetadataFilters": {},
    *         //   "name": "my_name",
    *         //   "role": "my_role",
    *         //   "sipRecordingMediaLabel": "my_sipRecordingMediaLabel"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "documentsMetadataFilters": {},
    *   //   "name": "my_name",
    *   //   "role": "my_role",
    *   //   "sipRecordingMediaLabel": "my_sipRecordingMediaLabel"
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
  def patch(
    params: ParamsResourceProjectsLocationsConversationsParticipantsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationsParticipantsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var suggestions: ResourceProjectsLocationsConversationsParticipantsSuggestions = js.native
}
