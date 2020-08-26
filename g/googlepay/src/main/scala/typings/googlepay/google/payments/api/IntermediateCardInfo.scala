package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limited information for a
  * [[PaymentMethodType|`PaymentMethodType.CARD`]] payment method used for
  * developer callbacks.
  */
@js.native
trait IntermediateCardInfo extends js.Object {
  /**
    * The card network.
    *
    * This card network value **should not** be displayed to
    * the buyer, but can be used when the details of a buyer's card are
    * needed. An example would be for customer support to help the buyer
    * identify the card used for this transaction. For a user-visible
    * description, use
    * [[PaymentMethodData.description|`PaymentMethodData.description`]]
    * instead.
    */
  var cardNetwork: CardNetwork = js.native
}

object IntermediateCardInfo {
  @scala.inline
  def apply(cardNetwork: CardNetwork): IntermediateCardInfo = {
    val __obj = js.Dynamic.literal(cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediateCardInfo]
  }
  @scala.inline
  implicit class IntermediateCardInfoOps[Self <: IntermediateCardInfo] (val x: Self) extends AnyVal {
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
    def setCardNetwork(value: CardNetwork): Self = this.set("cardNetwork", value.asInstanceOf[js.Any])
  }
  
}

