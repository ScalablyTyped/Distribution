package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.PAN_ONLY
  - typings.googlepay.googlepayStrings.CRYPTOGRAM_3DS
*/
trait AllowedAuthMethod extends js.Object

object AllowedAuthMethod {
  @scala.inline
  def CRYPTOGRAM_3DS: typings.googlepay.googlepayStrings.CRYPTOGRAM_3DS = this.cast("CRYPTOGRAM_3DS")
  @scala.inline
  def PAN_ONLY: typings.googlepay.googlepayStrings.PAN_ONLY = this.cast("PAN_ONLY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

