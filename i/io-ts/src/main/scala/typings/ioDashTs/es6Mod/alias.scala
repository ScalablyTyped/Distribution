package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "alias")
@js.native
object alias extends js.Object {
  def apply[A, O, P, I](codec: InterfaceType[P, A, O, I]): js.Function0[InterfaceType[_, _, _, I]] = js.native
  def apply[A, O, P, I](codec: PartialType[P, A, O, I]): js.Function0[PartialType[_, _, _, I]] = js.native
  def apply[A, O, P, I](codec: StrictType[P, A, O, I]): js.Function0[StrictType[_, _, _, I]] = js.native
}

