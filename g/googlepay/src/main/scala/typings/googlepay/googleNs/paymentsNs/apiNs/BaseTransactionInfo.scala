package typings.googlepay.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTransactionInfo extends js.Object {
  var currencyCode: String
  var totalPriceStatus: TotalPriceStatus
}

object BaseTransactionInfo {
  @scala.inline
  def apply(currencyCode: String, totalPriceStatus: TotalPriceStatus): BaseTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPriceStatus = totalPriceStatus)
  
    __obj.asInstanceOf[BaseTransactionInfo]
  }
}

