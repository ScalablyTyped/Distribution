package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "exact")
@js.native
object exact extends js.Object {
  def apply[C /* <: HasProps */](codec: C): ExactC[C] = js.native
  def apply[C /* <: HasProps */](codec: C, name: String): ExactC[C] = js.native
}

