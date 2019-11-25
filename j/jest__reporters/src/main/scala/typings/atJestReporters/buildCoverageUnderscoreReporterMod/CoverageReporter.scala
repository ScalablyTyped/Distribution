package typings.atJestReporters.buildCoverageUnderscoreReporterMod

import typings.atJestReporters.buildBaseUnderscoreReporterMod.BaseReporter
import typings.atJestReporters.buildTypesMod.Context
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestReporters.buildTypesMod.Test
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageReporter extends BaseReporter {
  var _addUntestedFiles: js.Any
  var _checkThreshold: js.Any
  var _coverageMap: js.Any
  var _globalConfig: js.Any
  var _options: js.Any
  var _sourceMapStore: js.Any
  def getCoverageMap(): CoverageMap
}

object CoverageReporter {
  @scala.inline
  def apply(
    _addUntestedFiles: js.Any,
    _checkThreshold: js.Any,
    _coverageMap: js.Any,
    _globalConfig: js.Any,
    _options: js.Any,
    _setError: Error => Unit,
    _sourceMapStore: js.Any,
    getCoverageMap: () => CoverageMap,
    getLastError: () => Error | Unit,
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit,
    _error: js.Any = null
  ): CoverageReporter = {
    val __obj = js.Dynamic.literal(_addUntestedFiles = _addUntestedFiles.asInstanceOf[js.Any], _checkThreshold = _checkThreshold.asInstanceOf[js.Any], _coverageMap = _coverageMap.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _setError = js.Any.fromFunction1(_setError), _sourceMapStore = _sourceMapStore.asInstanceOf[js.Any], getCoverageMap = js.Any.fromFunction0(getCoverageMap), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageReporter]
  }
}

