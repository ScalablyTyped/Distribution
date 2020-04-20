package typings.ioTs.codecMod

import typings.ioTs.decoderMod.Decoder_
import typings.ioTs.encoderMod.Encoder_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "make")
@js.native
object make extends js.Object {
  def apply[A](decoder: Decoder_[A], encoder: Encoder_[A]): Codec_[A] = js.native
}

