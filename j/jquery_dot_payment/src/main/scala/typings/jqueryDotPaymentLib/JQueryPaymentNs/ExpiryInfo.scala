package typings
package jqueryDotPaymentLib.JQueryPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiryInfo extends js.Object {
  var month: scala.Double
  var year: scala.Double
}

object ExpiryInfo {
  @scala.inline
  def apply(month: scala.Double, year: scala.Double): ExpiryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[ExpiryInfo]
  }
}

