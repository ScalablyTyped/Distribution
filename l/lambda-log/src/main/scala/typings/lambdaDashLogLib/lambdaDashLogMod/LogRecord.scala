package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecord extends js.Object {
  var _logLevel: java.lang.String
  var _tags: js.Array[java.lang.String]
  var meta: js.Any
  var msg: java.lang.String
}

object LogRecord {
  @scala.inline
  def apply(
    _logLevel: java.lang.String,
    _tags: js.Array[java.lang.String],
    meta: js.Any,
    msg: java.lang.String
  ): LogRecord = {
    val __obj = js.Dynamic.literal(_logLevel = _logLevel, _tags = _tags, meta = meta, msg = msg)
  
    __obj.asInstanceOf[LogRecord]
  }
}

