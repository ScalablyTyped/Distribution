package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTransactionInfo extends js.Object {
  var checkoutOption: js.UndefOr[CheckoutOption] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var currencyCode: String
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.undefined
  var totalPriceLabel: js.UndefOr[String] = js.undefined
  var totalPriceStatus: TotalPriceStatus
  var transactionId: js.UndefOr[String] = js.undefined
}

object BaseTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    totalPriceStatus: TotalPriceStatus,
    checkoutOption: CheckoutOption = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): BaseTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, totalPriceStatus = totalPriceStatus)
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[BaseTransactionInfo]
  }
}

