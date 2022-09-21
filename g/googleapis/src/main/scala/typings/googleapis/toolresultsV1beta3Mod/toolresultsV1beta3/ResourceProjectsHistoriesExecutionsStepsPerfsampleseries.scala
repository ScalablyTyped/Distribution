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

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries")
@js.native
open class ResourceProjectsHistoriesExecutionsStepsPerfsampleseries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(callback: BodyResponseCallback[SchemaPerfSampleSeries]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    options: BodyResponseCallback[Readable | SchemaPerfSampleSeries],
    callback: BodyResponseCallback[Readable | SchemaPerfSampleSeries]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  /**
    * Creates a PerfSampleSeries. May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step does not exist
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
    *     await toolresults.projects.histories.executions.steps.perfSampleSeries.create(
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
    *           //   "basicPerfSampleSeries": {},
    *           //   "executionId": "my_executionId",
    *           //   "historyId": "my_historyId",
    *           //   "projectId": "my_projectId",
    *           //   "sampleSeriesId": "my_sampleSeriesId",
    *           //   "stepId": "my_stepId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basicPerfSampleSeries": {},
    *   //   "executionId": "my_executionId",
    *   //   "historyId": "my_historyId",
    *   //   "projectId": "my_projectId",
    *   //   "sampleSeriesId": "my_sampleSeriesId",
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
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(callback: BodyResponseCallback[SchemaPerfSampleSeries]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    options: BodyResponseCallback[Readable | SchemaPerfSampleSeries],
    callback: BodyResponseCallback[Readable | SchemaPerfSampleSeries]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet, options: MethodOptions): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  /**
    * Gets a PerfSampleSeries. May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
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
    *     await toolresults.projects.histories.executions.steps.perfSampleSeries.get({
    *       // A tool results execution ID.
    *       executionId: 'placeholder-value',
    *       // A tool results history ID.
    *       historyId: 'placeholder-value',
    *       // The cloud project
    *       projectId: 'placeholder-value',
    *       // A sample series id
    *       sampleSeriesId: 'placeholder-value',
    *       // A tool results step ID.
    *       stepId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basicPerfSampleSeries": {},
    *   //   "executionId": "my_executionId",
    *   //   "historyId": "my_historyId",
    *   //   "projectId": "my_projectId",
    *   //   "sampleSeriesId": "my_sampleSeriesId",
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
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    options: BodyResponseCallback[Readable | SchemaListPerfSampleSeriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPerfSampleSeriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList, options: MethodOptions): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]
  ): Unit = js.native
  /**
    * Lists PerfSampleSeries for a given Step. The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting PerfSampleSeries are sorted by ids. May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
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
    *     await toolresults.projects.histories.executions.steps.perfSampleSeries.list(
    *       {
    *         // A tool results execution ID.
    *         executionId: 'placeholder-value',
    *         // Specify one or more PerfMetricType values such as CPU to filter the result
    *         filter: 'placeholder-value',
    *         // A tool results history ID.
    *         historyId: 'placeholder-value',
    *         // The cloud project
    *         projectId: 'placeholder-value',
    *         // A tool results step ID.
    *         stepId: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "perfSampleSeries": []
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
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var samples: ResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamples = js.native
}
