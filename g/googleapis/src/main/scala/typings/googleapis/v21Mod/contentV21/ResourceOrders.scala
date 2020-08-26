package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Orders")
@js.native
class ResourceOrders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.orders.acknowledge
    * @desc Marks an order as acknowledged.
    * @alias content.orders.acknowledge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersAcknowledgeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledge(): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]): Unit = js.native
  def acknowledge(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(params: ParamsResourceOrdersAcknowledge): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    options: BodyResponseCallback[SchemaOrdersAcknowledgeResponse],
    callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceOrdersAcknowledge, options: MethodOptions): GaxiosPromise[SchemaOrdersAcknowledgeResponse] = js.native
  def acknowledge(
    params: ParamsResourceOrdersAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersAcknowledgeResponse]
  ): Unit = js.native
  /**
    * content.orders.advancetestorder
    * @desc Sandbox only. Moves a test order from state "inProgress" to state
    * "pendingShipment".
    * @alias content.orders.advancetestorder
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the test order to modify.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def advancetestorder(): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]): Unit = js.native
  def advancetestorder(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(params: ParamsResourceOrdersAdvancetestorder): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    options: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse],
    callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  def advancetestorder(params: ParamsResourceOrdersAdvancetestorder, options: MethodOptions): GaxiosPromise[SchemaOrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(
    params: ParamsResourceOrdersAdvancetestorder,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersAdvanceTestOrderResponse]
  ): Unit = js.native
  /**
    * content.orders.cancel
    * @desc Cancels all line items in an order, making a full refund.
    * @alias content.orders.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order to cancel.
    * @param {().OrdersCancelRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(callback: BodyResponseCallback[SchemaOrdersCancelResponse]): Unit = js.native
  def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(params: ParamsResourceOrdersCancel): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(params: ParamsResourceOrdersCancel, callback: BodyResponseCallback[SchemaOrdersCancelResponse]): Unit = js.native
  def cancel(
    params: ParamsResourceOrdersCancel,
    options: BodyResponseCallback[SchemaOrdersCancelResponse],
    callback: BodyResponseCallback[SchemaOrdersCancelResponse]
  ): Unit = js.native
  def cancel(params: ParamsResourceOrdersCancel, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelResponse] = js.native
  def cancel(
    params: ParamsResourceOrdersCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCancelResponse]
  ): Unit = js.native
  /**
    * content.orders.cancellineitem
    * @desc Cancels a line item, making a full refund.
    * @alias content.orders.cancellineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersCancelLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancellineitem(): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]): Unit = js.native
  def cancellineitem(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(params: ParamsResourceOrdersCancellineitem): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]
  ): Unit = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    options: BodyResponseCallback[SchemaOrdersCancelLineItemResponse],
    callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]
  ): Unit = js.native
  def cancellineitem(params: ParamsResourceOrdersCancellineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelLineItemResponse] = js.native
  def cancellineitem(
    params: ParamsResourceOrdersCancellineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCancelLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.canceltestorderbycustomer
    * @desc Sandbox only. Cancels a test order for customer-initiated
    * cancellation.
    * @alias content.orders.canceltestorderbycustomer
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the test order to cancel.
    * @param {().OrdersCancelTestOrderByCustomerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def canceltestorderbycustomer(): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]): Unit = js.native
  def canceltestorderbycustomer(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(params: ParamsResourceOrdersCanceltestorderbycustomer): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    options: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse],
    callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  def canceltestorderbycustomer(params: ParamsResourceOrdersCanceltestorderbycustomer, options: MethodOptions): GaxiosPromise[SchemaOrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(
    params: ParamsResourceOrdersCanceltestorderbycustomer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCancelTestOrderByCustomerResponse]
  ): Unit = js.native
  /**
    * content.orders.createtestorder
    * @desc Sandbox only. Creates a test order.
    * @alias content.orders.createtestorder
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that should manage the order. This cannot be a multi-client account.
    * @param {().OrdersCreateTestOrderRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createtestorder(): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]): Unit = js.native
  def createtestorder(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(params: ParamsResourceOrdersCreatetestorder): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]
  ): Unit = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    options: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse],
    callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]
  ): Unit = js.native
  def createtestorder(params: ParamsResourceOrdersCreatetestorder, options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestOrderResponse] = js.native
  def createtestorder(
    params: ParamsResourceOrdersCreatetestorder,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCreateTestOrderResponse]
  ): Unit = js.native
  /**
    * content.orders.createtestreturn
    * @desc Sandbox only. Creates a test return.
    * @alias content.orders.createtestreturn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersCreateTestReturnRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createtestreturn(): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]): Unit = js.native
  def createtestreturn(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(params: ParamsResourceOrdersCreatetestreturn): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]
  ): Unit = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    options: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse],
    callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]
  ): Unit = js.native
  def createtestreturn(params: ParamsResourceOrdersCreatetestreturn, options: MethodOptions): GaxiosPromise[SchemaOrdersCreateTestReturnResponse] = js.native
  def createtestreturn(
    params: ParamsResourceOrdersCreatetestreturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersCreateTestReturnResponse]
  ): Unit = js.native
  /**
    * content.orders.get
    * @desc Retrieves an order from your Merchant Center account.
    * @alias content.orders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOrder] = js.native
  def get(callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet): GaxiosPromise[SchemaOrder] = js.native
  def get(params: ParamsResourceOrdersGet, callback: BodyResponseCallback[SchemaOrder]): Unit = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: BodyResponseCallback[SchemaOrder],
    callback: BodyResponseCallback[SchemaOrder]
  ): Unit = js.native
  def get(params: ParamsResourceOrdersGet, options: MethodOptions): GaxiosPromise[SchemaOrder] = js.native
  def get(
    params: ParamsResourceOrdersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrder]
  ): Unit = js.native
  /**
    * content.orders.getbymerchantorderid
    * @desc Retrieves an order using merchant order ID.
    * @alias content.orders.getbymerchantorderid
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.merchantOrderId The merchant order ID to be looked for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getbymerchantorderid(): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]): Unit = js.native
  def getbymerchantorderid(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(params: ParamsResourceOrdersGetbymerchantorderid): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    options: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse],
    callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  def getbymerchantorderid(params: ParamsResourceOrdersGetbymerchantorderid, options: MethodOptions): GaxiosPromise[SchemaOrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(
    params: ParamsResourceOrdersGetbymerchantorderid,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersGetByMerchantOrderIdResponse]
  ): Unit = js.native
  /**
    * content.orders.gettestordertemplate
    * @desc Sandbox only. Retrieves an order template that can be used to
    * quickly create a new order in sandbox.
    * @alias content.orders.gettestordertemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.country The country of the template to retrieve. Defaults to US.
    * @param {string} params.merchantId The ID of the account that should manage the order. This cannot be a multi-client account.
    * @param {string} params.templateName The name of the template to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def gettestordertemplate(): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]): Unit = js.native
  def gettestordertemplate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(params: ParamsResourceOrdersGettestordertemplate): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    options: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse],
    callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  def gettestordertemplate(params: ParamsResourceOrdersGettestordertemplate, options: MethodOptions): GaxiosPromise[SchemaOrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(
    params: ParamsResourceOrdersGettestordertemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersGetTestOrderTemplateResponse]
  ): Unit = js.native
  /**
    * content.orders.instorerefundlineitem
    * @desc Notifies that item return and refund was handled directly by
    * merchant outside of Google payments processing (e.g. cash refund done in
    * store). Note: We recommend calling the returnrefundlineitem method to
    * refund in-store returns. We will issue the refund directly to the
    * customer. This helps to prevent possible differences arising between
    * merchant and Google transaction records. We also recommend having the
    * point of sale system communicate with Google to ensure that customers do
    * not receive a double refund by first refunding via Google then via an
    * in-store return.
    * @alias content.orders.instorerefundlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersInStoreRefundLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instorerefundlineitem(): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]): Unit = js.native
  def instorerefundlineitem(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(params: ParamsResourceOrdersInstorerefundlineitem): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    options: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse],
    callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  def instorerefundlineitem(params: ParamsResourceOrdersInstorerefundlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(
    params: ParamsResourceOrdersInstorerefundlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersInStoreRefundLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.list
    * @desc Lists the orders in your Merchant Center account.
    * @alias content.orders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledged Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that have not been acknowledged. We recommend using this filter set to false, in conjunction with the acknowledge call, such that only un-acknowledged orders are returned.
    * @param {integer=} params.maxResults The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250 orders per page. Known issue: All List calls will return all Orders without limit regardless of the value of this field.
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string=} params.orderBy The ordering of the returned list. The only supported value are placedDate desc and placedDate asc for now, which returns orders sorted by placement date. "placedDate desc" stands for listing orders by placement date, from oldest to most recent. "placedDate asc" stands for listing orders by placement date, from most recent to oldest. In future releases we'll support other sorting criteria.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string=} params.placedDateEnd Obtains orders placed before this date (exclusively), in ISO 8601 format.
    * @param {string=} params.placedDateStart Obtains orders placed after this date (inclusively), in ISO 8601 format.
    * @param {string=} params.statuses Obtains orders that match any of the specified statuses. Multiple values can be specified with comma separation. Additionally, please note that active is a shortcut for pendingShipment and partiallyShipped, and completed is a shortcut for shipped , partiallyDelivered, delivered, partiallyReturned, returned, and canceled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(params: ParamsResourceOrdersList, callback: BodyResponseCallback[SchemaOrdersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: BodyResponseCallback[SchemaOrdersListResponse],
    callback: BodyResponseCallback[SchemaOrdersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrdersList, options: MethodOptions): GaxiosPromise[SchemaOrdersListResponse] = js.native
  def list(
    params: ParamsResourceOrdersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersListResponse]
  ): Unit = js.native
  /**
    * content.orders.rejectreturnlineitem
    * @desc Rejects return on an line item.
    * @alias content.orders.rejectreturnlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersRejectReturnLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rejectreturnlineitem(): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]): Unit = js.native
  def rejectreturnlineitem(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(params: ParamsResourceOrdersRejectreturnlineitem): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    options: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse],
    callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  def rejectreturnlineitem(params: ParamsResourceOrdersRejectreturnlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(
    params: ParamsResourceOrdersRejectreturnlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersRejectReturnLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.returnrefundlineitem
    * @desc Returns and refunds a line item. Note that this method can only be
    * called on fully shipped orders.
    * @alias content.orders.returnrefundlineitem
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersReturnRefundLineItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def returnrefundlineitem(): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]): Unit = js.native
  def returnrefundlineitem(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(params: ParamsResourceOrdersReturnrefundlineitem): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    options: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse],
    callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  def returnrefundlineitem(params: ParamsResourceOrdersReturnrefundlineitem, options: MethodOptions): GaxiosPromise[SchemaOrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(
    params: ParamsResourceOrdersReturnrefundlineitem,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersReturnRefundLineItemResponse]
  ): Unit = js.native
  /**
    * content.orders.setlineitemmetadata
    * @desc Sets (or overrides if it already exists) merchant provided
    * annotations in the form of key-value pairs. A common use case would be to
    * supply us with additional structured information about a line item that
    * cannot be provided via other methods. Submitted key-value pairs can be
    * retrieved as part of the orders resource.
    * @alias content.orders.setlineitemmetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersSetLineItemMetadataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setlineitemmetadata(): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]): Unit = js.native
  def setlineitemmetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(params: ParamsResourceOrdersSetlineitemmetadata): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    options: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse],
    callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  def setlineitemmetadata(params: ParamsResourceOrdersSetlineitemmetadata, options: MethodOptions): GaxiosPromise[SchemaOrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(
    params: ParamsResourceOrdersSetlineitemmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersSetLineItemMetadataResponse]
  ): Unit = js.native
  /**
    * content.orders.shiplineitems
    * @desc Marks line item(s) as shipped.
    * @alias content.orders.shiplineitems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersShipLineItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def shiplineitems(): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]): Unit = js.native
  def shiplineitems(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(params: ParamsResourceOrdersShiplineitems): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]
  ): Unit = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    options: BodyResponseCallback[SchemaOrdersShipLineItemsResponse],
    callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]
  ): Unit = js.native
  def shiplineitems(params: ParamsResourceOrdersShiplineitems, options: MethodOptions): GaxiosPromise[SchemaOrdersShipLineItemsResponse] = js.native
  def shiplineitems(
    params: ParamsResourceOrdersShiplineitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersShipLineItemsResponse]
  ): Unit = js.native
  /**
    * content.orders.updatelineitemshippingdetails
    * @desc Updates ship by and delivery by dates for a line item.
    * @alias content.orders.updatelineitemshippingdetails
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersUpdateLineItemShippingDetailsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatelineitemshippingdetails(): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]): Unit = js.native
  def updatelineitemshippingdetails(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(params: ParamsResourceOrdersUpdatelineitemshippingdetails): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    options: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse],
    callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  def updatelineitemshippingdetails(params: ParamsResourceOrdersUpdatelineitemshippingdetails, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(
    params: ParamsResourceOrdersUpdatelineitemshippingdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersUpdateLineItemShippingDetailsResponse]
  ): Unit = js.native
  /**
    * content.orders.updatemerchantorderid
    * @desc Updates the merchant order ID for a given order.
    * @alias content.orders.updatemerchantorderid
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersUpdateMerchantOrderIdRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatemerchantorderid(): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]): Unit = js.native
  def updatemerchantorderid(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(params: ParamsResourceOrdersUpdatemerchantorderid): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    options: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse],
    callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  def updatemerchantorderid(params: ParamsResourceOrdersUpdatemerchantorderid, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(
    params: ParamsResourceOrdersUpdatemerchantorderid,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersUpdateMerchantOrderIdResponse]
  ): Unit = js.native
  /**
    * content.orders.updateshipment
    * @desc Updates a shipment's status, carrier, and/or tracking ID.
    * @alias content.orders.updateshipment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrdersUpdateShipmentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateshipment(): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]): Unit = js.native
  def updateshipment(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(params: ParamsResourceOrdersUpdateshipment): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]
  ): Unit = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    options: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse],
    callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]
  ): Unit = js.native
  def updateshipment(params: ParamsResourceOrdersUpdateshipment, options: MethodOptions): GaxiosPromise[SchemaOrdersUpdateShipmentResponse] = js.native
  def updateshipment(
    params: ParamsResourceOrdersUpdateshipment,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrdersUpdateShipmentResponse]
  ): Unit = js.native
}

