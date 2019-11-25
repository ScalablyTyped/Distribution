package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.k6.k6Strings.basic
  - typings.k6.k6Strings.digest
  - typings.k6.k6Strings.ntlm
*/
trait AuthMethod extends js.Object

object AuthMethod {
  @scala.inline
  def basic: typings.k6.k6Strings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def digest: typings.k6.k6Strings.digest = this.cast("digest")
  @scala.inline
  def ntlm: typings.k6.k6Strings.ntlm = this.cast("ntlm")
}

