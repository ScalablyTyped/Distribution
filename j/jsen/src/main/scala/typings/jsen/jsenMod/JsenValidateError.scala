package typings.jsen.jsenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsenValidateError extends js.Object {
  var keyword: String
  var message: js.UndefOr[String] = js.undefined
  var path: String
}

object JsenValidateError {
  @scala.inline
  def apply(keyword: String, path: String, message: String = null): JsenValidateError = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsenValidateError]
  }
}

