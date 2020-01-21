package typings.gun

import typings.gun.gunStrings.PBKDF2
import typings.gun.gunStrings.`SHA-256`
import typings.gun.gunStrings.base16
import typings.gun.gunStrings.base32
import typings.gun.gunStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase16 extends js.Object {
  var encode: base64 | base32 | base16
  var hash: String
  /** iterations to use on subtle.deriveBits */
  var iterations: Double
  var length: js.Any
  var name: `SHA-256` | PBKDF2
  var salt: js.Any
}

object AnonBase16 {
  @scala.inline
  def apply(
    encode: base64 | base32 | base16,
    hash: String,
    iterations: Double,
    length: js.Any,
    name: `SHA-256` | PBKDF2,
    salt: js.Any
  ): AnonBase16 = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase16]
  }
}

