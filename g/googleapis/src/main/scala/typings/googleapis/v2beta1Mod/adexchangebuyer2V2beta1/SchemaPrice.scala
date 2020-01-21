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
  def apply(amount: SchemaMoney = null, pricingType: String = null): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrice]
  }
}

