package typings.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsError extends js.Object {
  var isError: Boolean
  var message: String | Null
}

object Anon_IsError {
  @scala.inline
  def apply(isError: Boolean, message: String = null): Anon_IsError = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsError]
  }
}

