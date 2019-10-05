package typings.jsrsasign.jsrsasignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "b64tob64u")
@js.native
object b64tob64u extends js.Object {
  /**
    * convert a Base64 encoded string to a Base64URL encoded string.
    * @param s Base64 encoded string
    * @return Base64URL encoded string
    * @example
    * b64tob64u("ab+c3f/==") → "ab-c3f_"
    */
  def apply(s: String): String = js.native
}

