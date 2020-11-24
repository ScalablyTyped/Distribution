package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientContent.anon.AccesstokenAltCallbackFields
import typings.maximMazurokGapiClientContent.anon.AltCallbackFields
import typings.maximMazurokGapiClientContent.anon.CallbackFieldsKey
import typings.maximMazurokGapiClientContent.anon.FieldsKeyMerchantId
import typings.maximMazurokGapiClientContent.anon.KeyMerchantIdOauthtoken
import typings.maximMazurokGapiClientContent.anon.MerchantIdOauthtokenOrderId
import typings.maximMazurokGapiClientContent.anon.MerchantOrderId
import typings.maximMazurokGapiClientContent.anon.OauthtokenOrderId
import typings.maximMazurokGapiClientContent.anon.OauthtokenOrderIdPrettyPrint
import typings.maximMazurokGapiClientContent.anon.OrderBy
import typings.maximMazurokGapiClientContent.anon.OrderIdPrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUserResource
import typings.maximMazurokGapiClientContent.anon.QuotaUserResourceUploadType
import typings.maximMazurokGapiClientContent.anon.ResourceUploadType
import typings.maximMazurokGapiClientContent.anon.ResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientContent.anon.TemplateName
import typings.maximMazurokGapiClientContent.anon.UploadType
import typings.maximMazurokGapiClientContent.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientContent.anon.UploadTypeUploadprotocolXgafv
import typings.maximMazurokGapiClientContent.anon.UploadprotocolXgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersResource extends js.Object {
  
  def acknowledge(request: OauthtokenOrderId, body: OrdersAcknowledgeRequest): Request[OrdersAcknowledgeResponse] = js.native
  /** Marks an order as acknowledged. */
  def acknowledge(request: ResourceUploadType): Request[OrdersAcknowledgeResponse] = js.native
  
  /** Sandbox only. Moves a test order from state "`inProgress`" to state "`pendingShipment`". */
  def advancetestorder(): Request[OrdersAdvanceTestOrderResponse] = js.native
  def advancetestorder(request: OauthtokenOrderId): Request[OrdersAdvanceTestOrderResponse] = js.native
  
  def cancel(request: OauthtokenOrderId, body: OrdersCancelRequest): Request[OrdersCancelResponse] = js.native
  /** Cancels all line items in an order, making a full refund. */
  def cancel(request: UploadTypeUploadprotocol): Request[OrdersCancelResponse] = js.native
  
  def cancellineitem(request: OauthtokenOrderId, body: OrdersCancelLineItemRequest): Request[OrdersCancelLineItemResponse] = js.native
  /** Cancels a line item, making a full refund. */
  def cancellineitem(request: UploadprotocolXgafv): Request[OrdersCancelLineItemResponse] = js.native
  
  /** Sandbox only. Cancels a test order for customer-initiated cancellation. */
  def canceltestorderbycustomer(request: AccesstokenAltCallback): Request[OrdersCancelTestOrderByCustomerResponse] = js.native
  def canceltestorderbycustomer(request: OauthtokenOrderId, body: OrdersCancelTestOrderByCustomerRequest): Request[OrdersCancelTestOrderByCustomerResponse] = js.native
  
  /** Sandbox only. Creates a test order. */
  def createtestorder(request: AltCallbackFields): Request[OrdersCreateTestOrderResponse] = js.native
  def createtestorder(request: UploadType, body: OrdersCreateTestOrderRequest): Request[OrdersCreateTestOrderResponse] = js.native
  
  /** Sandbox only. Creates a test return. */
  def createtestreturn(request: CallbackFieldsKey): Request[OrdersCreateTestReturnResponse] = js.native
  def createtestreturn(request: OauthtokenOrderId, body: OrdersCreateTestReturnRequest): Request[OrdersCreateTestReturnResponse] = js.native
  
  /** Retrieves an order from your Merchant Center account. */
  def get(): Request[Order] = js.native
  def get(request: OauthtokenOrderId): Request[Order] = js.native
  
  /** Retrieves an order using merchant order ID. */
  def getbymerchantorderid(): Request[OrdersGetByMerchantOrderIdResponse] = js.native
  def getbymerchantorderid(request: MerchantOrderId): Request[OrdersGetByMerchantOrderIdResponse] = js.native
  
  /** Sandbox only. Retrieves an order template that can be used to quickly create a new order in sandbox. */
  def gettestordertemplate(): Request[OrdersGetTestOrderTemplateResponse] = js.native
  def gettestordertemplate(request: TemplateName): Request[OrdersGetTestOrderTemplateResponse] = js.native
  
  /**
    * Deprecated. Notifies that item return and refund was handled directly by merchant outside of Google payments processing (e.g. cash refund done in store). Note: We recommend calling
    * the returnrefundlineitem method to refund in-store returns. We will issue the refund directly to the customer. This helps to prevent possible differences arising between merchant
    * and Google transaction records. We also recommend having the point of sale system communicate with Google to ensure that customers do not receive a double refund by first refunding
    * via Google then via an in-store return.
    */
  def instorerefundlineitem(request: FieldsKeyMerchantId): Request[OrdersInStoreRefundLineItemResponse] = js.native
  def instorerefundlineitem(request: OauthtokenOrderId, body: OrdersInStoreRefundLineItemRequest): Request[OrdersInStoreRefundLineItemResponse] = js.native
  
  /** Lists the orders in your Merchant Center account. */
  def list(): Request[OrdersListResponse] = js.native
  def list(request: OrderBy): Request[OrdersListResponse] = js.native
  
  /** Issues a partial or total refund for items and shipment. */
  def refunditem(request: KeyMerchantIdOauthtoken): Request[OrdersRefundItemResponse] = js.native
  def refunditem(request: OauthtokenOrderId, body: OrdersRefundItemRequest): Request[OrdersRefundItemResponse] = js.native
  
  /** Issues a partial or total refund for an order. */
  def refundorder(request: MerchantIdOauthtokenOrderId): Request[OrdersRefundOrderResponse] = js.native
  def refundorder(request: OauthtokenOrderId, body: OrdersRefundOrderRequest): Request[OrdersRefundOrderResponse] = js.native
  
  /** Rejects return on an line item. */
  def rejectreturnlineitem(request: OauthtokenOrderIdPrettyPrint): Request[OrdersRejectReturnLineItemResponse] = js.native
  def rejectreturnlineitem(request: OauthtokenOrderId, body: OrdersRejectReturnLineItemRequest): Request[OrdersRejectReturnLineItemResponse] = js.native
  
  def returnrefundlineitem(request: OauthtokenOrderId, body: OrdersReturnRefundLineItemRequest): Request[OrdersReturnRefundLineItemResponse] = js.native
  /**
    * Returns and refunds a line item. Note that this method can only be called on fully shipped orders. Please also note that the Orderreturns API is the preferred way to handle returns
    * after you receive a return from a customer. You can use Orderreturns.list or Orderreturns.get to search for the return, and then use Orderreturns.processreturn to issue the refund.
    * If the return cannot be found, then we recommend using this API to issue a refund.
    */
  def returnrefundlineitem(request: OrderIdPrettyPrintQuotaUser): Request[OrdersReturnRefundLineItemResponse] = js.native
  
  def setlineitemmetadata(request: OauthtokenOrderId, body: OrdersSetLineItemMetadataRequest): Request[OrdersSetLineItemMetadataResponse] = js.native
  /**
    * Sets (or overrides if it already exists) merchant provided annotations in the form of key-value pairs. A common use case would be to supply us with additional structured information
    * about a line item that cannot be provided via other methods. Submitted key-value pairs can be retrieved as part of the orders resource.
    */
  def setlineitemmetadata(request: PrettyPrintQuotaUserResource): Request[OrdersSetLineItemMetadataResponse] = js.native
  
  def shiplineitems(request: OauthtokenOrderId, body: OrdersShipLineItemsRequest): Request[OrdersShipLineItemsResponse] = js.native
  /** Marks line item(s) as shipped. */
  def shiplineitems(request: QuotaUserResourceUploadType): Request[OrdersShipLineItemsResponse] = js.native
  
  def updatelineitemshippingdetails(request: OauthtokenOrderId, body: OrdersUpdateLineItemShippingDetailsRequest): Request[OrdersUpdateLineItemShippingDetailsResponse] = js.native
  /** Updates ship by and delivery by dates for a line item. */
  def updatelineitemshippingdetails(request: ResourceUploadTypeUploadprotocol): Request[OrdersUpdateLineItemShippingDetailsResponse] = js.native
  
  def updatemerchantorderid(request: OauthtokenOrderId, body: OrdersUpdateMerchantOrderIdRequest): Request[OrdersUpdateMerchantOrderIdResponse] = js.native
  /** Updates the merchant order ID for a given order. */
  def updatemerchantorderid(request: UploadTypeUploadprotocolXgafv): Request[OrdersUpdateMerchantOrderIdResponse] = js.native
  
  /** Updates a shipment's status, carrier, and/or tracking ID. */
  def updateshipment(request: AccesstokenAltCallbackFields): Request[OrdersUpdateShipmentResponse] = js.native
  def updateshipment(request: OauthtokenOrderId, body: OrdersUpdateShipmentRequest): Request[OrdersUpdateShipmentResponse] = js.native
}
