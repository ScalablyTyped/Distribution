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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var agent: ResourceProjectsLocationsAgent = js.native
  
  var answerRecords: ResourceProjectsLocationsAnswerrecords = js.native
  
  var context: APIRequestContext = js.native
  
  var conversationDatasets: ResourceProjectsLocationsConversationdatasets = js.native
  
  var conversationModels: ResourceProjectsLocationsConversationmodels = js.native
  
  var conversationProfiles: ResourceProjectsLocationsConversationprofiles = js.native
  
  var conversations: ResourceProjectsLocationsConversations = js.native
  
  def deleteAgent(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def deleteAgent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(params: ParamsResourceProjectsLocationsDeleteagent): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(
    params: ParamsResourceProjectsLocationsDeleteagent,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteAgent(
    params: ParamsResourceProjectsLocationsDeleteagent,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def deleteAgent(params: ParamsResourceProjectsLocationsDeleteagent, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def deleteAgent(
    params: ParamsResourceProjectsLocationsDeleteagent,
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
    *   const res = await dialogflow.projects.locations.deleteAgent({
    *     // Required. The project that the agent to delete is associated with. Format: `projects/`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def deleteAgent(params: ParamsResourceProjectsLocationsDeleteagent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteAgent(
    params: ParamsResourceProjectsLocationsDeleteagent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudLocationLocation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationLocation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudLocationLocation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudLocationLocation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationLocation]
  ): Unit = js.native
  /**
    * Gets information about a location.
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
    *   const res = await dialogflow.projects.locations.get({
    *     // Resource name for the location.
    *     name: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "labels": {},
    *   //   "locationId": "my_locationId",
    *   //   "metadata": {},
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
  def get(params: ParamsResourceProjectsLocationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAgent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]): Unit = js.native
  def getAgent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(params: ParamsResourceProjectsLocationsGetagent): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsLocationsGetagent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(
    params: ParamsResourceProjectsLocationsGetagent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(params: ParamsResourceProjectsLocationsGetagent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsResourceProjectsLocationsGetagent,
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
    *   const res = await dialogflow.projects.locations.getAgent({
    *     // Required. The project that the agent to fetch is associated with. Format: `projects/`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def getAgent(params: ParamsResourceProjectsLocationsGetagent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAgent(
    params: ParamsResourceProjectsLocationsGetagent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var knowledgeBases: ResourceProjectsLocationsKnowledgebases = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudLocationListLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsList): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudLocationListLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudLocationListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationListLocationsResponse]
  ): Unit = js.native
  /**
    * Lists information about the supported locations for this service.
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
    *   const res = await dialogflow.projects.locations.list({
    *     // A filter to narrow down results to a preferred subset. The filtering language accepts strings like `"displayName=tokyo"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The resource that owns the locations collection, if applicable.
    *     name: 'projects/my-project',
    *     // The maximum number of results to return. If not set, the service selects a default.
    *     pageSize: 'placeholder-value',
    *     // A page token received from the `next_page_token` field in the response. Send that page token to receive the subsequent page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locations": [],
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
  def list(params: ParamsResourceProjectsLocationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  def setAgent(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]): Unit = js.native
  def setAgent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(params: ParamsResourceProjectsLocationsSetagent): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(
    params: ParamsResourceProjectsLocationsSetagent,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def setAgent(
    params: ParamsResourceProjectsLocationsSetagent,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def setAgent(params: ParamsResourceProjectsLocationsSetagent, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Agent] = js.native
  def setAgent(
    params: ParamsResourceProjectsLocationsSetagent,
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
    *   const res = await dialogflow.projects.locations.setAgent({
    *     // Required. The project of this agent. Format: `projects/`.
    *     parent: 'projects/my-project/locations/my-location',
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
  def setAgent(params: ParamsResourceProjectsLocationsSetagent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAgent(
    params: ParamsResourceProjectsLocationsSetagent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
