package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1alpha1", "tpu_v1alpha1.Resource$Projects$Locations$Nodes")
@js.native
class ResourceProjectsLocationsNodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tpu.projects.locations.nodes.create
    * @desc Creates a node.
    * @alias tpu.projects.locations.nodes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.nodeId The unqualified resource name.
    * @param {string} params.parent The parent resource name.
    * @param {().Node} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsNodesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsNodesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsNodesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.delete
    * @desc Deletes a node.
    * @alias tpu.projects.locations.nodes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsNodesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsNodesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsNodesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.get
    * @desc Gets the details of a node.
    * @alias tpu.projects.locations.nodes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNode] = js.native
  def get(callback: BodyResponseCallback[SchemaNode]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNode] = js.native
  def get(params: ParamsResourceProjectsLocationsNodesGet): GaxiosPromise[SchemaNode] = js.native
  def get(params: ParamsResourceProjectsLocationsNodesGet, callback: BodyResponseCallback[SchemaNode]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsNodesGet,
    options: BodyResponseCallback[SchemaNode],
    callback: BodyResponseCallback[SchemaNode]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsNodesGet, options: MethodOptions): GaxiosPromise[SchemaNode] = js.native
  def get(
    params: ParamsResourceProjectsLocationsNodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNode]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.list
    * @desc Lists nodes.
    * @alias tpu.projects.locations.nodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The parent resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNodesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsNodesList): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    callback: BodyResponseCallback[SchemaListNodesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    options: BodyResponseCallback[SchemaListNodesResponse],
    callback: BodyResponseCallback[SchemaListNodesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsNodesList, options: MethodOptions): GaxiosPromise[SchemaListNodesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsNodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNodesResponse]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.reimage
    * @desc Reimages a node's OS.
    * @alias tpu.projects.locations.nodes.reimage
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {().ReimageNodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reimage(): GaxiosPromise[SchemaOperation] = js.native
  def reimage(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reimage(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reimage(params: ParamsResourceProjectsLocationsNodesReimage): GaxiosPromise[SchemaOperation] = js.native
  def reimage(
    params: ParamsResourceProjectsLocationsNodesReimage,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reimage(
    params: ParamsResourceProjectsLocationsNodesReimage,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reimage(params: ParamsResourceProjectsLocationsNodesReimage, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reimage(
    params: ParamsResourceProjectsLocationsNodesReimage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.start
    * @desc Starts a node.
    * @alias tpu.projects.locations.nodes.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {().StartNodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsNodesStart): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsNodesStart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(
    params: ParamsResourceProjectsLocationsNodesStart,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsLocationsNodesStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsNodesStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * tpu.projects.locations.nodes.stop
    * @desc Stops a node.
    * @alias tpu.projects.locations.nodes.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {().StopNodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[SchemaOperation] = js.native
  def stop(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsNodesStop): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsNodesStop, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsNodesStop,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsNodesStop, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsNodesStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

