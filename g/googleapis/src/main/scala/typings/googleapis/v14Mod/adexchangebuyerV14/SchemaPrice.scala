package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrice extends js.Object {
  /**
    * The price value in micros.
    */
  var amountMicros: js.UndefOr[Double] = js.native
  /**
    * The currency code for the price.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * In case of CPD deals, the expected CPM in micros.
    */
  var expectedCpmMicros: js.UndefOr[Double] = js.native
  /**
    * The pricing type for the deal/product.
    */
  var pricingType: js.UndefOr[String] = js.native
}

object SchemaPrice {
  @scala.inline
  def apply(
    amountMicros: Int | Double = null,
    currencyCode: String = null,
    expectedCpmMicros: Int | Double = null,
    pricingType: String = null
  ): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    if (amountMicros != null) __obj.updateDynamic("amountMicros")(amountMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (expectedCpmMicros != null) __obj.updateDynamic("expectedCpmMicros")(expectedCpmMicros.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrice]
  }
}

