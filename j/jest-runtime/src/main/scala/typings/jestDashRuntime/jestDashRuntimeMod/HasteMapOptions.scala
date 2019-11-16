package typings.jestDashRuntime.jestDashRuntimeMod

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteMapOptions extends js.Object {
  var console: js.UndefOr[Console] = js.undefined
  var maxWorkers: Double
  var resetCache: Boolean
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchman: Boolean
}

object HasteMapOptions {
  @scala.inline
  def apply(
    maxWorkers: Double,
    resetCache: Boolean,
    watchman: Boolean,
    console: Console = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): HasteMapOptions = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers, resetCache = resetCache, watchman = watchman)
    if (console != null) __obj.updateDynamic("console")(console)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[HasteMapOptions]
  }
}

