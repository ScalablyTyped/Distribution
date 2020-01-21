package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs")
@js.native
class ResourceProjectsScanconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var scanRuns: ResourceProjectsScanconfigsScanruns = js.native
  /**
    * websecurityscanner.projects.scanConfigs.create
    * @desc Creates a new ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource name where the scan is created, which should be a project resource name in the format 'projects/{projectId}'.
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaScanConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def create(params: ParamsResourceProjectsScanconfigsCreate): GaxiosPromise[SchemaScanConfig] = js.native
  def create(params: ParamsResourceProjectsScanconfigsCreate, callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
  def create(
    params: ParamsResourceProjectsScanconfigsCreate,
    options: BodyResponseCallback[SchemaScanConfig],
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsScanconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaScanConfig] = js.native
  def create(
    params: ParamsResourceProjectsScanconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanConfig]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.delete
    * @desc Deletes an existing ScanConfig and its child resources.
    * @alias websecurityscanner.projects.scanConfigs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanConfig to be deleted. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsScanconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsScanconfigsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsScanconfigsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsScanconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsScanconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.get
    * @desc Gets a ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanConfig to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaScanConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
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
    * websecurityscanner.projects.scanConfigs.list
    * @desc Lists ScanConfigs under a given project.
    * @alias websecurityscanner.projects.scanConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of ScanConfigs to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a project resource name in the format 'projects/{projectId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListScanConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListScanConfigsResponse]): Unit = js.native
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
    * websecurityscanner.projects.scanConfigs.patch
    * @desc Updates a ScanConfig. This method support partial update of a
    * ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
    * @param {string=} params.updateMask Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaScanConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaScanConfig]): Unit = js.native
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
  /**
    * websecurityscanner.projects.scanConfigs.start
    * @desc Start a ScanRun according to the given ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanConfig to be used. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {().StartScanRunRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[SchemaScanRun] = js.native
  def start(callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def start(params: ParamsResourceProjectsScanconfigsStart): GaxiosPromise[SchemaScanRun] = js.native
  def start(params: ParamsResourceProjectsScanconfigsStart, callback: BodyResponseCallback[SchemaScanRun]): Unit = js.native
  def start(
    params: ParamsResourceProjectsScanconfigsStart,
    options: BodyResponseCallback[SchemaScanRun],
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsScanconfigsStart, options: MethodOptions): GaxiosPromise[SchemaScanRun] = js.native
  def start(
    params: ParamsResourceProjectsScanconfigsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScanRun]
  ): Unit = js.native
}

