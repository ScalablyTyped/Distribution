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

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Locations$Conversations$Participants$Suggestions")
@js.native
open class ResourceProjectsLocationsConversationsParticipantsSuggestions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def suggestArticles(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]): Unit = js.native
  def suggestArticles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  ): Unit = js.native
  def suggestArticles(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  ): Unit = js.native
  def suggestArticles(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  ): Unit = js.native
  /**
    * Gets suggested articles for a participant based on specific historical messages. Note that ListSuggestions will only list the auto-generated suggestions, while CompileSuggestion will try to compile suggestion based on the provided conversation context in the real time.
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.suggestions.suggestArticles(
    *       {
    *         // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *         parent:
    *           'projects/my-project/locations/my-location/conversations/my-conversation/participants/my-participant',
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
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestarticles,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suggestFaqAnswers(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]): Unit = js.native
  def suggestFaqAnswers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]
  ): Unit = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]
  ): Unit = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.suggestions.suggestFaqAnswers(
    *       {
    *         // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *         parent:
    *           'projects/my-project/locations/my-location/conversations/my-conversation/participants/my-participant',
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
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suggestSmartReplies(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]): Unit = js.native
  def suggestSmartReplies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]
  ): Unit = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]
  ): Unit = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]
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
    *   const res =
    *     await dialogflow.projects.locations.conversations.participants.suggestions.suggestSmartReplies(
    *       {
    *         // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *         parent:
    *           'projects/my-project/locations/my-location/conversations/my-conversation/participants/my-participant',
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
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
