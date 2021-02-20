package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order. All methods require the order manager role.
  */
@js.native
trait SchemaOrder extends StObject {
  
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
  implicit class SchemaOrderMutableBuilder[Self <: SchemaOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgedUndefined: Self = StObject.set(x, "acknowledged", js.undefined)
    
    @scala.inline
    def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    @scala.inline
    def setCustomer(value: SchemaOrderCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDeliveryDetails(value: SchemaOrderDeliveryDetails): Self = StObject.set(x, "deliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryDetailsUndefined: Self = StObject.set(x, "deliveryDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[SchemaOrderLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: SchemaOrderLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setNetAmount(value: SchemaPrice): Self = StObject.set(x, "netAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetAmountUndefined: Self = StObject.set(x, "netAmount", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: SchemaOrderPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setPaymentStatus(value: String): Self = StObject.set(x, "paymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentStatusUndefined: Self = StObject.set(x, "paymentStatus", js.undefined)
    
    @scala.inline
    def setPlacedDate(value: String): Self = StObject.set(x, "placedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacedDateUndefined: Self = StObject.set(x, "placedDate", js.undefined)
    
    @scala.inline
    def setPromotions(value: js.Array[SchemaOrderLegacyPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: SchemaOrderLegacyPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
    @scala.inline
    def setRefunds(value: js.Array[SchemaOrderRefund]): Self = StObject.set(x, "refunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundsUndefined: Self = StObject.set(x, "refunds", js.undefined)
    
    @scala.inline
    def setRefundsVarargs(value: SchemaOrderRefund*): Self = StObject.set(x, "refunds", js.Array(value :_*))
    
    @scala.inline
    def setShipments(value: js.Array[SchemaOrderShipment]): Self = StObject.set(x, "shipments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentsUndefined: Self = StObject.set(x, "shipments", js.undefined)
    
    @scala.inline
    def setShipmentsVarargs(value: SchemaOrderShipment*): Self = StObject.set(x, "shipments", js.Array(value :_*))
    
    @scala.inline
    def setShippingCost(value: SchemaPrice): Self = StObject.set(x, "shippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingCostTax(value: SchemaPrice): Self = StObject.set(x, "shippingCostTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingCostTaxUndefined: Self = StObject.set(x, "shippingCostTax", js.undefined)
    
    @scala.inline
    def setShippingCostUndefined: Self = StObject.set(x, "shippingCost", js.undefined)
    
    @scala.inline
    def setShippingOption(value: String): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionUndefined: Self = StObject.set(x, "shippingOption", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTaxCollector(value: String): Self = StObject.set(x, "taxCollector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxCollectorUndefined: Self = StObject.set(x, "taxCollector", js.undefined)
  }
}
