package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns")
@js.native
class ResourceProjectsScanconfigsScanruns protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var crawledUrls: ResourceProjectsScanconfigsScanrunsCrawledurls = js.native
  
  var findingTypeStats: ResourceProjectsScanconfigsScanrunsFindingtypestats = js.native
  
  var findings: ResourceProjectsScanconfigsScanrunsFindings = js.native
  
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.get
    * @desc Gets a ScanRun.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanRun to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaScanRun] = js.native
  def get(callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsGet): GaxiosPromise[SchemaScanRun] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    options: BodyResponseCallback[SchemaScanRun],
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsGet, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.list
    * @desc Lists ScanRuns under a given ScanConfig, in descending order of
    * ScanRun stop time.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of ScanRuns to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a scan resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScanRunsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsList): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    callback: BodyResponseCallback[SchemaListScanRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    options: BodyResponseCallback[SchemaListScanRunsResponse],
    callback: BodyResponseCallback[SchemaListScanRunsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsList, options: MethodOptions): GaxiosPromise[SchemaListScanRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScanRunsResponse]
  ): Unit = js.native
  
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.stop
    * @desc Stops a ScanRun. The stopped ScanRun is returned.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanRun to be stopped. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {().StopScanRunRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[SchemaScanRun] = js.native
  def stop(callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def stop(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def stop(params: ParamsResourceProjectsScanconfigsScanrunsStop): GaxiosPromise[SchemaScanRun] = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    options: BodyResponseCallback[SchemaScanRun],
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsScanconfigsScanrunsStop, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def stop(
    params: ParamsResourceProjectsScanconfigsScanrunsStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
}
