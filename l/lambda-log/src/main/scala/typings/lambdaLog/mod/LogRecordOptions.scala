package typings.lambdaLog.mod

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
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecordOptions]
  }
}

