package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StringDictionary
import typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentGatewayTokenizationSpecification
  extends BasePaymentMethodTokenizationSpecification
     with PaymentMethodTokenizationSpecification {
  var parameters: StringDictionary[String]
  @JSName("type")
  var type_PaymentGatewayTokenizationSpecification: PAYMENT_GATEWAY
}

object PaymentGatewayTokenizationSpecification {
  @scala.inline
  def apply(parameters: StringDictionary[String], `type`: PAYMENT_GATEWAY): PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentGatewayTokenizationSpecification]
  }
}

