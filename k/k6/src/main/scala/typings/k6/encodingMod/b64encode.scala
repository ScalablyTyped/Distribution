package typings.k6.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/encoding", "b64encode")
@js.native
object b64encode extends js.Object {
  def apply(input: String): String = js.native
  def apply(input: String, encoding: Base64Variant): String = js.native
}

