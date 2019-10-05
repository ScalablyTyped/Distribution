package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePaymentMethodTokenizationSpecification extends js.Object {
  var `type`: TokenizationType
}

object BasePaymentMethodTokenizationSpecification {
  @scala.inline
  def apply(`type`: TokenizationType): BasePaymentMethodTokenizationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BasePaymentMethodTokenizationSpecification]
  }
}

