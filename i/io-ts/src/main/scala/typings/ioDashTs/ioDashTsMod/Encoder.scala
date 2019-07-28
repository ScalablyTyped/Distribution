package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder[A, O] extends js.Object {
  def encode(a: A): O
}

object Encoder {
  @scala.inline
  def apply[A, O](encode: A => O): Encoder[A, O] = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Encoder[A, O]]
  }
}

