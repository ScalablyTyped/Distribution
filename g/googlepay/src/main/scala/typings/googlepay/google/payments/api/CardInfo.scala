package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data for a [[PaymentMethodType|`PaymentMethodType.CARD`]] payment
  * method.
  */
trait CardInfo extends js.Object {
  /**
    * The billing address associated with the card.
    *
    * Note this billing address will only be populated when billing address
    * is set as required through
    * [[CardParameters.billingAddressRequired|`CardParameters.billingAddressRequired`]].
    */
  var billingAddress: js.UndefOr[Address] = js.undefined
  /**
    * The details about the card.
    *
    * This value will be generally the last 4 digits of the card.
    *
    * These details **should not** be displayed to the buyer,
    * but can be used when the details of a buyer's card are needed. An
    * example would be for customer support to help the buyer identify the
    * card used for this transaction. For a user-visible description, use
    * [[PaymentMethodData.description|`PaymentMethodData.description`]]
    * instead.
    */
  var cardDetails: String
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

object CardInfo {
  @scala.inline
  def apply(cardDetails: String, cardNetwork: CardNetwork, billingAddress: Address = null): CardInfo = {
    val __obj = js.Dynamic.literal(cardDetails = cardDetails.asInstanceOf[js.Any], cardNetwork = cardNetwork.asInstanceOf[js.Any])
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfo]
  }
}

