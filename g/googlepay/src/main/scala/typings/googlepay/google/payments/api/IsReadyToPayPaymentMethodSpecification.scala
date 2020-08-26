package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification of accepted payment method for use in `isReadyToPay`.
  */
@js.native
trait IsReadyToPayPaymentMethodSpecification extends js.Object {
  /**
    * Payment method parameters.
    *
    * The parameters set here affect which payment methods will be
    * available for the user to choose from.
    */
  var parameters: CardParameters = js.native
  /**
    * Tokenization parameters.
    *
    * These parameters will be used to tokenize/transmit the
    * payment method returned to you in a format you can charge or
    * reference.
    */
  var tokenizationSpecification: js.UndefOr[PaymentMethodTokenizationSpecification] = js.native
  /**
    * Type of payment method.
    *
    * This field is required.
    */
  var `type`: PaymentMethodType = js.native
}

object IsReadyToPayPaymentMethodSpecification {
  @scala.inline
  def apply(parameters: CardParameters, `type`: PaymentMethodType): IsReadyToPayPaymentMethodSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayPaymentMethodSpecification]
  }
  @scala.inline
  implicit class IsReadyToPayPaymentMethodSpecificationOps[Self <: IsReadyToPayPaymentMethodSpecification] (val x: Self) extends AnyVal {
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
    def setParameters(value: CardParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PaymentMethodType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenizationSpecification(value: PaymentMethodTokenizationSpecification): Self = this.set("tokenizationSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenizationSpecification: Self = this.set("tokenizationSpecification", js.undefined)
  }
  
}

