package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.DIRECT
  - typings.googlepay.googlepayStrings.PAYMENT_GATEWAY
*/
trait TokenizationType extends js.Object

object TokenizationType {
  @scala.inline
  def DIRECT: typings.googlepay.googlepayStrings.DIRECT = this.cast("DIRECT")
  @scala.inline
  def PAYMENT_GATEWAY: typings.googlepay.googlepayStrings.PAYMENT_GATEWAY = this.cast("PAYMENT_GATEWAY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

