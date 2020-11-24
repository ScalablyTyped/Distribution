package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.DIRECT
import typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification
  - typings.googlepay.google.payments.api.DirectTokenizationSpecification
*/
trait PaymentMethodTokenizationSpecification extends js.Object
object PaymentMethodTokenizationSpecification {
  
  @scala.inline
  def PaymentGatewayTokenizationSpecification(parameters: PaymentGatewayTokenizationParameters, `type`: PAYMENT_GATEWAY): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
  
  @scala.inline
  def DirectTokenizationSpecification(parameters: DirectTokenizationParameters, `type`: DIRECT): PaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationSpecification]
  }
}
