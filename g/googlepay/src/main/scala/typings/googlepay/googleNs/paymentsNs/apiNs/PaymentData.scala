package typings.googlepay.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentData extends ApiVersion {
  var email: js.UndefOr[String] = js.undefined
  var paymentMethodData: PaymentMethodData
  var shippingAddress: js.UndefOr[Address] = js.undefined
}

object PaymentData {
  @scala.inline
  def apply(
    apiVersion: Double,
    apiVersionMinor: Double,
    paymentMethodData: PaymentMethodData,
    email: String = null,
    shippingAddress: Address = null
  ): PaymentData = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, apiVersionMinor = apiVersionMinor, paymentMethodData = paymentMethodData)
    if (email != null) __obj.updateDynamic("email")(email)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    __obj.asInstanceOf[PaymentData]
  }
}

