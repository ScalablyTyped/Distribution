package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string for the callback trigger.
  *
  * Options:
  *
  * - `OFFER_INFO`:
  *   Callback occurs after offer info is changed.
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs after shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs after shipping option is changed.
  *
  * - `INITIALIZE`:
  *   Callback occurs on initialize, every field specified by callback
  *   intent would be returned in
  *   [[IntermediatePaymentData|`IntermediatePaymentData`]] if applicable.
  *
  *   Note that this callback trigger may be triggered multiple times along
  *   a single call to loadPaymentData, so you must make sure you can
  *   handle multiple calls to it. For example, when the user changes
  *   accounts, we will call initialize again with data from the new
  *   account.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.OFFER_INFO
  - typings.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typings.googlepay.googlepayStrings.SHIPPING_OPTION
  - typings.googlepay.googlepayStrings.INITIALIZE
*/
trait CallbackTrigger extends StObject
object CallbackTrigger {
  
  @scala.inline
  def INITIALIZE: typings.googlepay.googlepayStrings.INITIALIZE = "INITIALIZE".asInstanceOf[typings.googlepay.googlepayStrings.INITIALIZE]
  
  @scala.inline
  def OFFER_INFO: typings.googlepay.googlepayStrings.OFFER_INFO = "OFFER_INFO".asInstanceOf[typings.googlepay.googlepayStrings.OFFER_INFO]
  
  @scala.inline
  def SHIPPING_ADDRESS: typings.googlepay.googlepayStrings.SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_ADDRESS]
  
  @scala.inline
  def SHIPPING_OPTION: typings.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_OPTION]
}
