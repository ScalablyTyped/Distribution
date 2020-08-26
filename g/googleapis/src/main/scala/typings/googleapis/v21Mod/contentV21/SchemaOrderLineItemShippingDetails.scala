package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemShippingDetails extends js.Object {
  /**
    * The delivery by date, in ISO 8601 format.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  /**
    * Details of the shipping method.
    */
  var method: js.UndefOr[SchemaOrderLineItemShippingDetailsMethod] = js.native
  /**
    * The ship by date, in ISO 8601 format.
    */
  var shipByDate: js.UndefOr[String] = js.native
}

object SchemaOrderLineItemShippingDetails {
  @scala.inline
  def apply(): SchemaOrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetails]
  }
  @scala.inline
  implicit class SchemaOrderLineItemShippingDetailsOps[Self <: SchemaOrderLineItemShippingDetails] (val x: Self) extends AnyVal {
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
    def setDeliverByDate(value: String): Self = this.set("deliverByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverByDate: Self = this.set("deliverByDate", js.undefined)
    @scala.inline
    def setMethod(value: SchemaOrderLineItemShippingDetailsMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setShipByDate(value: String): Self = this.set("shipByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipByDate: Self = this.set("shipByDate", js.undefined)
  }
  
}

