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
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownPriceTransactionInfo]
  }
}

