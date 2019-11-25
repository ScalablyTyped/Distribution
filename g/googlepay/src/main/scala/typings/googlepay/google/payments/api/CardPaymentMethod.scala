package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.CARD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPaymentMethod extends BasePaymentMethod {
  var parameters: CardParameters
  @JSName("type")
  var type_CardPaymentMethod: CARD
}

object CardPaymentMethod {
  @scala.inline
  def apply(
    parameters: CardParameters,
    `type`: CARD,
    tokenizationSpecification: PaymentMethodTokenizationSpecification = null
  ): CardPaymentMethod = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokenizationSpecification != null) __obj.updateDynamic("tokenizationSpecification")(tokenizationSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPaymentMethod]
  }
}

