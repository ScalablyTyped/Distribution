package typings.jestConsole.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var message: LogMessage
  var origin: String
  var `type`: LogType
}

object LogEntry {
  @scala.inline
  def apply(message: LogMessage, origin: String, `type`: LogType): LogEntry = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
}

