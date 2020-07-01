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
    amountMicros: js.UndefOr[Double] = js.undefined,
    currencyCode: String = null,
    expectedCpmMicros: js.UndefOr[Double] = js.undefined,
    pricingType: String = null
  ): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amountMicros)) __obj.updateDynamic("amountMicros")(amountMicros.get.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(expectedCpmMicros)) __obj.updateDynamic("expectedCpmMicros")(expectedCpmMicros.get.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrice]
  }
}

