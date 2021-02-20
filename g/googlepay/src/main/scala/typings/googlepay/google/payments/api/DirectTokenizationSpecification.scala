package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.DIRECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Direct tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the direct
  * payment method returned to you in a format you can charge or reference.
  */
@js.native
trait DirectTokenizationSpecification extends PaymentMethodTokenizationSpecification {
  
  /**
    * Specific parameters used for direct tokenization.
    */
  var parameters: DirectTokenizationParameters = js.native
  
  /**
    * The type of payment method tokenization to apply to the selected
    * payment method.
    */
  var `type`: DIRECT = js.native
}
object DirectTokenizationSpecification {
  
  @scala.inline
  def apply(parameters: DirectTokenizationParameters, `type`: DIRECT): DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTokenizationSpecification]
  }
  
  @scala.inline
  implicit class DirectTokenizationSpecificationMutableBuilder[Self <: DirectTokenizationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: DirectTokenizationParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DIRECT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
