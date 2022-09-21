package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrder extends StObject {
  
  /**
    * Overrides the predefined delivery details if provided.
    */
  var deliveryDetails: js.UndefOr[SchemaTestOrderDeliveryDetails] = js.undefined
  
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
    * Overrides the predefined pickup details if provided.
    */
  var pickupDetails: js.UndefOr[SchemaTestOrderPickupDetails] = js.undefined
  
  /**
    * Required. The billing address. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
    */
  var predefinedBillingAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Identifier of one of the predefined delivery addresses for the delivery. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
    */
  var predefinedDeliveryAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Email address of the customer. Acceptable values are: - "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" - "`penpog.pam.beesly@gmail.comding`"
    */
  var predefinedEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier of one of the predefined pickup details. Required for orders containing line items with shipping type `pickup`. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
    */
  var predefinedPickupDetails: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Promotions associated with the order.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderPromotion]] = js.undefined
  
  /**
    * Required. The price of shipping for all items. Shipping tax is automatically calculated for orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from Merchant Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.undefined
  
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
    
    inline def setDeliveryDetails(value: SchemaTestOrderDeliveryDetails): Self = StObject.set(x, "deliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDetailsUndefined: Self = StObject.set(x, "deliveryDetails", js.undefined)
    
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
    
    inline def setPickupDetails(value: SchemaTestOrderPickupDetails): Self = StObject.set(x, "pickupDetails", value.asInstanceOf[js.Any])
    
    inline def setPickupDetailsUndefined: Self = StObject.set(x, "pickupDetails", js.undefined)
    
    inline def setPredefinedBillingAddress(value: String): Self = StObject.set(x, "predefinedBillingAddress", value.asInstanceOf[js.Any])
    
    inline def setPredefinedBillingAddressNull: Self = StObject.set(x, "predefinedBillingAddress", null)
    
    inline def setPredefinedBillingAddressUndefined: Self = StObject.set(x, "predefinedBillingAddress", js.undefined)
    
    inline def setPredefinedDeliveryAddress(value: String): Self = StObject.set(x, "predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setPredefinedDeliveryAddressNull: Self = StObject.set(x, "predefinedDeliveryAddress", null)
    
    inline def setPredefinedDeliveryAddressUndefined: Self = StObject.set(x, "predefinedDeliveryAddress", js.undefined)
    
    inline def setPredefinedEmail(value: String): Self = StObject.set(x, "predefinedEmail", value.asInstanceOf[js.Any])
    
    inline def setPredefinedEmailNull: Self = StObject.set(x, "predefinedEmail", null)
    
    inline def setPredefinedEmailUndefined: Self = StObject.set(x, "predefinedEmail", js.undefined)
    
    inline def setPredefinedPickupDetails(value: String): Self = StObject.set(x, "predefinedPickupDetails", value.asInstanceOf[js.Any])
    
    inline def setPredefinedPickupDetailsNull: Self = StObject.set(x, "predefinedPickupDetails", null)
    
    inline def setPredefinedPickupDetailsUndefined: Self = StObject.set(x, "predefinedPickupDetails", js.undefined)
    
    inline def setPromotions(value: js.Array[SchemaOrderPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: SchemaOrderPromotion*): Self = StObject.set(x, "promotions", js.Array(value*))
    
    inline def setShippingCost(value: SchemaPrice): Self = StObject.set(x, "shippingCost", value.asInstanceOf[js.Any])
    
    inline def setShippingCostUndefined: Self = StObject.set(x, "shippingCost", js.undefined)
    
    inline def setShippingOption(value: String): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionNull: Self = StObject.set(x, "shippingOption", null)
    
    inline def setShippingOptionUndefined: Self = StObject.set(x, "shippingOption", js.undefined)
  }
}
