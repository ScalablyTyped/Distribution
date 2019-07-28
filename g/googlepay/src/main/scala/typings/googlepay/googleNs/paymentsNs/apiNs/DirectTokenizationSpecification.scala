package typings.googlepay.googleNs.paymentsNs.apiNs

import typings.googlepay.Anon_ProtocolVersion
import typings.googlepay.googlepayStrings.DIRECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectTokenizationSpecification
  extends BasePaymentMethodTokenizationSpecification
     with PaymentMethodTokenizationSpecification {
  var parameters: Anon_ProtocolVersion
  @JSName("type")
  var type_DirectTokenizationSpecification: DIRECT
}

object DirectTokenizationSpecification {
  @scala.inline
  def apply(parameters: Anon_ProtocolVersion, `type`: DIRECT): DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DirectTokenizationSpecification]
  }
}

