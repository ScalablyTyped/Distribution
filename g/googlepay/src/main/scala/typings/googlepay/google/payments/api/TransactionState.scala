package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum strings for the state of the transaction.
  *
  * Options:
  *
  * - `SUCCESS`:
  *   Indicates the transaction was successful and the payment sheet should
  *   be dismissed.
  *
  * - `ERROR`:
  *   Indicates there's an error in the flow.
  *
  *   The Google Pay UI will show the merchant error message and allow user
  *   to retry.
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.SUCCESS
  - typings.googlepay.googlepayStrings.ERROR
*/
trait TransactionState extends StObject
object TransactionState {
  
  inline def ERROR: typings.googlepay.googlepayStrings.ERROR = "ERROR".asInstanceOf[typings.googlepay.googlepayStrings.ERROR]
  
  inline def SUCCESS: typings.googlepay.googlepayStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.googlepay.googlepayStrings.SUCCESS]
}
