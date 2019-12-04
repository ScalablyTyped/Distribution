package typings.atJestCore.buildReporterDispatcherMod

import typings.atJestReporters.buildTypesMod.Reporter
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.jestDashRunner.jestDashRunnerMod.Test
import typings.jestDashRuntime.jestDashRuntimeMod.Context
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterDispatcher extends js.Object {
  var _reporters: js.Any
  def getErrors(): js.Array[Error]
  def hasErrors(): Boolean
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit]
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit]
  def onTestResult(test: Test, testResult: TestResult, results: AggregatedResult): js.Promise[Unit]
  def onTestStart(test: Test): js.Promise[Unit]
  def register(reporter: Reporter): Unit
  def unregister(ReporterClass: js.Function): Unit
}

object ReporterDispatcher {
  @scala.inline
  def apply(
    _reporters: js.Any,
    getErrors: () => js.Array[Error],
    hasErrors: () => Boolean,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit],
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit],
    onTestStart: Test => js.Promise[Unit],
    register: Reporter => Unit,
    unregister: js.Function => Unit
  ): ReporterDispatcher = {
    val __obj = js.Dynamic.literal(_reporters = _reporters.asInstanceOf[js.Any], getErrors = js.Any.fromFunction0(getErrors), hasErrors = js.Any.fromFunction0(hasErrors), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[ReporterDispatcher]
  }
}

