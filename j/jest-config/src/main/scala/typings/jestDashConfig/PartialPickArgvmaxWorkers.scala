package typings.jestDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.Argv, 'maxWorkers'>> */
trait PartialPickArgvmaxWorkers extends js.Object {
  var maxWorkers: js.UndefOr[Double | String] = js.undefined
}

object PartialPickArgvmaxWorkers {
  @scala.inline
  def apply(maxWorkers: Double | String = null): PartialPickArgvmaxWorkers = {
    val __obj = js.Dynamic.literal()
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickArgvmaxWorkers]
  }
}

