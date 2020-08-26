package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tokenization data for the payment method.
  *
  * @see PaymentMethodTokenizationSpecification
  */
@js.native
trait PaymentMethodTokenizationData extends js.Object {
  /**
    * The generated payment method token.
    *
    * The contents of this token and how it should be used will depend on
    * the selected
    * [[PaymentMethodTokenizationSpecification.type|`PaymentMethodTokenizationSpecification.type`]].
    */
  var token: String = js.native
  /**
    * The type of tokenization to be applied to the selected payment
    * method.
    *
    * This value will match the
    * [[PaymentMethodTokenizationSpecification.type|`PaymentMethodTokenizationSpecification.type`]]
    * specified in the request.
    */
  var `type`: PaymentMethodTokenizationType = js.native
}

object PaymentMethodTokenizationData {
  @scala.inline
  def apply(token: String, `type`: PaymentMethodTokenizationType): PaymentMethodTokenizationData = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationData]
  }
  @scala.inline
  implicit class PaymentMethodTokenizationDataOps[Self <: PaymentMethodTokenizationData] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PaymentMethodTokenizationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

