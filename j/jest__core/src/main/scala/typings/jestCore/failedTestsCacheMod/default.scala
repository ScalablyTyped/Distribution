package typings.jestCore.failedTestsCacheMod

import typings.jestRunner.mod.Test
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/FailedTestsCache", JSImport.Default)
@js.native
class default () extends FailedTestsCache {
  /* CompleteClass */
  override def filterTests(tests: js.Array[Test]): js.Array[Test] = js.native
  /* CompleteClass */
  override def setTestResults(testResults: js.Array[TestResult]): Unit = js.native
  /* CompleteClass */
  override def updateConfig(globalConfig: GlobalConfig): GlobalConfig = js.native
}

