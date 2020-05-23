package typings.jestWatcher.typesMod

import typings.jestTypes.configMod.ProjectConfig
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
  def apply(config: ProjectConfig, testPath: String, duration: js.UndefOr[Double] = js.undefined): TestSuiteInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteInfo]
  }
}

