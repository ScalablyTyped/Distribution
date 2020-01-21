package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItem extends js.Object {
  /**
    * Annotations that are attached to the line item.
    */
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.native
  /**
    * Cancellations of the line item.
    */
  var cancellations: js.UndefOr[js.Array[SchemaOrderCancellation]] = js.native
  /**
    * The ID of the line item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Total price for the line item. For example, if two items for $10 are
    * purchased, the total price will be $20.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * Product data as seen by customer from the time of the order placement.
    * Note that certain attributes values (e.g. title or gtin) might be
    * reformatted and no longer match values submitted via product feed.
    */
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.native
  /**
    * Number of items canceled.
    */
  var quantityCanceled: js.UndefOr[Double] = js.native
  /**
    * Number of items delivered.
    */
  var quantityDelivered: js.UndefOr[Double] = js.native
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  /**
    * Number of items pending.
    */
  var quantityPending: js.UndefOr[Double] = js.native
  /**
    * Number of items returned.
    */
  var quantityReturned: js.UndefOr[Double] = js.native
  /**
    * Number of items shipped.
    */
  var quantityShipped: js.UndefOr[Double] = js.native
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.native
  /**
    * Returns of the line item.
    */
  var returns: js.UndefOr[js.Array[SchemaOrderReturn]] = js.native
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.native
  /**
    * Total tax amount for the line item. For example, if two items are
    * purchased, and each have a cost tax of $2, the total tax amount will be
    * $4.
    */
  var tax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaOrderLineItem {
  @scala.inline
  def apply(
    annotations: js.Array[SchemaOrderMerchantProvidedAnnotation] = null,
    cancellations: js.Array[SchemaOrderCancellation] = null,
    id: String = null,
    price: SchemaPrice = null,
    product: SchemaOrderLineItemProduct = null,
    quantityCanceled: Int | Double = null,
    quantityDelivered: Int | Double = null,
    quantityOrdered: Int | Double = null,
    quantityPending: Int | Double = null,
    quantityReturned: Int | Double = null,
    quantityShipped: Int | Double = null,
    returnInfo: SchemaOrderLineItemReturnInfo = null,
    returns: js.Array[SchemaOrderReturn] = null,
    shippingDetails: SchemaOrderLineItemShippingDetails = null,
    tax: SchemaPrice = null
  ): SchemaOrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (cancellations != null) __obj.updateDynamic("cancellations")(cancellations.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (quantityCanceled != null) __obj.updateDynamic("quantityCanceled")(quantityCanceled.asInstanceOf[js.Any])
    if (quantityDelivered != null) __obj.updateDynamic("quantityDelivered")(quantityDelivered.asInstanceOf[js.Any])
    if (quantityOrdered != null) __obj.updateDynamic("quantityOrdered")(quantityOrdered.asInstanceOf[js.Any])
    if (quantityPending != null) __obj.updateDynamic("quantityPending")(quantityPending.asInstanceOf[js.Any])
    if (quantityReturned != null) __obj.updateDynamic("quantityReturned")(quantityReturned.asInstanceOf[js.Any])
    if (quantityShipped != null) __obj.updateDynamic("quantityShipped")(quantityShipped.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderLineItem]
  }
}

