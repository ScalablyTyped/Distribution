package typings.ioTs.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "refinement")
@js.native
object refinement extends js.Object {
  def apply[A, B /* <: A */](from: Decoder_[A], refinement: js.Function1[/* a */ A, /* is B */ Boolean], expected: String): Decoder_[B] = js.native
}

