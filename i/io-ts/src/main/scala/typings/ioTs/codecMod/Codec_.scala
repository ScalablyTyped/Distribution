package typings.ioTs.codecMod

import typings.ioTs.decoderMod.Decoder_
import typings.ioTs.encoderMod.Encoder_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codec_[A]
  extends Decoder_[A]
     with Encoder_[A]

object Codec_ {
  @scala.inline
  def apply[A](decode: js.Any => js.Any, encode: A => js.Any): Codec_[A] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Codec_[A]]
  }
}

