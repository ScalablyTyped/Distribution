package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.DIRECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DirectTokenizationSpecificationOps[Self <: DirectTokenizationSpecification] (val x: Self) extends AnyVal {
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
    def setParameters(value: DirectTokenizationParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DIRECT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

