package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "hextoutf8")
@js.native
object hextoutf8 extends js.Object {
  
  /**
    * convert a hexadecimal encoded string to a UTF-8 encoded string including CJK or Latin.
    * Note that when input is improper hexadecimal string as UTF-8 string, this function returns
    * 'null'.
    * @param s hexadecimal encoded string
    * @return UTF-8 encoded string or null
    */
  def apply(s: String): String = js.native
}
