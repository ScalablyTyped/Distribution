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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Conversationprofiles")
@js.native
open class ResourceProjectsConversationprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def clearSuggestionFeatureConfig(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def clearSuggestionFeatureConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Clears a suggestion feature from a conversation profile for the given participant role. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: ClearSuggestionFeatureConfigOperationMetadata - `response`: ConversationProfile
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
    *     await dialogflow.projects.conversationProfiles.clearSuggestionFeatureConfig(
    *       {
    *         // Required. The Conversation Profile to add or update the suggestion feature config. Format: `projects//locations//conversationProfiles/`.
    *         conversationProfile:
    *           'projects/my-project/conversationProfiles/my-conversationProfile',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "participantRole": "my_participantRole",
    *           //   "suggestionFeatureType": "my_suggestionFeatureType"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesClearsuggestionfeatureconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def create(params: ParamsResourceProjectsConversationprofilesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def create(
    params: ParamsResourceProjectsConversationprofilesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsConversationprofilesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationProfile],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsConversationprofilesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def create(
    params: ParamsResourceProjectsConversationprofilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  /**
    * Creates a conversation profile in the specified project. ConversationProfile.CreateTime and ConversationProfile.UpdateTime aren't populated in the response. You can retrieve them via GetConversationProfile API.
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
    *   const res = await dialogflow.projects.conversationProfiles.create({
    *     // Required. The project to create a conversation profile for. Format: `projects//locations/`.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "automatedAgentConfig": {},
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "humanAgentAssistantConfig": {},
    *       //   "humanAgentHandoffConfig": {},
    *       //   "languageCode": "my_languageCode",
    *       //   "loggingConfig": {},
    *       //   "name": "my_name",
    *       //   "newMessageEventNotificationConfig": {},
    *       //   "notificationConfig": {},
    *       //   "securitySettings": "my_securitySettings",
    *       //   "sttConfig": {},
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "automatedAgentConfig": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "humanAgentAssistantConfig": {},
    *   //   "humanAgentHandoffConfig": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "loggingConfig": {},
    *   //   "name": "my_name",
    *   //   "newMessageEventNotificationConfig": {},
    *   //   "notificationConfig": {},
    *   //   "securitySettings": "my_securitySettings",
    *   //   "sttConfig": {},
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsConversationprofilesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsConversationprofilesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsConversationprofilesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsConversationprofilesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsConversationprofilesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsConversationprofilesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsConversationprofilesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified conversation profile.
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
    *   const res = await dialogflow.projects.conversationProfiles.delete({
    *     // Required. The name of the conversation profile to delete. Format: `projects//locations//conversationProfiles/`.
    *     name: 'projects/my-project/conversationProfiles/my-conversationProfile',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsConversationprofilesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsConversationprofilesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def get(params: ParamsResourceProjectsConversationprofilesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def get(
    params: ParamsResourceProjectsConversationprofilesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsConversationprofilesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationProfile],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsConversationprofilesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def get(
    params: ParamsResourceProjectsConversationprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  /**
    * Retrieves the specified conversation profile.
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
    *   const res = await dialogflow.projects.conversationProfiles.get({
    *     // Required. The resource name of the conversation profile. Format: `projects//locations//conversationProfiles/`.
    *     name: 'projects/my-project/conversationProfiles/my-conversationProfile',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "automatedAgentConfig": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "humanAgentAssistantConfig": {},
    *   //   "humanAgentHandoffConfig": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "loggingConfig": {},
    *   //   "name": "my_name",
    *   //   "newMessageEventNotificationConfig": {},
    *   //   "notificationConfig": {},
    *   //   "securitySettings": "my_securitySettings",
    *   //   "sttConfig": {},
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsConversationprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsConversationprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse] = js.native
  def list(params: ParamsResourceProjectsConversationprofilesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationprofilesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConversationprofilesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConversationprofilesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsConversationprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListConversationProfilesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all conversation profiles in the specified project.
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
    *   const res = await dialogflow.projects.conversationProfiles.list({
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project to list all conversation profiles from. Format: `projects//locations/`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conversationProfiles": [],
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
  def list(params: ParamsResourceProjectsConversationprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsConversationprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def patch(params: ParamsResourceProjectsConversationprofilesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def patch(
    params: ParamsResourceProjectsConversationprofilesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsConversationprofilesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationProfile],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsConversationprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ConversationProfile] = js.native
  def patch(
    params: ParamsResourceProjectsConversationprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ConversationProfile]
  ): Unit = js.native
  /**
    * Updates the specified conversation profile. ConversationProfile.CreateTime and ConversationProfile.UpdateTime aren't populated in the response. You can retrieve them via GetConversationProfile API.
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
    *   const res = await dialogflow.projects.conversationProfiles.patch({
    *     // The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
    *     name: 'projects/my-project/conversationProfiles/my-conversationProfile',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "automatedAgentConfig": {},
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "humanAgentAssistantConfig": {},
    *       //   "humanAgentHandoffConfig": {},
    *       //   "languageCode": "my_languageCode",
    *       //   "loggingConfig": {},
    *       //   "name": "my_name",
    *       //   "newMessageEventNotificationConfig": {},
    *       //   "notificationConfig": {},
    *       //   "securitySettings": "my_securitySettings",
    *       //   "sttConfig": {},
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "automatedAgentConfig": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "humanAgentAssistantConfig": {},
    *   //   "humanAgentHandoffConfig": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "loggingConfig": {},
    *   //   "name": "my_name",
    *   //   "newMessageEventNotificationConfig": {},
    *   //   "notificationConfig": {},
    *   //   "securitySettings": "my_securitySettings",
    *   //   "sttConfig": {},
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsConversationprofilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsConversationprofilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setSuggestionFeatureConfig(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def setSuggestionFeatureConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Adds or updates a suggestion feature in a conversation profile. If the conversation profile contains the type of suggestion feature for the participant role, it will update it. Otherwise it will insert the suggestion feature. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: SetSuggestionFeatureConfigOperationMetadata - `response`: ConversationProfile If a long running operation to add or update suggestion feature config for the same conversation profile, participant role and suggestion feature type exists, please cancel the existing long running operation before sending such request, otherwise the request will be rejected.
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
    *     await dialogflow.projects.conversationProfiles.setSuggestionFeatureConfig({
    *       // Required. The Conversation Profile to add or update the suggestion feature config. Format: `projects//locations//conversationProfiles/`.
    *       conversationProfile:
    *         'projects/my-project/conversationProfiles/my-conversationProfile',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "participantRole": "my_participantRole",
    *         //   "suggestionFeatureConfig": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsConversationprofilesSetsuggestionfeatureconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
