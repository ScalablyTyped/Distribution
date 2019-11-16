package typings.atJestReporters.buildBaseUnderscoreReporterMod

import typings.atJestReporters.buildTypesMod.Context
import typings.atJestReporters.buildTypesMod.Reporter
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestReporters.buildTypesMod.Test
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseReporter extends Reporter {
  var _error: js.UndefOr[js.Any] = js.undefined
  /* protected */ def _setError(error: Error): Unit
  def log(message: String): Unit
}

object BaseReporter {
  @scala.inline
  def apply(
    _setError: Error => Unit,
    getLastError: () => js.UndefOr[Error],
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => Unit,
    onTestStart: Test => Unit,
    _error: js.Any = null
  ): BaseReporter = {
    val __obj = js.Dynamic.literal(_setError = js.Any.fromFunction1(_setError), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    if (_error != null) __obj.updateDynamic("_error")(_error)
    __obj.asInstanceOf[BaseReporter]
  }
}

