package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderTrackingSignal extends StObject {
  
  /** The shipping fee of the order; this value should be set to zero in the case of free shipping. */
  var customerShippingFee: js.UndefOr[PriceAmount] = js.undefined
  
  /** Required. The delivery postal code, as a continuous string without spaces or dashes, e.g. "95016". */
  var deliveryPostalCode: js.UndefOr[String] = js.undefined
  
  /** Required. The [CLDR territory code] (http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) for the shipping destination. */
  var deliveryRegionCode: js.UndefOr[String] = js.undefined
  
  /** Information about line items in the order. */
  var lineItems: js.UndefOr[js.Array[OrderTrackingSignalLineItemDetails]] = js.undefined
  
  /**
    * The Google merchant ID of this order tracking signal. This value is optional. If left unset, the caller's merchant ID is used. You must request access in order to provide data on
    * behalf of another merchant. For more information, see [Submitting Order Tracking Signals](/shopping-content/guides/order-tracking-signals).
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** Required. The time when the order was created on the merchant side. Include the year and timezone string, if available. */
  var orderCreatedTime: js.UndefOr[DateTime] = js.undefined
  
  /** Required. The ID of the order on the merchant side. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** Output only. The ID that uniquely identifies this order tracking signal. */
  var orderTrackingSignalId: js.UndefOr[String] = js.undefined
  
  /** The mapping of the line items to the shipment information. */
  var shipmentLineItemMapping: js.UndefOr[js.Array[OrderTrackingSignalShipmentLineItemMapping]] = js.undefined
  
  /** The shipping information for the order. */
  var shippingInfo: js.UndefOr[js.Array[OrderTrackingSignalShippingInfo]] = js.undefined
}
object OrderTrackingSignal {
  
  @scala.inline
  def apply(): OrderTrackingSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignal]
  }
  
  @scala.inline
  implicit class OrderTrackingSignalMutableBuilder[Self <: OrderTrackingSignal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerShippingFee(value: PriceAmount): Self = StObject.set(x, "customerShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerShippingFeeUndefined: Self = StObject.set(x, "customerShippingFee", js.undefined)
    
    @scala.inline
    def setDeliveryPostalCode(value: String): Self = StObject.set(x, "deliveryPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPostalCodeUndefined: Self = StObject.set(x, "deliveryPostalCode", js.undefined)
    
    @scala.inline
    def setDeliveryRegionCode(value: String): Self = StObject.set(x, "deliveryRegionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryRegionCodeUndefined: Self = StObject.set(x, "deliveryRegionCode", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[OrderTrackingSignalLineItemDetails]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: OrderTrackingSignalLineItemDetails*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setOrderCreatedTime(value: DateTime): Self = StObject.set(x, "orderCreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderCreatedTimeUndefined: Self = StObject.set(x, "orderCreatedTime", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setOrderTrackingSignalId(value: String): Self = StObject.set(x, "orderTrackingSignalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderTrackingSignalIdUndefined: Self = StObject.set(x, "orderTrackingSignalId", js.undefined)
    
    @scala.inline
    def setShipmentLineItemMapping(value: js.Array[OrderTrackingSignalShipmentLineItemMapping]): Self = StObject.set(x, "shipmentLineItemMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentLineItemMappingUndefined: Self = StObject.set(x, "shipmentLineItemMapping", js.undefined)
    
    @scala.inline
    def setShipmentLineItemMappingVarargs(value: OrderTrackingSignalShipmentLineItemMapping*): Self = StObject.set(x, "shipmentLineItemMapping", js.Array(value :_*))
    
    @scala.inline
    def setShippingInfo(value: js.Array[OrderTrackingSignalShippingInfo]): Self = StObject.set(x, "shippingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingInfoUndefined: Self = StObject.set(x, "shippingInfo", js.undefined)
    
    @scala.inline
    def setShippingInfoVarargs(value: OrderTrackingSignalShippingInfo*): Self = StObject.set(x, "shippingInfo", js.Array(value :_*))
  }
}
