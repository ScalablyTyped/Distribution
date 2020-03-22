package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestReporters.typesMod.Context
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

@JSImport("@jest/reporters/build/summary_reporter", JSImport.Namespace)
@js.native
object summaryReporterMod extends js.Object {
  @js.native
  trait SummaryReporter extends BaseReporter {
    var _estimatedTime: js.Any = js.native
    var _getTestSummary: js.Any = js.native
    var _globalConfig: js.Any = js.native
    var _printSnapshotSummary: js.Any = js.native
    var _printSummary: js.Any = js.native
    var _write: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SummaryReporter {
    def this(globalConfig: GlobalConfig) = this()
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

