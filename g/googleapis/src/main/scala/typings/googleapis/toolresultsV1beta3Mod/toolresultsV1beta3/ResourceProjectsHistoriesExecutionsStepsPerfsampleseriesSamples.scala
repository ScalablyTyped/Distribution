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

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries$Samples")
@js.native
open class ResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamples protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreate(): GaxiosPromise[SchemaBatchCreatePerfSamplesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaBatchCreatePerfSamplesResponse]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchCreatePerfSamplesResponse] = js.native
  def batchCreate(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate): GaxiosPromise[SchemaBatchCreatePerfSamplesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate,
    callback: BodyResponseCallback[SchemaBatchCreatePerfSamplesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate,
    options: BodyResponseCallback[Readable | SchemaBatchCreatePerfSamplesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchCreatePerfSamplesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaBatchCreatePerfSamplesResponse] = js.native
  def batchCreate(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreatePerfSamplesResponse]
  ): Unit = js.native
  /**
    * Creates a batch of PerfSamples - a client can submit multiple batches of Perf Samples through repeated calls to this method in order to split up a large request payload - duplicates and existing timestamp entries will be ignored. - the batch operation may partially succeed - the set of elements successfully inserted is returned in the response (omits items which already existed in the database). May return any of the following canonical error codes: - NOT_FOUND - The containing PerfSampleSeries does not exist
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
    *     await toolresults.projects.histories.executions.steps.perfSampleSeries.samples.batchCreate(
    *       {
    *         // A tool results execution ID.
    *         executionId: 'placeholder-value',
    *         // A tool results history ID.
    *         historyId: 'placeholder-value',
    *         // The cloud project
    *         projectId: 'placeholder-value',
    *         // A sample series id
    *         sampleSeriesId: 'placeholder-value',
    *         // A tool results step ID.
    *         stepId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "perfSamples": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "perfSamples": []
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
  def batchCreate(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPerfSamplesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPerfSamplesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPerfSamplesResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList): GaxiosPromise[SchemaListPerfSamplesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList,
    callback: BodyResponseCallback[SchemaListPerfSamplesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList,
    options: BodyResponseCallback[Readable | SchemaListPerfSamplesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPerfSamplesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListPerfSamplesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPerfSamplesResponse]
  ): Unit = js.native
  /**
    * Lists the Performance Samples of a given Sample Series - The list results are sorted by timestamps ascending - The default page size is 500 samples; and maximum size allowed 5000 - The response token indicates the last returned PerfSample timestamp - When the results size exceeds the page size, submit a subsequent request including the page token to return the rest of the samples up to the page limit May return any of the following canonical error codes: - OUT_OF_RANGE - The specified request page_token is out of valid range - NOT_FOUND - The containing PerfSampleSeries does not exist
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
    *     await toolresults.projects.histories.executions.steps.perfSampleSeries.samples.list(
    *       {
    *         // A tool results execution ID.
    *         executionId: 'placeholder-value',
    *         // A tool results history ID.
    *         historyId: 'placeholder-value',
    *         // The default page size is 500 samples, and the maximum size is 5000. If the page_size is greater than 5000, the effective page size will be 5000
    *         pageSize: 'placeholder-value',
    *         // Optional, the next_page_token returned in the previous response
    *         pageToken: 'placeholder-value',
    *         // The cloud project
    *         projectId: 'placeholder-value',
    *         // A sample series id
    *         sampleSeriesId: 'placeholder-value',
    *         // A tool results step ID.
    *         stepId: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "perfSamples": []
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
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
