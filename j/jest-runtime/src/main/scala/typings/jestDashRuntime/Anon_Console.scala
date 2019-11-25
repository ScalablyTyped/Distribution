package typings.jestDashRuntime

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Console extends js.Object {
  var console: js.UndefOr[Console] = js.undefined
  var maxWorkers: Double
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchman: Boolean
}

object Anon_Console {
  @scala.inline
  def apply(
    maxWorkers: Double,
    watchman: Boolean,
    console: Console = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Anon_Console = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Console]
  }
}

