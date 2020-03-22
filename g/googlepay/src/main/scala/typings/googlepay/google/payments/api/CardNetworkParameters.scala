package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for card networks that can be used in this request.
  *
  * This should only be set for [[PaymentMethodType|`CARD`]].
  */
trait CardNetworkParameters extends js.Object {
  /**
    * Acquiring institution identification code as assigned by the DS
    * receiving the AReq message for the given card network.
    *
    * This is an optional field. We recommend setting this field to allow
    * SCA challenges to be done for the given card network.
    */
  var acquirerBin: js.UndefOr[String] = js.undefined
  /**
    * Acquirer-assigned Merchant identifier for VISA.
    *
    * This is an optional field. We recommend setting this field to allow
    * SCA challenges to be done for the given card network.
    */
  var acquirerMerchantId: js.UndefOr[String] = js.undefined
  /**
    * Type of card network parameters. Currently only
    * [[CardNetwork|`VISA`]] and [[CardNetwork|`MASTERCARD`]] are
    * supported.
    *
    * This field is required.
    */
  var cardNetwork: CardNetwork
}

object CardNetworkParameters {
  @scala.inline
  def apply(cardNetwork: CardNetwork, acquirerBin: String = null, acquirerMerchantId: String = null): CardNetworkParameters = {
    val __obj = js.Dynamic.literal(cardNetwork = cardNetwork.asInstanceOf[js.Any])
    if (acquirerBin != null) __obj.updateDynamic("acquirerBin")(acquirerBin.asInstanceOf[js.Any])
    if (acquirerMerchantId != null) __obj.updateDynamic("acquirerMerchantId")(acquirerMerchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNetworkParameters]
  }
}

