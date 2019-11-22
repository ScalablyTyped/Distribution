package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.DEFAULT
import typings.googlepay.googlepayStrings.ESTIMATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EstimatedPriceTransactionInfo
  extends KnownPriceTransactionInfo
     with TransactionInfo {
  @JSName("checkoutOption")
  var checkoutOption_EstimatedPriceTransactionInfo: js.UndefOr[DEFAULT] = js.undefined
  @JSName("totalPriceStatus")
  var totalPriceStatus_EstimatedPriceTransactionInfo: ESTIMATED
}

object EstimatedPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    totalPrice: String,
    totalPriceStatus: ESTIMATED,
    checkoutOption: DEFAULT = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): EstimatedPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPrice = totalPrice, totalPriceStatus = totalPriceStatus)
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[EstimatedPriceTransactionInfo]
  }
}

