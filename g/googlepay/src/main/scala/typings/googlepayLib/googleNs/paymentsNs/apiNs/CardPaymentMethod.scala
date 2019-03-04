package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPaymentMethod extends BasePaymentMethod {
  var parameters: CardParameters
  @JSName("type")
  var type_CardPaymentMethod: googlepayLib.googlepayLibStrings.CARD
}

object CardPaymentMethod {
  @scala.inline
  def apply(
    parameters: CardParameters,
    `type`: googlepayLib.googlepayLibStrings.CARD,
    tokenizationSpecification: PaymentMethodTokenizationSpecification = null
  ): CardPaymentMethod = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    if (tokenizationSpecification != null) __obj.updateDynamic("tokenizationSpecification")(tokenizationSpecification)
    __obj.asInstanceOf[CardPaymentMethod]
  }
}

