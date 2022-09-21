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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Locations$Agent$Intents")
@js.native
open class ResourceProjectsLocationsAgentIntents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchDelete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes intents in the specified agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
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
    *   const res = await dialogflow.projects.locations.agent.intents.batchDelete({
    *     // Required. The name of the agent to delete all entities types for. Format: `projects//agent`.
    *     parent: 'projects/my-project/locations/my-location/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "intents": []
    *       // }
    *     },
    *   });
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
  def batchDelete(params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates/Creates multiple intents in the specified agent. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: BatchUpdateIntentsResponse Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
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
    *   const res = await dialogflow.projects.locations.agent.intents.batchUpdate({
    *     // Required. The name of the agent to update or create intents in. Format: `projects//agent`.
    *     parent: 'projects/my-project/locations/my-location/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "intentBatchInline": {},
    *       //   "intentBatchUri": "my_intentBatchUri",
    *       //   "intentView": "my_intentView",
    *       //   "languageCode": "my_languageCode",
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
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
  def batchUpdate(params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsLocationsAgentIntentsBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentIntentsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentIntentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentIntentsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Intent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentIntentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentIntentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  /**
    * Creates an intent in the specified agent. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
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
    *   const res = await dialogflow.projects.locations.agent.intents.create({
    *     // Optional. The resource view to apply to the returned intent.
    *     intentView: 'placeholder-value',
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Required. The agent to create a intent for. Format: `projects//agent`.
    *     parent: 'projects/my-project/locations/my-location/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "defaultResponsePlatforms": [],
    *       //   "displayName": "my_displayName",
    *       //   "endInteraction": false,
    *       //   "events": [],
    *       //   "followupIntentInfo": [],
    *       //   "inputContextNames": [],
    *       //   "isFallback": false,
    *       //   "liveAgentHandoff": false,
    *       //   "messages": [],
    *       //   "mlDisabled": false,
    *       //   "name": "my_name",
    *       //   "outputContexts": [],
    *       //   "parameters": [],
    *       //   "parentFollowupIntentName": "my_parentFollowupIntentName",
    *       //   "priority": 0,
    *       //   "resetContexts": false,
    *       //   "rootFollowupIntentName": "my_rootFollowupIntentName",
    *       //   "trainingPhrases": [],
    *       //   "webhookState": "my_webhookState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "defaultResponsePlatforms": [],
    *   //   "displayName": "my_displayName",
    *   //   "endInteraction": false,
    *   //   "events": [],
    *   //   "followupIntentInfo": [],
    *   //   "inputContextNames": [],
    *   //   "isFallback": false,
    *   //   "liveAgentHandoff": false,
    *   //   "messages": [],
    *   //   "mlDisabled": false,
    *   //   "name": "my_name",
    *   //   "outputContexts": [],
    *   //   "parameters": [],
    *   //   "parentFollowupIntentName": "my_parentFollowupIntentName",
    *   //   "priority": 0,
    *   //   "resetContexts": false,
    *   //   "rootFollowupIntentName": "my_rootFollowupIntentName",
    *   //   "trainingPhrases": [],
    *   //   "webhookState": "my_webhookState"
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
  def create(params: ParamsResourceProjectsLocationsAgentIntentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentIntentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentIntentsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentIntentsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentIntentsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentIntentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentIntentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified intent and its direct or indirect followup intents. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
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
    *   const res = await dialogflow.projects.locations.agent.intents.delete({
    *     // Required. The name of the intent to delete. If this intent has direct or indirect followup intents, we also delete them. Format: `projects//agent/intents/`.
    *     name: 'projects/my-project/locations/my-location/agent/intents/my-intent',
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
  def delete(params: ParamsResourceProjectsLocationsAgentIntentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentIntentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentIntentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentIntentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentIntentsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Intent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentIntentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentIntentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  /**
    * Retrieves the specified intent.
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
    *   const res = await dialogflow.projects.locations.agent.intents.get({
    *     // Optional. The resource view to apply to the returned intent.
    *     intentView: 'placeholder-value',
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Required. The name of the intent. Format: `projects//agent/intents/`.
    *     name: 'projects/my-project/locations/my-location/agent/intents/my-intent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "defaultResponsePlatforms": [],
    *   //   "displayName": "my_displayName",
    *   //   "endInteraction": false,
    *   //   "events": [],
    *   //   "followupIntentInfo": [],
    *   //   "inputContextNames": [],
    *   //   "isFallback": false,
    *   //   "liveAgentHandoff": false,
    *   //   "messages": [],
    *   //   "mlDisabled": false,
    *   //   "name": "my_name",
    *   //   "outputContexts": [],
    *   //   "parameters": [],
    *   //   "parentFollowupIntentName": "my_parentFollowupIntentName",
    *   //   "priority": 0,
    *   //   "resetContexts": false,
    *   //   "rootFollowupIntentName": "my_rootFollowupIntentName",
    *   //   "trainingPhrases": [],
    *   //   "webhookState": "my_webhookState"
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
  def get(params: ParamsResourceProjectsLocationsAgentIntentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentIntentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListIntentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListIntentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListIntentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentIntentsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListIntentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentIntentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListIntentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentIntentsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListIntentsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListIntentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentIntentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListIntentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentIntentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListIntentsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all intents in the specified agent.
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
    *   const res = await dialogflow.projects.locations.agent.intents.list({
    *     // Optional. The resource view to apply to the returned intent.
    *     intentView: 'placeholder-value',
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all intents from. Format: `projects//agent` or `projects//locations//agent`. Alternatively, you can specify the environment to list intents for. Format: `projects//agent/environments/` or `projects//locations//agent/environments/`. Note: training phrases of the intents will not be returned for non-draft environment.
    *     parent: 'projects/my-project/locations/my-location/agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "intents": [],
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
  def list(params: ParamsResourceProjectsLocationsAgentIntentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentIntentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentIntentsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentIntentsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentIntentsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Intent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentIntentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Intent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentIntentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Intent]
  ): Unit = js.native
  /**
    * Updates the specified intent. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
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
    *   const res = await dialogflow.projects.locations.agent.intents.patch({
    *     // Optional. The resource view to apply to the returned intent.
    *     intentView: 'placeholder-value',
    *     // Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    *     languageCode: 'placeholder-value',
    *     // Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Format: `projects//agent/intents/`.
    *     name: 'projects/my-project/locations/my-location/agent/intents/my-intent',
    *     // Optional. The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "defaultResponsePlatforms": [],
    *       //   "displayName": "my_displayName",
    *       //   "endInteraction": false,
    *       //   "events": [],
    *       //   "followupIntentInfo": [],
    *       //   "inputContextNames": [],
    *       //   "isFallback": false,
    *       //   "liveAgentHandoff": false,
    *       //   "messages": [],
    *       //   "mlDisabled": false,
    *       //   "name": "my_name",
    *       //   "outputContexts": [],
    *       //   "parameters": [],
    *       //   "parentFollowupIntentName": "my_parentFollowupIntentName",
    *       //   "priority": 0,
    *       //   "resetContexts": false,
    *       //   "rootFollowupIntentName": "my_rootFollowupIntentName",
    *       //   "trainingPhrases": [],
    *       //   "webhookState": "my_webhookState"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "defaultResponsePlatforms": [],
    *   //   "displayName": "my_displayName",
    *   //   "endInteraction": false,
    *   //   "events": [],
    *   //   "followupIntentInfo": [],
    *   //   "inputContextNames": [],
    *   //   "isFallback": false,
    *   //   "liveAgentHandoff": false,
    *   //   "messages": [],
    *   //   "mlDisabled": false,
    *   //   "name": "my_name",
    *   //   "outputContexts": [],
    *   //   "parameters": [],
    *   //   "parentFollowupIntentName": "my_parentFollowupIntentName",
    *   //   "priority": 0,
    *   //   "resetContexts": false,
    *   //   "rootFollowupIntentName": "my_rootFollowupIntentName",
    *   //   "trainingPhrases": [],
    *   //   "webhookState": "my_webhookState"
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
  def patch(params: ParamsResourceProjectsLocationsAgentIntentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentIntentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
