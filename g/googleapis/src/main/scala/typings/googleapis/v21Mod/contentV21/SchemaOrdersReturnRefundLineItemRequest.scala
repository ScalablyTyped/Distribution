package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersReturnRefundLineItemRequest extends js.Object {
  /**
    * The ID of the line item to return. Either lineItemId or productId is
    * required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The amount to be refunded. This may be pre-tax or post-tax depending on
    * the location of the order. If omitted, refundless return is assumed.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The ID of the product to return. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity to return and refund.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
  /**
    * The amount of tax to be refunded. Optional, but if filled, then
    * priceAmount must be set. Calculated automatically if not provided.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
}

object SchemaOrdersReturnRefundLineItemRequest {
  @scala.inline
  def apply(): SchemaOrdersReturnRefundLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersReturnRefundLineItemRequest]
  }
  @scala.inline
  implicit class SchemaOrdersReturnRefundLineItemRequestOps[Self <: SchemaOrdersReturnRefundLineItemRequest] (val x: Self) extends AnyVal {
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
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setPriceAmount(value: SchemaPrice): Self = this.set("priceAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceAmount: Self = this.set("priceAmount", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
    @scala.inline
    def setTaxAmount(value: SchemaPrice): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
  }
  
}

