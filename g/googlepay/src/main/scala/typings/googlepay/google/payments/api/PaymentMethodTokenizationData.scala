package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodTokenizationData extends js.Object {
  var token: js.UndefOr[String] = js.undefined
  var `type`: TokenizationType
}

object PaymentMethodTokenizationData {
  @scala.inline
  def apply(`type`: TokenizationType, token: String = null): PaymentMethodTokenizationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodTokenizationData]
  }
}

