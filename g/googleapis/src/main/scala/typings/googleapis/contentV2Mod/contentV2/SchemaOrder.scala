package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order. All methods require the order manager role.
  */
@js.native
trait SchemaOrder extends js.Object {
  
  /**
    * Whether the order was acknowledged.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated.
    */
  var channelType: js.UndefOr[String] = js.native
  
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaOrderCustomer] = js.native
  
  /**
    * The details for the delivery.
    */
  var deliveryDetails: js.UndefOr[SchemaOrderDeliveryDetails] = js.native
  
  /**
    * The REST ID of the order. Globally unique.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#order&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Line items that are ordered.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderLineItem]] = js.native
  
  var merchantId: js.UndefOr[String] = js.native
  
  /**
    * Merchant-provided ID of the order.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  
  /**
    * The net amount for the order. For example, if an order was originally for
    * a grand total of $100 and a refund was issued for $20, the net amount
    * will be $80.
    */
  var netAmount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The details of the payment method.
    */
  var paymentMethod: js.UndefOr[SchemaOrderPaymentMethod] = js.native
  
  /**
    * The status of the payment.
    */
  var paymentStatus: js.UndefOr[String] = js.native
  
  /**
    * The date when the order was placed, in ISO 8601 format.
    */
  var placedDate: js.UndefOr[String] = js.native
  
  /**
    * The details of the merchant provided promotions applied to the order.
    * More details about the program are here.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderLegacyPromotion]] = js.native
  
  /**
    * Refunds for the order.
    */
  var refunds: js.UndefOr[js.Array[SchemaOrderRefund]] = js.native
  
  /**
    * Shipments of the order.
    */
  var shipments: js.UndefOr[js.Array[SchemaOrderShipment]] = js.native
  
  /**
    * The total cost of shipping for all items.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The tax for the total shipping cost.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Deprecated. Shipping details are provided with line items instead.
    */
  var shippingOption: js.UndefOr[String] = js.native
  
  /**
    * The status of the order.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The party responsible for collecting and remitting taxes.
    */
  var taxCollector: js.UndefOr[String] = js.native
}
object SchemaOrder {
  
  @scala.inline
  def apply(): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrder]
  }
  
  @scala.inline
  implicit class SchemaOrderOps[Self <: SchemaOrder] (val x: Self) extends AnyVal {
    
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
    def setChannelType(value: String): Self = this.set("channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("channelType", js.undefined)
    
    @scala.inline
    def setCustomer(value: SchemaOrderCustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setDeliveryDetails(value: SchemaOrderDeliveryDetails): Self = this.set("deliveryDetails", value.asInstanceOf[js.Any])
    
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
    def setLineItemsVarargs(value: SchemaOrderLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[SchemaOrderLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
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
    def setNetAmount(value: SchemaPrice): Self = this.set("netAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetAmount: Self = this.set("netAmount", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: SchemaOrderPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setPaymentStatus(value: String): Self = this.set("paymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentStatus: Self = this.set("paymentStatus", js.undefined)
    
    @scala.inline
    def setPlacedDate(value: String): Self = this.set("placedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacedDate: Self = this.set("placedDate", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: SchemaOrderLegacyPromotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[SchemaOrderLegacyPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setRefundsVarargs(value: SchemaOrderRefund*): Self = this.set("refunds", js.Array(value :_*))
    
    @scala.inline
    def setRefunds(value: js.Array[SchemaOrderRefund]): Self = this.set("refunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefunds: Self = this.set("refunds", js.undefined)
    
    @scala.inline
    def setShipmentsVarargs(value: SchemaOrderShipment*): Self = this.set("shipments", js.Array(value :_*))
    
    @scala.inline
    def setShipments(value: js.Array[SchemaOrderShipment]): Self = this.set("shipments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipments: Self = this.set("shipments", js.undefined)
    
    @scala.inline
    def setShippingCost(value: SchemaPrice): Self = this.set("shippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCost: Self = this.set("shippingCost", js.undefined)
    
    @scala.inline
    def setShippingCostTax(value: SchemaPrice): Self = this.set("shippingCostTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCostTax: Self = this.set("shippingCostTax", js.undefined)
    
    @scala.inline
    def setShippingOption(value: String): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOption: Self = this.set("shippingOption", js.undefined)
    
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
