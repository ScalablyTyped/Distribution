package typings.gzipJs.mod

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
  def apply(
    level: js.UndefOr[Double] = js.undefined,
    name: String = null,
    timestamp: js.UndefOr[Double] = js.undefined
  ): ZipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipOptions]
  }
}

