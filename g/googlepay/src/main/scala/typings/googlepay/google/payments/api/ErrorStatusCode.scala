package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR
  - typings.googlepay.googlepayStrings.CANCELED
  - typings.googlepay.googlepayStrings.DEVELOPER_ERROR
  - typings.googlepay.googlepayStrings.INTERNAL_ERROR
*/
trait ErrorStatusCode extends js.Object

object ErrorStatusCode {
  @scala.inline
  def BUYER_ACCOUNT_ERROR: typings.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR = this.cast("BUYER_ACCOUNT_ERROR")
  @scala.inline
  def CANCELED: typings.googlepay.googlepayStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def DEVELOPER_ERROR: typings.googlepay.googlepayStrings.DEVELOPER_ERROR = this.cast("DEVELOPER_ERROR")
  @scala.inline
  def INTERNAL_ERROR: typings.googlepay.googlepayStrings.INTERNAL_ERROR = this.cast("INTERNAL_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

