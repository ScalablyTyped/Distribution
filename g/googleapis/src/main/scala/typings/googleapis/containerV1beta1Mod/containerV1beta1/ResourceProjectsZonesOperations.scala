package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Zones$Operations")
@js.native
class ResourceProjectsZonesOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * container.projects.zones.operations.cancel
    * @desc Cancels the specified operation.
    * @alias container.projects.zones.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.operationId Deprecated. The server-assigned `name` of the operation. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the operation resides. This field has been deprecated and replaced by the name field.
    * @param {().CancelOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(params: ParamsResourceProjectsZonesOperationsCancel): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(params: ParamsResourceProjectsZonesOperationsCancel, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsZonesOperationsCancel,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsZonesOperationsCancel, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsZonesOperationsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * container.projects.zones.operations.get
    * @desc Gets the specified operation.
    * @alias container.projects.zones.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.name The name (project, location, operation id) of the operation to get. Specified in the format 'projects/x/locations/x/operations/x'.
    * @param {string} params.operationId Deprecated. The server-assigned `name` of the operation. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceProjectsZonesOperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceProjectsZonesOperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceProjectsZonesOperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsZonesOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceProjectsZonesOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * container.projects.zones.operations.list
    * @desc Lists all operations in a project in a specific zone or all zones.
    * @alias container.projects.zones.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent The parent (project and location) where the operations will be listed. Specified in the format 'projects/x/locations/x'. Location "-" matches all zones and all regions.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) to return operations for, or `-` for all zones. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceProjectsZonesOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesOperationsList,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsZonesOperationsList,
    options: BodyResponseCallback[SchemaListOperationsResponse],
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsZonesOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsZonesOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
}

