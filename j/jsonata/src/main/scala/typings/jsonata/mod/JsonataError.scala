package typings.jsonata.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonataError extends Error {
  var code: String
  var position: Double
  var token: String
}

object JsonataError {
  @scala.inline
  def apply(code: String, message: String, name: String, position: Double, token: String, stack: String = null): JsonataError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonataError]
  }
}

