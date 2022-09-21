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

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Locations$Conversationprofiles")
@js.native
open class ResourceProjectsLocationsConversationprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def clearSuggestionFeatureConfig(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def clearSuggestionFeatureConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig,
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
    *     await dialogflow.projects.locations.conversationProfiles.clearSuggestionFeatureConfig(
    *       {
    *         // Required. The Conversation Profile to add or update the suggestion feature config. Format: `projects//locations//conversationProfiles/`.
    *         conversationProfile:
    *           'projects/my-project/locations/my-location/conversationProfiles/my-conversationProfile',
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
    params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def clearSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesClearsuggestionfeatureconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def create(params: ParamsResourceProjectsLocationsConversationprofilesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationprofilesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationprofilesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ConversationProfile],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsConversationprofilesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationprofilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
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
    *   const res = await dialogflow.projects.locations.conversationProfiles.create({
    *     // Required. The project to create a conversation profile for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def create(params: ParamsResourceProjectsLocationsConversationprofilesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConversationprofilesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsConversationprofilesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationprofilesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationprofilesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsConversationprofilesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationprofilesDelete,
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
    *   const res = await dialogflow.projects.locations.conversationProfiles.delete({
    *     // Required. The name of the conversation profile to delete. Format: `projects//locations//conversationProfiles/`.
    *     name: 'projects/my-project/locations/my-location/conversationProfiles/my-conversationProfile',
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
  def delete(params: ParamsResourceProjectsLocationsConversationprofilesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConversationprofilesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def get(params: ParamsResourceProjectsLocationsConversationprofilesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationprofilesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationprofilesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ConversationProfile],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConversationprofilesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
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
    *   const res = await dialogflow.projects.locations.conversationProfiles.get({
    *     // Required. The resource name of the conversation profile. Format: `projects//locations//conversationProfiles/`.
    *     name: 'projects/my-project/locations/my-location/conversationProfiles/my-conversationProfile',
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
  def get(params: ParamsResourceProjectsLocationsConversationprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConversationprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConversationprofilesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationprofilesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationprofilesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConversationprofilesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListConversationProfilesResponse]
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
    *   const res = await dialogflow.projects.locations.conversationProfiles.list({
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The project to list all conversation profiles from. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def list(params: ParamsResourceProjectsLocationsConversationprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConversationprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def patch(params: ParamsResourceProjectsLocationsConversationprofilesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationprofilesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationprofilesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ConversationProfile],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsConversationprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ConversationProfile] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ConversationProfile]
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
    *   const res = await dialogflow.projects.locations.conversationProfiles.patch({
    *     // The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
    *     name: 'projects/my-project/locations/my-location/conversationProfiles/my-conversationProfile',
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
  def patch(params: ParamsResourceProjectsLocationsConversationprofilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConversationprofilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setSuggestionFeatureConfig(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def setSuggestionFeatureConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig,
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
    *     await dialogflow.projects.locations.conversationProfiles.setSuggestionFeatureConfig(
    *       {
    *         // Required. The Conversation Profile to add or update the suggestion feature config. Format: `projects//locations//conversationProfiles/`.
    *         conversationProfile:
    *           'projects/my-project/locations/my-location/conversationProfiles/my-conversationProfile',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "participantRole": "my_participantRole",
    *           //   "suggestionFeatureConfig": {}
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
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setSuggestionFeatureConfig(
    params: ParamsResourceProjectsLocationsConversationprofilesSetsuggestionfeatureconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
