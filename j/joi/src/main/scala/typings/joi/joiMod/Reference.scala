package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends JoiObject {
  var isContext: Boolean = js.native
  var key: String = js.native
  var path: String = js.native
  def apply(value: js.Any, validationOptions: ValidationOptions): js.Any = js.native
}

