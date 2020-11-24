package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment gateway tokenization parameters.
  *
  * These parameters will be used to tokenize/transmit the
  * payment method returned to you in a format you can charge or reference.
  */
@js.native
trait PaymentGatewayTokenizationSpecification extends PaymentMethodTokenizationSpecification {
  
  /**
    * Specific parameters used for payment gateway tokenization.
    */
  var parameters: PaymentGatewayTokenizationParameters = js.native
  
  /**
    * The type of payment method tokenization to apply to the selected
    * payment method.
    */
  var `type`: PAYMENT_GATEWAY = js.native
}
object PaymentGatewayTokenizationSpecification {
  
  @scala.inline
  def apply(parameters: PaymentGatewayTokenizationParameters, `type`: PAYMENT_GATEWAY): PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentGatewayTokenizationSpecification]
  }
  
  @scala.inline
  implicit class PaymentGatewayTokenizationSpecificationOps[Self <: PaymentGatewayTokenizationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: PaymentGatewayTokenizationParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PAYMENT_GATEWAY): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
