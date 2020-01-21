package typings.jsonpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonpack", "unpack")
@js.native
object unpack extends js.Object {
  def apply[T](packed: String): T = js.native
  def apply[T](packed: String, options: PackOptions): T = js.native
}

