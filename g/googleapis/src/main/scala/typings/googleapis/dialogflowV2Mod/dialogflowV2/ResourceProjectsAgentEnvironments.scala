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

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Environments")
@js.native
open class ResourceProjectsAgentEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Environment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  /**
    * Creates an agent environment.
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
    *   const res = await dialogflow.projects.agent.environments.create({
    *     // Required. The unique id of the new environment.
    *     environmentId: 'placeholder-value',
    *     // Required. The agent to create an environment for. Supported formats: - `projects//agent` - `projects//locations//agent`
    *     parent: 'projects/my-project/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentVersion": "my_agentVersion",
    *       //   "description": "my_description",
    *       //   "fulfillment": {},
    *       //   "name": "my_name",
    *       //   "state": "my_state",
    *       //   "textToSpeechSettings": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentVersion": "my_agentVersion",
    *   //   "description": "my_description",
    *   //   "fulfillment": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "textToSpeechSettings": {},
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsAgentEnvironmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified agent environment.
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
    *   const res = await dialogflow.projects.agent.environments.delete({
    *     // Required. The name of the environment to delete. / Format: - `projects//agent/environments/` - `projects//locations//agent/environments/` The environment ID for the default environment is `-`.
    *     name: 'projects/my-project/agent/environments/my-environment',
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
  def delete(params: ParamsResourceProjectsAgentEnvironmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Environment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  /**
    * Retrieves the specified agent environment.
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
    *   const res = await dialogflow.projects.agent.environments.get({
    *     // Required. The name of the environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/` The environment ID for the default environment is `-`.
    *     name: 'projects/my-project/agent/environments/my-environment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentVersion": "my_agentVersion",
    *   //   "description": "my_description",
    *   //   "fulfillment": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "textToSpeechSettings": {},
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsAgentEnvironmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getHistory(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EnvironmentHistory] = js.native
  def getHistory(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EnvironmentHistory]): Unit = js.native
  def getHistory(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EnvironmentHistory] = js.native
  def getHistory(params: ParamsResourceProjectsAgentEnvironmentsGethistory): GaxiosPromise[SchemaGoogleCloudDialogflowV2EnvironmentHistory] = js.native
  def getHistory(
    params: ParamsResourceProjectsAgentEnvironmentsGethistory,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EnvironmentHistory]
  ): Unit = js.native
  def getHistory(
    params: ParamsResourceProjectsAgentEnvironmentsGethistory,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EnvironmentHistory],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2EnvironmentHistory]
  ): Unit = js.native
  def getHistory(params: ParamsResourceProjectsAgentEnvironmentsGethistory, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EnvironmentHistory] = js.native
  def getHistory(
    params: ParamsResourceProjectsAgentEnvironmentsGethistory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EnvironmentHistory]
  ): Unit = js.native
  /**
    * Gets the history of the specified environment.
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
    *   const res = await dialogflow.projects.agent.environments.getHistory({
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the environment to retrieve history for. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/` The environment ID for the default environment is `-`.
    *     parent: 'projects/my-project/agent/environments/my-environment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "parent": "my_parent"
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
  def getHistory(params: ParamsResourceProjectsAgentEnvironmentsGethistory, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getHistory(
    params: ParamsResourceProjectsAgentEnvironmentsGethistory,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var intents: ResourceProjectsAgentEnvironmentsIntents = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEnvironmentsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all non-default environments of the specified agent.
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
    *   const res = await dialogflow.projects.agent.environments.list({
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all environments from. Format: - `projects//agent` - `projects//locations//agent`
    *     parent: 'projects/my-project/agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "environments": [],
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
  def list(params: ParamsResourceProjectsAgentEnvironmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Environment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2Environment] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2Environment]
  ): Unit = js.native
  /**
    * Updates the specified agent environment. This method allows you to deploy new agent versions into the environment. When an environment is pointed to a new agent version by setting `environment.agent_version`, the environment is temporarily set to the `LOADING` state. During that time, the environment continues serving the previous version of the agent. After the new agent version is done loading, the environment is set back to the `RUNNING` state. You can use "-" as Environment ID in environment name to update an agent version in the default environment. WARNING: this will negate all recent changes to the draft agent and can't be undone. You may want to save the draft agent to a version before calling this method.
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
    *   const res = await dialogflow.projects.agent.environments.patch({
    *     // Optional. This field is used to prevent accidental overwrite of the default environment, which is an operation that cannot be undone. To confirm that the caller desires this overwrite, this field must be explicitly set to true when updating the default environment (environment ID = `-`).
    *     allowLoadToDraftAndDiscardChanges: 'placeholder-value',
    *     // Output only. The unique identifier of this agent environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/` The environment ID for the default environment is `-`.
    *     name: 'projects/my-project/agent/environments/my-environment',
    *     // Required. The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentVersion": "my_agentVersion",
    *       //   "description": "my_description",
    *       //   "fulfillment": {},
    *       //   "name": "my_name",
    *       //   "state": "my_state",
    *       //   "textToSpeechSettings": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentVersion": "my_agentVersion",
    *   //   "description": "my_description",
    *   //   "fulfillment": {},
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "textToSpeechSettings": {},
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsAgentEnvironmentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var users: ResourceProjectsAgentEnvironmentsUsers = js.native
}
