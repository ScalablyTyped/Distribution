package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "hextorstr")
@js.native
object hextorstr extends js.Object {
  
  /**
    * convert a hexadecimal encoded string to raw string including non printable characters.
    * @param s hexadecimal encoded string
    * @return raw string
    * @example
    * hextorstr("610061") → "a\x00a"
    */
  def apply(s: String): String = js.native
}
