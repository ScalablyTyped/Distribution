package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Intermediate version of payment data.
  *
  * Contains limited user information for developer callbacks.
  */
@js.native
trait IntermediatePaymentData extends js.Object {
  /**
    * Indicate the changing field that triggers the callback.
    */
  var callbackTrigger: js.Array[CallbackTrigger] = js.native
  /**
    * Contains limited data for user selected card information.
    */
  var paymentMethodData: IntermediatePaymentMethodData = js.native
  /**
    * Contains limited data for user selected shipping address information.
    */
  var shippingAddress: js.UndefOr[IntermediateAddress] = js.native
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.native
}

object IntermediatePaymentData {
  @scala.inline
  def apply(callbackTrigger: js.Array[CallbackTrigger], paymentMethodData: IntermediatePaymentMethodData): IntermediatePaymentData = {
    val __obj = js.Dynamic.literal(callbackTrigger = callbackTrigger.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentData]
  }
  @scala.inline
  implicit class IntermediatePaymentDataOps[Self <: IntermediatePaymentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallbackTriggerVarargs(value: CallbackTrigger*): Self = this.set("callbackTrigger", js.Array(value :_*))
    @scala.inline
    def setCallbackTrigger(value: js.Array[CallbackTrigger]): Self = this.set("callbackTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentMethodData(value: IntermediatePaymentMethodData): Self = this.set("paymentMethodData", value.asInstanceOf[js.Any])
    @scala.inline
    def setShippingAddress(value: IntermediateAddress): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddress: Self = this.set("shippingAddress", js.undefined)
    @scala.inline
    def setShippingOptionData(value: SelectionOptionData): Self = this.set("shippingOptionData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOptionData: Self = this.set("shippingOptionData", js.undefined)
  }
  
}

