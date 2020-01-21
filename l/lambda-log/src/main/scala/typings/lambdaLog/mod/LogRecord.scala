package typings.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecord extends js.Object {
  var _logLevel: String
  var _tags: js.Array[String]
  var meta: js.Any
  var msg: String
}

object LogRecord {
  @scala.inline
  def apply(_logLevel: String, _tags: js.Array[String], meta: js.Any, msg: String): LogRecord = {
    val __obj = js.Dynamic.literal(_logLevel = _logLevel.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogRecord]
  }
}

