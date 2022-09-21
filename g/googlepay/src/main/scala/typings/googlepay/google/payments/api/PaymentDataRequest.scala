package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for payment data.
  *
  * Contains several options to describe which information is being
  * requested and how it will be transferred.
  */
trait PaymentDataRequest extends StObject {
  
  /**
    * List of allowed payment methods.
    *
    * This field is required and must contain at least one
    * [[PaymentMethodSpecification|`PaymentMethodSpecification`]].
    */
  var allowedPaymentMethods: js.Array[PaymentMethodSpecification]
  
  /**
    * Major API version.
    *
    * For this specification's version, this value should be 2.
    *
    * This field is required.
    */
  var apiVersion: Double
  
  /**
    * Minor API version.
    *
    * For this specification's version, this value should be 0.
    *
    * This field is required.
    */
  var apiVersionMinor: Double
  
  /**
    * List of callbacks that the developer intents to handle.
    * Upon selection by the user, these intents can be used to update the
    * request with new data based on that selection (e.g. if a shipping
    * option is selected, the developer could update the `transactionInfo`
    * with new `totalPrice` and `diplayItems`).
    *
    * Note: This  functionality is only available for web.
    */
  var callbackIntents: js.UndefOr[js.Array[CallbackIntent]] = js.undefined
  
  /**
    * Whether to collect the email from the buyer.
    *
    * The returned email can be retrieved from
    * [[PaymentData.email|`PaymentData.email`]]
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var emailRequired: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * Detailed merchant information.
    *
    * This field is required.
    */
  var merchantInfo: MerchantInfo
  
  /**
    * Offers available for redemption that can be used with the current
    * order.
    */
  var offerInfo: js.UndefOr[OfferInfo] = js.undefined
  
  /**
    * Optional shipping address parameters.
    *
    * If omitted, the default values specified in
    * [[ShippingAddressParameters|`ShippingAddressParameters`]] will be
    * assumed.
    */
  var shippingAddressParameters: js.UndefOr[ShippingAddressParameters] = js.undefined
  
  /**
    * Whether a shipping address is required from the buyer.
    *
    * The returned shipping address can be retrieved from
    * [[Address|`Address`]].
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var shippingAddressRequired: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * Parameters for shipping option that can be used in this request.
    *
    * This should only be set if
    * [[PaymentDataRequest.shippingOptionRequired|`PaymentDataRequest.shippingOptionRequired`]]
    * is set to true.
    *
    * Note: This field is currently only for web only.
    */
  var shippingOptionParameters: js.UndefOr[ShippingOptionParameters] = js.undefined
  
  /**
    * Whether a shipping option is required from the buyer.
    *
    * If omitted, defaults to `false`.
    * Note: This field is currently only for web only.
    *
    * @default false
    */
  var shippingOptionRequired: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * Detailed information about the transaction.
    *
    * This field is required.
    */
  var transactionInfo: TransactionInfo
}
object PaymentDataRequest {
  
  inline def apply(
    allowedPaymentMethods: js.Array[PaymentMethodSpecification],
    apiVersion: Double,
    apiVersionMinor: Double,
    merchantInfo: MerchantInfo,
    transactionInfo: TransactionInfo
  ): PaymentDataRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], merchantInfo = merchantInfo.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataRequest]
  }
  
  extension [Self <: PaymentDataRequest](x: Self) {
    
    inline def setAllowedPaymentMethods(value: js.Array[PaymentMethodSpecification]): Self = StObject.set(x, "allowedPaymentMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedPaymentMethodsVarargs(value: PaymentMethodSpecification*): Self = StObject.set(x, "allowedPaymentMethods", js.Array(value*))
    
    inline def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionMinor(value: Double): Self = StObject.set(x, "apiVersionMinor", value.asInstanceOf[js.Any])
    
    inline def setCallbackIntents(value: js.Array[CallbackIntent]): Self = StObject.set(x, "callbackIntents", value.asInstanceOf[js.Any])
    
    inline def setCallbackIntentsUndefined: Self = StObject.set(x, "callbackIntents", js.undefined)
    
    inline def setCallbackIntentsVarargs(value: CallbackIntent*): Self = StObject.set(x, "callbackIntents", js.Array(value*))
    
    inline def setEmailRequired(value: `false` | `true`): Self = StObject.set(x, "emailRequired", value.asInstanceOf[js.Any])
    
    inline def setEmailRequiredUndefined: Self = StObject.set(x, "emailRequired", js.undefined)
    
    inline def setMerchantInfo(value: MerchantInfo): Self = StObject.set(x, "merchantInfo", value.asInstanceOf[js.Any])
    
    inline def setOfferInfo(value: OfferInfo): Self = StObject.set(x, "offerInfo", value.asInstanceOf[js.Any])
    
    inline def setOfferInfoUndefined: Self = StObject.set(x, "offerInfo", js.undefined)
    
    inline def setShippingAddressParameters(value: ShippingAddressParameters): Self = StObject.set(x, "shippingAddressParameters", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressParametersUndefined: Self = StObject.set(x, "shippingAddressParameters", js.undefined)
    
    inline def setShippingAddressRequired(value: `false` | `true`): Self = StObject.set(x, "shippingAddressRequired", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressRequiredUndefined: Self = StObject.set(x, "shippingAddressRequired", js.undefined)
    
    inline def setShippingOptionParameters(value: ShippingOptionParameters): Self = StObject.set(x, "shippingOptionParameters", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionParametersUndefined: Self = StObject.set(x, "shippingOptionParameters", js.undefined)
    
    inline def setShippingOptionRequired(value: `false` | `true`): Self = StObject.set(x, "shippingOptionRequired", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionRequiredUndefined: Self = StObject.set(x, "shippingOptionRequired", js.undefined)
    
    inline def setTransactionInfo(value: TransactionInfo): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
  }
}
