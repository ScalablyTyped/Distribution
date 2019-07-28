package typings.gzipDashJs.gzipDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipOptions extends js.Object {
  var level: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
}

object ZipOptions {
  @scala.inline
  def apply(level: Int | Double = null, name: String = null, timestamp: Int | Double = null): ZipOptions = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipOptions]
  }
}

