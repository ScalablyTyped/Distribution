package typings.ioTs.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "intersection")
@js.native
object intersection extends js.Object {
  def apply[A, B](left: Decoder_[A], right: Decoder_[B]): Decoder_[A with B] = js.native
}

