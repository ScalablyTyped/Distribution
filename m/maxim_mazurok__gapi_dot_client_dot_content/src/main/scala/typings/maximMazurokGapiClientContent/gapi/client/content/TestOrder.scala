package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrder extends js.Object {
  
  /** Overrides the predefined delivery details if provided. */
  var deliveryDetails: js.UndefOr[TestOrderDeliveryDetails] = js.native
  
  /** Whether the orderinvoices service should support this order. */
  var enableOrderinvoices: js.UndefOr[Boolean] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#testOrder`" */
  var kind: js.UndefOr[String] = js.native
  
  /** Required. Line items that are ordered. At least one line item must be provided. */
  var lineItems: js.UndefOr[js.Array[TestOrderLineItem]] = js.native
  
  /** Restricted. Do not use. */
  var notificationMode: js.UndefOr[String] = js.native
  
  /** Overrides the predefined pickup details if provided. */
  var pickupDetails: js.UndefOr[TestOrderPickupDetails] = js.native
  
  /** Required. The billing address. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`" */
  var predefinedBillingAddress: js.UndefOr[String] = js.native
  
  /** Required. Identifier of one of the predefined delivery addresses for the delivery. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`" */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  
  /** Required. Email address of the customer. Acceptable values are: - "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" - "`penpog.pam.beesly@gmail.comding`" */
  var predefinedEmail: js.UndefOr[String] = js.native
  
  /** Identifier of one of the predefined pickup details. Required for orders containing line items with shipping type `pickup`. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`" */
  var predefinedPickupDetails: js.UndefOr[String] = js.native
  
  /** Promotions associated with the order. */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.native
  
  /**
    * Required. The price of shipping for all items. Shipping tax is automatically calculated for orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings
    * from Merchant Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[Price] = js.native
  
  /** Required. The requested shipping option. Acceptable values are: - "`economy`" - "`expedited`" - "`oneDay`" - "`sameDay`" - "`standard`" - "`twoDay`" */
  var shippingOption: js.UndefOr[String] = js.native
}
object TestOrder {
  
  @scala.inline
  def apply(): TestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrder]
  }
  
  @scala.inline
  implicit class TestOrderOps[Self <: TestOrder] (val x: Self) extends AnyVal {
    
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
    def setDeliveryDetails(value: TestOrderDeliveryDetails): Self = this.set("deliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryDetails: Self = this.set("deliveryDetails", js.undefined)
    
    @scala.inline
    def setEnableOrderinvoices(value: Boolean): Self = this.set("enableOrderinvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOrderinvoices: Self = this.set("enableOrderinvoices", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: TestOrderLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[TestOrderLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setNotificationMode(value: String): Self = this.set("notificationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationMode: Self = this.set("notificationMode", js.undefined)
    
    @scala.inline
    def setPickupDetails(value: TestOrderPickupDetails): Self = this.set("pickupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupDetails: Self = this.set("pickupDetails", js.undefined)
    
    @scala.inline
    def setPredefinedBillingAddress(value: String): Self = this.set("predefinedBillingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedBillingAddress: Self = this.set("predefinedBillingAddress", js.undefined)
    
    @scala.inline
    def setPredefinedDeliveryAddress(value: String): Self = this.set("predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedDeliveryAddress: Self = this.set("predefinedDeliveryAddress", js.undefined)
    
    @scala.inline
    def setPredefinedEmail(value: String): Self = this.set("predefinedEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedEmail: Self = this.set("predefinedEmail", js.undefined)
    
    @scala.inline
    def setPredefinedPickupDetails(value: String): Self = this.set("predefinedPickupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedPickupDetails: Self = this.set("predefinedPickupDetails", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: OrderPromotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[OrderPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setShippingCost(value: Price): Self = this.set("shippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCost: Self = this.set("shippingCost", js.undefined)
    
    @scala.inline
    def setShippingOption(value: String): Self = this.set("shippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOption: Self = this.set("shippingOption", js.undefined)
  }
}
