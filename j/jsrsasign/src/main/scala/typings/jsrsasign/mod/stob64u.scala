package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "stob64u")
@js.native
object stob64u extends js.Object {
  
  /**
    * convert a ASCII string to a Base64URL encoded string.
    * NOTE: This can't be used for non ASCII characters.
    * @param s ASCII string
    * @return Base64URL encoded string
    */
  def apply(s: String): String = js.native
}
