package typings.jestReporters

import typings.jestReporters.baseReporterMod.BaseReporter
import typings.jestReporters.typesMod.Context
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestReporters.typesMod.TestSchedulerContext
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/notify_reporter", JSImport.Namespace)
@js.native
object notifyReporterMod extends js.Object {
  @js.native
  trait NotifyReporter extends BaseReporter {
    var _context: js.Any = js.native
    var _globalConfig: js.Any = js.native
    var _notifier: js.Any = js.native
    var _startRun: js.Any = js.native
  }
  
  @js.native
  class default protected () extends NotifyReporter {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
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

