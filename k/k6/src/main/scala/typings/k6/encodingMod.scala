package typings.k6

import typings.k6.encodingMod.Base64Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/encoding", JSImport.Namespace)
@js.native
object encodingMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.std
    - typings.k6.k6Strings.rawstd
    - typings.k6.k6Strings.url
    - typings.k6.k6Strings.rawurl
  */
  trait Base64Variant extends js.Object
  
  def b64decode(input: String): String = js.native
  def b64decode(input: String, encoding: Base64Variant): String = js.native
  def b64encode(input: String): String = js.native
  def b64encode(input: String, encoding: Base64Variant): String = js.native
}

