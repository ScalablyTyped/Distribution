package typings.googleapis.tpuV1Mod.tpuV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1", "tpu_v1.Resource$Projects$Locations$Tensorflowversions")
@js.native
class ResourceProjectsLocationsTensorflowversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tpu.projects.locations.tensorflowVersions.get
    * @desc Gets TensorFlow Version.
    * @alias tpu.projects.locations.tensorflowVersions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaTensorFlowVersion]): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTensorflowversionsGet): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    callback: BodyResponseCallback[SchemaTensorFlowVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    options: BodyResponseCallback[SchemaTensorFlowVersion],
    callback: BodyResponseCallback[SchemaTensorFlowVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTensorflowversionsGet, options: MethodOptions): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTensorFlowVersion]
  ): Unit = js.native
  /**
    * tpu.projects.locations.tensorflowVersions.list
    * @desc List TensorFlow versions supported by this API.
    * @alias tpu.projects.locations.tensorflowVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter List filter.
    * @param {string=} params.orderBy Sort results.
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The parent resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTensorflowversionsList): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    options: BodyResponseCallback[SchemaListTensorFlowVersionsResponse],
    callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTensorflowversionsList, options: MethodOptions): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]
  ): Unit = js.native
}

