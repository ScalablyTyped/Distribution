package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment gateway tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
trait PaymentGatewayTokenizationSpecification
  extends StObject
     with PaymentMethodTokenizationSpecification {
  
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
  
  inline def apply(parameters: PaymentGatewayTokenizationParameters): PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PAYMENT_GATEWAY")
    __obj.asInstanceOf[PaymentGatewayTokenizationSpecification]
  }
  
  extension [Self <: PaymentGatewayTokenizationSpecification](x: Self) {
    
    inline def setParameters(value: PaymentGatewayTokenizationParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setType(value: PAYMENT_GATEWAY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
