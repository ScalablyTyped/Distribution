package typings.joigoose.mod

import typings.joi.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joigoose extends js.Object {
  def convert(schema: Schema): typings.mongoose.mod.Schema[_]
}

object Joigoose {
  @scala.inline
  def apply(convert: Schema => typings.mongoose.mod.Schema[_]): Joigoose = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[Joigoose]
  }
}

