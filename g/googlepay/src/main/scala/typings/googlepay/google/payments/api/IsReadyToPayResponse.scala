package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsReadyToPayResponse extends js.Object {
  var paymentMethodPresent: js.UndefOr[Boolean] = js.undefined
  var result: Boolean
}

object IsReadyToPayResponse {
  @scala.inline
  def apply(result: Boolean, paymentMethodPresent: js.UndefOr[Boolean] = js.undefined): IsReadyToPayResponse = {
    val __obj = js.Dynamic.literal(result = result)
    if (!js.isUndefined(paymentMethodPresent)) __obj.updateDynamic("paymentMethodPresent")(paymentMethodPresent)
    __obj.asInstanceOf[IsReadyToPayResponse]
  }
}

