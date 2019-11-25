package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePaymentMethod extends js.Object {
  var tokenizationSpecification: js.UndefOr[PaymentMethodTokenizationSpecification] = js.undefined
  var `type`: AllowedPaymentMethodType
}

object BasePaymentMethod {
  @scala.inline
  def apply(
    `type`: AllowedPaymentMethodType,
    tokenizationSpecification: PaymentMethodTokenizationSpecification = null
  ): BasePaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokenizationSpecification != null) __obj.updateDynamic("tokenizationSpecification")(tokenizationSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePaymentMethod]
  }
}

