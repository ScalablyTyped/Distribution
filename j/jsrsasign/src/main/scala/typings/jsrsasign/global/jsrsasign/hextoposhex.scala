package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.hextoposhex")
@js.native
object hextoposhex extends js.Object {
  /**
    * canonicalize hexadecimal string of positive integer
    * @param s hexadecimal string
    * @return canonicalized hexadecimal string of positive integer
    * @description
    * This method canonicalize a hexadecimal string of positive integer
    * for two's complement representation.
    * Canonicalized hexadecimal string of positive integer will be:
    * - Its length is always even.
    * - If odd length it will be padded with leading zero.
    * - If it is even length and its first character is "8" or greater,
    * it will be padded with "00" to make it positive integer.
    * @example
    * hextoposhex("abcd") → "00abcd"
    * hextoposhex("1234") → "1234"
    * hextoposhex("12345") → "012345"
    */
  def apply(s: String): String = js.native
}

