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
  def apply(): SchemaTestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderLineItem]
  }
  @scala.inline
  implicit class SchemaTestOrderLineItemOps[Self <: SchemaTestOrderLineItem] (val x: Self) extends AnyVal {
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
    def setProduct(value: SchemaTestOrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setQuantityOrdered(value: Double): Self = this.set("quantityOrdered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantityOrdered: Self = this.set("quantityOrdered", js.undefined)
    @scala.inline
    def setReturnInfo(value: SchemaOrderLineItemReturnInfo): Self = this.set("returnInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnInfo: Self = this.set("returnInfo", js.undefined)
    @scala.inline
    def setShippingDetails(value: SchemaOrderLineItemShippingDetails): Self = this.set("shippingDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingDetails: Self = this.set("shippingDetails", js.undefined)
  }
  
}

