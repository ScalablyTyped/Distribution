package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string for error reason.
  *
  * Options:
  *
  * - `SHIPPING_ADDRESS_INVALID`:
  *   Error when the provided shipping address is an invalid address.
  *
  * - `SHIPPING_ADDRESS_UNSERVICEABLE`:
  *   Error when the provided shipping address cannot be served
  *   for this request.
  *
  * - `SHIPPING_OPTION_INVALID`:
  *   Error when the provided shipping option is not applicable to the
  *   current request. An example would be shipping option cannot be used
  *   for the selected shipping address.
  *
  * - `PAYMENT_DATA_INVALID`:
  *   Error when the provided payment data is invalid. e.g. Payment token
  *   cannot be charged.
  *
  * - `OTHER_ERROR`:
  *   A catch all for error not fitting anywhere else.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.SHIPPING_ADDRESS_INVALID
  - typings.googlepay.googlepayStrings.SHIPPING_ADDRESS_UNSERVICEABLE
  - typings.googlepay.googlepayStrings.SHIPPING_OPTION_INVALID
  - typings.googlepay.googlepayStrings.PAYMENT_DATA_INVALID
  - typings.googlepay.googlepayStrings.OTHER_ERROR
*/
trait ErrorReason extends StObject
object ErrorReason {
  
  @scala.inline
  def OTHER_ERROR: typings.googlepay.googlepayStrings.OTHER_ERROR = "OTHER_ERROR".asInstanceOf[typings.googlepay.googlepayStrings.OTHER_ERROR]
  
  @scala.inline
  def PAYMENT_DATA_INVALID: typings.googlepay.googlepayStrings.PAYMENT_DATA_INVALID = "PAYMENT_DATA_INVALID".asInstanceOf[typings.googlepay.googlepayStrings.PAYMENT_DATA_INVALID]
  
  @scala.inline
  def SHIPPING_ADDRESS_INVALID: typings.googlepay.googlepayStrings.SHIPPING_ADDRESS_INVALID = "SHIPPING_ADDRESS_INVALID".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_ADDRESS_INVALID]
  
  @scala.inline
  def SHIPPING_ADDRESS_UNSERVICEABLE: typings.googlepay.googlepayStrings.SHIPPING_ADDRESS_UNSERVICEABLE = "SHIPPING_ADDRESS_UNSERVICEABLE".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_ADDRESS_UNSERVICEABLE]
  
  @scala.inline
  def SHIPPING_OPTION_INVALID: typings.googlepay.googlepayStrings.SHIPPING_OPTION_INVALID = "SHIPPING_OPTION_INVALID".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_OPTION_INVALID]
}
