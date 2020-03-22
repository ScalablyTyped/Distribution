package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limited data for a payment method for developer callbacks.
  */
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
  var info: js.UndefOr[IntermediateCardInfo] = js.undefined
  /**
    * Type of payment method.
    */
  var `type`: PaymentMethodType
}

object IntermediatePaymentMethodData {
  @scala.inline
  def apply(`type`: PaymentMethodType, info: IntermediateCardInfo = null): IntermediatePaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentMethodData]
  }
}

