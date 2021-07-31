package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1", "remotebuildexecution_v1.Resource$Operations")
@js.native
class ResourceOperations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * remotebuildexecution.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation.  The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
    * or other methods to check whether the cancellation succeeded or whether
    * the operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with an
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    * @alias remotebuildexecution.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {().GoogleLongrunningCancelOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
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
  
  var context: APIRequestContext = js.native
  
  /**
    * remotebuildexecution.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`.
    * @alias remotebuildexecution.operations.delete
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
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
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
    * remotebuildexecution.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias remotebuildexecution.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string} params.name The name of the operation's parent resource.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleLongrunningListOperationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningListOperationsResponse] = js.native
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
