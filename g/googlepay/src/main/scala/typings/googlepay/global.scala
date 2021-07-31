package typings.googlepay

import typings.googlepay.google.payments.api.ButtonOptions
import typings.googlepay.google.payments.api.IsReadyToPayRequest
import typings.googlepay.google.payments.api.IsReadyToPayResponse
import typings.googlepay.google.payments.api.PaymentData
import typings.googlepay.google.payments.api.PaymentDataRequest
import typings.googlepay.google.payments.api.PaymentOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object google {
    
    object payments {
      
      object api {
        
        /**
          * This reference describes the JavaScript client methods to use to
          * implement the Google Pay API in your web applications.
          */
        @JSGlobal("google.payments.api.PaymentsClient")
        @js.native
        class PaymentsClient protected ()
          extends StObject
             with typings.googlepay.google.payments.api.PaymentsClient {
          /**
            * Initializes the [[PaymentsClient|`PaymentsClient`]] object. You must
            * call this constructor before calling member methods.
            *
            * @param paymentOptions An object containing key-value pairs of Google
            *     Pay API configuration data.
            *
            * Example: `{environment:'PRODUCTION'}`
            *
            * @throws `Error` The passed environment property value isn't
            *     supported.
            */
          def this(paymentOptions: PaymentOptions) = this()
          
          /**
            * The convenience method is used to generate a Google Pay payment
            * button styled with the latest Google Pay branding for insertion into
            * a webpage.
            *
            * The generated `HTMLElement` includes dynamically inserted CSS and an
            * SVG image hosted on Google's CDN.
            *
            * Reference our [Brand
            * guidelines](https://developers.google.com/pay/api/web/guides/brand-guidelines)
            * for more information about how to select the appropriate button color
            * and button type for your site's design. You might need to alter the
            * dimensions of a returned Google Pay payment button to match similar
            * buttons or checkout elements on your page.
            *
            * @param options An object that contains key-value pairs for a button
            *     configuration.
            *
            * Example: `{onClick:onGooglePaymentButtonClicked}`
            * @returns An HTML `<button>` inside a generic flow content container
            *     such as a `<div>`.
            *
            * @throws `Error` A required property isn't set.
            */
          /* CompleteClass */
          override def createButton(options: ButtonOptions): HTMLElement = js.native
          
          /**
            * This method determines a shopper's ability to return a form of
            * payment from the Google Pay API.
            *
            * @param request An object that contains methods of payment supported
            *     by the merchant.
            * @returns
            * Resolved: An object that contains information about the user's
            * ability to pay.
            *
            * Rejected: An error object that contains more information about the
            * reason for rejection. See [[`PaymentsError`]] for more information.
            *
            * - `DEVELOPER_ERROR`:
            *   - The passed [[IsReadyToPayRequest|`IsReadyToPayRequest`]] object
            *     was improperly formatted, missed the minimum required parameters
            *     to determine a user's readiness to pay, or contains an invalid
            *     parameter and/or value.
            *   - The request was initiated from a security context the payment
            *     agent or the browser chose not to fulfill. Most commonly an
            *     [insecure browser
            *     context](https://developer.mozilla.org/en-US/docs/Web/Security/Secure_Contexts).
            */
          /* CompleteClass */
          override def isReadyToPay(request: IsReadyToPayRequest): js.Promise[IsReadyToPayResponse] = js.native
          
          /**
            * This method presents a Google Pay payment sheet that allows selection
            * of a payment method and optionally configured parameters.
            *
            * This method must be called while the browser processes an [activation
            * behavior](https://html.spec.whatwg.org/multipage/interaction.html#activation)
            * as a result of a click event. A popup window may be presented to the
            * user to select a payment method or other required data specified in
            * the passed request parameter.
            *
            * @param request An object that contains key-value pairs of full Google
            *     Pay API configuration.
            * @returns
            * Resolved: An object that contains the requested shopper data.
            *
            * Rejected: An object containing an error code and more information
            * about the reason for rejection. See [[`PaymentsError`]] for more
            * information.
            *
            * - `CANCELED`:
            *   - The current browser or logged-in Google user isn't supported.
            *   - The shopper dismissed the Google Pay payment sheet without
            *     payment authorization.
            *   - The request was initiated from a security context the payment
            *     agent or the browser chose not to fulfill. Most commonly an
            *     [insecure browser
            *     context](https://developer.mozilla.org/en-US/docs/Web/Security/Secure_Contexts).
            *   - The method was called while the Google Pay payment sheet was
            *     already shown.
            *   - The passed [[PaymentDataRequest|`PaymentDataRequest`]] object was
            *     rejected by the Google Pay payment sheet. Missed or incomplete
            *     [[PaymentMethodTokenizationSpecification|`PaymentMethodTokenizationSpecification`]]
            *     parameters for your gateway or invalid parameter values are a
            *     common cause.
            * - `DEVELOPER_ERROR`:
            *   - The passed [[PaymentDataRequest|`PaymentDataRequest`]] object was
            *     improperly formatted, missing the minimum required parameters, or
            *     contains an invalid parameter and/or value.
            */
          /* CompleteClass */
          override def loadPaymentData(request: PaymentDataRequest): js.Promise[PaymentData] = js.native
          
          /**
            * Use this method to prefetch a
            * [[PaymentDataRequest|`PaymentDataRequest`]] configuration to improve
            * [[PaymentsClient.loadPaymentData|`loadPaymentData`]] execution time
            * on later user interaction. No value is returned.
            *
            * Prefetch optimizations are currently available on Chrome for Android.
            * Other browsers and platforms to follow.
            *
            * @param request An object that contains key-value pairs of full Google
            *     Pay API configuration. A change in the `transactionInfo` property
            *     doesn't affect the cached prefetch value.
            */
          /* CompleteClass */
          override def prefetchPaymentData(request: PaymentDataRequest): Unit = js.native
        }
      }
    }
  }
}
