package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnknownPriceTransactionInfo
  extends BaseTransactionInfo
     with TransactionInfo {
  @JSName("totalPriceStatus")
  var totalPriceStatus_UnknownPriceTransactionInfo: googlepayLib.googlepayLibStrings.NOT_CURRENTLY_KNOWN
}

object UnknownPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: java.lang.String,
    totalPriceStatus: googlepayLib.googlepayLibStrings.NOT_CURRENTLY_KNOWN
  ): UnknownPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPriceStatus = totalPriceStatus)
  
    __obj.asInstanceOf[UnknownPriceTransactionInfo]
  }
}

