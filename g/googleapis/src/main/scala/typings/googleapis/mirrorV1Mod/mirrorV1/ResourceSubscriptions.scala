package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Subscriptions")
@js.native
class ResourceSubscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.subscriptions.delete
    * @desc Deletes a subscription.
    * @alias mirror.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the subscription.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSubscriptionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * mirror.subscriptions.insert
    * @desc Creates a new subscription.
    * @alias mirror.subscriptions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSubscription] = js.native
  def insert(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def insert(params: ParamsResourceSubscriptionsInsert): GaxiosPromise[SchemaSubscription] = js.native
  def insert(params: ParamsResourceSubscriptionsInsert, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def insert(params: ParamsResourceSubscriptionsInsert, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * mirror.subscriptions.list
    * @desc Retrieves a list of subscriptions for the authenticated user and
    * service.
    * @alias mirror.subscriptions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSubscriptionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSubscriptionsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubscriptionsListResponse] = js.native
  def list(params: ParamsResourceSubscriptionsList): GaxiosPromise[SchemaSubscriptionsListResponse] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    callback: BodyResponseCallback[SchemaSubscriptionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: BodyResponseCallback[SchemaSubscriptionsListResponse],
    callback: BodyResponseCallback[SchemaSubscriptionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaSubscriptionsListResponse] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionsListResponse]
  ): Unit = js.native
  /**
    * mirror.subscriptions.update
    * @desc Updates an existing subscription in place.
    * @alias mirror.subscriptions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the subscription.
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSubscription] = js.native
  def update(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def update(params: ParamsResourceSubscriptionsUpdate): GaxiosPromise[SchemaSubscription] = js.native
  def update(params: ParamsResourceSubscriptionsUpdate, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def update(
    params: ParamsResourceSubscriptionsUpdate,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def update(params: ParamsResourceSubscriptionsUpdate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def update(
    params: ParamsResourceSubscriptionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
}

