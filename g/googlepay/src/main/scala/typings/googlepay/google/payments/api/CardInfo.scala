package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data for a [[PaymentMethodType|`PaymentMethodType.CARD`]] payment
  * method.
  */
@js.native
trait CardInfo extends js.Object {
  /**
    * The billing address associated with the card.
    *
    * Note this billing address will only be populated when billing address
    * is set as required through
    * [[CardParameters.billingAddressRequired|`CardParameters.billingAddressRequired`]].
    */
  var billingAddress: js.UndefOr[Address] = js.native
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
  var cardDetails: String = js.native
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

object CardInfo {
  @scala.inline
  def apply(cardDetails: String, cardNetwork: CardNetwork): CardInfo = {
    val __obj = js.Dynamic.literal(cardDetails = cardDetails.asInstanceOf[js.Any], cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfo]
  }
  @scala.inline
  implicit class CardInfoOps[Self <: CardInfo] (val x: Self) extends AnyVal {
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
    def setCardDetails(value: String): Self = this.set("cardDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardNetwork(value: CardNetwork): Self = this.set("cardNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingAddress(value: Address): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
  }
  
}

