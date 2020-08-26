package typings.jestWatcher.typesMod

import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuiteInfo extends js.Object {
  var config: ProjectConfig = js.native
  var duration: js.UndefOr[Double] = js.native
  var testPath: String = js.native
}

object TestSuiteInfo {
  @scala.inline
  def apply(config: ProjectConfig, testPath: String): TestSuiteInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteInfo]
  }
  @scala.inline
  implicit class TestSuiteInfoOps[Self <: TestSuiteInfo] (val x: Self) extends AnyVal {
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
    def setTestPath(value: String): Self = this.set("testPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

