package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.DEFAULT
import typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnknownPriceTransactionInfo
  extends BaseTransactionInfo
     with TransactionInfo {
  @JSName("checkoutOption")
  var checkoutOption_UnknownPriceTransactionInfo: js.UndefOr[DEFAULT] = js.undefined
  @JSName("totalPriceStatus")
  var totalPriceStatus_UnknownPriceTransactionInfo: NOT_CURRENTLY_KNOWN
}

object UnknownPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    totalPriceStatus: NOT_CURRENTLY_KNOWN,
    checkoutOption: DEFAULT = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): UnknownPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownPriceTransactionInfo]
  }
}

