package typings.googleapis.dialogflowV3Mod.dialogflowV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Intents")
@js.native
open class ResourceProjectsLocationsAgentsIntents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsIntentsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsIntentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsIntentsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Intent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsIntentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsIntentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  /**
    * Creates an intent in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.intents.create({
    *     // The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // Required. The agent to create an intent for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "isFallback": false,
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "parameters": [],
    *       //   "priority": 0,
    *       //   "trainingPhrases": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "isFallback": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "priority": 0,
    *   //   "trainingPhrases": []
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
  def create(params: ParamsResourceProjectsLocationsAgentsIntentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsIntentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsIntentsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsIntentsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsIntentsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsIntentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsIntentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified intent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.intents.delete({
    *     // Required. The name of the intent to delete. Format: `projects//locations//agents//intents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/intents/my-intent',
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
  def delete(params: ParamsResourceProjectsLocationsAgentsIntentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsIntentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsIntentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsIntentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsIntentsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Intent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsIntentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsIntentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.intents.get({
    *     // The language to retrieve the intent for. The following fields are language dependent: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // Required. The name of the intent. Format: `projects//locations//agents//intents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/intents/my-intent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "isFallback": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "priority": 0,
    *   //   "trainingPhrases": []
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
  def get(params: ParamsResourceProjectsLocationsAgentsIntentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsIntentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsIntentsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsIntentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsIntentsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListIntentsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListIntentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsIntentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsIntentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListIntentsResponse]
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.intents.list({
    *     // The resource view to apply to the returned intent.
    *     intentView: 'placeholder-value',
    *     // The language to list intents for. The following fields are language dependent: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all intents for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
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
  def list(params: ParamsResourceProjectsLocationsAgentsIntentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsIntentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsIntentsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsIntentsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsIntentsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Intent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsIntentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Intent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsIntentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Intent]
  ): Unit = js.native
  /**
    * Updates the specified intent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.intents.patch({
    *     // The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/intents/my-intent',
    *     // The mask to control which fields get updated. If the mask is not present, all fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "isFallback": false,
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "parameters": [],
    *       //   "priority": 0,
    *       //   "trainingPhrases": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "isFallback": false,
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "priority": 0,
    *   //   "trainingPhrases": []
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
  def patch(params: ParamsResourceProjectsLocationsAgentsIntentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsIntentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
