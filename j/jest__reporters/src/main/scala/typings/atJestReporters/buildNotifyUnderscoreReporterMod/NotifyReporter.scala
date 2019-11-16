package typings.atJestReporters.buildNotifyUnderscoreReporterMod

import typings.atJestReporters.buildBaseUnderscoreReporterMod.BaseReporter
import typings.atJestReporters.buildTypesMod.Context
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestReporters.buildTypesMod.Test
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReporter extends BaseReporter {
  var _context: js.Any
  var _globalConfig: js.Any
  var _startRun: js.Any
}

object NotifyReporter {
  @scala.inline
  def apply(
    _context: js.Any,
    _globalConfig: js.Any,
    _setError: Error => Unit,
    _startRun: js.Any,
    getLastError: () => js.UndefOr[Error],
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => Unit,
    onTestStart: Test => Unit,
    _error: js.Any = null
  ): NotifyReporter = {
    val __obj = js.Dynamic.literal(_context = _context, _globalConfig = _globalConfig, _setError = js.Any.fromFunction1(_setError), _startRun = _startRun, getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    if (_error != null) __obj.updateDynamic("_error")(_error)
    __obj.asInstanceOf[NotifyReporter]
  }
}

