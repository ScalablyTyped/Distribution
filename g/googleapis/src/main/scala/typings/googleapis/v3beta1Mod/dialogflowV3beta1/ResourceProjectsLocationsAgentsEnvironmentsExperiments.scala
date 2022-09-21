package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Environments$Experiments")
@js.native
open class ResourceProjectsLocationsAgentsEnvironmentsExperiments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  /**
    * Creates an Experiment in the specified Environment.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.create({
    *       // Required. The Agent to create an Environment for. Format: `projects//locations//agents//environments/`.
    *       parent:
    *         'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "definition": {},
    *         //   "description": "my_description",
    *         //   "displayName": "my_displayName",
    *         //   "endTime": "my_endTime",
    *         //   "experimentLength": "my_experimentLength",
    *         //   "lastUpdateTime": "my_lastUpdateTime",
    *         //   "name": "my_name",
    *         //   "result": {},
    *         //   "rolloutConfig": {},
    *         //   "rolloutFailureReason": "my_rolloutFailureReason",
    *         //   "rolloutState": {},
    *         //   "startTime": "my_startTime",
    *         //   "state": "my_state",
    *         //   "variantsHistory": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "definition": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endTime": "my_endTime",
    *   //   "experimentLength": "my_experimentLength",
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "result": {},
    *   //   "rolloutConfig": {},
    *   //   "rolloutFailureReason": "my_rolloutFailureReason",
    *   //   "rolloutState": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "variantsHistory": []
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified Experiment.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.delete({
    *       // Required. The name of the Environment to delete. Format: `projects//locations//agents//environments//experiments/`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/experiments/my-experiment',
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
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  /**
    * Retrieves the specified Experiment.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.get({
    *       // Required. The name of the Environment. Format: `projects//locations//agents//environments//experiments/`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/experiments/my-experiment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "definition": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endTime": "my_endTime",
    *   //   "experimentLength": "my_experimentLength",
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "result": {},
    *   //   "rolloutConfig": {},
    *   //   "rolloutFailureReason": "my_rolloutFailureReason",
    *   //   "rolloutState": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "variantsHistory": []
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all experiments in the specified Environment.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.list({
    *       // The maximum number of items to return in a single page. By default 20 and at most 100.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request.
    *       pageToken: 'placeholder-value',
    *       // Required. The Environment to list all environments for. Format: `projects//locations//agents//environments/`.
    *       parent:
    *         'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "experiments": [],
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  /**
    * Updates the specified Experiment.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.patch({
    *       // The name of the experiment. Format: projects//locations//agents//environments//experiments/..
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/experiments/my-experiment',
    *       // Required. The mask to control which fields get updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "definition": {},
    *         //   "description": "my_description",
    *         //   "displayName": "my_displayName",
    *         //   "endTime": "my_endTime",
    *         //   "experimentLength": "my_experimentLength",
    *         //   "lastUpdateTime": "my_lastUpdateTime",
    *         //   "name": "my_name",
    *         //   "result": {},
    *         //   "rolloutConfig": {},
    *         //   "rolloutFailureReason": "my_rolloutFailureReason",
    *         //   "rolloutState": {},
    *         //   "startTime": "my_startTime",
    *         //   "state": "my_state",
    *         //   "variantsHistory": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "definition": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endTime": "my_endTime",
    *   //   "experimentLength": "my_experimentLength",
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "result": {},
    *   //   "rolloutConfig": {},
    *   //   "rolloutFailureReason": "my_rolloutFailureReason",
    *   //   "rolloutState": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "variantsHistory": []
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def start(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def start(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def start(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def start(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def start(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  /**
    * Starts the specified Experiment. This rpc only changes the state of experiment from PENDING to RUNNING.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.start({
    *       // Required. Resource name of the experiment to start. Format: `projects//locations//agents//environments//experiments/`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/experiments/my-experiment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "definition": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endTime": "my_endTime",
    *   //   "experimentLength": "my_experimentLength",
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "result": {},
    *   //   "rolloutConfig": {},
    *   //   "rolloutFailureReason": "my_rolloutFailureReason",
    *   //   "rolloutState": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "variantsHistory": []
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
  def start(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def stop(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def stop(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Experiment] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Experiment]
  ): Unit = js.native
  /**
    * Stops the specified Experiment. This rpc only changes the state of experiment from RUNNING to DONE.
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
    * const dialogflow = google.dialogflow('v3beta1');
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
    *     await dialogflow.projects.locations.agents.environments.experiments.stop({
    *       // Required. Resource name of the experiment to stop. Format: `projects//locations//agents//environments//experiments/`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/experiments/my-experiment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "definition": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "endTime": "my_endTime",
    *   //   "experimentLength": "my_experimentLength",
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "name": "my_name",
    *   //   "result": {},
    *   //   "rolloutConfig": {},
    *   //   "rolloutFailureReason": "my_rolloutFailureReason",
    *   //   "rolloutState": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "variantsHistory": []
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
  def stop(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
