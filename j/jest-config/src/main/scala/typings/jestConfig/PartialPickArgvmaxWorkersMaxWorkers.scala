package typings.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.Argv, 'maxWorkers'>> */
trait PartialPickArgvmaxWorkersMaxWorkers extends js.Object {
  var maxWorkers: js.UndefOr[Double | String] = js.undefined
}

object PartialPickArgvmaxWorkersMaxWorkers {
  @scala.inline
  def apply(maxWorkers: Double | String = null): PartialPickArgvmaxWorkersMaxWorkers = {
    val __obj = js.Dynamic.literal()
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickArgvmaxWorkersMaxWorkers]
  }
}

