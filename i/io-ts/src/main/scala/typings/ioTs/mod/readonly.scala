package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "readonly")
@js.native
object readonly extends js.Object {
  def apply[C /* <: Mixed_ */](codec: C): ReadonlyC[C] = js.native
  def apply[C /* <: Mixed_ */](codec: C, name: String): ReadonlyC[C] = js.native
}

