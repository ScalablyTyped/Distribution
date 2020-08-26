package typings.jestCore.failedTestsCacheMod

import typings.jestRunner.mod.Test
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedTestsCache extends js.Object {
  var _enabledTestsMap: js.Any = js.native
  def filterTests(tests: js.Array[Test]): js.Array[Test] = js.native
  def setTestResults(testResults: js.Array[TestResult]): Unit = js.native
  def updateConfig(globalConfig: GlobalConfig): GlobalConfig = js.native
}

object FailedTestsCache {
  @scala.inline
  def apply(
    _enabledTestsMap: js.Any,
    filterTests: js.Array[Test] => js.Array[Test],
    setTestResults: js.Array[TestResult] => Unit,
    updateConfig: GlobalConfig => GlobalConfig
  ): FailedTestsCache = {
    val __obj = js.Dynamic.literal(_enabledTestsMap = _enabledTestsMap.asInstanceOf[js.Any], filterTests = js.Any.fromFunction1(filterTests), setTestResults = js.Any.fromFunction1(setTestResults), updateConfig = js.Any.fromFunction1(updateConfig))
    __obj.asInstanceOf[FailedTestsCache]
  }
  @scala.inline
  implicit class FailedTestsCacheOps[Self <: FailedTestsCache] (val x: Self) extends AnyVal {
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
    def set_enabledTestsMap(value: js.Any): Self = this.set("_enabledTestsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterTests(value: js.Array[Test] => js.Array[Test]): Self = this.set("filterTests", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTestResults(value: js.Array[TestResult] => Unit): Self = this.set("setTestResults", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateConfig(value: GlobalConfig => GlobalConfig): Self = this.set("updateConfig", js.Any.fromFunction1(value))
  }
  
}

