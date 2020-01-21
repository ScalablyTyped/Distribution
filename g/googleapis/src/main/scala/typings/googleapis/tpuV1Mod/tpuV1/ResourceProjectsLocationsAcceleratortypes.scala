package typings.googleapis.tpuV1Mod.tpuV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1", "tpu_v1.Resource$Projects$Locations$Acceleratortypes")
@js.native
class ResourceProjectsLocationsAcceleratortypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tpu.projects.locations.acceleratorTypes.get
    * @desc Gets AcceleratorType.
    * @alias tpu.projects.locations.acceleratorTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(callback: BodyResponseCallback[SchemaAcceleratorType]): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAcceleratortypesGet): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    callback: BodyResponseCallback[SchemaAcceleratorType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    options: BodyResponseCallback[SchemaAcceleratorType],
    callback: BodyResponseCallback[SchemaAcceleratorType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAcceleratortypesGet, options: MethodOptions): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAcceleratorType]
  ): Unit = js.native
  /**
    * tpu.projects.locations.acceleratorTypes.list
    * @desc Lists accelerator types supported by this API.
    * @alias tpu.projects.locations.acceleratorTypes.list
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
  def list(): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAcceleratortypesList): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    options: BodyResponseCallback[SchemaListAcceleratorTypesResponse],
    callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAcceleratortypesList, options: MethodOptions): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]
  ): Unit = js.native
}

