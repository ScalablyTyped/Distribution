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
  def apply(amount: String = null, currency: String = null): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrice]
  }
}

