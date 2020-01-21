package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "alias")
@js.native
object alias extends js.Object {
  def apply[A, O, P, I](codec: InterfaceType[P, A, O, I]): js.Function0[InterfaceType[P, _, O, I]] = js.native
  def apply[A, O, P, I](codec: PartialType[P, A, O, I]): js.Function0[PartialType[P, _, O, I]] = js.native
  def apply[A, O, P, I](codec: StrictType[P, A, O, I]): js.Function0[StrictType[P, _, O, I]] = js.native
}

