package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReadyToPayRequest extends ApiVersion {
  var allowedPaymentMethods: js.Array[PaymentMethod]
  var existingPaymentMethodRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object IsReadyToPayRequest {
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethod],
    apiVersion: scala.Double,
    apiVersionMinor: scala.Double,
    existingPaymentMethodRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): IsReadyToPayRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods, apiVersion = apiVersion, apiVersionMinor = apiVersionMinor)
    if (!js.isUndefined(existingPaymentMethodRequired)) __obj.updateDynamic("existingPaymentMethodRequired")(existingPaymentMethodRequired)
    __obj.asInstanceOf[IsReadyToPayRequest]
  }
}

