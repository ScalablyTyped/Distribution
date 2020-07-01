package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrderLineItem extends js.Object {
  /**
    * Product data from the time of the order placement.
    */
  var product: js.UndefOr[SchemaTestOrderLineItemProduct] = js.native
  /**
    * Number of items ordered.
    */
  var quantityOrdered: js.UndefOr[Double] = js.native
  /**
    * Details of the return policy for the line item.
    */
  var returnInfo: js.UndefOr[SchemaOrderLineItemReturnInfo] = js.native
  /**
    * Details of the requested shipping for the line item.
    */
  var shippingDetails: js.UndefOr[SchemaOrderLineItemShippingDetails] = js.native
}

object SchemaTestOrderLineItem {
  @scala.inline
  def apply(
    product: SchemaTestOrderLineItemProduct = null,
    quantityOrdered: js.UndefOr[Double] = js.undefined,
    returnInfo: SchemaOrderLineItemReturnInfo = null,
    shippingDetails: SchemaOrderLineItemShippingDetails = null
  ): SchemaTestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (!js.isUndefined(quantityOrdered)) __obj.updateDynamic("quantityOrdered")(quantityOrdered.get.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestOrderLineItem]
  }
}

