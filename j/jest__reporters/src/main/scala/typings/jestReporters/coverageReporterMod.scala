package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestReporters.typesMod.CoverageReporterOptions
import typings.jestReporters.typesMod.Test
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/coverage_reporter", JSImport.Namespace)
@js.native
object coverageReporterMod extends js.Object {
  @js.native
  trait CoverageReporter extends BaseReporter {
    var _addUntestedFiles: js.Any = js.native
    var _checkThreshold: js.Any = js.native
    var _coverageMap: js.Any = js.native
    var _getCoverageResult: js.Any = js.native
    var _globalConfig: js.Any = js.native
    var _options: js.Any = js.native
    var _sourceMapStore: js.Any = js.native
    var _v8CoverageResults: js.Any = js.native
    @JSName("onTestResult")
    def onTestResult_MCoverageReporter(_test: Test, testResult: TestResult): Unit = js.native
  }
  
  @js.native
  class default protected () extends CoverageReporter {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
  
}

