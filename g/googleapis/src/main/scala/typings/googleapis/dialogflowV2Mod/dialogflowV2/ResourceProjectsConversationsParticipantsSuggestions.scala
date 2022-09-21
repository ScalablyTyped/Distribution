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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Conversations$Participants$Suggestions")
@js.native
open class ResourceProjectsConversationsParticipantsSuggestions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def suggestArticles(): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse] = js.native
  def suggestArticles(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse]): Unit = js.native
  def suggestArticles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse] = js.native
  def suggestArticles(params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse]
  ): Unit = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2SuggestArticlesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2SuggestArticlesResponse]
  ): Unit = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestArticlesResponse]
  ): Unit = js.native
  /**
    * Gets suggested articles for a participant based on specific historical messages.
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
    *     await dialogflow.projects.conversations.participants.suggestions.suggestArticles(
    *       {
    *         // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *         parent:
    *           'projects/my-project/conversations/my-conversation/participants/my-participant',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "assistQueryParams": {},
    *           //   "contextSize": 0,
    *           //   "latestMessage": "my_latestMessage"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "articleAnswers": [],
    *   //   "contextSize": 0,
    *   //   "latestMessage": "my_latestMessage"
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
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suggestFaqAnswers(): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse]): Unit = js.native
  def suggestFaqAnswers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse]
  ): Unit = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse]
  ): Unit = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestFaqAnswersResponse]
  ): Unit = js.native
  /**
    * Gets suggested faq answers for a participant based on specific historical messages.
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
    *     await dialogflow.projects.conversations.participants.suggestions.suggestFaqAnswers(
    *       {
    *         // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *         parent:
    *           'projects/my-project/conversations/my-conversation/participants/my-participant',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "assistQueryParams": {},
    *           //   "contextSize": 0,
    *           //   "latestMessage": "my_latestMessage"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contextSize": 0,
    *   //   "faqAnswers": [],
    *   //   "latestMessage": "my_latestMessage"
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
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suggestSmartReplies(): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse]): Unit = js.native
  def suggestSmartReplies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse]
  ): Unit = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse]
  ): Unit = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesResponse]
  ): Unit = js.native
  /**
    * Gets smart replies for a participant based on specific historical messages.
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
    *     await dialogflow.projects.conversations.participants.suggestions.suggestSmartReplies(
    *       {
    *         // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *         parent:
    *           'projects/my-project/conversations/my-conversation/participants/my-participant',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "contextSize": 0,
    *           //   "currentTextInput": {},
    *           //   "latestMessage": "my_latestMessage"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contextSize": 0,
    *   //   "latestMessage": "my_latestMessage",
    *   //   "smartReplyAnswers": []
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
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
