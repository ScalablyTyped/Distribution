package typings.googlepay

import typings.googlepay.google.payments.api.PaymentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object google extends js.Object {
    
    @js.native
    object payments extends js.Object {
      
      @js.native
      object api extends js.Object {
        
        /**
          * This reference describes the JavaScript client methods to use to
          * implement the Google Pay API in your web applications.
          */
        @js.native
        class PaymentsClient protected ()
          extends typings.googlepay.google.payments.api.PaymentsClient {
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
        }
      }
    }
  }
}
