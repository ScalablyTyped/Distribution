package typings.jestReporters.typesMod

import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSchedulerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
  var firstRun: Boolean
  var previousSuccess: Boolean
}

object TestSchedulerContext {
  @scala.inline
  def apply(firstRun: Boolean, previousSuccess: Boolean, changedFiles: Set[Path] = null): TestSchedulerContext = {
    val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], previousSuccess = previousSuccess.asInstanceOf[js.Any])
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSchedulerContext]
  }
}

