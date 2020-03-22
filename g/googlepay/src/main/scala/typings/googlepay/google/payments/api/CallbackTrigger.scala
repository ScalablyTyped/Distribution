package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum string for the callback trigger.
  *
  * Options:
  *
  * - `OFFER_INFO`:
  *   Callback occurs after offer info is changed.
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs after shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs after shipping option is changed.
  *
  * - `INITIALIZE`:
  *   Callback occurs on initialize, every field specified by callback
  *   intent would be returned in
  *   [[IntermediatePaymentData|`IntermediatePaymentData`]] if applicable.
  *
  *   Note that this callback trigger may be triggered multiple times along
  *   a single call to loadPaymentData, so you must make sure you can
  *   handle multiple calls to it. For example, when the user changes
  *   accounts, we will call initialize again with data from the new
  *   account.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.OFFER_INFO
  - typings.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typings.googlepay.googlepayStrings.SHIPPING_OPTION
  - typings.googlepay.googlepayStrings.INITIALIZE
*/
trait CallbackTrigger extends js.Object

object CallbackTrigger {
  @scala.inline
  def INITIALIZE: typings.googlepay.googlepayStrings.INITIALIZE = this.cast("INITIALIZE")
  @scala.inline
  def OFFER_INFO: typings.googlepay.googlepayStrings.OFFER_INFO = this.cast("OFFER_INFO")
  @scala.inline
  def SHIPPING_ADDRESS: typings.googlepay.googlepayStrings.SHIPPING_ADDRESS = this.cast("SHIPPING_ADDRESS")
  @scala.inline
  def SHIPPING_OPTION: typings.googlepay.googlepayStrings.SHIPPING_OPTION = this.cast("SHIPPING_OPTION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

