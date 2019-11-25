package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StringDictionary
import typings.googlepay.Anon_ProtocolVersion
import typings.googlepay.googlepayStrings.DIRECT
import typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification
  - typings.googlepay.google.payments.api.DirectTokenizationSpecification
*/
trait PaymentMethodTokenizationSpecification extends js.Object

object PaymentMethodTokenizationSpecification {
  @scala.inline
  def PaymentGatewayTokenizationSpecification(parameters: StringDictionary[String], `type`: PAYMENT_GATEWAY): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
  @scala.inline
  def DirectTokenizationSpecification(parameters: Anon_ProtocolVersion, `type`: DIRECT): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
}

