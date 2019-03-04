package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTransactionInfo extends js.Object {
  var currencyCode: java.lang.String
  var totalPriceStatus: TotalPriceStatus
}

object BaseTransactionInfo {
  @scala.inline
  def apply(currencyCode: java.lang.String, totalPriceStatus: TotalPriceStatus): BaseTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPriceStatus = totalPriceStatus)
  
    __obj.asInstanceOf[BaseTransactionInfo]
  }
}

