package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base16 extends js.Object {
  var encode: gunLib.gunLibStrings.base64 | gunLib.gunLibStrings.base32 | gunLib.gunLibStrings.base16
  var hash: java.lang.String
  /** iterations to use on subtle.deriveBits */
  var iterations: scala.Double
  var length: js.Any
  var name: gunLib.gunLibStrings.`SHA-256` | gunLib.gunLibStrings.PBKDF2
  var salt: js.Any
}

object Anon_Base16 {
  @scala.inline
  def apply(
    encode: gunLib.gunLibStrings.base64 | gunLib.gunLibStrings.base32 | gunLib.gunLibStrings.base16,
    hash: java.lang.String,
    iterations: scala.Double,
    length: js.Any,
    name: gunLib.gunLibStrings.`SHA-256` | gunLib.gunLibStrings.PBKDF2,
    salt: js.Any
  ): Anon_Base16 = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any], hash = hash, iterations = iterations, length = length, name = name.asInstanceOf[js.Any], salt = salt)
  
    __obj.asInstanceOf[Anon_Base16]
  }
}

