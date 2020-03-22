package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
trait PaymentMethodTokenizationSpecification extends js.Object {
  /**
    * Specific parameters used for tokenization.
    *
    * The values in this object will depend on the value of type set in
    * [[PaymentMethodTokenizationSpecification.type|`type`]]:
    *
    * - [[PaymentMethodTokenizationType|`PAYMENT_GATEWAY`]]:
    *   [[PaymentGatewayTokenizationParameters|`PaymentGatewayTokenizationParameters`]]
    * - [[PaymentMethodTokenizationType|`DIRECT`]]:
    *   [[DirectTokenizationParameters|`DirectTokenizationParameters`]]
    */
  var parameters: PaymentGatewayTokenizationParameters | DirectTokenizationParameters
  /**
    * The type of payment method tokenization to apply to the selected
    * payment method.
    *
    * This field is required.
    */
  var `type`: PaymentMethodTokenizationType
}

object PaymentMethodTokenizationSpecification {
  @scala.inline
  def apply(
    parameters: PaymentGatewayTokenizationParameters | DirectTokenizationParameters,
    `type`: PaymentMethodTokenizationType
  ): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
}

