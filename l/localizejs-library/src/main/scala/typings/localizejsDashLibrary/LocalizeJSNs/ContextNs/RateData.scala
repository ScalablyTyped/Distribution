package typings.localizejsDashLibrary.LocalizeJSNs.ContextNs

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
    val __obj = js.Dynamic.literal(fromCurrency = fromCurrency, rate = rate, toCurrency = toCurrency)
  
    __obj.asInstanceOf[RateData]
  }
}

