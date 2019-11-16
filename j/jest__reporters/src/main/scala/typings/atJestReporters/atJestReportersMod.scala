package typings.atJestReporters

import typings.atJestReporters.buildCoverageUnderscoreReporterMod.default
import typings.atJestReporters.buildTypesMod.Context
import typings.atJestReporters.buildTypesMod.CoverageReporterOptions
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestReporters.buildTypesMod.Test
import typings.atJestReporters.buildTypesMod.TestSchedulerContext
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.AssertionResult
import typings.atJestTestDashResult.buildTypesMod.Suite
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters", JSImport.Namespace)
@js.native
object atJestReportersMod extends js.Object {
  @js.native
  class BaseReporter ()
    extends typings.atJestReporters.buildBaseUnderscoreReporterMod.BaseReporter {
    /* CompleteClass */
    /* protected */ override def _setError(error: Error): Unit = js.native
    /* CompleteClass */
    override def getLastError(): Error | Unit = js.native
    /* CompleteClass */
    override def log(message: String): Unit = js.native
    /* CompleteClass */
    override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
  }
  
  @js.native
  class CoverageReporter protected () extends default {
    def this(globalConfig: GlobalConfig) = this()
    def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  }
  
  @js.native
  class DefaultReporter protected ()
    extends typings.atJestReporters.buildDefaultUnderscoreReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class NotifyReporter protected ()
    extends typings.atJestReporters.buildNotifyUnderscoreReporterMod.default {
    def this(
      globalConfig: GlobalConfig,
      startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
      context: TestSchedulerContext
    ) = this()
  }
  
  @js.native
  class SummaryReporter protected ()
    extends typings.atJestReporters.buildSummaryUnderscoreReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  @js.native
  class VerboseReporter protected ()
    extends typings.atJestReporters.buildVerboseUnderscoreReporterMod.default {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object VerboseReporter extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
}

