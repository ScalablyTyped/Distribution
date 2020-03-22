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
trait CardParameters extends js.Object {
  /**
    * Whether a credit card may be used for this transaction.
    *
    * If omitted, defaults to `true`.
    *
    * @default true
    */
  var allowCreditCards: js.UndefOr[`false` | `true`] = js.undefined
  /**
    * Whether a prepaid card may be used for this transaction.
    *
    * If omitted, defaults to `true`.
    *
    * @default true
    */
  var allowPrepaidCards: js.UndefOr[`false` | `true`] = js.undefined
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
  var allowedAuthMethods: js.Array[CardAuthMethod]
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
  var allowedCardNetworks: js.Array[CardNetwork]
  /**
    * Optional billing address parameters.
    *
    * If omitted, the default values specified in
    * [[BillingAddressParameters|`BillingAddressParameters`]] will be
    * assumed.
    */
  var billingAddressParameters: js.UndefOr[BillingAddressParameters] = js.undefined
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
  var billingAddressRequired: js.UndefOr[`false` | `true`] = js.undefined
  /**
    * List of card network parameters.
    *
    * This field is optional. You may set it when network specific
    * parameters are needed to complete a transaction.
    */
  var cardNetworkParameters: js.UndefOr[js.Array[CardNetworkParameters]] = js.undefined
}

object CardParameters {
  @scala.inline
  def apply(
    allowedAuthMethods: js.Array[CardAuthMethod],
    allowedCardNetworks: js.Array[CardNetwork],
    allowCreditCards: `false` | `true` = null,
    allowPrepaidCards: `false` | `true` = null,
    billingAddressParameters: BillingAddressParameters = null,
    billingAddressRequired: `false` | `true` = null,
    cardNetworkParameters: js.Array[CardNetworkParameters] = null
  ): CardParameters = {
    val __obj = js.Dynamic.literal(allowedAuthMethods = allowedAuthMethods.asInstanceOf[js.Any], allowedCardNetworks = allowedCardNetworks.asInstanceOf[js.Any])
    if (allowCreditCards != null) __obj.updateDynamic("allowCreditCards")(allowCreditCards.asInstanceOf[js.Any])
    if (allowPrepaidCards != null) __obj.updateDynamic("allowPrepaidCards")(allowPrepaidCards.asInstanceOf[js.Any])
    if (billingAddressParameters != null) __obj.updateDynamic("billingAddressParameters")(billingAddressParameters.asInstanceOf[js.Any])
    if (billingAddressRequired != null) __obj.updateDynamic("billingAddressRequired")(billingAddressRequired.asInstanceOf[js.Any])
    if (cardNetworkParameters != null) __obj.updateDynamic("cardNetworkParameters")(cardNetworkParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardParameters]
  }
}

