package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder[I, A] extends js.Object {
  val name: String
  def decode(i: I): Validation[A]
  def validate(i: I, context: Context): Validation[A]
}

object Decoder {
  @scala.inline
  def apply[I, A](decode: I => Validation[A], name: String, validate: (I, Context) => Validation[A]): Decoder[I, A] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), name = name, validate = js.Any.fromFunction2(validate))
  
    __obj.asInstanceOf[Decoder[I, A]]
  }
}

