package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrder extends StObject {
  
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
    * The billing address.
    */
  var predefinedBillingAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of one of the predefined delivery addresses for the delivery.
    */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of the customer.
    */
  var predefinedEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Promotions associated with the order.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderPromotion]] = js.undefined
  
  /**
    * The price of shipping for all items. Shipping tax is automatically
    * calculated for MFL orders. For non-MFL orders, tax settings from Merchant
    * Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.undefined
  
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
    def setPredefinedBillingAddress(value: String): Self = StObject.set(x, "predefinedBillingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedBillingAddressUndefined: Self = StObject.set(x, "predefinedBillingAddress", js.undefined)
    
    @scala.inline
    def setPredefinedDeliveryAddress(value: String): Self = StObject.set(x, "predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedDeliveryAddressUndefined: Self = StObject.set(x, "predefinedDeliveryAddress", js.undefined)
    
    @scala.inline
    def setPredefinedEmail(value: String): Self = StObject.set(x, "predefinedEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedEmailUndefined: Self = StObject.set(x, "predefinedEmail", js.undefined)
    
    @scala.inline
    def setPromotions(value: js.Array[SchemaOrderPromotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: SchemaOrderPromotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
    @scala.inline
    def setShippingCost(value: SchemaPrice): Self = StObject.set(x, "shippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingCostUndefined: Self = StObject.set(x, "shippingCost", js.undefined)
    
    @scala.inline
    def setShippingOption(value: String): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionUndefined: Self = StObject.set(x, "shippingOption", js.undefined)
  }
}
