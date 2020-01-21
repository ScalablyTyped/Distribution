package typings.jsonrpcSerializer.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerError extends Error {
  var code: Double
  var data: js.UndefOr[js.Array[_]] = js.undefined
}

object SerializerError {
  @scala.inline
  def apply(code: Double, message: String, name: String, data: js.Array[_] = null, stack: String = null): SerializerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerError]
  }
}

