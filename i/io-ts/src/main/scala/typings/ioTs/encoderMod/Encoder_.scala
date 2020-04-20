package typings.ioTs.encoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder_[A] extends js.Object {
  def encode(a: A): js.Any
}

object Encoder_ {
  @scala.inline
  def apply[A](encode: A => js.Any): Encoder_[A] = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Encoder_[A]]
  }
}

