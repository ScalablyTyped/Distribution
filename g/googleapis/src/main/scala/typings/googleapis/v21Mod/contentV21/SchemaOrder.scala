package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The billing address.
    */
  var billingAddress: js.UndefOr[SchemaOrderAddress] = js.native
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
    * The net amount for the order (price part). For example, if an order was
    * originally for $100 and a refund was issued for $20, the net amount will
    * be $80.
    */
  var netPriceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The net amount for the order (tax part). Note that in certain cases due
    * to taxable base adjustment netTaxAmount might not match to a sum of tax
    * field across all lineItems and refunds.
    */
  var netTaxAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The status of the payment.
    */
  var paymentStatus: js.UndefOr[String] = js.native
  /**
    * The date when the order was placed, in ISO 8601 format.
    */
  var placedDate: js.UndefOr[String] = js.native
  /**
    * Promotions associated with the order.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderPromotion]] = js.native
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
    def setBillingAddress(value: SchemaOrderAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
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
    def setNetPriceAmount(value: SchemaPrice): Self = this.set("netPriceAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetPriceAmount: Self = this.set("netPriceAmount", js.undefined)
    @scala.inline
    def setNetTaxAmount(value: SchemaPrice): Self = this.set("netTaxAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetTaxAmount: Self = this.set("netTaxAmount", js.undefined)
    @scala.inline
    def setPaymentStatus(value: String): Self = this.set("paymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentStatus: Self = this.set("paymentStatus", js.undefined)
    @scala.inline
    def setPlacedDate(value: String): Self = this.set("placedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacedDate: Self = this.set("placedDate", js.undefined)
    @scala.inline
    def setPromotionsVarargs(value: SchemaOrderPromotion*): Self = this.set("promotions", js.Array(value :_*))
    @scala.inline
    def setPromotions(value: js.Array[SchemaOrderPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTaxCollector(value: String): Self = this.set("taxCollector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxCollector: Self = this.set("taxCollector", js.undefined)
  }
  
}

