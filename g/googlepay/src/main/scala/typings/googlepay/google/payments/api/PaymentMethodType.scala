package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment method type enum string.
  *
  * Options:
  *
  * - `CARD`:
  *   CARD payment method.
  *
  *   Note that the payment method information that may be returned to you
  *   or your processor for a credit card transaction is meant to be used
  *   only once. If you need to charge the user again you must call the
  *   APIs to obtain new payment credentials.
  *
  *   Also note that when we transfer information like PAN (personal
  *   account number) to either you or your gateway/processor, they may not
  *   correspond to the user's physical card. For support purposes, please
  *   use user's card info returned in [[CardInfo|`CardInfo`]] instead.
  *
  * - `PAYPAL`:
  *   PAYPAL payment method.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.CARD
  - typings.googlepay.googlepayStrings.PAYPAL
*/
trait PaymentMethodType extends js.Object

object PaymentMethodType {
  @scala.inline
  def CARD: typings.googlepay.googlepayStrings.CARD = this.cast("CARD")
  @scala.inline
  def PAYPAL: typings.googlepay.googlepayStrings.PAYPAL = this.cast("PAYPAL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

