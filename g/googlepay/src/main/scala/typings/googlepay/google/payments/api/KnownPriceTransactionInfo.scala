package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.ESTIMATED
import typings.googlepay.googlepayStrings.FINAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownPriceTransactionInfo extends BaseTransactionInfo {
  var totalPrice: String
  @JSName("totalPriceStatus")
  var totalPriceStatus_KnownPriceTransactionInfo: ESTIMATED | FINAL
}

object KnownPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    totalPrice: String,
    totalPriceStatus: ESTIMATED | FINAL,
    checkoutOption: CheckoutOption = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): KnownPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPrice = totalPrice, totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[KnownPriceTransactionInfo]
  }
}

