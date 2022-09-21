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

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Environments$Continuoustestresults")
@js.native
open class ResourceProjectsLocationsAgentsEnvironmentsContinuoustestresults protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse]
  ): Unit = js.native
  /**
    * Fetches a list of continuous test results for a given environment.
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
    *     await dialogflow.projects.locations.agents.environments.continuousTestResults.list(
    *       {
    *         // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *         pageSize: 'placeholder-value',
    *         // The next_page_token value returned from a previous list request.
    *         pageToken: 'placeholder-value',
    *         // Required. The environment to list results for. Format: `projects//locations//agents// environments/`.
    *         parent:
    *           'projects/my-project/locations/my-location/agents/my-agent/environments/my-environment',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "continuousTestResults": [],
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
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsEnvironmentsContinuoustestresultsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
