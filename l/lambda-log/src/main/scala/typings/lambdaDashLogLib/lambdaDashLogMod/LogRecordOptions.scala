package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecordOptions extends js.Object {
  var level: java.lang.String
  var meta: js.UndefOr[js.Any] = js.undefined
  var msg: java.lang.String
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LogRecordOptions {
  @scala.inline
  def apply(
    level: java.lang.String,
    msg: java.lang.String,
    meta: js.Any = null,
    tags: js.Array[java.lang.String] = null
  ): LogRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("msg")(msg)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LogRecordOptions]
  }
}

