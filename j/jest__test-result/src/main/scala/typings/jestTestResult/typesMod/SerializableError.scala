package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableError extends js.Object {
  var code: js.UndefOr[js.Any] = js.undefined
  var message: String
  var stack: js.UndefOr[String | Null] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SerializableError {
  @scala.inline
  def apply(message: String, code: js.Any = null, stack: String = null, `type`: String = null): SerializableError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableError]
  }
}

