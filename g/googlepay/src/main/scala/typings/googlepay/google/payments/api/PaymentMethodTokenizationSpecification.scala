package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait PaymentMethodTokenizationSpecification extends StObject
object PaymentMethodTokenizationSpecification {
  
  inline def DirectTokenizationSpecification(parameters: DirectTokenizationParameters): typings.googlepay.google.payments.api.DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DIRECT")
    __obj.asInstanceOf[typings.googlepay.google.payments.api.DirectTokenizationSpecification]
  }
  
  inline def PaymentGatewayTokenizationSpecification(parameters: PaymentGatewayTokenizationParameters): typings.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PAYMENT_GATEWAY")
    __obj.asInstanceOf[typings.googlepay.google.payments.api.PaymentGatewayTokenizationSpecification]
  }
}
