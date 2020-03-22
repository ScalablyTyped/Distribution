package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the user's ability to display the Google Pay payment sheet
  * and provide at least one of the payment methods specified.
  *
  * A user's ability to pay may be tied to the capabilities of the current
  * context (browser/device) to display required components for the
  * specified payment methods including logging in to a Google Account and
  * providing one of the payment methods specified in
  * [[IsReadyToPayRequest.allowedPaymentMethods|`allowedPaymentMethods`]]
  *
  * Optionally provides a signal if one or more of the specified payment
  * methods exists for the current user.
  */
trait IsReadyToPayRequest extends js.Object {
  /**
    * List of allowed payment methods.
    *
    * This field is required and must contain at least one
    * [[PaymentMethodSpecification|`PaymentMethodSpecification`]].
    *
    * Note that when
    * [[PaymentMethodSpecification|`PaymentMethodSpecification`]] is used
    * within an IsReadyToPayRequest not all fields are required. For
    * example,
    * [[PaymentMethodSpecification.tokenizationSpecification|`PaymentMethodSpecification.tokenizationSpecification`]]
    * is ignored by the `isReadyToPay` client method so you may leave it
    * unset. Check each filtering criteria within the payment method's
    * parameters field to see if the properties within are applicable for
    * IsReadyToPayRequest.
    */
  var allowedPaymentMethods: js.Array[PaymentMethodSpecification]
  /**
    * Major API version.
    *
    * For this specification's version, this value should be 2.
    *
    * Make sure this matches
    * [[PaymentDataRequest.apiVersion|`PaymentDataRequest.apiVersion`]] so
    * the `isReadyToPay` client method can correctly check whether the
    * specified API version is supported for the current context.
    *
    * This field is required.
    */
  var apiVersion: Double
  /**
    * Minor API version.
    *
    * For this specification's version, this value should be 0.
    *
    * Make sure this matches
    * [[PaymentDataRequest.apiVersionMinor|`PaymentDataRequest.apiVersionMinor`]]
    * so the `isReadyToPay` client method can correctly check whether the
    * specified API version is supported for the current context.
    *
    * This field is required.
    */
  var apiVersionMinor: Double
  /**
    * If set to `true` then the
    * [[IsReadyToPayResponse.paymentMethodPresent|`IsReadyToPayResponse.paymentMethodPresent`]]
    * property will be populated with a boolean indicating the current
    * user's ability to pay with one or more of the payment methods
    * specified in
    * [[IsReadyToPayRequest.allowedPaymentMethods|`IsReadyToPayRequest.allowedPaymentMethods`]]
    *
    * @default false
    */
  var existingPaymentMethodRequired: js.UndefOr[`false` | `true`] = js.undefined
}

object IsReadyToPayRequest {
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[PaymentMethodSpecification],
    apiVersion: Double,
    apiVersionMinor: Double,
    existingPaymentMethodRequired: `false` | `true` = null
  ): IsReadyToPayRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any])
    if (existingPaymentMethodRequired != null) __obj.updateDynamic("existingPaymentMethodRequired")(existingPaymentMethodRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayRequest]
  }
}

