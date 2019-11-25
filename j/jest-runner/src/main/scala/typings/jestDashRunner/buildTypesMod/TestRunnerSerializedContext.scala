package typings.jestDashRunner.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunnerSerializedContext extends js.Object {
  var changedFiles: js.UndefOr[js.Array[Path]] = js.undefined
}

object TestRunnerSerializedContext {
  @scala.inline
  def apply(changedFiles: js.Array[Path] = null): TestRunnerSerializedContext = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunnerSerializedContext]
  }
}

