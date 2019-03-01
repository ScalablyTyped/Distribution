package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPaymentMethodData extends BasePaymentMethodData {
  var info: CardInfo
  @JSName("type")
  var type_CardPaymentMethodData: googlepayLib.googlepayLibStrings.CARD
}

object CardPaymentMethodData {
  @scala.inline
  def apply(
    description: java.lang.String,
    info: CardInfo,
    tokenizationData: PaymentMethodTokenizationData,
    `type`: googlepayLib.googlepayLibStrings.CARD
  ): CardPaymentMethodData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("tokenizationData")(tokenizationData)
    __obj.asInstanceOf[CardPaymentMethodData]
  }
}

