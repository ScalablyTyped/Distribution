package typings.libxmljs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends Error {
  var code: Double | Null
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: Double
  var domain: Double | Null
  var level: Double | Null
  var line: Double | Null
}

object ValidationError {
  @scala.inline
  def apply(
    column: Double,
    message: String,
    name: String,
    code: Double = null.asInstanceOf[Double],
    domain: Double = null.asInstanceOf[Double],
    level: Double = null.asInstanceOf[Double],
    line: Double = null.asInstanceOf[Double],
    stack: String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

