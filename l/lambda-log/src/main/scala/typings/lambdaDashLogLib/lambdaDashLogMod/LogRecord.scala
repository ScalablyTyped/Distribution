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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_logLevel")(_logLevel)
    __obj.updateDynamic("_tags")(_tags)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[LogRecord]
  }
}

