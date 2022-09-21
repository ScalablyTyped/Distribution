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

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents")
@js.native
open class ResourceProjectsLocationsAgents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var changelogs: ResourceProjectsLocationsAgentsChangelogs = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  /**
    * Creates an agent in the specified location. Note: You should always train flows prior to sending them queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    *   const res = await dialogflow.projects.locations.agents.create({
    *     // Required. The location to create a agent for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advancedSettings": {},
    *       //   "avatarUri": "my_avatarUri",
    *       //   "defaultLanguageCode": "my_defaultLanguageCode",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "enableSpellCorrection": false,
    *       //   "enableStackdriverLogging": false,
    *       //   "locked": false,
    *       //   "name": "my_name",
    *       //   "securitySettings": "my_securitySettings",
    *       //   "speechToTextSettings": {},
    *       //   "startFlow": "my_startFlow",
    *       //   "supportedLanguageCodes": [],
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advancedSettings": {},
    *   //   "avatarUri": "my_avatarUri",
    *   //   "defaultLanguageCode": "my_defaultLanguageCode",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enableSpellCorrection": false,
    *   //   "enableStackdriverLogging": false,
    *   //   "locked": false,
    *   //   "name": "my_name",
    *   //   "securitySettings": "my_securitySettings",
    *   //   "speechToTextSettings": {},
    *   //   "startFlow": "my_startFlow",
    *   //   "supportedLanguageCodes": [],
    *   //   "timeZone": "my_timeZone"
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
  def create(params: ParamsResourceProjectsLocationsAgentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified agent.
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
    *   const res = await dialogflow.projects.locations.agents.delete({
    *     // Required. The name of the agent to delete. Format: `projects//locations//agents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent',
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
  def delete(params: ParamsResourceProjectsLocationsAgentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var entityTypes: ResourceProjectsLocationsAgentsEntitytypes = js.native
  
  var environments: ResourceProjectsLocationsAgentsEnvironments = js.native
  
  def `export`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(params: ParamsResourceProjectsLocationsAgentsExport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsExport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsExport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsLocationsAgentsExport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Exports the specified agent to a binary file. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: ExportAgentResponse
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
    *   const res = await dialogflow.projects.locations.agents.export({
    *     // Required. The name of the agent to export. Format: `projects//locations//agents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentUri": "my_agentUri",
    *       //   "dataFormat": "my_dataFormat",
    *       //   "environment": "my_environment"
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
  def `export`(params: ParamsResourceProjectsLocationsAgentsExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsAgentsExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var flows: ResourceProjectsLocationsAgentsFlows = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  /**
    * Retrieves the specified agent.
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
    *   const res = await dialogflow.projects.locations.agents.get({
    *     // Required. The name of the agent. Format: `projects//locations//agents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advancedSettings": {},
    *   //   "avatarUri": "my_avatarUri",
    *   //   "defaultLanguageCode": "my_defaultLanguageCode",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enableSpellCorrection": false,
    *   //   "enableStackdriverLogging": false,
    *   //   "locked": false,
    *   //   "name": "my_name",
    *   //   "securitySettings": "my_securitySettings",
    *   //   "speechToTextSettings": {},
    *   //   "startFlow": "my_startFlow",
    *   //   "supportedLanguageCodes": [],
    *   //   "timeZone": "my_timeZone"
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
  def get(params: ParamsResourceProjectsLocationsAgentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getValidationResult(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def getValidationResult(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]): Unit = js.native
  def getValidationResult(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def getValidationResult(params: ParamsResourceProjectsLocationsAgentsGetvalidationresult): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsGetvalidationresult,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  ): Unit = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsGetvalidationresult,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3AgentValidationResult],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  ): Unit = js.native
  def getValidationResult(params: ParamsResourceProjectsLocationsAgentsGetvalidationresult, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsGetvalidationresult,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  ): Unit = js.native
  /**
    * Gets the latest agent validation result. Agent validation is performed when ValidateAgent is called.
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
    *   const res = await dialogflow.projects.locations.agents.getValidationResult({
    *     // If not specified, the agent's default language is used.
    *     languageCode: 'placeholder-value',
    *     // Required. The agent name. Format: `projects//locations//agents//validationResult`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/validationResult',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "flowValidationResults": [],
    *   //   "name": "my_name"
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
  def getValidationResult(params: ParamsResourceProjectsLocationsAgentsGetvalidationresult, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getValidationResult(
    params: ParamsResourceProjectsLocationsAgentsGetvalidationresult,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var intents: ResourceProjectsLocationsAgentsIntents = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListAgentsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListAgentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListAgentsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all agents in the specified location.
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
    *   const res = await dialogflow.projects.locations.agents.list({
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The location to list all agents for. Format: `projects//locations/`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agents": [],
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
  def list(params: ParamsResourceProjectsLocationsAgentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Agent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Agent]
  ): Unit = js.native
  /**
    * Updates the specified agent. Note: You should always train flows prior to sending them queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    *   const res = await dialogflow.projects.locations.agents.patch({
    *     // The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent',
    *     // The mask to control which fields get updated. If the mask is not present, all fields will be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advancedSettings": {},
    *       //   "avatarUri": "my_avatarUri",
    *       //   "defaultLanguageCode": "my_defaultLanguageCode",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "enableSpellCorrection": false,
    *       //   "enableStackdriverLogging": false,
    *       //   "locked": false,
    *       //   "name": "my_name",
    *       //   "securitySettings": "my_securitySettings",
    *       //   "speechToTextSettings": {},
    *       //   "startFlow": "my_startFlow",
    *       //   "supportedLanguageCodes": [],
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advancedSettings": {},
    *   //   "avatarUri": "my_avatarUri",
    *   //   "defaultLanguageCode": "my_defaultLanguageCode",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enableSpellCorrection": false,
    *   //   "enableStackdriverLogging": false,
    *   //   "locked": false,
    *   //   "name": "my_name",
    *   //   "securitySettings": "my_securitySettings",
    *   //   "speechToTextSettings": {},
    *   //   "startFlow": "my_startFlow",
    *   //   "supportedLanguageCodes": [],
    *   //   "timeZone": "my_timeZone"
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
  def patch(params: ParamsResourceProjectsLocationsAgentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(params: ParamsResourceProjectsLocationsAgentsRestore): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsAgentsRestore,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsLocationsAgentsRestore,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def restore(params: ParamsResourceProjectsLocationsAgentsRestore, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsAgentsRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Restores the specified agent from a binary file. Replaces the current agent with a new one. Note that all existing resources in agent (e.g. intents, entity types, flows) will be removed. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty) Note: You should always train flows prior to sending them queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    *   const res = await dialogflow.projects.locations.agents.restore({
    *     // Required. The name of the agent to restore into. Format: `projects//locations//agents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentContent": "my_agentContent",
    *       //   "agentUri": "my_agentUri",
    *       //   "restoreOption": "my_restoreOption"
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
  def restore(params: ParamsResourceProjectsLocationsAgentsRestore, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsAgentsRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sessions: ResourceProjectsLocationsAgentsSessions = js.native
  
  var testCases: ResourceProjectsLocationsAgentsTestcases = js.native
  
  def validate(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def validate(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]): Unit = js.native
  def validate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def validate(params: ParamsResourceProjectsLocationsAgentsValidate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsValidate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  ): Unit = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsValidate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3AgentValidationResult],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  ): Unit = js.native
  def validate(params: ParamsResourceProjectsLocationsAgentsValidate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3AgentValidationResult] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3AgentValidationResult]
  ): Unit = js.native
  /**
    * Validates the specified agent and creates or updates validation results. The agent in draft version is validated. Please call this API after the training is completed to get the complete validation results.
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
    *   const res = await dialogflow.projects.locations.agents.validate({
    *     // Required. The agent to validate. Format: `projects//locations//agents/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "languageCode": "my_languageCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "flowValidationResults": [],
    *   //   "name": "my_name"
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
  def validate(params: ParamsResourceProjectsLocationsAgentsValidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validate(
    params: ParamsResourceProjectsLocationsAgentsValidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var webhooks: ResourceProjectsLocationsAgentsWebhooks = js.native
}
