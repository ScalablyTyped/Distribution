package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDataRequest extends ApiVersion {
  var allowedPaymentMethods: js.Array[PaymentMethod]
  var emailRequired: js.UndefOr[scala.Boolean] = js.undefined
  var merchantInfo: MerchantInfo
  var shippingAddressParameters: js.UndefOr[ShippingAddressParameters] = js.undefined
  var shippingAddressRequired: js.UndefOr[scala.Boolean] = js.undefined
  var transactionInfo: TransactionInfo
}

object PaymentDataRequest {
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethod],
    apiVersion: scala.Double,
    apiVersionMinor: scala.Double,
    merchantInfo: MerchantInfo,
    transactionInfo: TransactionInfo,
    emailRequired: js.UndefOr[scala.Boolean] = js.undefined,
    shippingAddressParameters: ShippingAddressParameters = null,
    shippingAddressRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): PaymentDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedPaymentMethods")(allowedPaymentMethods)
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("apiVersionMinor")(apiVersionMinor)
    __obj.updateDynamic("merchantInfo")(merchantInfo)
    __obj.updateDynamic("transactionInfo")(transactionInfo)
    if (!js.isUndefined(emailRequired)) __obj.updateDynamic("emailRequired")(emailRequired)
    if (shippingAddressParameters != null) __obj.updateDynamic("shippingAddressParameters")(shippingAddressParameters)
    if (!js.isUndefined(shippingAddressRequired)) __obj.updateDynamic("shippingAddressRequired")(shippingAddressRequired)
    __obj.asInstanceOf[PaymentDataRequest]
  }
}

