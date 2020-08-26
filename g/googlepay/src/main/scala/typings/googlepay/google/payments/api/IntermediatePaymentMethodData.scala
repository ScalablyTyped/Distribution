package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limited data for a payment method for developer callbacks.
  */
@js.native
trait IntermediatePaymentMethodData extends js.Object {
  /**
    * Payment method information.
    *
    * The definition of this field depends
    * on which payment method type was set in
    * [[PaymentMethodData.type|`PaymentMethodData.type`]].
    *
    * - For [[PaymentMethodType|`PaymentMethodType.CARD`]], this field
    *   will be an object conforming to
    *   [[IntermediateCardInfo|`IntermediateCardInfo`]].
    */
  var info: js.UndefOr[IntermediateCardInfo] = js.native
  /**
    * Type of payment method.
    */
  var `type`: PaymentMethodType = js.native
}

object IntermediatePaymentMethodData {
  @scala.inline
  def apply(`type`: PaymentMethodType): IntermediatePaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentMethodData]
  }
  @scala.inline
  implicit class IntermediatePaymentMethodDataOps[Self <: IntermediatePaymentMethodData] (val x: Self) extends AnyVal {
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
    def setType(value: PaymentMethodType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: IntermediateCardInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
  }
  
}

