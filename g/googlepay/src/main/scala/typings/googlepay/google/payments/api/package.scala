package typings.googlepay.google.payments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object api {
  import typings.googlepay.googlepayStrings.CARD

  type AllowedPaymentMethodType = CARD
  type PaymentMethod = CardPaymentMethod
  type PaymentMethodData = CardPaymentMethodData
}
