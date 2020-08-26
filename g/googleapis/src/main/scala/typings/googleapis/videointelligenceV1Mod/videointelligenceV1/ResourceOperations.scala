package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/videointelligence/v1", "videointelligence_v1.Resource$Operations")
@js.native
class ResourceOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * videointelligence.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation.  The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
    * or other methods to check whether the cancellation succeeded or whether
    * the operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with an
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    * @alias videointelligence.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {().GoogleLongrunning_CancelOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(params: ParamsResourceOperationsCancel): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(params: ParamsResourceOperationsCancel, callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def cancel(
    params: ParamsResourceOperationsCancel,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(params: ParamsResourceOperationsCancel, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsResourceOperationsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * videointelligence.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`.
    * @alias videointelligence.operations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOperationsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOperationsDelete, callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceOperationsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOperationsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOperationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * videointelligence.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias videointelligence.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(params: ParamsResourceOperationsGet): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(
    params: ParamsResourceOperationsGet,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def get(
    params: ParamsResourceOperationsGet,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def get(params: ParamsResourceOperationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(
    params: ParamsResourceOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * videointelligence.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias videointelligence.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string=} params.name The name of the operation's parent resource.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsResourceOperationsList,
    callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse],
    callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]
  ): Unit = js.native
}

