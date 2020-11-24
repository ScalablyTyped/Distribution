package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends js.Object {
  
  /** Whether the order was acknowledged. */
  var acknowledged: js.UndefOr[Boolean] = js.native
  
  /** List of key-value pairs that are attached to a given order. */
  var annotations: js.UndefOr[js.Array[OrderOrderAnnotation]] = js.native
  
  /** The billing address. */
  var billingAddress: js.UndefOr[OrderAddress] = js.native
  
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[OrderCustomer] = js.native
  
  /** Delivery details for shipments of type `delivery`. */
  var deliveryDetails: js.UndefOr[OrderDeliveryDetails] = js.native
  
  /** The REST ID of the order. Globally unique. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#order`" */
  var kind: js.UndefOr[String] = js.native
  
  /** Line items that are ordered. */
  var lineItems: js.UndefOr[js.Array[OrderLineItem]] = js.native
  
  var merchantId: js.UndefOr[String] = js.native
  
  /** Merchant-provided ID of the order. */
  var merchantOrderId: js.UndefOr[String] = js.native
  
  /** The net amount for the order (price part). For example, if an order was originally for $100 and a refund was issued for $20, the net amount will be $80. */
  var netPriceAmount: js.UndefOr[Price] = js.native
  
  /**
    * The net amount for the order (tax part). Note that in certain cases due to taxable base adjustment `netTaxAmount` might not match to a sum of tax field across all lineItems and
    * refunds.
    */
  var netTaxAmount: js.UndefOr[Price] = js.native
  
  /** The status of the payment. Acceptable values are: - "`paymentCaptured`" - "`paymentRejected`" - "`paymentSecured`" - "`pendingAuthorization`" */
  var paymentStatus: js.UndefOr[String] = js.native
  
  /** Pickup details for shipments of type `pickup`. */
  var pickupDetails: js.UndefOr[OrderPickupDetails] = js.native
  
  /** The date when the order was placed, in ISO 8601 format. */
  var placedDate: js.UndefOr[String] = js.native
  
  /**
    * Promotions associated with the order. To determine which promotions apply to which products, check the `Promotions[].appliedItems[].lineItemId` field against the `LineItems[].id`
    * field for each promotion. If a promotion is applied to more than 1 offerId, divide the discount value by the number of affected offers to determine how much discount to apply to
    * each offerId. Examples: 1. To calculate price paid by the customer for a single line item including the discount: For each promotion, subtract the
    * `LineItems[].adjustments[].priceAdjustment.value` amount from the `LineItems[].Price.value`. 2. To calculate price paid by the customer for a single line item including the discount
    * in case of multiple quantity: For each promotion, divide the `LineItems[].adjustments[].priceAdjustment.value` by the quantity of products then subtract the resulting value from the
    * `LineItems[].Product.Price.value` for each quantity item. Only 1 promotion can be applied to an offerId in a given order. To refund an item which had a promotion applied to it, make
    * sure to refund the amount after first subtracting the promotion discount from the item price. More details about the program are here.
    */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.native
  
  /** Refunds for the order. */
  var refunds: js.UndefOr[js.Array[OrderRefund]] = js.native
  
  /** Shipments of the order. */
  var shipments: js.UndefOr[js.Array[OrderShipment]] = js.native
  
  /** The total cost of shipping for all items. */
  var shippingCost: js.UndefOr[Price] = js.native
  
  /** The tax for the total shipping cost. */
  var shippingCostTax: js.UndefOr[Price] = js.native
  
  /**
    * The status of the order. Acceptable values are: - "`canceled`" - "`delivered`" - "`inProgress`" - "`partiallyDelivered`" - "`partiallyReturned`" - "`partiallyShipped`" -
    * "`pendingShipment`" - "`returned`" - "`shipped`"
    */
  var status: js.UndefOr[String] = js.native
  
  /** The party responsible for collecting and remitting taxes. Acceptable values are: - "`marketplaceFacilitator`" - "`merchant`" */
  var taxCollector: js.UndefOr[String] = js.native
}
object Order {
  
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    
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
    def setAcknowledged(value: Boolean): Self = this.set("acknowledged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledged: Self = this.set("acknowledged", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: OrderOrderAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[OrderOrderAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setBillingAddress(value: OrderAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    
    @scala.inline
    def setCustomer(value: OrderCustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setDeliveryDetails(value: OrderDeliveryDetails): Self = this.set("deliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryDetails: Self = this.set("deliveryDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: OrderLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[OrderLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    
    @scala.inline
    def setNetPriceAmount(value: Price): Self = this.set("netPriceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetPriceAmount: Self = this.set("netPriceAmount", js.undefined)
    
    @scala.inline
    def setNetTaxAmount(value: Price): Self = this.set("netTaxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetTaxAmount: Self = this.set("netTaxAmount", js.undefined)
    
    @scala.inline
    def setPaymentStatus(value: String): Self = this.set("paymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentStatus: Self = this.set("paymentStatus", js.undefined)
    
    @scala.inline
    def setPickupDetails(value: OrderPickupDetails): Self = this.set("pickupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupDetails: Self = this.set("pickupDetails", js.undefined)
    
    @scala.inline
    def setPlacedDate(value: String): Self = this.set("placedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacedDate: Self = this.set("placedDate", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: OrderPromotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[OrderPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setRefundsVarargs(value: OrderRefund*): Self = this.set("refunds", js.Array(value :_*))
    
    @scala.inline
    def setRefunds(value: js.Array[OrderRefund]): Self = this.set("refunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefunds: Self = this.set("refunds", js.undefined)
    
    @scala.inline
    def setShipmentsVarargs(value: OrderShipment*): Self = this.set("shipments", js.Array(value :_*))
    
    @scala.inline
    def setShipments(value: js.Array[OrderShipment]): Self = this.set("shipments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipments: Self = this.set("shipments", js.undefined)
    
    @scala.inline
    def setShippingCost(value: Price): Self = this.set("shippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCost: Self = this.set("shippingCost", js.undefined)
    
    @scala.inline
    def setShippingCostTax(value: Price): Self = this.set("shippingCostTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCostTax: Self = this.set("shippingCostTax", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTaxCollector(value: String): Self = this.set("taxCollector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxCollector: Self = this.set("taxCollector", js.undefined)
  }
}
