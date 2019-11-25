package typings.googlepay.google.payments.api

import typings.googlepay.googlepayStrings.CARD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPaymentMethodData extends BasePaymentMethodData {
  var info: CardInfo
  @JSName("type")
  var type_CardPaymentMethodData: CARD
}

object CardPaymentMethodData {
  @scala.inline
  def apply(description: String, info: CardInfo, tokenizationData: PaymentMethodTokenizationData, `type`: CARD): CardPaymentMethodData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tokenizationData = tokenizationData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPaymentMethodData]
  }
}

