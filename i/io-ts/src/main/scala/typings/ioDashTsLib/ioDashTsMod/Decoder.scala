package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder[I, A] extends js.Object {
  val name: java.lang.String
  def decode(i: I): Validation[A]
  def validate(i: I, context: Context): Validation[A]
}

object Decoder {
  @scala.inline
  def apply[I, A](
    decode: js.Function1[I, Validation[A]],
    name: java.lang.String,
    validate: js.Function2[I, Context, Validation[A]]
  ): Decoder[I, A] = {
    val __obj = js.Dynamic.literal(decode = decode, name = name, validate = validate)
  
    __obj.asInstanceOf[Decoder[I, A]]
  }
}

