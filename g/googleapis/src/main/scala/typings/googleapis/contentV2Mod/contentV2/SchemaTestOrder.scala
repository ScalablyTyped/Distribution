package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrder extends StObject {
  
  /**
    * Required. The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaTestOrderCustomer] = js.undefined
  
  /**
    * Whether the orderinvoices service should support this order.
    */
  var enableOrderinvoices: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#testOrder`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Line items that are ordered. At least one line item must be provided.
    */
  var lineItems: js.UndefOr[js.Array[SchemaTestOrderLineItem]] = js.undefined
  
  /**
    * Restricted. Do not use.
    */
  var notificationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The details of the payment method.
    */
  var paymentMethod: js.UndefOr[SchemaTestOrderPaymentMethod] = js.undefined
  
  /**
    * Required. Identifier of one of the predefined delivery addresses for the delivery. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
    */
  var predefinedDeliveryAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier of one of the predefined pickup details. Required for orders containing line items with shipping type `pickup`. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
    */
  var predefinedPickupDetails: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Ignored if provided.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderLegacyPromotion]] = js.undefined
  
  /**
    * Required. The price of shipping for all items. Shipping tax is automatically calculated for orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from Merchant Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Deprecated. Ignored if provided.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Required. The requested shipping option. Acceptable values are: - "`economy`" - "`expedited`" - "`oneDay`" - "`sameDay`" - "`standard`" - "`twoDay`"
    */
  var shippingOption: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestOrder {
  
  inline def apply(): SchemaTestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrder]
  }
  
  extension [Self <: SchemaTestOrder](x: Self) {
    
    inline def setCustomer(value: SchemaTestOrderCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setEnableOrderinvoices(value: Boolean): Self = StObject.set(x, "enableOrderinvoices", value.asInstanceOf[js.Any])
    
    inline def setEnableOrderinvoicesNull: Self = StObject.set(x, "enableOrderinvoices", null)
    
    inline def setEnableOrderinvoicesUndefined: Self = StObject.set(x, "enableOrderinvoices", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLineItems(value: js.Array[SchemaTestOrderLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: SchemaTestOrderLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setNotificationMode(value: String): Self = StObject.set(x, "notificationMode", value.asInstanceOf[js.Any])
    
    inline def setNotificationModeNull: Self = StObject.set(x, "notificationMode", null)
    
    inline def setNotificationModeUndefined: Self = StObject.set(x, "notificationMode", js.undefined)
    
    inline def setPaymentMethod(value: SchemaTestOrderPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setPredefinedDeliveryAddress(value: String): Self = StObject.set(x, "predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setPredefinedDeliveryAddressNull: Self = StObject.set(x, "predefinedDeliveryAddress", null)
    
    inline def setPredefinedDeliveryAddressUndefined: Self = StObject.set(x, "predefinedDeliveryAddress", js.undefined)
    
    inline def setPredefinedPickupDetails(value: String): Self = StObject.set(x, "predefinedPickupDetails", value.asInstanceOf[js.Any])
    
    inline def setPredefinedPickupDetailsNull: Self = StObject.set(x, "predefinedPickupDetails", null)
    
    inline def setPredefinedPickupDetailsUndefined: Self = StObject.set(x, "predefinedPickupDetails", js.undefined)
    
    inline def setPromotions(value: js.Array[SchemaOrderLegacyPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: SchemaOrderLegacyPromotion*): Self = StObject.set(x, "promotions", js.Array(value*))
    
    inline def setShippingCost(value: SchemaPrice): Self = StObject.set(x, "shippingCost", value.asInstanceOf[js.Any])
    
    inline def setShippingCostTax(value: SchemaPrice): Self = StObject.set(x, "shippingCostTax", value.asInstanceOf[js.Any])
    
    inline def setShippingCostTaxUndefined: Self = StObject.set(x, "shippingCostTax", js.undefined)
    
    inline def setShippingCostUndefined: Self = StObject.set(x, "shippingCost", js.undefined)
    
    inline def setShippingOption(value: String): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionNull: Self = StObject.set(x, "shippingOption", null)
    
    inline def setShippingOptionUndefined: Self = StObject.set(x, "shippingOption", js.undefined)
  }
}
