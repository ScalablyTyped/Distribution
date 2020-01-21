package typings.googlepay.google.payments.api

import typings.googlepay.AnonProtocolVersion
import typings.googlepay.googlepayStrings.DIRECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectTokenizationSpecification
  extends BasePaymentMethodTokenizationSpecification
     with PaymentMethodTokenizationSpecification {
  var parameters: AnonProtocolVersion
  @JSName("type")
  var type_DirectTokenizationSpecification: DIRECT
}

object DirectTokenizationSpecification {
  @scala.inline
  def apply(parameters: AnonProtocolVersion, `type`: DIRECT): DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTokenizationSpecification]
  }
}

