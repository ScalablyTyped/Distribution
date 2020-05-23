package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Price extends js.Object {
  var amount: Double
  var currency: String
  var hint: js.UndefOr[String] = js.undefined
}

object Price {
  @scala.inline
  def apply(amount: Double, currency: String, hint: String = null): Price = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
}

