package typings.jestRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  var console: js.UndefOr[typings.std.Console] = js.undefined
  var maxWorkers: Double
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchman: Boolean
}

object Console {
  @scala.inline
  def apply(
    maxWorkers: Double,
    watchman: Boolean,
    console: typings.std.Console = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Console = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Console]
  }
}

