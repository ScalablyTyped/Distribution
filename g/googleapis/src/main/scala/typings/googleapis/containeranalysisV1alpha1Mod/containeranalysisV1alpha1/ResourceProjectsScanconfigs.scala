package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Scanconfigs")
@js.native
class ResourceProjectsScanconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * containeranalysis.projects.scanConfigs.get
    * @desc Gets a specific scan configuration for a project.
    * @alias containeranalysis.projects.scanConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the ScanConfig in the form projects/{project_id}/scanConfigs/{scan_config_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaScanConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet): GaxiosPromise[SchemaScanConfig] = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: BodyResponseCallback[SchemaScanConfig],
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsScanconfigsGet, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def get(
    params: ParamsResourceProjectsScanconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.scanConfigs.list
    * @desc Lists scan configurations for a project.
    * @alias containeranalysis.projects.scanConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize The number of items to return.
    * @param {string=} params.pageToken The page token to use for the next request.
    * @param {string} params.parent This containers the project Id i.e.: projects/{project_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScanConfigsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsScanconfigsList): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: BodyResponseCallback[SchemaListScanConfigsResponse],
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsList, options: MethodOptions): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListScanConfigsResponse]
  ): Unit = js.native
  
  /**
    * containeranalysis.projects.scanConfigs.patch
    * @desc Updates the scan configuration to a new value.
    * @alias containeranalysis.projects.scanConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The scan config to update of the form projects/{project_id}/scanConfigs/{scan_config_id}.
    * @param {string=} params.updateMask The fields to update.
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: BodyResponseCallback[SchemaScanConfig],
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsScanconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(
    params: ParamsResourceProjectsScanconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
}
