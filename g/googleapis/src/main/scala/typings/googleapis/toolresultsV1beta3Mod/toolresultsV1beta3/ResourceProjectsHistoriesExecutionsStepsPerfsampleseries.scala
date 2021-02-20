package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries")
@js.native
class ResourceProjectsHistoriesExecutionsStepsPerfsampleseries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.create
    * @desc Creates a PerfSampleSeries.  May return any of the following error
    * code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the
    * given Step - NOT_FOUND - The containing Step does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {().PerfSampleSeries} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(callback: BodyResponseCallback[SchemaPerfSampleSeries]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesCreate,
    options: BodyResponseCallback[SchemaPerfSampleSeries],
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
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
    * toolresults.projects.histories.executions.steps.perfSampleSeries.get
    * @desc Gets a PerfSampleSeries.  May return any of the following error
    * code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.sampleSeriesId A sample series id
    * @param {string} params.stepId A tool results step ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(callback: BodyResponseCallback[SchemaPerfSampleSeries]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    options: BodyResponseCallback[SchemaPerfSampleSeries],
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet, options: MethodOptions): GaxiosPromise[SchemaPerfSampleSeries] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerfSampleSeries]
  ): Unit = js.native
  
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.list
    * @desc Lists PerfSampleSeries for a given Step.  The request provides an
    * optional filter which specifies one or more PerfMetricsType to include in
    * the result; if none returns all. The resulting PerfSampleSeries are
    * sorted by ids.  May return any of the following canonical error codes: -
    * NOT_FOUND - The containing Step does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string=} params.filter Specify one or more PerfMetricType values such as CPU to filter the result
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    options: BodyResponseCallback[SchemaListPerfSampleSeriesResponse],
    callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList, options: MethodOptions): GaxiosPromise[SchemaListPerfSampleSeriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPerfSampleSeriesResponse]
  ): Unit = js.native
  
  var samples: ResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamples = js.native
}
