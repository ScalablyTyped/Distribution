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
    getLastError: () => Error | Unit,
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit,
    _error: js.Any = null
  ): NotifyReporter = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _setError = js.Any.fromFunction1(_setError), _startRun = _startRun.asInstanceOf[js.Any], getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyReporter]
  }
}

