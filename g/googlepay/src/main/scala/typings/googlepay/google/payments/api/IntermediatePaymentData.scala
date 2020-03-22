package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Intermediate version of payment data.
  *
  * Contains limited user information for developer callbacks.
  */
trait IntermediatePaymentData extends js.Object {
  /**
    * Indicate the changing field that triggers the callback.
    */
  var callbackTrigger: js.Array[CallbackTrigger]
  /**
    * Contains limited data for user selected card information.
    */
  var paymentMethodData: IntermediatePaymentMethodData
  /**
    * Contains limited data for user selected shipping address information.
    */
  var shippingAddress: js.UndefOr[IntermediateAddress] = js.undefined
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.undefined
}

object IntermediatePaymentData {
  @scala.inline
  def apply(
    callbackTrigger: js.Array[CallbackTrigger],
    paymentMethodData: IntermediatePaymentMethodData,
    shippingAddress: IntermediateAddress = null,
    shippingOptionData: SelectionOptionData = null
  ): IntermediatePaymentData = {
    val __obj = js.Dynamic.literal(callbackTrigger = callbackTrigger.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    if (shippingOptionData != null) __obj.updateDynamic("shippingOptionData")(shippingOptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentData]
  }
}

