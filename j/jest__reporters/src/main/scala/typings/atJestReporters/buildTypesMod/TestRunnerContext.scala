package typings.atJestReporters.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunnerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
}

object TestRunnerContext {
  @scala.inline
  def apply(changedFiles: Set[Path] = null): TestRunnerContext = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles)
    __obj.asInstanceOf[TestRunnerContext]
  }
}

