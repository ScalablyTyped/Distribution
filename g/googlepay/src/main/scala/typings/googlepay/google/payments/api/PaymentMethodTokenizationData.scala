package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tokenization data for the payment method.
  *
  * @see PaymentMethodTokenizationSpecification
  */
trait PaymentMethodTokenizationData extends StObject {
  
  /**
    * The generated payment method token.
    *
    * The contents of this token and how it should be used will depend on
    * the selected
    * [[PaymentMethodTokenizationSpecification.type|`PaymentMethodTokenizationSpecification.type`]].
    */
  var token: String
  
  /**
    * The type of tokenization to be applied to the selected payment
    * method.
    *
    * This value will match the
    * [[PaymentMethodTokenizationSpecification.type|`PaymentMethodTokenizationSpecification.type`]]
    * specified in the request.
    */
  var `type`: PaymentMethodTokenizationType
}
object PaymentMethodTokenizationData {
  
  @scala.inline
  def apply(token: String, `type`: PaymentMethodTokenizationType): PaymentMethodTokenizationData = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationData]
  }
  
  @scala.inline
  implicit class PaymentMethodTokenizationDataMutableBuilder[Self <: PaymentMethodTokenizationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PaymentMethodTokenizationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
