package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a price and a pricing type for a product / deal.
  */
@js.native
trait SchemaPrice extends js.Object {
  /**
    * The actual price with currency specified.
    */
  var amount: js.UndefOr[SchemaMoney] = js.native
  /**
    * The pricing type for the deal/product. (default: CPM)
    */
  var pricingType: js.UndefOr[String] = js.native
}

object SchemaPrice {
  @scala.inline
  def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  @scala.inline
  implicit class SchemaPriceOps[Self <: SchemaPrice] (val x: Self) extends AnyVal {
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
    def setAmount(value: SchemaMoney): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setPricingType(value: String): Self = this.set("pricingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingType: Self = this.set("pricingType", js.undefined)
  }
  
}

