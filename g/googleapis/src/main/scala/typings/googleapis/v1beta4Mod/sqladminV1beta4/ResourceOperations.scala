package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Operations")
@js.native
class ResourceOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.operations.get
    * @desc Retrieves an instance operation that has been performed on an
    * instance.
    * @alias sql.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.operation Instance operation ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceOperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceOperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceOperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * sql.operations.list
    * @desc Lists all instance operations that have been performed on the given
    * Cloud SQL instance in the reverse chronological order of the start time.
    * @alias sql.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {integer=} params.maxResults Maximum number of operations per response.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOperationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOperationsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperationsListResponse] = js.native
  def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaOperationsListResponse] = js.native
  def list(params: ParamsResourceOperationsList, callback: BodyResponseCallback[SchemaOperationsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: BodyResponseCallback[SchemaOperationsListResponse],
    callback: BodyResponseCallback[SchemaOperationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaOperationsListResponse] = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperationsListResponse]
  ): Unit = js.native
}

