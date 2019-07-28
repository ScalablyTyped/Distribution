package typings.lambdaDashLog.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecordOptions extends js.Object {
  var level: String
  var meta: js.UndefOr[js.Any] = js.undefined
  var msg: String
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object LogRecordOptions {
  @scala.inline
  def apply(level: String, msg: String, meta: js.Any = null, tags: js.Array[String] = null): LogRecordOptions = {
    val __obj = js.Dynamic.literal(level = level, msg = msg)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LogRecordOptions]
  }
}

