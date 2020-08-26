package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Scanconfigs")
@js.native
class ResourceProjectsScanconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.scanConfigs.get
    * @desc Gets the specified scan configuration.
    * @alias containeranalysis.projects.scanConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`.
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
    * @desc Lists scan configurations for the specified project.
    * @alias containeranalysis.projects.scanConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize The number of scan configs to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent The name of the project to list scan configurations for in the form of `projects/[PROJECT_ID]`.
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
    * containeranalysis.projects.scanConfigs.update
    * @desc Updates the specified scan configuration.
    * @alias containeranalysis.projects.scanConfigs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`.
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaScanConfig] = js.native
  def update(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def update(params: ParamsResourceProjectsScanconfigsUpdate): GaxiosPromise[SchemaScanConfig] = js.native
  def update(params: ParamsResourceProjectsScanconfigsUpdate, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def update(
    params: ParamsResourceProjectsScanconfigsUpdate,
    options: BodyResponseCallback[SchemaScanConfig],
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsScanconfigsUpdate, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def update(
    params: ParamsResourceProjectsScanconfigsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
}

