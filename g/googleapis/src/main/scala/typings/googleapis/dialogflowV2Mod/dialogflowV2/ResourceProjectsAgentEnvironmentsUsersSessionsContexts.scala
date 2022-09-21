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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Environments$Users$Sessions$Contexts")
@js.native
open class ResourceProjectsAgentEnvironmentsUsersSessionsContexts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Context],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  /**
    * Creates a context. If the specified context already exists, overrides the context.
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
    *     await dialogflow.projects.agent.environments.users.sessions.contexts.create(
    *       {
    *         // Required. The session to create a context for. Format: `projects//agent/sessions/` or `projects//agent/environments//users//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *         parent:
    *           'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "lifespanCount": 0,
    *           //   "name": "my_name",
    *           //   "parameters": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "lifespanCount": 0,
    *   //   "name": "my_name",
    *   //   "parameters": {}
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified context.
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
    *     await dialogflow.projects.agent.environments.users.sessions.contexts.delete(
    *       {
    *         // Required. The name of the context to delete. Format: `projects//agent/sessions//contexts/` or `projects//agent/environments//users//sessions//contexts/`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *         name: 'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session/contexts/my-context',
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Context],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  /**
    * Retrieves the specified context.
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
    *     await dialogflow.projects.agent.environments.users.sessions.contexts.get({
    *       // Required. The name of the context. Format: `projects//agent/sessions//contexts/` or `projects//agent/environments//users//sessions//contexts/`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *       name: 'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session/contexts/my-context',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "lifespanCount": 0,
    *   //   "name": "my_name",
    *   //   "parameters": {}
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListContextsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListContextsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListContextsResponse] = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListContextsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListContextsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListContextsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListContextsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListContextsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListContextsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all contexts in the specified session.
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
    *     await dialogflow.projects.agent.environments.users.sessions.contexts.list({
    *       // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. The next_page_token value returned from a previous list request.
    *       pageToken: 'placeholder-value',
    *       // Required. The session to list all contexts from. Format: `projects//agent/sessions/` or `projects//agent/environments//users//sessions/`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *       parent:
    *         'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contexts": [],
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
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Context],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Context] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Context]
  ): Unit = js.native
  /**
    * Updates the specified context.
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
    *     await dialogflow.projects.agent.environments.users.sessions.contexts.patch({
    *       // Required. The unique identifier of the context. Format: `projects//agent/sessions//contexts/`, or `projects//agent/environments//users//sessions//contexts/`. The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
    *       name: 'projects/my-project/agent/environments/my-environment/users/my-user/sessions/my-session/contexts/my-context',
    *       // Optional. The mask to control which fields get updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "lifespanCount": 0,
    *         //   "name": "my_name",
    *         //   "parameters": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "lifespanCount": 0,
    *   //   "name": "my_name",
    *   //   "parameters": {}
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
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
