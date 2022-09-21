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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var agent: ResourceProjectsAgent = js.native
  
  var answerRecords: ResourceProjectsAnswerrecords = js.native
  
  var context: APIRequestContext = js.native
  
  var conversationDatasets: ResourceProjectsConversationdatasets = js.native
  
  var conversationModels: ResourceProjectsConversationmodels = js.native
  
  var conversationProfiles: ResourceProjectsConversationprofiles = js.native
  
  var conversations: ResourceProjectsConversations = js.native
  
  def deleteAgent(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def deleteAgent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(params: ParamsResourceProjectsDeleteagent): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(
    params: ParamsResourceProjectsDeleteagent,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteAgent(
    params: ParamsResourceProjectsDeleteagent,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteAgent(params: ParamsResourceProjectsDeleteagent, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(
    params: ParamsResourceProjectsDeleteagent,
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
    *   const res = await dialogflow.projects.deleteAgent({
    *     // Required. The project that the agent to delete is associated with. Format: `projects/`.
    *     parent: 'projects/my-project',
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
  def deleteAgent(params: ParamsResourceProjectsDeleteagent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteAgent(
    params: ParamsResourceProjectsDeleteagent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAgent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]): Unit = js.native
  def getAgent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(params: ParamsResourceProjectsGetagent): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(params: ParamsResourceProjectsGetagent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
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
    *   const res = await dialogflow.projects.getAgent({
    *     // Required. The project that the agent to fetch is associated with. Format: `projects/`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "avatarUri": "my_avatarUri",
    *   //   "classificationThreshold": {},
    *   //   "defaultLanguageCode": "my_defaultLanguageCode",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enableLogging": false,
    *   //   "matchMode": "my_matchMode",
    *   //   "parent": "my_parent",
    *   //   "supportedLanguageCodes": [],
    *   //   "tier": "my_tier",
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
  def getAgent(params: ParamsResourceProjectsGetagent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAgent(
    params: ParamsResourceProjectsGetagent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var knowledgeBases: ResourceProjectsKnowledgebases = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var operations: ResourceProjectsOperations = js.native
  
  def setAgent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]): Unit = js.native
  def setAgent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(params: ParamsResourceProjectsSetagent): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(
    params: ParamsResourceProjectsSetagent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def setAgent(
    params: ParamsResourceProjectsSetagent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def setAgent(params: ParamsResourceProjectsSetagent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(
    params: ParamsResourceProjectsSetagent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  /**
    * Creates/updates the specified agent. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
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
    *   const res = await dialogflow.projects.setAgent({
    *     // Required. The project of this agent. Format: `projects/`.
    *     parent: 'projects/my-project',
    *     // Optional. The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiVersion": "my_apiVersion",
    *       //   "avatarUri": "my_avatarUri",
    *       //   "classificationThreshold": {},
    *       //   "defaultLanguageCode": "my_defaultLanguageCode",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "enableLogging": false,
    *       //   "matchMode": "my_matchMode",
    *       //   "parent": "my_parent",
    *       //   "supportedLanguageCodes": [],
    *       //   "tier": "my_tier",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "avatarUri": "my_avatarUri",
    *   //   "classificationThreshold": {},
    *   //   "defaultLanguageCode": "my_defaultLanguageCode",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "enableLogging": false,
    *   //   "matchMode": "my_matchMode",
    *   //   "parent": "my_parent",
    *   //   "supportedLanguageCodes": [],
    *   //   "tier": "my_tier",
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
  def setAgent(params: ParamsResourceProjectsSetagent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAgent(
    params: ParamsResourceProjectsSetagent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
