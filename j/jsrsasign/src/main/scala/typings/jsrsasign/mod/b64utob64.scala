package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "b64utob64")
@js.native
object b64utob64 extends js.Object {
  
  /**
    * convert a Base64URL encoded string to a Base64 encoded string.
    * @param s Base64URL encoded string
    * @return Base64 encoded string
    * @example
    * b64utob64("ab-c3f_") → "ab+c3f/=="
    */
  def apply(s: String): String = js.native
}
