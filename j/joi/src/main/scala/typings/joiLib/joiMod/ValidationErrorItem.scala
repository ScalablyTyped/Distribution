package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorItem extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var message: java.lang.String
  var options: js.UndefOr[ValidationOptions] = js.undefined
  var path: js.Array[java.lang.String]
  var `type`: java.lang.String
}

object ValidationErrorItem {
  @scala.inline
  def apply(
    message: java.lang.String,
    path: js.Array[java.lang.String],
    `type`: java.lang.String,
    context: Context = null,
    options: ValidationOptions = null
  ): ValidationErrorItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("path")(path)
    if (context != null) __obj.updateDynamic("context")(context)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ValidationErrorItem]
  }
}

