package typings.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.Argv, 'maxWorkers' | 'runInBand' | 'watch' | 'watchAll'>> */
trait PartialPickArgvmaxWorkers extends js.Object {
  var maxWorkers: js.UndefOr[Double | String] = js.undefined
  var runInBand: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchAll: js.UndefOr[Boolean] = js.undefined
}

object PartialPickArgvmaxWorkers {
  @scala.inline
  def apply(
    maxWorkers: Double | String = null,
    runInBand: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchAll: js.UndefOr[Boolean] = js.undefined
  ): PartialPickArgvmaxWorkers = {
    val __obj = js.Dynamic.literal()
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (!js.isUndefined(runInBand)) __obj.updateDynamic("runInBand")(runInBand.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (!js.isUndefined(watchAll)) __obj.updateDynamic("watchAll")(watchAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickArgvmaxWorkers]
  }
}

