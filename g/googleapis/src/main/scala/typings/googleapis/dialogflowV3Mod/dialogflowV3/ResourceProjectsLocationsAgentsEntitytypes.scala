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

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Entitytypes")
@js.native
open class ResourceProjectsLocationsAgentsEntitytypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3EntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  /**
    * Creates an entity type in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    *   const res = await dialogflow.projects.locations.agents.entityTypes.create({
    *     // The language of the following fields in `entity_type`: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // Required. The agent to create a entity type for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoExpansionMode": "my_autoExpansionMode",
    *       //   "displayName": "my_displayName",
    *       //   "enableFuzzyExtraction": false,
    *       //   "entities": [],
    *       //   "excludedPhrases": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "redact": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpansionMode": "my_autoExpansionMode",
    *   //   "displayName": "my_displayName",
    *   //   "enableFuzzyExtraction": false,
    *   //   "entities": [],
    *   //   "excludedPhrases": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "redact": false
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
  def create(params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    *   const res = await dialogflow.projects.locations.agents.entityTypes.delete({
    *     // This field has no effect for entity type not being used. For entity types that are used by intents or pages: * If `force` is set to false, an error will be returned with message indicating the referencing resources. * If `force` is set to true, Dialogflow will remove the entity type, as well as any references to the entity type (i.e. Page parameter of the entity type will be changed to '@sys.any' and intent parameter of the entity type will be removed).
    *     force: 'placeholder-value',
    *     // Required. The name of the entity type to delete. Format: `projects//locations//agents//entityTypes/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/entityTypes/my-entityType',
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
  def delete(params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEntitytypesGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3EntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEntitytypesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  /**
    * Retrieves the specified entity type.
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
    *   const res = await dialogflow.projects.locations.agents.entityTypes.get({
    *     // The language to retrieve the entity type for. The following fields are language dependent: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // Required. The name of the entity type. Format: `projects//locations//agents//entityTypes/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/entityTypes/my-entityType',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpansionMode": "my_autoExpansionMode",
    *   //   "displayName": "my_displayName",
    *   //   "enableFuzzyExtraction": false,
    *   //   "entities": [],
    *   //   "excludedPhrases": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "redact": false
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
  def get(params: ParamsResourceProjectsLocationsAgentsEntitytypesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEntitytypesList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEntitytypesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListEntityTypesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all entity types in the specified agent.
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
    *   const res = await dialogflow.projects.locations.agents.entityTypes.list({
    *     // The language to list entity types for. The following fields are language dependent: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all entity types for. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entityTypes": [],
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
  def list(params: ParamsResourceProjectsLocationsAgentsEntitytypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3EntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3EntityType] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3EntityType]
  ): Unit = js.native
  /**
    * Updates the specified entity type. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
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
    *   const res = await dialogflow.projects.locations.agents.entityTypes.patch({
    *     // The language of the following fields in `entity_type`: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    *     languageCode: 'placeholder-value',
    *     // The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/entityTypes/my-entityType',
    *     // The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoExpansionMode": "my_autoExpansionMode",
    *       //   "displayName": "my_displayName",
    *       //   "enableFuzzyExtraction": false,
    *       //   "entities": [],
    *       //   "excludedPhrases": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "redact": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpansionMode": "my_autoExpansionMode",
    *   //   "displayName": "my_displayName",
    *   //   "enableFuzzyExtraction": false,
    *   //   "entities": [],
    *   //   "excludedPhrases": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "redact": false
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
  def patch(params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEntitytypesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
