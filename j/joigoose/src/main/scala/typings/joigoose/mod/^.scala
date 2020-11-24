package typings.joigoose.mod

import typings.joi.mod.ValidationOptions
import typings.mongoose.mod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("joigoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(mongoose: Mongoose): Joigoose = js.native
  def apply(mongoose: Mongoose, joiOptions: ValidationOptions): Joigoose = js.native
}
