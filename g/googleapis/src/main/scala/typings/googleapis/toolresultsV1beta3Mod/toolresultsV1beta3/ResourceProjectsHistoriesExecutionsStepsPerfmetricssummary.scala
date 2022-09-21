package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfmetricssummary")
@js.native
open class ResourceProjectsHistoriesExecutionsStepsPerfmetricssummary protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def create(callback: BodyResponseCallback[SchemaPerfMetricsSummary]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate,
    callback: BodyResponseCallback[SchemaPerfMetricsSummary]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate,
    options: BodyResponseCallback[Readable | SchemaPerfMetricsSummary],
    callback: BodyResponseCallback[Readable | SchemaPerfMetricsSummary]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaPerfMetricsSummary] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerfMetricsSummary]
  ): Unit = js.native
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created. May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await toolresults.projects.histories.executions.steps.perfMetricsSummary.create(
    *       {
    *         // A tool results execution ID.
    *         executionId: 'placeholder-value',
    *         // A tool results history ID.
    *         historyId: 'placeholder-value',
    *         // The cloud project
    *         projectId: 'placeholder-value',
    *         // A tool results step ID.
    *         stepId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "appStartTime": {},
    *           //   "executionId": "my_executionId",
    *           //   "graphicsStats": {},
    *           //   "historyId": "my_historyId",
    *           //   "perfEnvironment": {},
    *           //   "perfMetrics": [],
    *           //   "projectId": "my_projectId",
    *           //   "stepId": "my_stepId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appStartTime": {},
    *   //   "executionId": "my_executionId",
    *   //   "graphicsStats": {},
    *   //   "historyId": "my_historyId",
    *   //   "perfEnvironment": {},
    *   //   "perfMetrics": [],
    *   //   "projectId": "my_projectId",
    *   //   "stepId": "my_stepId"
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
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
