package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchRequestEntryCancelLineItem extends js.Object {
  /**
    * Deprecated. Please use amountPretax and amountTax instead.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will
    * calculate the default based on the price and tax of the items involved.
    * The amount must not be larger than the net amount left on the order.
    */
  var amountPretax: js.UndefOr[SchemaPrice] = js.native
  /**
    * Tax amount that corresponds to cancellation amount in amountPretax.
    * Optional, but if filled, then amountPretax must be set. Calculated
    * automatically if not provided.
    */
  var amountTax: js.UndefOr[SchemaPrice] = js.native
  /**
    * The ID of the line item to cancel. Either lineItemId or productId is
    * required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to cancel. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity to cancel.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object SchemaOrdersCustomBatchRequestEntryCancelLineItem {
  @scala.inline
  def apply(
    amount: SchemaPrice = null,
    amountPretax: SchemaPrice = null,
    amountTax: SchemaPrice = null,
    lineItemId: String = null,
    productId: String = null,
    quantity: js.UndefOr[Double] = js.undefined,
    reason: String = null,
    reasonText: String = null
  ): SchemaOrdersCustomBatchRequestEntryCancelLineItem = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax.asInstanceOf[js.Any])
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryCancelLineItem]
  }
}

