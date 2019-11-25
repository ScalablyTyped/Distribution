package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.COMPLETE_IMMEDIATE_PURCHASE
import typings.googlepay.googlepayStrings.DEFAULT
import typings.googlepay.googlepayStrings.ESTIMATED
import typings.googlepay.googlepayStrings.FINAL
import typings.googlepay.googlepayStrings.NOT_CURRENTLY_KNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.google.payments.api.UnknownPriceTransactionInfo
  - typings.googlepay.google.payments.api.EstimatedPriceTransactionInfo
  - typings.googlepay.google.payments.api.FinalPriceTransactionInfo
*/
trait TransactionInfo extends js.Object

object TransactionInfo {
  @scala.inline
  def UnknownPriceTransactionInfo(
    currencyCode: String,
    totalPriceStatus: NOT_CURRENTLY_KNOWN,
    checkoutOption: DEFAULT = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): TransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInfo]
  }
  @scala.inline
  def EstimatedPriceTransactionInfo(
    currencyCode: String,
    totalPrice: String,
    totalPriceStatus: ESTIMATED,
    checkoutOption: DEFAULT = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): TransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInfo]
  }
  @scala.inline
  def FinalPriceTransactionInfo(
    currencyCode: String,
    totalPrice: String,
    totalPriceStatus: FINAL,
    checkoutOption: DEFAULT | COMPLETE_IMMEDIATE_PURCHASE = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): TransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionInfo]
  }
}

