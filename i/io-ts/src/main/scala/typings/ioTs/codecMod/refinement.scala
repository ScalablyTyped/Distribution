package typings.ioTs.codecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "refinement")
@js.native
object refinement extends js.Object {
  def apply[A, B /* <: A */](from: Codec_[A], refinement: js.Function1[/* a */ A, /* is B */ Boolean], expected: String): Codec_[B] = js.native
}

