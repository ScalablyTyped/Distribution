package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownPriceTransactionInfo
  extends BaseTransactionInfo
     with TransactionInfo {
  var totalPrice: java.lang.String
  @JSName("totalPriceStatus")
  var totalPriceStatus_KnownPriceTransactionInfo: googlepayLib.googlepayLibStrings.ESTIMATED | googlepayLib.googlepayLibStrings.FINAL
}

object KnownPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: java.lang.String,
    totalPrice: java.lang.String,
    totalPriceStatus: googlepayLib.googlepayLibStrings.ESTIMATED | googlepayLib.googlepayLibStrings.FINAL
  ): KnownPriceTransactionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currencyCode")(currencyCode)
    __obj.updateDynamic("totalPrice")(totalPrice)
    __obj.updateDynamic("totalPriceStatus")(totalPriceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownPriceTransactionInfo]
  }
}

