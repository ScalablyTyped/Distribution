package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemProductFee extends js.Object {
  /**
    * Amount of the fee.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Name of the fee.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaOrderLineItemProductFee {
  @scala.inline
  def apply(): SchemaOrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemProductFee]
  }
  @scala.inline
  implicit class SchemaOrderLineItemProductFeeOps[Self <: SchemaOrderLineItemProductFee] (val x: Self) extends AnyVal {
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
    def setAmount(value: SchemaPrice): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

