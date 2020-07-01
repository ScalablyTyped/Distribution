package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.DIRECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Direct tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the direct
  * payment method returned to you in a format you can charge or reference.
  */
trait DirectTokenizationSpecification extends PaymentMethodTokenizationSpecification {
  /**
    * Specific parameters used for direct tokenization.
    */
  var parameters: DirectTokenizationParameters
  /**
    * The type of payment method tokenization to apply to the selected
    * payment method.
    */
  var `type`: DIRECT
}

object DirectTokenizationSpecification {
  @scala.inline
  def apply(parameters: DirectTokenizationParameters, `type`: DIRECT): DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTokenizationSpecification]
  }
}

