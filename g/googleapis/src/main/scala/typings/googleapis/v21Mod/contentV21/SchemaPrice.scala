package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrice extends js.Object {
  /**
    * The currency of the price.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The price represented as a number.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaPrice {
  @scala.inline
  def apply(currency: String = null, value: String = null): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrice]
  }
}

