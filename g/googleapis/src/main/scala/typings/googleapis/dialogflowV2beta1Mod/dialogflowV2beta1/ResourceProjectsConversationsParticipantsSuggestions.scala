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

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Conversations$Participants$Suggestions")
@js.native
open class ResourceProjectsConversationsParticipantsSuggestions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def compile(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse] = js.native
  def compile(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse]): Unit = js.native
  def compile(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse] = js.native
  def compile(params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse] = js.native
  def compile(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse]
  ): Unit = js.native
  def compile(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse]
  ): Unit = js.native
  def compile(params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse] = js.native
  def compile(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1CompileSuggestionResponse]
  ): Unit = js.native
  /**
    * Deprecated. use SuggestArticles and SuggestFaqAnswers instead. Gets suggestions for a participant based on specific historical messages. Note that ListSuggestions will only list the auto-generated suggestions, while CompileSuggestion will try to compile suggestion based on the provided conversation context in the real time.
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
    *     await dialogflow.projects.conversations.participants.suggestions.compile({
    *       // Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    *       parent:
    *         'projects/my-project/conversations/my-conversation/participants/my-participant',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "contextSize": 0,
    *         //   "latestMessage": "my_latestMessage"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contextSize": 0,
    *   //   "latestMessage": "my_latestMessage",
    *   //   "suggestion": {}
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
  def compile(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def compile(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsCompile,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse] = js.native
  def list(params: ParamsResourceProjectsConversationsParticipantsSuggestionsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConversationsParticipantsSuggestionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse]
  ): Unit = js.native
  /**
    * Deprecated: Use inline suggestion, event based suggestion or Suggestion* API instead. See HumanAgentAssistantConfig.name for more details. Removal Date: 2020-09-01. Retrieves suggestions for live agents. This method should be used by human agent client software to fetch auto generated suggestions in real-time, while the conversation with an end user is in progress. The functionality is implemented in terms of the [list pagination](https://cloud.google.com/apis/design/design_patterns#list_pagination) design pattern. The client app should use the `next_page_token` field to fetch the next batch of suggestions. `suggestions` are sorted by `create_time` in descending order. To fetch latest suggestion, just set `page_size` to 1. To fetch new suggestions without duplication, send request with filter `create_time_epoch_microseconds \> [first item's create_time of previous request]` and empty page_token.
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
    *     await dialogflow.projects.conversations.participants.suggestions.list({
    *       // Optional. Filter on suggestions fields. Currently predicates on `create_time` and `create_time_epoch_microseconds` are supported. `create_time` only support milliseconds accuracy. E.g., `create_time_epoch_microseconds \> 1551790877964485` or `create_time \> "2017-01-15T01:30:15.01Z"` For more information about filtering, see [API Filtering](https://aip.dev/160).
    *       filter: 'placeholder-value',
    *       // Optional. The maximum number of items to return in a single page. The default value is 100; the maximum value is 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. The next_page_token value returned from a previous list request.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the participant to fetch suggestions for. Format: `projects//locations//conversations//participants/`.
    *       parent:
    *         'projects/my-project/conversations/my-conversation/participants/my-participant',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "suggestions": []
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
  def list(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suggestArticles(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]): Unit = js.native
  def suggestArticles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  ): Unit = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse]
  ): Unit = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.native
  def suggestArticles(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestarticles,
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
  
  def suggestFaqAnswers(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]): Unit = js.native
  def suggestFaqAnswers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]
  ): Unit = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse]
  ): Unit = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.native
  def suggestFaqAnswers(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestfaqanswers,
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
  
  def suggestSmartReplies(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]): Unit = js.native
  def suggestSmartReplies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]
  ): Unit = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse]
  ): Unit = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.native
  def suggestSmartReplies(
    params: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies,
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
