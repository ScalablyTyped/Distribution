package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
@js.native
class ResourceProjectsScanconfigsScanrunsFindingtypestats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findingTypeStats.list
    * @desc List all FindingTypeStats under a given ScanRun.
    * @alias
    * websecurityscanner.projects.scanConfigs.scanRuns.findingTypeStats.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFindingTypeStatsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFindingTypeStatsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFindingTypeStatsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList): GaxiosPromise[SchemaListFindingTypeStatsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList,
    callback: BodyResponseCallback[SchemaListFindingTypeStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList,
    options: BodyResponseCallback[SchemaListFindingTypeStatsResponse],
    callback: BodyResponseCallback[SchemaListFindingTypeStatsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList, options: MethodOptions): GaxiosPromise[SchemaListFindingTypeStatsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFindingTypeStatsResponse]
  ): Unit = js.native
}
