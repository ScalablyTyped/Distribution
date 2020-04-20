package typings.localizejsLibrary.LocalizeJS.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateData extends js.Object {
  var fromCurrency: String
  var rate: String
  var toCurrency: String
}

object RateData {
  @scala.inline
  def apply(fromCurrency: String, rate: String, toCurrency: String): RateData = {
    val __obj = js.Dynamic.literal(fromCurrency = fromCurrency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], toCurrency = toCurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateData]
  }
}

