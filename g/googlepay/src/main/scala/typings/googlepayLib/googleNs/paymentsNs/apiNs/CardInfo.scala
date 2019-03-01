package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardInfo extends js.Object {
  var billingAddress: js.UndefOr[Address] = js.undefined
  var cardDetails: java.lang.String
  var cardNetwork: AllowedCardNetwork
}

object CardInfo {
  @scala.inline
  def apply(cardDetails: java.lang.String, cardNetwork: AllowedCardNetwork, billingAddress: Address = null): CardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardDetails")(cardDetails)
    __obj.updateDynamic("cardNetwork")(cardNetwork)
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress)
    __obj.asInstanceOf[CardInfo]
  }
}

