package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  /** Whether the order was acknowledged. */
  var acknowledged: js.UndefOr[Boolean] = js.undefined
  
  /** List of key-value pairs that are attached to a given order. */
  var annotations: js.UndefOr[js.Array[OrderOrderAnnotation]] = js.undefined
  
  /** The billing address. */
  var billingAddress: js.UndefOr[OrderAddress] = js.undefined
  
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[OrderCustomer] = js.undefined
  
  /** Delivery details for shipments of type `delivery`. */
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.undefined
  
  /** The REST ID of the order. Globally unique. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#order`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Line items that are ordered. */
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.undefined
  
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** Merchant-provided ID of the order. */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  /** The net amount for the order (price part). For example, if an order was originally for $100 and a refund was issued for $20, the net amount will be $80. */
  var netPriceAmount: js.UndefOr[Price] = js.undefined
  
  /**
    * The net amount for the order (tax part). Note that in certain cases due to taxable base adjustment `netTaxAmount` might not match to a sum of tax field across all lineItems and
    * refunds.
    */
  var netTaxAmount: js.UndefOr[Price] = js.undefined
  
  /** The status of the payment. Acceptable values are: - "`paymentCaptured`" - "`paymentRejected`" - "`paymentSecured`" - "`pendingAuthorization`" */
  var paymentStatus: js.UndefOr[String] = js.undefined
  
  /** Pickup details for shipments of type `pickup`. */
  var pickupDetails: js.UndefOr[OrderPickupDetails] = js.undefined
  
  /** The date when the order was placed, in ISO 8601 format. */
  var placedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Promotions associated with the order. To determine which promotions apply to which products, check the `Promotions[].appliedItems[].lineItemId` field against the `LineItems[].id`
    * field for each promotion. If a promotion is applied to more than 1 offerId, divide the discount value by the number of affected offers to determine how much discount to apply to
    * each offerId. Examples: 1. To calculate price paid by the customer for a single line item including the discount: For each promotion, subtract the
    * `LineItems[].adjustments[].priceAdjustment.value` amount from the `LineItems[].Price.value`. 2. To calculate price paid by the customer for a single line item including the discount
    * in case of multiple quantity: For each promotion, divide the `LineItems[].adjustments[].priceAdjustment.value` by the quantity of products then subtract the resulting value from the
    * `LineItems[].Product.Price.value` for each quantity item. Only 1 promotion can be applied to an offerId in a given order. To refund an item which had a promotion applied to it, make
    * sure to refund the amount after first subtracting the promotion discount from the item price. More details about the program are here.
    */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.undefined
  
  /** Refunds for the order. */
  var refunds: js.UndefOr[js.Array[OrderRefund]] = js.undefined
  
  /** Shipments of the order. */
  var shipments: js.UndefOr[js.Array[OrderShipment]] = js.undefined
  
  /** The total cost of shipping for all items. */
  var shippingCost: js.UndefOr[Price] = js.undefined
  
  /** The tax for the total shipping cost. */
  var shippingCostTax: js.UndefOr[Price] = js.undefined
  
  /**
    * The status of the order. Acceptable values are: - "`canceled`" - "`delivered`" - "`inProgress`" - "`partiallyDelivered`" - "`partiallyReturned`" - "`partiallyShipped`" -
    * "`pendingShipment`" - "`returned`" - "`shipped`"
    */
  var status: js.UndefOr[String] = js.undefined
  
  /** The party responsible for collecting and remitting taxes. Acceptable values are: - "`marketplaceFacilitator`" - "`merchant`" */
  var taxCollector: js.UndefOr[String] = js.undefined
}
object Order {
  
  inline def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedUndefined: Self = StObject.set(x, "acknowledged", js.undefined)
    
    inline def setAnnotations(value: js.Array[OrderOrderAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: OrderOrderAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    inline def setBillingAddress(value: OrderAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCustomer(value: OrderCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDeliveryDetails(value: OrderDeliveryDetails): Self = StObject.set(x, "deliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDetailsUndefined: Self = StObject.set(x, "deliveryDetails", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLineItems(value: js.Array[OrderLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: OrderLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    inline def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    inline def setNetPriceAmount(value: Price): Self = StObject.set(x, "netPriceAmount", value.asInstanceOf[js.Any])
    
    inline def setNetPriceAmountUndefined: Self = StObject.set(x, "netPriceAmount", js.undefined)
    
    inline def setNetTaxAmount(value: Price): Self = StObject.set(x, "netTaxAmount", value.asInstanceOf[js.Any])
    
    inline def setNetTaxAmountUndefined: Self = StObject.set(x, "netTaxAmount", js.undefined)
    
    inline def setPaymentStatus(value: String): Self = StObject.set(x, "paymentStatus", value.asInstanceOf[js.Any])
    
    inline def setPaymentStatusUndefined: Self = StObject.set(x, "paymentStatus", js.undefined)
    
    inline def setPickupDetails(value: OrderPickupDetails): Self = StObject.set(x, "pickupDetails", value.asInstanceOf[js.Any])
    
    inline def setPickupDetailsUndefined: Self = StObject.set(x, "pickupDetails", js.undefined)
    
    inline def setPlacedDate(value: String): Self = StObject.set(x, "placedDate", value.asInstanceOf[js.Any])
    
    inline def setPlacedDateUndefined: Self = StObject.set(x, "placedDate", js.undefined)
    
    inline def setPromotions(value: js.Array[OrderPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: OrderPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
    inline def setRefunds(value: js.Array[OrderRefund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    inline def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    inline def setRefundsVarargs(value: OrderRefund*): Self = StObject.set(x, "refunds", js.Array(value :_*))
    
    inline def setShipments(value: js.Array[OrderShipment]): Self = StObject.set(x, "shipments", value.asInstanceOf[js.Any])
    
    inline def setShipmentsUndefined: Self = StObject.set(x, "shipments", js.undefined)
    
    inline def setShipmentsVarargs(value: OrderShipment*): Self = StObject.set(x, "shipments", js.Array(value :_*))
    
    inline def setShippingCost(value: Price): Self = StObject.set(x, "shippingCost", value.asInstanceOf[js.Any])
    
    inline def setShippingCostTax(value: Price): Self = StObject.set(x, "shippingCostTax", value.asInstanceOf[js.Any])
    
    inline def setShippingCostTaxUndefined: Self = StObject.set(x, "shippingCostTax", js.undefined)
    
    inline def setShippingCostUndefined: Self = StObject.set(x, "shippingCost", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTaxCollector(value: String): Self = StObject.set(x, "taxCollector", value.asInstanceOf[js.Any])
    
    inline def setTaxCollectorUndefined: Self = StObject.set(x, "taxCollector", js.undefined)
  }
}
