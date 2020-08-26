package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderShipmentLineItemShipment extends js.Object {
  /**
    * The ID of the line item that is shipped. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to ship. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity that is shipped.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object SchemaOrderShipmentLineItemShipment {
  @scala.inline
  def apply(): SchemaOrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderShipmentLineItemShipment]
  }
  @scala.inline
  implicit class SchemaOrderShipmentLineItemShipmentOps[Self <: SchemaOrderShipmentLineItemShipment] (val x: Self) extends AnyVal {
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

