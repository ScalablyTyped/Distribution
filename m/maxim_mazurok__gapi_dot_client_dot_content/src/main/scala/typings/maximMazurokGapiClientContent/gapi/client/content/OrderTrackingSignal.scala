package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderTrackingSignal extends StObject {
  
  /** The shipping fee of the order; this value should be set to zero in the case of free shipping. */
  var customerShippingFee: js.UndefOr[PriceAmount] = js.undefined
  
  /** Required. The delivery postal code, as a continuous string without spaces or dashes, e.g. "95016". This field will be anonymized in returned OrderTrackingSignal creation response. */
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
  
  /** Required. The ID of the order on the merchant side. This field will be hashed in returned OrderTrackingSignal creation response. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** Output only. The ID that uniquely identifies this order tracking signal. */
  var orderTrackingSignalId: js.UndefOr[String] = js.undefined
  
  /** The mapping of the line items to the shipment information. */
  var shipmentLineItemMapping: js.UndefOr[js.Array[OrderTrackingSignalShipmentLineItemMapping]] = js.undefined
  
  /** The shipping information for the order. */
  var shippingInfo: js.UndefOr[js.Array[OrderTrackingSignalShippingInfo]] = js.undefined
}
object OrderTrackingSignal {
  
  inline def apply(): OrderTrackingSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignal]
  }
  
  extension [Self <: OrderTrackingSignal](x: Self) {
    
    inline def setCustomerShippingFee(value: PriceAmount): Self = StObject.set(x, "customerShippingFee", value.asInstanceOf[js.Any])
    
    inline def setCustomerShippingFeeUndefined: Self = StObject.set(x, "customerShippingFee", js.undefined)
    
    inline def setDeliveryPostalCode(value: String): Self = StObject.set(x, "deliveryPostalCode", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPostalCodeUndefined: Self = StObject.set(x, "deliveryPostalCode", js.undefined)
    
    inline def setDeliveryRegionCode(value: String): Self = StObject.set(x, "deliveryRegionCode", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRegionCodeUndefined: Self = StObject.set(x, "deliveryRegionCode", js.undefined)
    
    inline def setLineItems(value: js.Array[OrderTrackingSignalLineItemDetails]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: OrderTrackingSignalLineItemDetails*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setOrderCreatedTime(value: DateTime): Self = StObject.set(x, "orderCreatedTime", value.asInstanceOf[js.Any])
    
    inline def setOrderCreatedTimeUndefined: Self = StObject.set(x, "orderCreatedTime", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setOrderTrackingSignalId(value: String): Self = StObject.set(x, "orderTrackingSignalId", value.asInstanceOf[js.Any])
    
    inline def setOrderTrackingSignalIdUndefined: Self = StObject.set(x, "orderTrackingSignalId", js.undefined)
    
    inline def setShipmentLineItemMapping(value: js.Array[OrderTrackingSignalShipmentLineItemMapping]): Self = StObject.set(x, "shipmentLineItemMapping", value.asInstanceOf[js.Any])
    
    inline def setShipmentLineItemMappingUndefined: Self = StObject.set(x, "shipmentLineItemMapping", js.undefined)
    
    inline def setShipmentLineItemMappingVarargs(value: OrderTrackingSignalShipmentLineItemMapping*): Self = StObject.set(x, "shipmentLineItemMapping", js.Array(value*))
    
    inline def setShippingInfo(value: js.Array[OrderTrackingSignalShippingInfo]): Self = StObject.set(x, "shippingInfo", value.asInstanceOf[js.Any])
    
    inline def setShippingInfoUndefined: Self = StObject.set(x, "shippingInfo", js.undefined)
    
    inline def setShippingInfoVarargs(value: OrderTrackingSignalShippingInfo*): Self = StObject.set(x, "shippingInfo", js.Array(value*))
  }
}
