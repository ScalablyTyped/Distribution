package typings.joigoose.joigooseMod

import typings.joi.joiMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joigoose extends js.Object {
  def convert(schema: Schema): typings.mongoose.mongooseMod.Schema[_]
}

object Joigoose {
  @scala.inline
  def apply(convert: Schema => typings.mongoose.mongooseMod.Schema[_]): Joigoose = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
  
    __obj.asInstanceOf[Joigoose]
  }
}

