package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.hextob64u")
@js.native
object hextob64u extends js.Object {
  /**
    * convert a hexadecimal string to a Base64URL encoded string.
    * @param s hexadecimal string
    * @return Base64URL encoded string
    * @description
    * convert a hexadecimal string to a Base64URL encoded string.
    * NOTE: If leading "0" is omitted and odd number length for
    * hexadecimal leading "0" is automatically added.
    */
  def apply(s: String): String = js.native
}

