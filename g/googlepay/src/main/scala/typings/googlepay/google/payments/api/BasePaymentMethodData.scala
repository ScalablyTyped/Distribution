package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePaymentMethodData extends js.Object {
  var description: String
  var tokenizationData: PaymentMethodTokenizationData
  var `type`: AllowedPaymentMethodType
}

object BasePaymentMethodData {
  @scala.inline
  def apply(
    description: String,
    tokenizationData: PaymentMethodTokenizationData,
    `type`: AllowedPaymentMethodType
  ): BasePaymentMethodData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], tokenizationData = tokenizationData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePaymentMethodData]
  }
}

