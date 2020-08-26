package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseError extends js.Object {
  var line: Double = js.native
  var message: String = js.native
  var `type`: error = js.native
}

object ParseError {
  @scala.inline
  def apply(line: Double, message: String, `type`: error): ParseError = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseError]
  }
  @scala.inline
  implicit class ParseErrorOps[Self <: ParseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

