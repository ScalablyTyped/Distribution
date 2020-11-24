package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for payment data.
  *
  * Contains several options to describe which information is being
  * requested and how it will be transferred.
  */
@js.native
trait PaymentDataRequest extends js.Object {
  
  /**
    * List of allowed payment methods.
    *
    * This field is required and must contain at least one
    * [[PaymentMethodSpecification|`PaymentMethodSpecification`]].
    */
  var allowedPaymentMethods: js.Array[PaymentMethodSpecification] = js.native
  
  /**
    * Major API version.
    *
    * For this specification's version, this value should be 2.
    *
    * This field is required.
    */
  var apiVersion: Double = js.native
  
  /**
    * Minor API version.
    *
    * For this specification's version, this value should be 0.
    *
    * This field is required.
    */
  var apiVersionMinor: Double = js.native
  
  /**
    * List of callbacks that the developer intents to handle.
    * Upon selection by the user, these intents can be used to update the
    * request with new data based on that selection (e.g. if a shipping
    * option is selected, the developer could update the `transactionInfo`
    * with new `totalPrice` and `diplayItems`).
    *
    * Note: This  functionality is only available for web.
    */
  var callbackIntents: js.UndefOr[js.Array[CallbackIntent]] = js.native
  
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
  var emailRequired: js.UndefOr[`false` | `true`] = js.native
  
  /**
    * Detailed merchant information.
    *
    * This field is required.
    */
  var merchantInfo: MerchantInfo = js.native
  
  /**
    * Optional shipping address parameters.
    *
    * If omitted, the default values specified in
    * [[ShippingAddressParameters|`ShippingAddressParameters`]] will be
    * assumed.
    */
  var shippingAddressParameters: js.UndefOr[ShippingAddressParameters] = js.native
  
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
  var shippingAddressRequired: js.UndefOr[`false` | `true`] = js.native
  
  /**
    * Parameters for shipping option that can be used in this request.
    *
    * This should only be set if
    * [[PaymentDataRequest.shippingOptionRequired|`PaymentDataRequest.shippingOptionRequired`]]
    * is set to true.
    *
    * Note: This field is currently only for web only.
    */
  var shippingOptionParameters: js.UndefOr[ShippingOptionParameters] = js.native
  
  /**
    * Whether a shipping option is required from the buyer.
    *
    * If omitted, defaults to `false`.
    * Note: This field is currently only for web only.
    *
    * @default false
    */
  var shippingOptionRequired: js.UndefOr[`false` | `true`] = js.native
  
  /**
    * Detailed information about the transaction.
    *
    * This field is required.
    */
  var transactionInfo: TransactionInfo = js.native
}
object PaymentDataRequest {
  
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethodSpecification],
    apiVersion: Double,
    apiVersionMinor: Double,
    merchantInfo: MerchantInfo,
    transactionInfo: TransactionInfo
  ): PaymentDataRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], merchantInfo = merchantInfo.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataRequest]
  }
  
  @scala.inline
  implicit class PaymentDataRequestOps[Self <: PaymentDataRequest] (val x: Self) extends AnyVal {
    
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
    def setAllowedPaymentMethodsVarargs(value: PaymentMethodSpecification*): Self = this.set("allowedPaymentMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPaymentMethods(value: js.Array[PaymentMethodSpecification]): Self = this.set("allowedPaymentMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: Double): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionMinor(value: Double): Self = this.set("apiVersionMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantInfo(value: MerchantInfo): Self = this.set("merchantInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionInfo(value: TransactionInfo): Self = this.set("transactionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackIntentsVarargs(value: CallbackIntent*): Self = this.set("callbackIntents", js.Array(value :_*))
    
    @scala.inline
    def setCallbackIntents(value: js.Array[CallbackIntent]): Self = this.set("callbackIntents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackIntents: Self = this.set("callbackIntents", js.undefined)
    
    @scala.inline
    def setEmailRequired(value: `false` | `true`): Self = this.set("emailRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailRequired: Self = this.set("emailRequired", js.undefined)
    
    @scala.inline
    def setShippingAddressParameters(value: ShippingAddressParameters): Self = this.set("shippingAddressParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingAddressParameters: Self = this.set("shippingAddressParameters", js.undefined)
    
    @scala.inline
    def setShippingAddressRequired(value: `false` | `true`): Self = this.set("shippingAddressRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingAddressRequired: Self = this.set("shippingAddressRequired", js.undefined)
    
    @scala.inline
    def setShippingOptionParameters(value: ShippingOptionParameters): Self = this.set("shippingOptionParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOptionParameters: Self = this.set("shippingOptionParameters", js.undefined)
    
    @scala.inline
    def setShippingOptionRequired(value: `false` | `true`): Self = this.set("shippingOptionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOptionRequired: Self = this.set("shippingOptionRequired", js.undefined)
  }
}
