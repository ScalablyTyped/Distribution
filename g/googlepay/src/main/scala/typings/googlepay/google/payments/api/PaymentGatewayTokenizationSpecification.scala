package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment gateway tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
trait PaymentGatewayTokenizationSpecification extends PaymentMethodTokenizationSpecification {
  /**
    * Specific parameters used for payment gateway tokenization.
    */
  var parameters: PaymentGatewayTokenizationParameters
  /**
    * The type of payment method tokenization to apply to the selected
    * payment method.
    */
  var `type`: PAYMENT_GATEWAY
}

object PaymentGatewayTokenizationSpecification {
  @scala.inline
  def apply(parameters: PaymentGatewayTokenizationParameters, `type`: PAYMENT_GATEWAY): PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentGatewayTokenizationSpecification]
  }
}

