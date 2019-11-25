package typings.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.Ed25519
  - typings.jose.joseStrings.Ed448
  - typings.jose.joseStrings.X25519
  - typings.jose.joseStrings.X448
*/
trait OKPCurve extends js.Object

object OKPCurve {
  @scala.inline
  def Ed25519: typings.jose.joseStrings.Ed25519 = this.cast("Ed25519")
  @scala.inline
  def Ed448: typings.jose.joseStrings.Ed448 = this.cast("Ed448")
  @scala.inline
  def X25519: typings.jose.joseStrings.X25519 = this.cast("X25519")
  @scala.inline
  def X448: typings.jose.joseStrings.X448 = this.cast("X448")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

