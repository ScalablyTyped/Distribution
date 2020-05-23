package typings.gulpPostcss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[typings.gulpPostcss.mod.Options] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
}

object Options {
  @scala.inline
  def apply(options: typings.gulpPostcss.mod.Options = null, plugins: js.Array[_] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

