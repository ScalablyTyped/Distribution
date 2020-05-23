package typings.jestJasmine2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsError extends js.Object {
  var isError: Boolean
  var message: String | Null
}

object IsError {
  @scala.inline
  def apply(isError: Boolean, message: String = null): IsError = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsError]
  }
}

