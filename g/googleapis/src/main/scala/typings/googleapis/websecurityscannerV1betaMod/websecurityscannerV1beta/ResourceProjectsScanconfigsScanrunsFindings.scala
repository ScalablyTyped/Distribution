package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findings")
@js.native
class ResourceProjectsScanconfigsScanrunsFindings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findings.get
    * @desc Gets a Finding.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.findings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the Finding to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}/findings/{findingId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFinding] = js.native
  def get(callback: BodyResponseCallback[SchemaFinding]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet): GaxiosPromise[SchemaFinding] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    options: BodyResponseCallback[SchemaFinding],
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet, options: MethodOptions): GaxiosPromise[SchemaFinding] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFinding]
  ): Unit = js.native
  
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findings.list
    * @desc List Findings under a given ScanRun.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.findings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression. The expression must be in the format: <field> <operator> <value>. Supported field: 'finding_type'. Supported operator: '='.
    * @param {integer=} params.pageSize The maximum number of Findings to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFindingsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingsList): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    options: BodyResponseCallback[SchemaListFindingsResponse],
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsFindingsList, options: MethodOptions): GaxiosPromise[SchemaListFindingsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsFindingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFindingsResponse]
  ): Unit = js.native
}
