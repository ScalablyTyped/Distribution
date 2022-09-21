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

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Locations$Agent$Sessions$Contexts")
@js.native
open class ResourceProjectsLocationsAgentSessionsContexts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Context],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
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
    *     await dialogflow.projects.locations.agent.sessions.contexts.create({
    *       // Required. The session to create a context for. Supported formats: - `projects//agent/sessions/, - `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *       parent:
    *         'projects/my-project/locations/my-location/agent/sessions/my-session',
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
  def create(params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete,
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
    *     await dialogflow.projects.locations.agent.sessions.contexts.delete({
    *       // Required. The name of the context to delete. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, - `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *       name: 'projects/my-project/locations/my-location/agent/sessions/my-session/contexts/my-context',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentSessionsContextsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Context],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentSessionsContextsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
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
    *   const res = await dialogflow.projects.locations.agent.sessions.contexts.get({
    *     // Required. The name of the context. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, - `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *     name: 'projects/my-project/locations/my-location/agent/sessions/my-session/contexts/my-context',
    *   });
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
  def get(params: ParamsResourceProjectsLocationsAgentSessionsContextsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentSessionsContextsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListContextsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentSessionsContextsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]
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
    *   const res = await dialogflow.projects.locations.agent.sessions.contexts.list({
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The session to list all contexts from. Supported formats: - `projects//agent/sessions/, - `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    *     parent:
    *       'projects/my-project/locations/my-location/agent/sessions/my-session',
    *   });
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
  def list(params: ParamsResourceProjectsLocationsAgentSessionsContextsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Context],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
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
    *   const res = await dialogflow.projects.locations.agent.sessions.contexts.patch(
    *     {
    *       // Required. The unique identifier of the context. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, - `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
    *       name: 'projects/my-project/locations/my-location/agent/sessions/my-session/contexts/my-context',
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
    *     }
    *   );
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
  def patch(params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentSessionsContextsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
