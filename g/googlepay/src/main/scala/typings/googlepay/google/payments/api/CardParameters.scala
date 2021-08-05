package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for [[PaymentMethodType|`PaymentMethodType.CARD`]].
  *
  * The parameters specified here affect which payment methods are
  * available for users to choose from. For example, the list of supported
  * card networks can be filtered by setting the
  * [[CardParameters.allowedCardNetworks|`allowedCardNetworks`]] property.
  */
trait CardParameters extends StObject {
  
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
  
  inline def apply(allowedAuthMethods: js.Array[CardAuthMethod], allowedCardNetworks: js.Array[CardNetwork]): CardParameters = {
    val __obj = js.Dynamic.literal(allowedAuthMethods = allowedAuthMethods.asInstanceOf[js.Any], allowedCardNetworks = allowedCardNetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardParameters]
  }
  
  extension [Self <: CardParameters](x: Self) {
    
    inline def setAllowCreditCards(value: `false` | `true`): Self = StObject.set(x, "allowCreditCards", value.asInstanceOf[js.Any])
    
    inline def setAllowCreditCardsUndefined: Self = StObject.set(x, "allowCreditCards", js.undefined)
    
    inline def setAllowPrepaidCards(value: `false` | `true`): Self = StObject.set(x, "allowPrepaidCards", value.asInstanceOf[js.Any])
    
    inline def setAllowPrepaidCardsUndefined: Self = StObject.set(x, "allowPrepaidCards", js.undefined)
    
    inline def setAllowedAuthMethods(value: js.Array[CardAuthMethod]): Self = StObject.set(x, "allowedAuthMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedAuthMethodsVarargs(value: CardAuthMethod*): Self = StObject.set(x, "allowedAuthMethods", js.Array(value :_*))
    
    inline def setAllowedCardNetworks(value: js.Array[CardNetwork]): Self = StObject.set(x, "allowedCardNetworks", value.asInstanceOf[js.Any])
    
    inline def setAllowedCardNetworksVarargs(value: CardNetwork*): Self = StObject.set(x, "allowedCardNetworks", js.Array(value :_*))
    
    inline def setBillingAddressParameters(value: BillingAddressParameters): Self = StObject.set(x, "billingAddressParameters", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressParametersUndefined: Self = StObject.set(x, "billingAddressParameters", js.undefined)
    
    inline def setBillingAddressRequired(value: `false` | `true`): Self = StObject.set(x, "billingAddressRequired", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressRequiredUndefined: Self = StObject.set(x, "billingAddressRequired", js.undefined)
    
    inline def setCardNetworkParameters(value: js.Array[CardNetworkParameters]): Self = StObject.set(x, "cardNetworkParameters", value.asInstanceOf[js.Any])
    
    inline def setCardNetworkParametersUndefined: Self = StObject.set(x, "cardNetworkParameters", js.undefined)
    
    inline def setCardNetworkParametersVarargs(value: CardNetworkParameters*): Self = StObject.set(x, "cardNetworkParameters", js.Array(value :_*))
  }
}
