package typings.ioTs.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder_[A] extends js.Object {
  def decode(u: js.Any): js.Any
}

object Decoder_ {
  @scala.inline
  def apply[A](decode: js.Any => js.Any): Decoder_[A] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
    __obj.asInstanceOf[Decoder_[A]]
  }
}

