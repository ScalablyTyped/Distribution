package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exception extends js.Object {
  var column: js.UndefOr[js.Any] = js.undefined
  var description: String
  var endColumn: js.UndefOr[js.Any] = js.undefined
  var endLineNumber: js.UndefOr[js.Any] = js.undefined
  var fileName: String
  var lineNumber: js.UndefOr[js.Any] = js.undefined
  var message: String
  var name: String
  var number: Double
  var stack: js.UndefOr[String] = js.undefined
}

object Exception {
  @scala.inline
  def apply(
    description: String,
    fileName: String,
    message: String,
    name: String,
    number: Double,
    column: js.Any = null,
    endColumn: js.Any = null,
    endLineNumber: js.Any = null,
    lineNumber: js.Any = null,
    stack: String = null
  ): Exception = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLineNumber != null) __obj.updateDynamic("endLineNumber")(endLineNumber.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
}

