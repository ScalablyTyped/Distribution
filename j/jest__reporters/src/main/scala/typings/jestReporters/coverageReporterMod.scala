package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestReporters.typesMod.Context
import typings.jestReporters.typesMod.CoverageReporterOptions
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.std.Error
import typings.std.Set
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
  }
  
  @js.native
  class default protected () extends CoverageReporter {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
    /* CompleteClass */
    override def getLastError(): Error | Unit = js.native
    /* CompleteClass */
    override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
  }
  
}

