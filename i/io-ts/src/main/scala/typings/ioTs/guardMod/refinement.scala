package typings.ioTs.guardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Guard", "refinement")
@js.native
object refinement extends js.Object {
  def apply[A, B /* <: A */](from: Guard_[A], refinement: js.Function1[/* a */ A, /* is B */ Boolean]): Guard_[B] = js.native
}

