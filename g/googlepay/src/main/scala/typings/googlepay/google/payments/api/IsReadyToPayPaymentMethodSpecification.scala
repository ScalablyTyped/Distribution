package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification of accepted payment method for use in `isReadyToPay`.
  */
trait IsReadyToPayPaymentMethodSpecification extends StObject {
  
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
  var tokenizationSpecification: js.UndefOr[PaymentMethodTokenizationSpecification] = js.undefined
  
  /**
    * Type of payment method.
    *
    * This field is required.
    */
  var `type`: PaymentMethodType
}
object IsReadyToPayPaymentMethodSpecification {
  
  @scala.inline
  def apply(parameters: CardParameters, `type`: PaymentMethodType): IsReadyToPayPaymentMethodSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayPaymentMethodSpecification]
  }
  
  @scala.inline
  implicit class IsReadyToPayPaymentMethodSpecificationMutableBuilder[Self <: IsReadyToPayPaymentMethodSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CardParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenizationSpecification(value: PaymentMethodTokenizationSpecification): Self = StObject.set(x, "tokenizationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenizationSpecificationUndefined: Self = StObject.set(x, "tokenizationSpecification", js.undefined)
    
    @scala.inline
    def setType(value: PaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
