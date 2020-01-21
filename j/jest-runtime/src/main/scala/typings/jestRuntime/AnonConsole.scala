package typings.jestRuntime

import typings.std.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsole extends js.Object {
  var console: js.UndefOr[Console_] = js.undefined
  var maxWorkers: Double
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchman: Boolean
}

object AnonConsole {
  @scala.inline
  def apply(
    maxWorkers: Double,
    watchman: Boolean,
    console: Console_ = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): AnonConsole = {
    val __obj = js.Dynamic.literal(maxWorkers = maxWorkers.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsole]
  }
}

