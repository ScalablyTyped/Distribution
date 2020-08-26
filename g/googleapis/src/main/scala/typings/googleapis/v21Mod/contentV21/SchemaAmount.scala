package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAmount extends js.Object {
  /**
    * [required] The pre-tax or post-tax price depending on the location of the
    * order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * [required] Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
}

object SchemaAmount {
  @scala.inline
  def apply(): SchemaAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmount]
  }
  @scala.inline
  implicit class SchemaAmountOps[Self <: SchemaAmount] (val x: Self) extends AnyVal {
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
    def setPriceAmount(value: SchemaPrice): Self = this.set("priceAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceAmount: Self = this.set("priceAmount", js.undefined)
    @scala.inline
    def setTaxAmount(value: SchemaPrice): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
  }
  
}

