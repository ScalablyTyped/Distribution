package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A price.
  */
@js.native
trait SchemaPrice extends js.Object {
  /**
    * The numeric value of the price.
    */
  var amount: js.UndefOr[String] = js.native
  /**
    * The currency in which the price is denoted.
    */
  var currency: js.UndefOr[String] = js.native
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
  }
  
}

