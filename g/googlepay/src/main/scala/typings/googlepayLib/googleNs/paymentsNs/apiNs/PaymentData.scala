package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentData extends ApiVersion {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var paymentMethodData: PaymentMethodData
  var shippingAddress: js.UndefOr[Address] = js.undefined
}

object PaymentData {
  @scala.inline
  def apply(
    apiVersion: scala.Double,
    apiVersionMinor: scala.Double,
    paymentMethodData: PaymentMethodData,
    email: java.lang.String = null,
    shippingAddress: Address = null
  ): PaymentData = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, apiVersionMinor = apiVersionMinor, paymentMethodData = paymentMethodData)
    if (email != null) __obj.updateDynamic("email")(email)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    __obj.asInstanceOf[PaymentData]
  }
}

