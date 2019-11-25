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
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTransactionInfo]
  }
}

