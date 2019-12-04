package typings.atJestCore.buildFailedTestsCacheMod

import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.jestDashRunner.jestDashRunnerMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedTestsCache extends js.Object {
  var _enabledTestsMap: js.UndefOr[js.Any] = js.undefined
  def filterTests(tests: js.Array[Test]): js.Array[Test]
  def setTestResults(testResults: js.Array[TestResult]): Unit
  def updateConfig(globalConfig: GlobalConfig): GlobalConfig
}

object FailedTestsCache {
  @scala.inline
  def apply(
    filterTests: js.Array[Test] => js.Array[Test],
    setTestResults: js.Array[TestResult] => Unit,
    updateConfig: GlobalConfig => GlobalConfig,
    _enabledTestsMap: js.Any = null
  ): FailedTestsCache = {
    val __obj = js.Dynamic.literal(filterTests = js.Any.fromFunction1(filterTests), setTestResults = js.Any.fromFunction1(setTestResults), updateConfig = js.Any.fromFunction1(updateConfig))
    if (_enabledTestsMap != null) __obj.updateDynamic("_enabledTestsMap")(_enabledTestsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedTestsCache]
  }
}

