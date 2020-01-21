package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "stob64")
@js.native
object stob64 extends js.Object {
  /**
    * convert a ASCII string to a Base64 encoded string.
    * NOTE: This can't be used for non ASCII characters.
    * @param s ASCII string
    * @return Base64 encoded string
    */
  def apply(s: String): String = js.native
}

