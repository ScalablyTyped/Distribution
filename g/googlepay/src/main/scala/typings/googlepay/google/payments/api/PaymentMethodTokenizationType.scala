package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment method tokenization type enum string.
  *
  * Options:
  *
  * - `PAYMENT_GATEWAY`:
  *   Tokenize a payment response to be consumed or charged by a specified
  *   third-party gateway service.
  *
  * - `DIRECT`:
  *   Tokenize to be consumed/charged directly by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
  - typings.googlepay.googlepayStrings.DIRECT
*/
trait PaymentMethodTokenizationType extends StObject
object PaymentMethodTokenizationType {
  
  @scala.inline
  def DIRECT: typings.googlepay.googlepayStrings.DIRECT = "DIRECT".asInstanceOf[typings.googlepay.googlepayStrings.DIRECT]
  
  @scala.inline
  def PAYMENT_GATEWAY: typings.googlepay.googlepayStrings.PAYMENT_GATEWAY = "PAYMENT_GATEWAY".asInstanceOf[typings.googlepay.googlepayStrings.PAYMENT_GATEWAY]
}
