package typings.jest.jestMod.jest

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
    val __obj = js.Dynamic.literal(message = message, origin = origin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LogEntry]
  }
}

