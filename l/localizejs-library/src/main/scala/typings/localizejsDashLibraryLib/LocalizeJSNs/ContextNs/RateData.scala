package typings
package localizejsDashLibraryLib.LocalizeJSNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateData extends js.Object {
  var fromCurrency: java.lang.String
  var rate: java.lang.String
  var toCurrency: java.lang.String
}

object RateData {
  @scala.inline
  def apply(fromCurrency: java.lang.String, rate: java.lang.String, toCurrency: java.lang.String): RateData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromCurrency")(fromCurrency)
    __obj.updateDynamic("rate")(rate)
    __obj.updateDynamic("toCurrency")(toCurrency)
    __obj.asInstanceOf[RateData]
  }
}

