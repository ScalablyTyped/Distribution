package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var message: LogMessage
  var origin: java.lang.String
  var `type`: LogType
}

object LogEntry {
  @scala.inline
  def apply(message: LogMessage, origin: java.lang.String, `type`: LogType): LogEntry = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[LogEntry]
  }
}

