package typings.jestConsole.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  var message: LogMessage = js.native
  var origin: String = js.native
  var `type`: LogType = js.native
}

object LogEntry {
  @scala.inline
  def apply(message: LogMessage, origin: String, `type`: LogType): LogEntry = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
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
    def setMessage(value: LogMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LogType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

