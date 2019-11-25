package typings.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.sign
  - typings.jose.joseStrings.verify
  - typings.jose.joseStrings.encrypt
  - typings.jose.joseStrings.decrypt
  - typings.jose.joseStrings.wrapKey
  - typings.jose.joseStrings.unwrapKey
  - typings.jose.joseStrings.deriveKey
*/
trait keyOperation extends js.Object

object keyOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decrypt: typings.jose.joseStrings.decrypt = this.cast("decrypt")
  @scala.inline
  def deriveKey: typings.jose.joseStrings.deriveKey = this.cast("deriveKey")
  @scala.inline
  def encrypt: typings.jose.joseStrings.encrypt = this.cast("encrypt")
  @scala.inline
  def sign: typings.jose.joseStrings.sign = this.cast("sign")
  @scala.inline
  def unwrapKey: typings.jose.joseStrings.unwrapKey = this.cast("unwrapKey")
  @scala.inline
  def verify: typings.jose.joseStrings.verify = this.cast("verify")
  @scala.inline
  def wrapKey: typings.jose.joseStrings.wrapKey = this.cast("wrapKey")
}

