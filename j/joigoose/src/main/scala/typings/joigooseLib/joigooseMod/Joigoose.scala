package typings
package joigooseLib.joigooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joigoose extends js.Object {
  def convert(schema: joiLib.joiMod.Schema): mongooseLib.mongooseMod.Schema[_]
}

object Joigoose {
  @scala.inline
  def apply(convert: joiLib.joiMod.Schema => mongooseLib.mongooseMod.Schema[_]): Joigoose = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
  
    __obj.asInstanceOf[Joigoose]
  }
}

