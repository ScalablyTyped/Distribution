package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum string for the callback intents.
  *
  * Options:
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs when shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs when shipping option is changed.
  *
  *   If this callback intent is set, then
  *   [[PaymentDataRequest.shippingOptionRequired|`PaymentDataRequest.shippingOptionRequired`]]
  *   must be set to true.
  *
  *   [[PaymentDataRequest.shippingOptionParameters|`PaymentDataRequest.shippingOptionParameters`]]
  *   can optionally be set, if omitted, we will render a placeholder
  *   shipping option named "Shipping option pending" with id
  *   "shipping_option_unselected".
  *
  *   If developers receive a
  *   [[IntermediatePaymentData.shippingOptionData|`IntermediatePaymentData.shippingOptionData`]]
  *   with id "shipping_option_unselected", it means they need to populate
  *   valid
  *   [[PaymentDataRequest.shippingOptionParameters|`PaymentDataRequest.shippingOptionParameters`]]
  *   in the
  *   [[PaymentDataRequestUpdate.newShippingOptionParameters|`PaymentDataRequestUpdate.newShippingOptionParameters`]].
  *
  * - `PAYMENT_AUTHORIZATION`:
  *   Callback occurs when user authorized payment and
  *   [[PaymentData|`PaymentData`]] will be returned.
  *
  * - `PAYMENT_METHOD`:
  *   Callback occurs when payment method is changed.
  *
  *   Developer will receive callback data in
  *   [[IntermediatePaymentData.paymentMethodData|`IntermediatePaymentData.paymentMethodData`]]
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typings.googlepay.googlepayStrings.SHIPPING_OPTION
  - typings.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION
  - typings.googlepay.googlepayStrings.PAYMENT_METHOD
*/
trait CallbackIntent extends js.Object

object CallbackIntent {
  @scala.inline
  def PAYMENT_AUTHORIZATION: typings.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION = this.cast("PAYMENT_AUTHORIZATION")
  @scala.inline
  def PAYMENT_METHOD: typings.googlepay.googlepayStrings.PAYMENT_METHOD = this.cast("PAYMENT_METHOD")
  @scala.inline
  def SHIPPING_ADDRESS: typings.googlepay.googlepayStrings.SHIPPING_ADDRESS = this.cast("SHIPPING_ADDRESS")
  @scala.inline
  def SHIPPING_OPTION: typings.googlepay.googlepayStrings.SHIPPING_OPTION = this.cast("SHIPPING_OPTION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

