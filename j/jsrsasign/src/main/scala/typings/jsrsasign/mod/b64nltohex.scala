package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "b64nltohex")
@js.native
object b64nltohex extends js.Object {
  /**
    * convert a Base64 encoded string with new lines to a hexadecimal string
    * @param s Base64 encoded string with new lines
    * @return hexadecimal string
    * @description
    * This function converts from a Base64 encoded
    * string with new lines to a hexadecimal string.
    * This is useful to handle PEM encoded file.
    * This function removes any non-Base64 characters (i.e. not 0-9,A-Z,a-z,\,+,=)
    * including new line.
    * @example
    * hextob64nl(
    * "MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTIzNDU2Nzg5MDEyMzQ1Njc4\r\n" +
    * "OTAxMjM0NTY3ODkwCg==\r\n")
    * →
    * "123456789012345678901234567890123456789012345678901234567890"
    */
  def apply(s: String): String = js.native
}

