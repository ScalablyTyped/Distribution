package typings.jestRunner.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  code ? :string} */
trait ErrorWithCode extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorWithCode {
  @scala.inline
  def apply(message: String, name: String, code: String = null, stack: String = null): ErrorWithCode = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithCode]
  }
}

