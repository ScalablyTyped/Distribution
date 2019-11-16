package typings.atJestReporters.buildSummaryUnderscoreReporterMod

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

trait SummaryReporter extends BaseReporter {
  var _estimatedTime: js.Any
  var _getTestSummary: js.Any
  var _globalConfig: js.Any
  var _printSnapshotSummary: js.Any
  var _printSummary: js.Any
  var _write: js.Any
}

object SummaryReporter {
  @scala.inline
  def apply(
    _estimatedTime: js.Any,
    _getTestSummary: js.Any,
    _globalConfig: js.Any,
    _printSnapshotSummary: js.Any,
    _printSummary: js.Any,
    _setError: Error => Unit,
    _write: js.Any,
    getLastError: () => js.UndefOr[Error],
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => Unit,
    onTestStart: Test => Unit,
    _error: js.Any = null
  ): SummaryReporter = {
    val __obj = js.Dynamic.literal(_estimatedTime = _estimatedTime, _getTestSummary = _getTestSummary, _globalConfig = _globalConfig, _printSnapshotSummary = _printSnapshotSummary, _printSummary = _printSummary, _setError = js.Any.fromFunction1(_setError), _write = _write, getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    if (_error != null) __obj.updateDynamic("_error")(_error)
    __obj.asInstanceOf[SummaryReporter]
  }
}

