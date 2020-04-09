package typings.hoxy.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var level: LogLevel
  var message: String
}

object Log {
  @scala.inline
  def apply(level: LogLevel, message: String, error: Error = null): Log = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

