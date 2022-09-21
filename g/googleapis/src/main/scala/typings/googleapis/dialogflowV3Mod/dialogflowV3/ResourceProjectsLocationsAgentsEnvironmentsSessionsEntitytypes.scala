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

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Environments$Sessions$Entitytypes")
@js.native
open class ResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SessionEntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  /**
    * Creates a session entity type.
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
    *   const res =
    *     await dialogflow.projects.locations.agents.environments.sessions.entityTypes.create(
    *       {
    *         // Required. The session to create a session entity type for. Format: `projects//locations//agents//sessions/` or `projects//locations//agents//environments//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    *         parent:
    *           'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "entities": [],
    *           //   "entityOverrideMode": "my_entityOverrideMode",
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
    *   //   "entityOverrideMode": "my_entityOverrideMode",
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
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified session entity type.
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
    *   const res =
    *     await dialogflow.projects.locations.agents.environments.sessions.entityTypes.delete(
    *       {
    *         // Required. The name of the session entity type to delete. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    *         name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session/entityTypes/my-entityType',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SessionEntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  /**
    * Retrieves the specified session entity type.
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
    *   const res =
    *     await dialogflow.projects.locations.agents.environments.sessions.entityTypes.get(
    *       {
    *         // Required. The name of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    *         name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session/entityTypes/my-entityType',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
    *   //   "entityOverrideMode": "my_entityOverrideMode",
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
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListSessionEntityTypesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all session entity types in the specified session.
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
    *   const res =
    *     await dialogflow.projects.locations.agents.environments.sessions.entityTypes.list(
    *       {
    *         // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *         pageSize: 'placeholder-value',
    *         // The next_page_token value returned from a previous list request.
    *         pageToken: 'placeholder-value',
    *         // Required. The session to list all session entity types from. Format: `projects//locations//agents//sessions/` or `projects//locations//agents//environments//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    *         parent:
    *           'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sessionEntityTypes": []
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SessionEntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3SessionEntityType] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  ): Unit = js.native
  /**
    * Updates the specified session entity type.
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
    *   const res =
    *     await dialogflow.projects.locations.agents.environments.sessions.entityTypes.patch(
    *       {
    *         // Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    *         name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/sessions/my-session/entityTypes/my-entityType',
    *         // The mask to control which fields get updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "entities": [],
    *           //   "entityOverrideMode": "my_entityOverrideMode",
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
    *   //   "entityOverrideMode": "my_entityOverrideMode",
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
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsSessionsEntitytypesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
