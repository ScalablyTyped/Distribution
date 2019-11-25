package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReadyToPayRequest extends ApiVersion {
  var allowedPaymentMethods: js.Array[PaymentMethod]
  var existingPaymentMethodRequired: js.UndefOr[Boolean] = js.undefined
}

object IsReadyToPayRequest {
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethod],
    apiVersion: Double,
    apiVersionMinor: Double,
    existingPaymentMethodRequired: js.UndefOr[Boolean] = js.undefined
  ): IsReadyToPayRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any])
    if (!js.isUndefined(existingPaymentMethodRequired)) __obj.updateDynamic("existingPaymentMethodRequired")(existingPaymentMethodRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayRequest]
  }
}

