package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
  var line: Double
  var message: String
  var `type`: error
}

object ParseError {
  @scala.inline
  def apply(line: Double, message: String, `type`: error): ParseError = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseError]
  }
}

