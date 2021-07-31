package typings.googleapis.v2Mod.androidpublisherV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Purchases$Subscriptions")
@js.native
class ResourcePurchasesSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * androidpublisher.purchases.subscriptions.cancel
    * @desc Cancels a user's subscription purchase. The subscription remains
    * valid until its expiration time.
    * @alias androidpublisher.purchases.subscriptions.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Unit] = js.native
  def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel, callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(
    params: ParamsResourcePurchasesSubscriptionsCancel,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(params: ParamsResourcePurchasesSubscriptionsCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsResourcePurchasesSubscriptionsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.purchases.subscriptions.defer
    * @desc Defers a user's subscription purchase until a specified future
    * expiration time.
    * @alias androidpublisher.purchases.subscriptions.defer
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {().SubscriptionPurchasesDeferRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def defer(): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]): Unit = js.native
  def defer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(params: ParamsResourcePurchasesSubscriptionsDefer): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    options: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse],
    callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  def defer(params: ParamsResourcePurchasesSubscriptionsDefer, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchasesDeferResponse] = js.native
  def defer(
    params: ParamsResourcePurchasesSubscriptionsDefer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionPurchasesDeferResponse]
  ): Unit = js.native
  
  /**
    * androidpublisher.purchases.subscriptions.get
    * @desc Checks whether a user's subscription purchase is valid and returns
    * its expiry time.
    * @alias androidpublisher.purchases.subscriptions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(params: ParamsResourcePurchasesSubscriptionsGet): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    options: BodyResponseCallback[SchemaSubscriptionPurchase],
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
  def get(params: ParamsResourcePurchasesSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
  def get(
    params: ParamsResourcePurchasesSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptionPurchase]
  ): Unit = js.native
  
  /**
    * androidpublisher.purchases.subscriptions.refund
    * @desc Refunds a user's subscription purchase, but the subscription
    * remains valid until its expiration time and it will continue to recur.
    * @alias androidpublisher.purchases.subscriptions.refund
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def refund(): GaxiosPromise[Unit] = js.native
  def refund(callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund): GaxiosPromise[Unit] = js.native
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund, callback: BodyResponseCallback[Unit]): Unit = js.native
  def refund(
    params: ParamsResourcePurchasesSubscriptionsRefund,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def refund(params: ParamsResourcePurchasesSubscriptionsRefund, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def refund(
    params: ParamsResourcePurchasesSubscriptionsRefund,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidpublisher.purchases.subscriptions.revoke
    * @desc Refunds and immediately revokes a user's subscription purchase.
    * Access to the subscription will be terminated immediately and it will
    * stop recurring.
    * @alias androidpublisher.purchases.subscriptions.revoke
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
    * @param {string} params.token The token provided to the user's device when the subscription was purchased.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revoke(): GaxiosPromise[Unit] = js.native
  def revoke(callback: BodyResponseCallback[Unit]): Unit = js.native
  def revoke(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke): GaxiosPromise[Unit] = js.native
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke, callback: BodyResponseCallback[Unit]): Unit = js.native
  def revoke(
    params: ParamsResourcePurchasesSubscriptionsRevoke,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revoke(params: ParamsResourcePurchasesSubscriptionsRevoke, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revoke(
    params: ParamsResourcePurchasesSubscriptionsRevoke,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
