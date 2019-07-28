package typings.k6.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/encoding", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def b64decode(input: String): String = js.native
  def b64decode(input: String, encoding: Base64Variant): String = js.native
  def b64encode(input: String): String = js.native
  def b64encode(input: String, encoding: Base64Variant): String = js.native
}

