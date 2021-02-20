package typings.googlepay.google.payments.api

import typings.googlepay.googlepayBooleans.`false`
import typings.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait IsReadyToPayRequest extends StObject {
  
  /**
    * List of allowed payment methods.
    *
    * This field is required and must contain at least one
    * allowed payment method.
    *
    * Check each filtering criteria within the payment method's
    * parameters field to see if the properties within are applicable for
    * `IsReadyToPayRequest`.
    */
  var allowedPaymentMethods: js.Array[IsReadyToPayPaymentMethodSpecification] = js.native
  
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
  var apiVersion: Double = js.native
  
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
  var apiVersionMinor: Double = js.native
  
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
  var existingPaymentMethodRequired: js.UndefOr[`false` | `true`] = js.native
}
object IsReadyToPayRequest {
  
  @scala.inline
  def apply(
    allowedPaymentMethods: js.Array[IsReadyToPayPaymentMethodSpecification],
    apiVersion: Double,
    apiVersionMinor: Double
  ): IsReadyToPayRequest = {
    val __obj = js.Dynamic.literal(allowedPaymentMethods = allowedPaymentMethods.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReadyToPayRequest]
  }
  
  @scala.inline
  implicit class IsReadyToPayRequestMutableBuilder[Self <: IsReadyToPayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPaymentMethods(value: js.Array[IsReadyToPayPaymentMethodSpecification]): Self = StObject.set(x, "allowedPaymentMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPaymentMethodsVarargs(value: IsReadyToPayPaymentMethodSpecification*): Self = StObject.set(x, "allowedPaymentMethods", js.Array(value :_*))
    
    @scala.inline
    def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionMinor(value: Double): Self = StObject.set(x, "apiVersionMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingPaymentMethodRequired(value: `false` | `true`): Self = StObject.set(x, "existingPaymentMethodRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingPaymentMethodRequiredUndefined: Self = StObject.set(x, "existingPaymentMethodRequired", js.undefined)
  }
}
