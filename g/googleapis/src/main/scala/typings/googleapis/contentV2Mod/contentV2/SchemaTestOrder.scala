package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrder extends StObject {
  
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaTestOrderCustomer] = js.undefined
  
  /**
    * Whether the orderinvoices service should support this order.
    */
  var enableOrderinvoices: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#testOrder&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Line items that are ordered. At least one line item must be provided.
    */
  var lineItems: js.UndefOr[js.Array[SchemaTestOrderLineItem]] = js.undefined
  
  /**
    * Determines if test order must be pulled by merchant or pushed to merchant
    * via push integration.
    */
  var notificationMode: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the payment method.
    */
  var paymentMethod: js.UndefOr[SchemaTestOrderPaymentMethod] = js.undefined
  
  /**
    * Identifier of one of the predefined delivery addresses for the delivery.
    */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Ignored if provided.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderLegacyPromotion]] = js.undefined
  
  /**
    * The price of shipping for all items. Shipping tax is automatically
    * calculated for MFL orders. For non-MFL orders, tax settings from Merchant
    * Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Deprecated. Ignored if provided.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The requested shipping option.
    */
  var shippingOption: js.UndefOr[String] = js.undefined
}
object SchemaTestOrder {
  
  @scala.inline
  def apply(): SchemaTestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrder]
  }
  
  @scala.inline
  implicit class SchemaTestOrderMutableBuilder[Self <: SchemaTestOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: SchemaTestOrderCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setEnableOrderinvoices(value: Boolean): Self = StObject.set(x, "enableOrderinvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOrderinvoicesUndefined: Self = StObject.set(x, "enableOrderinvoices", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[SchemaTestOrderLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: SchemaTestOrderLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setNotificationMode(value: String): Self = StObject.set(x, "notificationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationModeUndefined: Self = StObject.set(x, "notificationMode", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: SchemaTestOrderPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setPredefinedDeliveryAddress(value: String): Self = StObject.set(x, "predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedDeliveryAddressUndefined: Self = StObject.set(x, "predefinedDeliveryAddress", js.undefined)
    
    @scala.inline
    def setPromotions(value: js.Array[SchemaOrderLegacyPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: SchemaOrderLegacyPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
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
  }
}
