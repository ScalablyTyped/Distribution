package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorItem extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var message: String
  var path: js.Array[String | Double]
  var `type`: String
}

object ValidationErrorItem {
  @scala.inline
  def apply(message: String, path: js.Array[String | Double], `type`: String, context: Context = null): ValidationErrorItem = {
    val __obj = js.Dynamic.literal(message = message, path = path)
    __obj.updateDynamic("type")(`type`)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[ValidationErrorItem]
  }
}

