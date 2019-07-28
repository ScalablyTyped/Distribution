package typings.googlepay.googleNs.paymentsNs.apiNs

import typings.googlepay.googlepayStrings.ESTIMATED
import typings.googlepay.googlepayStrings.FINAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownPriceTransactionInfo
  extends BaseTransactionInfo
     with TransactionInfo {
  var totalPrice: String
  @JSName("totalPriceStatus")
  var totalPriceStatus_KnownPriceTransactionInfo: ESTIMATED | FINAL
}

object KnownPriceTransactionInfo {
  @scala.inline
  def apply(currencyCode: String, totalPrice: String, totalPriceStatus: ESTIMATED | FINAL): KnownPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPrice = totalPrice, totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnownPriceTransactionInfo]
  }
}

