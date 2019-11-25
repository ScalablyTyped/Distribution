package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardInfo extends js.Object {
  var billingAddress: js.UndefOr[Address] = js.undefined
  var cardDetails: String
  var cardNetwork: AllowedCardNetwork
}

object CardInfo {
  @scala.inline
  def apply(cardDetails: String, cardNetwork: AllowedCardNetwork, billingAddress: Address = null): CardInfo = {
    val __obj = js.Dynamic.literal(cardDetails = cardDetails.asInstanceOf[js.Any], cardNetwork = cardNetwork.asInstanceOf[js.Any])
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfo]
  }
}

