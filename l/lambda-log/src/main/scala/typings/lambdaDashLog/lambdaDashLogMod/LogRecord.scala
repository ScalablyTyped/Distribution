package typings.lambdaDashLog.lambdaDashLogMod

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
    val __obj = js.Dynamic.literal(_logLevel = _logLevel, _tags = _tags, meta = meta, msg = msg)
  
    __obj.asInstanceOf[LogRecord]
  }
}

