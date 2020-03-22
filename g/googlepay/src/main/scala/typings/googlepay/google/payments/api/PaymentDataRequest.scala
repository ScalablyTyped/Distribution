package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for payment data.
  *
  * Contains several options to describe which information is being
  * requested and how it will be transferred.
  */
trait PaymentDataRequest extends js.Object {
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
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethodSpecification],
    apiVersion: Double,
    apiVersionMinor: Double,
    merchantInfo: MerchantInfo,
    transactionInfo: TransactionInfo,
    callbackIntents: js.Array[CallbackIntent] = null,
    emailRequired: `false` | `true` = null,
    shippingAddressParameters: ShippingAddressParameters = null,
    shippingAddressRequired: `false` | `true` = null,
    shippingOptionParameters: ShippingOptionParameters = null,
    shippingOptionRequired: `false` | `true` = null
  ): PaymentDataRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], merchantInfo = merchantInfo.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    if (callbackIntents != null) __obj.updateDynamic("callbackIntents")(callbackIntents.asInstanceOf[js.Any])
    if (emailRequired != null) __obj.updateDynamic("emailRequired")(emailRequired.asInstanceOf[js.Any])
    if (shippingAddressParameters != null) __obj.updateDynamic("shippingAddressParameters")(shippingAddressParameters.asInstanceOf[js.Any])
    if (shippingAddressRequired != null) __obj.updateDynamic("shippingAddressRequired")(shippingAddressRequired.asInstanceOf[js.Any])
    if (shippingOptionParameters != null) __obj.updateDynamic("shippingOptionParameters")(shippingOptionParameters.asInstanceOf[js.Any])
    if (shippingOptionRequired != null) __obj.updateDynamic("shippingOptionRequired")(shippingOptionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataRequest]
  }
}

