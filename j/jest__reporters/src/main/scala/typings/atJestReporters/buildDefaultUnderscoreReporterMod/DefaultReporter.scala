package typings.atJestReporters.buildDefaultUnderscoreReporterMod

import typings.atJestReporters.buildBaseUnderscoreReporterMod.BaseReporter
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestReporters.buildTypesMod.Test
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultReporter extends BaseReporter {
  var _bufferedOutput: js.Any
  var _clear: js.Any
  var _clearStatus: js.Any
  var _err: js.Any
  var _globalConfig: GlobalConfig
  var _out: js.Any
  var _printStatus: js.Any
  var _status: js.Any
  var _wrapStdio: js.Any
  def forceFlushBufferedOutput(): Unit
  def onRunComplete(): Unit
  def printTestFileFailureMessage(_testPath: Path, _config: ProjectConfig, result: TestResult): Unit
  def printTestFileHeader(_testPath: Path, config: ProjectConfig, result: TestResult): Unit
  def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit
}

object DefaultReporter {
  @scala.inline
  def apply(
    _bufferedOutput: js.Any,
    _clear: js.Any,
    _clearStatus: js.Any,
    _err: js.Any,
    _globalConfig: GlobalConfig,
    _out: js.Any,
    _printStatus: js.Any,
    _setError: Error => Unit,
    _status: js.Any,
    _wrapStdio: js.Any,
    forceFlushBufferedOutput: () => Unit,
    getLastError: () => js.UndefOr[Error],
    log: String => Unit,
    onRunComplete: () => Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => Unit,
    onTestStart: Test => Unit,
    printTestFileFailureMessage: (Path, ProjectConfig, TestResult) => Unit,
    printTestFileHeader: (Path, ProjectConfig, TestResult) => Unit,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Unit,
    _error: js.Any = null
  ): DefaultReporter = {
    val __obj = js.Dynamic.literal(_bufferedOutput = _bufferedOutput, _clear = _clear, _clearStatus = _clearStatus, _err = _err, _globalConfig = _globalConfig, _out = _out, _printStatus = _printStatus, _setError = js.Any.fromFunction1(_setError), _status = _status, _wrapStdio = _wrapStdio, forceFlushBufferedOutput = js.Any.fromFunction0(forceFlushBufferedOutput), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction0(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart), printTestFileFailureMessage = js.Any.fromFunction3(printTestFileFailureMessage), printTestFileHeader = js.Any.fromFunction3(printTestFileHeader), testFinished = js.Any.fromFunction3(testFinished))
    if (_error != null) __obj.updateDynamic("_error")(_error)
    __obj.asInstanceOf[DefaultReporter]
  }
}

