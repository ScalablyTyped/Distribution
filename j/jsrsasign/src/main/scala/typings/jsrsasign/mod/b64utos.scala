package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "b64utos")
@js.native
object b64utos extends js.Object {
  /**
    * convert a Base64URL encoded string to a ASCII string.
    * NOTE: This can't be used for Base64URL encoded non ASCII characters.
    * @param s Base64URL encoded string
    * @return ASCII string
    */
  def apply(s: String): String = js.native
}

