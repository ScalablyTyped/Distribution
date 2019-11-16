package typings.jestDashWatcher.buildTypesMod

import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuiteInfo extends js.Object {
  var config: ProjectConfig
  var duration: js.UndefOr[Double] = js.undefined
  var testPath: String
}

object TestSuiteInfo {
  @scala.inline
  def apply(config: ProjectConfig, testPath: String, duration: Int | Double = null): TestSuiteInfo = {
    val __obj = js.Dynamic.literal(config = config, testPath = testPath)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteInfo]
  }
}

