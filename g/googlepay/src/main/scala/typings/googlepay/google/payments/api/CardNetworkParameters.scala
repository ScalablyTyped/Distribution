package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for card networks that can be used in this request.
  *
  * This should only be set for [[PaymentMethodType|`CARD`]].
  */
@js.native
trait CardNetworkParameters extends js.Object {
  /**
    * Acquiring institution identification code as assigned by the DS
    * receiving the AReq message for the given card network.
    *
    * This is an optional field. We recommend setting this field to allow
    * SCA challenges to be done for the given card network.
    */
  var acquirerBin: js.UndefOr[String] = js.native
  /**
    * Acquirer-assigned Merchant identifier for VISA.
    *
    * This is an optional field. We recommend setting this field to allow
    * SCA challenges to be done for the given card network.
    */
  var acquirerMerchantId: js.UndefOr[String] = js.native
  /**
    * Type of card network parameters. Currently only
    * [[CardNetwork|`VISA`]] and [[CardNetwork|`MASTERCARD`]] are
    * supported.
    *
    * This field is required.
    */
  var cardNetwork: CardNetwork = js.native
}

object CardNetworkParameters {
  @scala.inline
  def apply(cardNetwork: CardNetwork): CardNetworkParameters = {
    val __obj = js.Dynamic.literal(cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNetworkParameters]
  }
  @scala.inline
  implicit class CardNetworkParametersOps[Self <: CardNetworkParameters] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setAcquirerBin(value: String): Self = this.set("acquirerBin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquirerBin: Self = this.set("acquirerBin", js.undefined)
    @scala.inline
    def setAcquirerMerchantId(value: String): Self = this.set("acquirerMerchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquirerMerchantId: Self = this.set("acquirerMerchantId", js.undefined)
  }
  
}

