package typings.gulpPostcss

import typings.gulpPostcss.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[Options] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonOptions {
  @scala.inline
  def apply(options: Options = null, plugins: js.Array[_] = null): AnonOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

