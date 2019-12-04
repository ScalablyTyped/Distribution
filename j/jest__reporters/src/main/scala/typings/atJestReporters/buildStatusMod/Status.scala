package typings.atJestReporters.buildStatusMod

import typings.atJestReporters.Anon_Clear
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var _aggregatedResults: js.UndefOr[js.Any] = js.undefined
  var _cache: js.Any
  var _callback: js.UndefOr[js.Any] = js.undefined
  var _currentTests: js.Any
  var _debouncedEmit: js.Any
  var _done: js.Any
  var _emit: js.Any
  var _emitScheduled: js.Any
  var _estimatedTime: js.Any
  var _interval: js.UndefOr[js.Any] = js.undefined
  var _showStatus: js.Any
  var _tick: js.Any
  def get(): Anon_Clear
  def onChange(callback: js.Function0[Unit]): Unit
  def runFinished(): Unit
  def runStarted(aggregatedResults: AggregatedResult, options: ReporterOnStartOptions): Unit
  def testFinished(_config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit
  def testStarted(testPath: Path, config: ProjectConfig): Unit
}

object Status {
  @scala.inline
  def apply(
    _cache: js.Any,
    _currentTests: js.Any,
    _debouncedEmit: js.Any,
    _done: js.Any,
    _emit: js.Any,
    _emitScheduled: js.Any,
    _estimatedTime: js.Any,
    _showStatus: js.Any,
    _tick: js.Any,
    get: () => Anon_Clear,
    onChange: js.Function0[Unit] => Unit,
    runFinished: () => Unit,
    runStarted: (AggregatedResult, ReporterOnStartOptions) => Unit,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Unit,
    testStarted: (Path, ProjectConfig) => Unit,
    _aggregatedResults: js.Any = null,
    _callback: js.Any = null,
    _interval: js.Any = null
  ): Status = {
    val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _currentTests = _currentTests.asInstanceOf[js.Any], _debouncedEmit = _debouncedEmit.asInstanceOf[js.Any], _done = _done.asInstanceOf[js.Any], _emit = _emit.asInstanceOf[js.Any], _emitScheduled = _emitScheduled.asInstanceOf[js.Any], _estimatedTime = _estimatedTime.asInstanceOf[js.Any], _showStatus = _showStatus.asInstanceOf[js.Any], _tick = _tick.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), onChange = js.Any.fromFunction1(onChange), runFinished = js.Any.fromFunction0(runFinished), runStarted = js.Any.fromFunction2(runStarted), testFinished = js.Any.fromFunction3(testFinished), testStarted = js.Any.fromFunction2(testStarted))
    if (_aggregatedResults != null) __obj.updateDynamic("_aggregatedResults")(_aggregatedResults.asInstanceOf[js.Any])
    if (_callback != null) __obj.updateDynamic("_callback")(_callback.asInstanceOf[js.Any])
    if (_interval != null) __obj.updateDynamic("_interval")(_interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

