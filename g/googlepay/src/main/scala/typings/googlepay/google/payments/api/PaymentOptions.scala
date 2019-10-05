package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentOptions extends js.Object {
  var environment: js.UndefOr[EnvironmentType] = js.undefined
}

object PaymentOptions {
  @scala.inline
  def apply(environment: EnvironmentType = null): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    __obj.asInstanceOf[PaymentOptions]
  }
}

