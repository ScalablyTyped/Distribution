package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typings.maximMazurokGapiClientContent.anon.AccesstokenAltCallbackFields
import typings.maximMazurokGapiClientContent.anon.AltCallbackFieldsKey
import typings.maximMazurokGapiClientContent.anon.CallbackFieldsKeyMerchantId
import typings.maximMazurokGapiClientContent.anon.FieldsKeyMerchantIdOauthtoken
import typings.maximMazurokGapiClientContent.anon.KeyMerchantIdOauthtoken
import typings.maximMazurokGapiClientContent.anon.KeyMerchantIdOauthtokenOrderId
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenOrderId
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenOrderIdPrettyPrint
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenPrettyPrint
import typings.maximMazurokGapiClientContent.anon.MerchantOrderId
import typings.maximMazurokGapiClientContent.anon.OauthtokenOrderId
import typings.maximMazurokGapiClientContent.anon.OauthtokenOrderIdPrettyPrint
import typings.maximMazurokGapiClientContent.anon.OauthtokenOrderIdPrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.OrderBy
import typings.maximMazurokGapiClientContent.anon.OrderIdPrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.OrderIdPrettyPrintQuotaUserResource
import typings.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUserResource
import typings.maximMazurokGapiClientContent.anon.QuotaUserResourceUploadType
import typings.maximMazurokGapiClientContent.anon.ResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientContent.anon.TemplateName
import typings.maximMazurokGapiClientContent.anon.UploadTypeUploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersResource extends StObject {
  
  /** Marks an order as acknowledged. */
  def acknowledge(request: KeyMerchantIdOauthtoken): Request[OrdersAcknowledgeResponse] = js.native
  def acknowledge(request: OauthtokenOrderId, body: OrdersAcknowledgeRequest): Request[OrdersAcknowledgeResponse] = js.native
  
  /** Sandbox only. Moves a test order from state "`inProgress`" to state "`pendingShipment`". */
  def advancetestorder(): Request[OrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(request: OauthtokenOrderId): Request[OrdersAdvanceTestOrderResponse] = js.native
  
  /** Cancels all line items in an order, making a full refund. */
  def cancel(request: MerchantIdOauthtokenOrderId): Request[OrdersCancelResponse] = js.native
  def cancel(request: OauthtokenOrderId, body: OrdersCancelRequest): Request[OrdersCancelResponse] = js.native
  
  /** Cancels a line item, making a full refund. */
  def cancellineitem(request: OauthtokenOrderIdPrettyPrint): Request[OrdersCancelLineItemResponse] = js.native
  def cancellineitem(request: OauthtokenOrderId, body: OrdersCancelLineItemRequest): Request[OrdersCancelLineItemResponse] = js.native
  
  def canceltestorderbycustomer(request: OauthtokenOrderId, body: OrdersCancelTestOrderByCustomerRequest): Request[OrdersCancelTestOrderByCustomerResponse] = js.native
  /** Sandbox only. Cancels a test order for customer-initiated cancellation. */
  def canceltestorderbycustomer(request: OrderIdPrettyPrintQuotaUser): Request[OrdersCancelTestOrderByCustomerResponse] = js.native
  
  def captureOrder(request: OauthtokenOrderId, body: CaptureOrderRequest): Request[CaptureOrderResponse] = js.native
  /**
    * Capture funds from the customer for the current order total. This method should be called after the merchant verifies that they are able and ready to start shipping the order. This
    * method blocks until a response is received from the payment processsor. If this method succeeds, the merchant is guaranteed to receive funds for the order after shipment. If the
    * request fails, it can be retried or the order may be cancelled. This method cannot be called after the entire order is already shipped. A rejected error code is returned when the
    * payment service provider has declined the charge. This indicates a problem between the PSP and either the merchant's or customer's account. Sometimes this error will be resolved by
    * the customer. We recommend retrying these errors once per day or cancelling the order with reason `failedToCaptureFunds` if the items cannot be held.
    */
  def captureOrder(request: PrettyPrintQuotaUserResource): Request[CaptureOrderResponse] = js.native
  
  def createtestorder(request: AccesstokenAlt, body: OrdersCreateTestOrderRequest): Request[OrdersCreateTestOrderResponse] = js.native
  /** Sandbox only. Creates a test order. */
  def createtestorder(request: MerchantIdOauthtokenPrettyPrint): Request[OrdersCreateTestOrderResponse] = js.native
  
  def createtestreturn(request: OauthtokenOrderId, body: OrdersCreateTestReturnRequest): Request[OrdersCreateTestReturnResponse] = js.native
  /** Sandbox only. Creates a test return. */
  def createtestreturn(request: QuotaUserResourceUploadType): Request[OrdersCreateTestReturnResponse] = js.native
  
  /** Retrieves an order from your Merchant Center account. */
  def get(): Request[Order] = js.native
  def get(request: OauthtokenOrderId): Request[Order] = js.native
  
  /** Retrieves an order using merchant order ID. */
  def getbymerchantorderid(): Request[OrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(request: MerchantOrderId): Request[OrdersGetByMerchantOrderIdResponse] = js.native
  
  /** Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. */
  def gettestordertemplate(): Request[OrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(request: TemplateName): Request[OrdersGetTestOrderTemplateResponse] = js.native
  
  def instorerefundlineitem(request: OauthtokenOrderId, body: OrdersInStoreRefundLineItemRequest): Request[OrdersInStoreRefundLineItemResponse] = js.native
  /**
    * Deprecated. Notifies that item return and refund was handled directly by merchant outside of Google payments processing (for example, cash refund done in store). Note: We recommend
    * calling the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between
    * merchant and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first
    * refunding through Google then through an in-store return.
    */
  def instorerefundlineitem(request: ResourceUploadTypeUploadprotocol): Request[OrdersInStoreRefundLineItemResponse] = js.native
  
  /** Lists the orders in your Merchant Center account. */
  def list(): Request[OrdersListResponse] = js.native
  def list(request: OrderBy): Request[OrdersListResponse] = js.native
  
  def refunditem(request: OauthtokenOrderId, body: OrdersRefundItemRequest): Request[OrdersRefundItemResponse] = js.native
  /** Issues a partial or total refund for items and shipment. */
  def refunditem(request: UploadTypeUploadprotocolXgafv): Request[OrdersRefundItemResponse] = js.native
  
  /** Issues a partial or total refund for an order. */
  def refundorder(request: AccesstokenAltCallbackFields): Request[OrdersRefundOrderResponse] = js.native
  def refundorder(request: OauthtokenOrderId, body: OrdersRefundOrderRequest): Request[OrdersRefundOrderResponse] = js.native
  
  /** Rejects return on an line item. */
  def rejectreturnlineitem(request: AltCallbackFieldsKey): Request[OrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(request: OauthtokenOrderId, body: OrdersRejectReturnLineItemRequest): Request[OrdersRejectReturnLineItemResponse] = js.native
  
  /**
    * Returns and refunds a line item. Note that this method can only be called on fully shipped orders. The Orderreturns API is the preferred way to handle returns after you receive a
    * return from a customer. You can use Orderreturns.list or Orderreturns.get to search for the return, and then use Orderreturns.processreturn to issue the refund. If the return cannot
    * be found, then we recommend using this API to issue a refund.
    */
  def returnrefundlineitem(request: CallbackFieldsKeyMerchantId): Request[OrdersReturnRefundLineItemResponse] = js.native
  def returnrefundlineitem(request: OauthtokenOrderId, body: OrdersReturnRefundLineItemRequest): Request[OrdersReturnRefundLineItemResponse] = js.native
  
  /**
    * Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information
    * about a line item that cannot be provided through other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
    */
  def setlineitemmetadata(request: FieldsKeyMerchantIdOauthtoken): Request[OrdersSetLineItemMetadataResponse] = js.native
  def setlineitemmetadata(request: OauthtokenOrderId, body: OrdersSetLineItemMetadataRequest): Request[OrdersSetLineItemMetadataResponse] = js.native
  
  /** Marks line item(s) as shipped. */
  def shiplineitems(request: KeyMerchantIdOauthtokenOrderId): Request[OrdersShipLineItemsResponse] = js.native
  def shiplineitems(request: OauthtokenOrderId, body: OrdersShipLineItemsRequest): Request[OrdersShipLineItemsResponse] = js.native
  
  /** Updates ship by and delivery by dates for a line item. */
  def updatelineitemshippingdetails(request: MerchantIdOauthtokenOrderIdPrettyPrint): Request[OrdersUpdateLineItemShippingDetailsResponse] = js.native
  def updatelineitemshippingdetails(request: OauthtokenOrderId, body: OrdersUpdateLineItemShippingDetailsRequest): Request[OrdersUpdateLineItemShippingDetailsResponse] = js.native
  
  /** Updates the merchant order ID for a given order. */
  def updatemerchantorderid(request: OauthtokenOrderIdPrettyPrintQuotaUser): Request[OrdersUpdateMerchantOrderIdResponse] = js.native
  def updatemerchantorderid(request: OauthtokenOrderId, body: OrdersUpdateMerchantOrderIdRequest): Request[OrdersUpdateMerchantOrderIdResponse] = js.native
  
  def updateshipment(request: OauthtokenOrderId, body: OrdersUpdateShipmentRequest): Request[OrdersUpdateShipmentResponse] = js.native
  /** Updates a shipment's status, carrier, and/or tracking ID. */
  def updateshipment(request: OrderIdPrettyPrintQuotaUserResource): Request[OrdersUpdateShipmentResponse] = js.native
}
