package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orderpayments")
@js.native
class ResourceOrderpayments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * content.orderpayments.notifyauthapproved
    * @desc Notify about successfully authorizing user's payment method for a
    * given amount.
    * @alias content.orderpayments.notifyauthapproved
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for for which payment authorization is happening.
    * @param {().OrderpaymentsNotifyAuthApprovedRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifyauthapproved(): GaxiosPromise[SchemaOrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthApprovedResponse]): Unit = js.native
  def notifyauthapproved(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(params: ParamsResourceOrderpaymentsNotifyauthapproved): GaxiosPromise[SchemaOrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(
    params: ParamsResourceOrderpaymentsNotifyauthapproved,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthApprovedResponse]
  ): Unit = js.native
  def notifyauthapproved(
    params: ParamsResourceOrderpaymentsNotifyauthapproved,
    options: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthApprovedResponse],
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthApprovedResponse]
  ): Unit = js.native
  def notifyauthapproved(params: ParamsResourceOrderpaymentsNotifyauthapproved, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(
    params: ParamsResourceOrderpaymentsNotifyauthapproved,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthApprovedResponse]
  ): Unit = js.native
  
  /**
    * content.orderpayments.notifyauthdeclined
    * @desc Notify about failure to authorize user's payment method.
    * @alias content.orderpayments.notifyauthdeclined
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for which payment authorization was declined.
    * @param {().OrderpaymentsNotifyAuthDeclinedRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifyauthdeclined(): GaxiosPromise[SchemaOrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthDeclinedResponse]): Unit = js.native
  def notifyauthdeclined(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(params: ParamsResourceOrderpaymentsNotifyauthdeclined): GaxiosPromise[SchemaOrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(
    params: ParamsResourceOrderpaymentsNotifyauthdeclined,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthDeclinedResponse]
  ): Unit = js.native
  def notifyauthdeclined(
    params: ParamsResourceOrderpaymentsNotifyauthdeclined,
    options: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthDeclinedResponse],
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthDeclinedResponse]
  ): Unit = js.native
  def notifyauthdeclined(params: ParamsResourceOrderpaymentsNotifyauthdeclined, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(
    params: ParamsResourceOrderpaymentsNotifyauthdeclined,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyAuthDeclinedResponse]
  ): Unit = js.native
  
  /**
    * content.orderpayments.notifycharge
    * @desc Notify about charge on user's selected payments method.
    * @alias content.orderpayments.notifycharge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for which charge is happening.
    * @param {().OrderpaymentsNotifyChargeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifycharge(): GaxiosPromise[SchemaOrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(callback: BodyResponseCallback[SchemaOrderpaymentsNotifyChargeResponse]): Unit = js.native
  def notifycharge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(params: ParamsResourceOrderpaymentsNotifycharge): GaxiosPromise[SchemaOrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(
    params: ParamsResourceOrderpaymentsNotifycharge,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyChargeResponse]
  ): Unit = js.native
  def notifycharge(
    params: ParamsResourceOrderpaymentsNotifycharge,
    options: BodyResponseCallback[SchemaOrderpaymentsNotifyChargeResponse],
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyChargeResponse]
  ): Unit = js.native
  def notifycharge(params: ParamsResourceOrderpaymentsNotifycharge, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(
    params: ParamsResourceOrderpaymentsNotifycharge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyChargeResponse]
  ): Unit = js.native
  
  /**
    * content.orderpayments.notifyrefund
    * @desc Notify about refund on user's selected payments method.
    * @alias content.orderpayments.notifyrefund
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for which charge is happening.
    * @param {().OrderpaymentsNotifyRefundRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifyrefund(): GaxiosPromise[SchemaOrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(callback: BodyResponseCallback[SchemaOrderpaymentsNotifyRefundResponse]): Unit = js.native
  def notifyrefund(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(params: ParamsResourceOrderpaymentsNotifyrefund): GaxiosPromise[SchemaOrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(
    params: ParamsResourceOrderpaymentsNotifyrefund,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyRefundResponse]
  ): Unit = js.native
  def notifyrefund(
    params: ParamsResourceOrderpaymentsNotifyrefund,
    options: BodyResponseCallback[SchemaOrderpaymentsNotifyRefundResponse],
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyRefundResponse]
  ): Unit = js.native
  def notifyrefund(params: ParamsResourceOrderpaymentsNotifyrefund, options: MethodOptions): GaxiosPromise[SchemaOrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(
    params: ParamsResourceOrderpaymentsNotifyrefund,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrderpaymentsNotifyRefundResponse]
  ): Unit = js.native
}
