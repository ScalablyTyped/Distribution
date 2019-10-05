package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnknownPriceTransactionInfo
  extends BaseTransactionInfo
     with TransactionInfo {
  @JSName("totalPriceStatus")
  var totalPriceStatus_UnknownPriceTransactionInfo: NOT_CURRENTLY_KNOWN
}

object UnknownPriceTransactionInfo {
  @scala.inline
  def apply(currencyCode: String, totalPriceStatus: NOT_CURRENTLY_KNOWN): UnknownPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPriceStatus = totalPriceStatus)
  
    __obj.asInstanceOf[UnknownPriceTransactionInfo]
  }
}

