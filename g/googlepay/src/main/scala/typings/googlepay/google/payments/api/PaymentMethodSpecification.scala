package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification of accepted payment method for use in `loadPaymentData`.
  */
trait PaymentMethodSpecification extends js.Object {
  /**
    * Payment method parameters.
    *
    * The parameters set here affect which payment methods will be
    * available for the user to choose from.
    */
  var parameters: CardParameters
  /**
    * Tokenization parameters.
    *
    * These parameters will be used to tokenize/transmit the
    * payment method returned to you in a format you can charge or
    * reference.
    */
  var tokenizationSpecification: PaymentMethodTokenizationSpecification
  /**
    * Type of payment method.
    *
    * This field is required.
    */
  var `type`: PaymentMethodType
}

object PaymentMethodSpecification {
  @scala.inline
  def apply(
    parameters: CardParameters,
    tokenizationSpecification: PaymentMethodTokenizationSpecification,
    `type`: PaymentMethodType
  ): PaymentMethodSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], tokenizationSpecification = tokenizationSpecification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodSpecification]
  }
}

