package typings.googleapis.resellerV1Mod.resellerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Resellernotify")
@js.native
class ResourceResellernotify protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reseller.resellernotify.getwatchdetails
    * @desc Returns all the details of the watch corresponding to the reseller.
    * @alias reseller.resellernotify.getwatchdetails
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getwatchdetails(): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]): Unit = js.native
  def getwatchdetails(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(params: ParamsResourceResellernotifyGetwatchdetails): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    options: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse],
    callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  def getwatchdetails(params: ParamsResourceResellernotifyGetwatchdetails, options: MethodOptions): GaxiosPromise[SchemaResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(
    params: ParamsResourceResellernotifyGetwatchdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  /**
    * reseller.resellernotify.register
    * @desc Registers a Reseller for receiving notifications.
    * @alias reseller.resellernotify.register
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.serviceAccountEmailAddress The service account which will own the created Cloud-PubSub topic.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def register(): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(callback: BodyResponseCallback[SchemaResellernotifyResource]): Unit = js.native
  def register(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(params: ParamsResourceResellernotifyRegister): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    options: BodyResponseCallback[SchemaResellernotifyResource],
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  def register(params: ParamsResourceResellernotifyRegister, options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def register(
    params: ParamsResourceResellernotifyRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  /**
    * reseller.resellernotify.unregister
    * @desc Unregisters a Reseller for receiving notifications.
    * @alias reseller.resellernotify.unregister
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.serviceAccountEmailAddress The service account which owns the Cloud-PubSub topic.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unregister(): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(callback: BodyResponseCallback[SchemaResellernotifyResource]): Unit = js.native
  def unregister(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(params: ParamsResourceResellernotifyUnregister): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    options: BodyResponseCallback[SchemaResellernotifyResource],
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
  def unregister(params: ParamsResourceResellernotifyUnregister, options: MethodOptions): GaxiosPromise[SchemaResellernotifyResource] = js.native
  def unregister(
    params: ParamsResourceResellernotifyUnregister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResellernotifyResource]
  ): Unit = js.native
}

