package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limited information for a
  * [[PaymentMethodType|`PaymentMethodType.CARD`]] payment method used for
  * developer callbacks.
  */
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
  var cardNetwork: CardNetwork
}

object IntermediateCardInfo {
  @scala.inline
  def apply(cardNetwork: CardNetwork): IntermediateCardInfo = {
    val __obj = js.Dynamic.literal(cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediateCardInfo]
  }
}

