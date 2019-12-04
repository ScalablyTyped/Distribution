package typings.jestDashRunner.buildTestWorkerMod

import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashRunner.buildTypesMod.TestRunnerSerializedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerData extends js.Object {
  var config: ProjectConfig
  var context: js.UndefOr[TestRunnerSerializedContext] = js.undefined
  var globalConfig: GlobalConfig
  var path: Path
}

object WorkerData {
  @scala.inline
  def apply(
    config: ProjectConfig,
    globalConfig: GlobalConfig,
    path: Path,
    context: TestRunnerSerializedContext = null
  ): WorkerData = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerData]
  }
}

