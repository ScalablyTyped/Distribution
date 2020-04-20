package typings.ioTs.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "nullable")
@js.native
object nullable extends js.Object {
  def apply[A](or: Decoder_[A]): Decoder_[Null | A] = js.native
}

