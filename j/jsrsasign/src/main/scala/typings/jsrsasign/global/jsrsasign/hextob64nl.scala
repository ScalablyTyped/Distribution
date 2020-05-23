package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.hextob64nl")
@js.native
object hextob64nl extends js.Object {
  /**
    * convert a hexadecimal string to Base64 encoded string with new lines
    * @param s hexadecimal string
    * @return resulted Base64 encoded string with new lines
    * @description
    * This function converts from a hexadecimal string to Base64 encoded
    * string with new lines for each 64 characters. This is useful for
    * PEM encoded file.
    * @example
    * hextob64nl("123456789012345678901234567890123456789012345678901234567890")
    * →
    * MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTIzNDU2Nzg5MDEyMzQ1Njc4 // new line
    * OTAxMjM0NTY3ODkwCg==
    */
  def apply(s: String): String = js.native
}

