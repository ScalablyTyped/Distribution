package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait TransactionState extends js.Object

object TransactionState {
  @scala.inline
  def ERROR: typings.googlepay.googlepayStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def SUCCESS: typings.googlepay.googlepayStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

