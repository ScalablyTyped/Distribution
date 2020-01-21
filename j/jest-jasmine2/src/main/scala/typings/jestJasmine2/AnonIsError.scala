package typings.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsError extends js.Object {
  var isError: Boolean
  var message: String | Null
}

object AnonIsError {
  @scala.inline
  def apply(isError: Boolean, message: String = null): AnonIsError = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsError]
  }
}

