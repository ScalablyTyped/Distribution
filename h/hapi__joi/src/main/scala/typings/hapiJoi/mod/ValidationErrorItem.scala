package typings.hapiJoi.mod

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationErrorItem]
  }
}

