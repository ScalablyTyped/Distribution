package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for [[PaymentMethodType|`PaymentMethodType.CARD`]].
  *
  * The parameters specified here affect which payment methods are
  * available for users to choose from. For example, the list of supported
  * card networks can be filtered by setting the
  * [[CardParameters.allowedCardNetworks|`allowedCardNetworks`]] property.
  */
@js.native
trait CardParameters extends js.Object {
  /**
    * Whether a credit card may be used for this transaction.
    *
    * If omitted, defaults to `true`.
    *
    * @default true
    */
  var allowCreditCards: js.UndefOr[`false` | `true`] = js.native
  /**
    * Whether a prepaid card may be used for this transaction.
    *
    * If omitted, defaults to `true`.
    *
    * @default true
    */
  var allowPrepaidCards: js.UndefOr[`false` | `true`] = js.native
  /**
    * Allowed authentication methods.
    *
    * This field specifies what set of fields or your gateway/processor
    * supports for authenticating a card transaction. Please note that some
    * of your processor's capabilities may vary by market, so consult your
    * processor to determine the authentication forms they support.
    *
    * In general, you should list/support as many authentication methods
    * possible as to increase the chances that a user will be able to
    * complete a purchase. Not all cards support all authentication
    * methods, so the more methods you or your processor support the
    * better.
    *
    * This field is required.
    */
  var allowedAuthMethods: js.Array[CardAuthMethod] = js.native
  /**
    * Allowed card networks.
    *
    * This field specifies what set of card networks your gateway/processor
    * supports for a card transaction.
    *
    * Note: Some cards may contain multiple brands and be processed across
    * different networks. In particular when
    * [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
    * to
    * `"BR", users will be prompted to choose whether to process the
    * transaction over a debit network or credit network and you should use
    * this field to know which network to process the transaction with. For
    * all other markets, this field will be set to a suggestion of a card
    * network to use for processing, but you or your processor may choose
    * to use different rails.
    *
    * This card network value **should not** be displayed.
    *
    * This field is required.
    */
  var allowedCardNetworks: js.Array[CardNetwork] = js.native
  /**
    * Optional billing address parameters.
    *
    * If omitted, the default values specified in
    * [[BillingAddressParameters|`BillingAddressParameters`]] will be
    * assumed.
    */
  var billingAddressParameters: js.UndefOr[BillingAddressParameters] = js.native
  /**
    * Whether a billing address is required from the buyer.
    *
    * If omitted, defaults to `false`.
    *
    * Note: you should only set this field to `true` when billing
    * address is required to process the order. Additional form entry or
    * customer data requests can increase friction during the checkout
    * process and can lead to a lower conversion rate.
    *
    * @default false
    */
  var billingAddressRequired: js.UndefOr[`false` | `true`] = js.native
  /**
    * List of card network parameters.
    *
    * This field is optional. You may set it when network specific
    * parameters are needed to complete a transaction.
    */
  var cardNetworkParameters: js.UndefOr[js.Array[CardNetworkParameters]] = js.native
}

object CardParameters {
  @scala.inline
  def apply(allowedAuthMethods: js.Array[CardAuthMethod], allowedCardNetworks: js.Array[CardNetwork]): CardParameters = {
    val __obj = js.Dynamic.literal(allowedAuthMethods = allowedAuthMethods.asInstanceOf[js.Any], allowedCardNetworks = allowedCardNetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardParameters]
  }
  @scala.inline
  implicit class CardParametersOps[Self <: CardParameters] (val x: Self) extends AnyVal {
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
    def setAllowedAuthMethodsVarargs(value: CardAuthMethod*): Self = this.set("allowedAuthMethods", js.Array(value :_*))
    @scala.inline
    def setAllowedAuthMethods(value: js.Array[CardAuthMethod]): Self = this.set("allowedAuthMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedCardNetworksVarargs(value: CardNetwork*): Self = this.set("allowedCardNetworks", js.Array(value :_*))
    @scala.inline
    def setAllowedCardNetworks(value: js.Array[CardNetwork]): Self = this.set("allowedCardNetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowCreditCards(value: `false` | `true`): Self = this.set("allowCreditCards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCreditCards: Self = this.set("allowCreditCards", js.undefined)
    @scala.inline
    def setAllowPrepaidCards(value: `false` | `true`): Self = this.set("allowPrepaidCards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPrepaidCards: Self = this.set("allowPrepaidCards", js.undefined)
    @scala.inline
    def setBillingAddressParameters(value: BillingAddressParameters): Self = this.set("billingAddressParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddressParameters: Self = this.set("billingAddressParameters", js.undefined)
    @scala.inline
    def setBillingAddressRequired(value: `false` | `true`): Self = this.set("billingAddressRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddressRequired: Self = this.set("billingAddressRequired", js.undefined)
    @scala.inline
    def setCardNetworkParametersVarargs(value: CardNetworkParameters*): Self = this.set("cardNetworkParameters", js.Array(value :_*))
    @scala.inline
    def setCardNetworkParameters(value: js.Array[CardNetworkParameters]): Self = this.set("cardNetworkParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardNetworkParameters: Self = this.set("cardNetworkParameters", js.undefined)
  }
  
}

