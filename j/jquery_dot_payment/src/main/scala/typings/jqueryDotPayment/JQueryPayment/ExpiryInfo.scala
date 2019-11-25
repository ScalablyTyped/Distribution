package typings.jqueryDotPayment.JQueryPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiryInfo extends js.Object {
  var month: Double
  var year: Double
}

object ExpiryInfo {
  @scala.inline
  def apply(month: Double, year: Double): ExpiryInfo = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpiryInfo]
  }
}

