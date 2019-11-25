package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDataRequest extends ApiVersion {
  var allowedPaymentMethods: js.Array[PaymentMethod]
  var emailRequired: js.UndefOr[Boolean] = js.undefined
  var merchantInfo: MerchantInfo
  var shippingAddressParameters: js.UndefOr[ShippingAddressParameters] = js.undefined
  var shippingAddressRequired: js.UndefOr[Boolean] = js.undefined
  var transactionInfo: TransactionInfo
}

object PaymentDataRequest {
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethod],
    apiVersion: Double,
    apiVersionMinor: Double,
    merchantInfo: MerchantInfo,
    transactionInfo: TransactionInfo,
    emailRequired: js.UndefOr[Boolean] = js.undefined,
    shippingAddressParameters: ShippingAddressParameters = null,
    shippingAddressRequired: js.UndefOr[Boolean] = js.undefined
  ): PaymentDataRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], merchantInfo = merchantInfo.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(emailRequired)) __obj.updateDynamic("emailRequired")(emailRequired.asInstanceOf[js.Any])
    if (shippingAddressParameters != null) __obj.updateDynamic("shippingAddressParameters")(shippingAddressParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingAddressRequired)) __obj.updateDynamic("shippingAddressRequired")(shippingAddressRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataRequest]
  }
}

