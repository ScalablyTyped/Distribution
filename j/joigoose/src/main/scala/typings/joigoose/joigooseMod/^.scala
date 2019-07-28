package typings.joigoose.joigooseMod

import typings.joi.joiMod.ValidationOptions
import typings.mongoose.mongooseMod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("joigoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(mongoose: Mongoose): Joigoose = js.native
  def apply(mongoose: Mongoose, joiOptions: ValidationOptions): Joigoose = js.native
}

