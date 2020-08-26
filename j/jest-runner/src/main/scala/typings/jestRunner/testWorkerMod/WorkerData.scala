package typings.jestRunner.testWorkerMod

import typings.jestRunner.typesMod.TestRunnerSerializedContext
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerData extends js.Object {
  var config: ProjectConfig = js.native
  var context: js.UndefOr[TestRunnerSerializedContext] = js.native
  var globalConfig: GlobalConfig = js.native
  var path: Path = js.native
}

object WorkerData {
  @scala.inline
  def apply(config: ProjectConfig, globalConfig: GlobalConfig, path: Path): WorkerData = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerData]
  }
  @scala.inline
  implicit class WorkerDataOps[Self <: WorkerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: ProjectConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalConfig(value: GlobalConfig): Self = this.set("globalConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TestRunnerSerializedContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

