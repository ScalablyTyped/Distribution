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

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Environments$Users$Sessions$Entitytypes")
@js.native
open class ResourceProjectsAgentEnvironmentsUsersSessionsEntitytypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  /**
    * Creates a session entity type. If the specified session entity type already exists, overrides the session entity type. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google Assistant integration.
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
    *     await dialogflow.projects.agent.environments.users.sessions.entityTypes.create(
    *       {
    *         // Required. The session to create a session entity type for. Supported formats: - `projects//agent/sessions/, - `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *         parent:
    *           'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session',
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified session entity type. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google Assistant integration.
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
    *     await dialogflow.projects.agent.environments.users.sessions.entityTypes.delete(
    *       {
    *         // Required. The name of the entity type to delete. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` - `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *         name: 'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session/entityTypes/my-entityType',
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  /**
    * Retrieves the specified session entity type. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google Assistant integration.
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
    *     await dialogflow.projects.agent.environments.users.sessions.entityTypes.get(
    *       {
    *         // Required. The name of the session entity type. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` - `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *         name: 'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session/entityTypes/my-entityType',
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  /**
    * Returns the list of all session entity types in the specified session. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google Assistant integration.
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
    *     await dialogflow.projects.agent.environments.users.sessions.entityTypes.list(
    *       {
    *         // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *         pageSize: 'placeholder-value',
    *         // Optional. The next_page_token value returned from a previous list request.
    *         pageToken: 'placeholder-value',
    *         // Required. The session to list all session entity types from. Supported formats: - `projects//agent/sessions/, - `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *         parent:
    *           'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session',
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  /**
    * Updates the specified session entity type. This method doesn't work with Google Assistant integration. Contact Dialogflow support if you need to use session entities with Google Assistant integration.
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
    *     await dialogflow.projects.agent.environments.users.sessions.entityTypes.patch(
    *       {
    *         // Required. The unique identifier of this session entity type. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` - `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. `` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
    *         name: 'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session/entityTypes/my-entityType',
    *         // Optional. The mask to control which fields get updated.
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
