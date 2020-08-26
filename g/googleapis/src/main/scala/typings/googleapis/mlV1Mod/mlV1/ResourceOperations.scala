package typings.googleapis.mlV1Mod.mlV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Operations")
@js.native
class ResourceOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`.
    * @alias ml.operations.delete
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
}

