package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderTrackingSignal extends js.Object {
  
  /** The shipping fee of the order; this value should be set to zero in the case of free shipping. */
  var customerShippingFee: js.UndefOr[PriceAmount] = js.native
  
  /** Required. The delivery postal code, as a continuous string without spaces or dashes, e.g. "95016". */
  var deliveryPostalCode: js.UndefOr[String] = js.native
  
  /** Required. The [CLDR territory code] (http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) for the shipping destination. */
  var deliveryRegionCode: js.UndefOr[String] = js.native
  
  /** Information about line items in the order. */
  var lineItems: js.UndefOr[js.Array[OrderTrackingSignalLineItemDetails]] = js.native
  
  /**
    * The Google merchant ID of this order tracking signal. This value is optional. If left unset, the caller's merchant ID is used. You must request access in order to provide data on
    * behalf of another merchant. For more information, see [Submitting Order Tracking Signals](/shopping-content/guides/order-tracking-signals).
    */
  var merchantId: js.UndefOr[String] = js.native
  
  /** Required. The time when the order was created on the merchant side. Include the year and timezone string, if available. */
  var orderCreatedTime: js.UndefOr[DateTime] = js.native
  
  /** Required. The ID of the order on the merchant side. */
  var orderId: js.UndefOr[String] = js.native
  
  /** Output only. The ID that uniquely identifies this order tracking signal. */
  var orderTrackingSignalId: js.UndefOr[String] = js.native
  
  /** The mapping of the line items to the shipment information. */
  var shipmentLineItemMapping: js.UndefOr[js.Array[OrderTrackingSignalShipmentLineItemMapping]] = js.native
  
  /** The shipping information for the order. */
  var shippingInfo: js.UndefOr[js.Array[OrderTrackingSignalShippingInfo]] = js.native
}
object OrderTrackingSignal {
  
  @scala.inline
  def apply(): OrderTrackingSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignal]
  }
  
  @scala.inline
  implicit class OrderTrackingSignalOps[Self <: OrderTrackingSignal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomerShippingFee(value: PriceAmount): Self = this.set("customerShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerShippingFee: Self = this.set("customerShippingFee", js.undefined)
    
    @scala.inline
    def setDeliveryPostalCode(value: String): Self = this.set("deliveryPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryPostalCode: Self = this.set("deliveryPostalCode", js.undefined)
    
    @scala.inline
    def setDeliveryRegionCode(value: String): Self = this.set("deliveryRegionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryRegionCode: Self = this.set("deliveryRegionCode", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: OrderTrackingSignalLineItemDetails*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[OrderTrackingSignalLineItemDetails]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setOrderCreatedTime(value: DateTime): Self = this.set("orderCreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderCreatedTime: Self = this.set("orderCreatedTime", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setOrderTrackingSignalId(value: String): Self = this.set("orderTrackingSignalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderTrackingSignalId: Self = this.set("orderTrackingSignalId", js.undefined)
    
    @scala.inline
    def setShipmentLineItemMappingVarargs(value: OrderTrackingSignalShipmentLineItemMapping*): Self = this.set("shipmentLineItemMapping", js.Array(value :_*))
    
    @scala.inline
    def setShipmentLineItemMapping(value: js.Array[OrderTrackingSignalShipmentLineItemMapping]): Self = this.set("shipmentLineItemMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentLineItemMapping: Self = this.set("shipmentLineItemMapping", js.undefined)
    
    @scala.inline
    def setShippingInfoVarargs(value: OrderTrackingSignalShippingInfo*): Self = this.set("shippingInfo", js.Array(value :_*))
    
    @scala.inline
    def setShippingInfo(value: js.Array[OrderTrackingSignalShippingInfo]): Self = this.set("shippingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingInfo: Self = this.set("shippingInfo", js.undefined)
  }
}
