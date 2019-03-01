package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReadyToPayResponse extends js.Object {
  var paymentMethodPresent: js.UndefOr[scala.Boolean] = js.undefined
  var result: scala.Boolean
}

object IsReadyToPayResponse {
  @scala.inline
  def apply(result: scala.Boolean, paymentMethodPresent: js.UndefOr[scala.Boolean] = js.undefined): IsReadyToPayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    if (!js.isUndefined(paymentMethodPresent)) __obj.updateDynamic("paymentMethodPresent")(paymentMethodPresent)
    __obj.asInstanceOf[IsReadyToPayResponse]
  }
}

