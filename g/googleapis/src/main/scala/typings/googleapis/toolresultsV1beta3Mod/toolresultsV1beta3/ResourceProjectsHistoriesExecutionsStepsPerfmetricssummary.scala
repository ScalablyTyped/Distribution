package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfmetricssummary")
@js.native
class ResourceProjectsHistoriesExecutionsStepsPerfmetricssummary protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * toolresults.projects.histories.executions.steps.perfMetricsSummary.create
    * @desc Creates a PerfMetricsSummary resource. Returns the existing one if
    * it has already been created.  May return any of the following error
    * code(s): - NOT_FOUND - The containing Step does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfMetricsSummary.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {().PerfMetricsSummary} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaPerfMetricsSummary],
    callback: BodyResponseCallback[SchemaPerfMetricsSummary]
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
}
