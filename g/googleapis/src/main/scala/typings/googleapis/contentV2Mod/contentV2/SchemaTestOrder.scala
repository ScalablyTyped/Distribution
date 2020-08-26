package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrder extends js.Object {
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaTestOrderCustomer] = js.native
  /**
    * Whether the orderinvoices service should support this order.
    */
  var enableOrderinvoices: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#testOrder&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Line items that are ordered. At least one line item must be provided.
    */
  var lineItems: js.UndefOr[js.Array[SchemaTestOrderLineItem]] = js.native
  /**
    * Determines if test order must be pulled by merchant or pushed to merchant
    * via push integration.
    */
  var notificationMode: js.UndefOr[String] = js.native
  /**
    * The details of the payment method.
    */
  var paymentMethod: js.UndefOr[SchemaTestOrderPaymentMethod] = js.native
  /**
    * Identifier of one of the predefined delivery addresses for the delivery.
    */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderLegacyPromotion]] = js.native
  /**
    * The price of shipping for all items. Shipping tax is automatically
    * calculated for MFL orders. For non-MFL orders, tax settings from Merchant
    * Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.native
  /**
    * The requested shipping option.
    */
  var shippingOption: js.UndefOr[String] = js.native
}

object SchemaTestOrder {
  @scala.inline
  def apply(): SchemaTestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrder]
  }
  @scala.inline
  implicit class SchemaTestOrderOps[Self <: SchemaTestOrder] (val x: Self) extends AnyVal {
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
    def setCustomer(value: SchemaTestOrderCustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setEnableOrderinvoices(value: Boolean): Self = this.set("enableOrderinvoices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableOrderinvoices: Self = this.set("enableOrderinvoices", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLineItemsVarargs(value: SchemaTestOrderLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    @scala.inline
    def setLineItems(value: js.Array[SchemaTestOrderLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    @scala.inline
    def setNotificationMode(value: String): Self = this.set("notificationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationMode: Self = this.set("notificationMode", js.undefined)
    @scala.inline
    def setPaymentMethod(value: SchemaTestOrderPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    @scala.inline
    def setPredefinedDeliveryAddress(value: String): Self = this.set("predefinedDeliveryAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedDeliveryAddress: Self = this.set("predefinedDeliveryAddress", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: SchemaOrderLegacyPromotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[SchemaOrderLegacyPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
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
  }
  
}

