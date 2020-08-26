package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudfunctions/v1beta2", "cloudfunctions_v1beta2.Resource$Operations")
@js.native
class ResourceOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudfunctions.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias cloudfunctions.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
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
    * cloudfunctions.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias cloudfunctions.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Required. A filter for matching the requested operations.<br><br> The supported formats of <b>filter</b> are:<br> To query for specific function: <code>project:*,location:*,function:*</code><br> To query for all of the latest operations for a project: <code>project:*,latest:true</code>
    * @param {string=} params.name Must not be set.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceOperationsList, callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: BodyResponseCallback[SchemaListOperationsResponse],
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
}

