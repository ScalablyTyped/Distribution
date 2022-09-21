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

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Environments$Deployments")
@js.native
open class ResourceProjectsLocationsAgentsEnvironmentsDeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Deployment] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Deployment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Deployment] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Deployment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Deployment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Deployment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Deployment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Deployment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Deployment]
  ): Unit = js.native
  /**
    * Retrieves the specified Deployment.
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
    *     await dialogflow.projects.locations.agents.environments.deployments.get({
    *       // Required. The name of the Deployment. Format: `projects//locations//agents//environments//deployments/`.
    *       name: 'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment/deployments/my-deployment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "endTime": "my_endTime",
    *   //   "flowVersion": "my_flowVersion",
    *   //   "name": "my_name",
    *   //   "result": {},
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state"
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListDeploymentsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all deployments in the specified Environment.
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
    *     await dialogflow.projects.locations.agents.environments.deployments.list({
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
    *   //   "deployments": [],
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
