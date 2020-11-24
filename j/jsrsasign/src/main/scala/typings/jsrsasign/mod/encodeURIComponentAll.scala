package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "encodeURIComponentAll")
@js.native
object encodeURIComponentAll extends js.Object {
  
  /**
    * convert UTFa hexadecimal string to a URLComponent string such like "%67%68".
    * Note that these "<code>0-9A-Za-z!'()*-._~</code>" characters will not
    * converted to "%xx" format by builtin 'encodeURIComponent()' function.
    * However this 'encodeURIComponentAll()' function will convert
    * all of characters into "%xx" format.
    * @param s hexadecimal string
    * @return URIComponent string such like "%67%68"
    */
  def apply(s: String): String = js.native
}
