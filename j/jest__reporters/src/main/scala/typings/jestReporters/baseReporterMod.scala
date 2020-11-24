package typings.jestReporters

import typings.jestReporters.typesMod.Context
import typings.jestReporters.typesMod.Reporter
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/BaseReporter", JSImport.Namespace)
@js.native
object baseReporterMod extends js.Object {
  
  @js.native
  trait BaseReporter extends Reporter {
    
    var _error: js.Any = js.native
    
    /* protected */ def _setError(error: Error): Unit = js.native
    
    def log(message: String): Unit = js.native
    
    def onRunComplete(): js.Promise[Unit] | Unit = js.native
    def onRunComplete(_contexts: js.UndefOr[scala.Nothing], _aggregatedResults: AggregatedResult): js.Promise[Unit] | Unit = js.native
    def onRunComplete(_contexts: Set[Context]): js.Promise[Unit] | Unit = js.native
    
    def onRunStart(): Unit = js.native
    def onRunStart(_results: js.UndefOr[scala.Nothing], _options: ReporterOnStartOptions): Unit = js.native
    def onRunStart(_results: AggregatedResult): Unit = js.native
    
    @JSName("onTestCaseResult")
    def onTestCaseResult_MBaseReporter(
      _test: Test,
      _testCaseResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any
    ): Unit = js.native
    
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(
      _test: js.UndefOr[scala.Nothing],
      _testResult: js.UndefOr[scala.Nothing],
      _results: AggregatedResult
    ): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: js.UndefOr[scala.Nothing], _testResult: TestResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: js.UndefOr[scala.Nothing], _testResult: TestResult, _results: AggregatedResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test, _testResult: js.UndefOr[scala.Nothing], _results: AggregatedResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test, _testResult: TestResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test, _testResult: TestResult, _results: AggregatedResult): Unit = js.native
    
    @JSName("onTestStart")
    def onTestStart_MBaseReporter(): Unit = js.native
    @JSName("onTestStart")
    def onTestStart_MBaseReporter(_test: Test): Unit = js.native
  }
  
  @js.native
  class default () extends BaseReporter
}
