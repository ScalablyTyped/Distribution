package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE
import typings.googlepay.googlepayStrings.DEFAULT
import typings.googlepay.googlepayStrings.FINAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalPriceTransactionInfo
  extends KnownPriceTransactionInfo
     with TransactionInfo {
  @JSName("checkoutOption")
  var checkoutOption_FinalPriceTransactionInfo: js.UndefOr[DEFAULT | COMPLETE_IMMEDIATE_PURCHASE] = js.undefined
  @JSName("totalPriceStatus")
  var totalPriceStatus_FinalPriceTransactionInfo: FINAL
}

object FinalPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    totalPrice: String,
    totalPriceStatus: FINAL,
    checkoutOption: DEFAULT | COMPLETE_IMMEDIATE_PURCHASE = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): FinalPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPrice = totalPrice, totalPriceStatus = totalPriceStatus)
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[FinalPriceTransactionInfo]
  }
}

