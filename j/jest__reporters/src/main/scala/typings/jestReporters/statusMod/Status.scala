package typings.jestReporters.statusMod

import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends js.Object {
  
  var _aggregatedResults: js.Any = js.native
  
  var _cache: js.Any = js.native
  
  var _callback: js.Any = js.native
  
  var _currentTestCases: js.Any = js.native
  
  var _currentTests: js.Any = js.native
  
  var _debouncedEmit: js.Any = js.native
  
  var _done: js.Any = js.native
  
  var _emit: js.Any = js.native
  
  var _emitScheduled: js.Any = js.native
  
  var _estimatedTime: js.Any = js.native
  
  var _interval: js.Any = js.native
  
  var _showStatus: js.Any = js.native
  
  var _tick: js.Any = js.native
  
  def addTestCaseResult(
    test: Test,
    testCaseResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any
  ): Unit = js.native
  
  def get(): Cache = js.native
  
  def onChange(callback: js.Function0[Unit]): Unit = js.native
  
  def runFinished(): Unit = js.native
  
  def runStarted(aggregatedResults: AggregatedResult, options: ReporterOnStartOptions): Unit = js.native
  
  def testFinished(_config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  
  def testStarted(testPath: Path, config: ProjectConfig): Unit = js.native
}
object Status {
  
  @scala.inline
  def apply(
    _aggregatedResults: js.Any,
    _cache: js.Any,
    _callback: js.Any,
    _currentTestCases: js.Any,
    _currentTests: js.Any,
    _debouncedEmit: js.Any,
    _done: js.Any,
    _emit: js.Any,
    _emitScheduled: js.Any,
    _estimatedTime: js.Any,
    _interval: js.Any,
    _showStatus: js.Any,
    _tick: js.Any,
    addTestCaseResult: (Test, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any) => Unit,
    get: () => Cache,
    onChange: js.Function0[Unit] => Unit,
    runFinished: () => Unit,
    runStarted: (AggregatedResult, ReporterOnStartOptions) => Unit,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Unit,
    testStarted: (Path, ProjectConfig) => Unit
  ): Status = {
    val __obj = js.Dynamic.literal(_aggregatedResults = _aggregatedResults.asInstanceOf[js.Any], _cache = _cache.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _currentTestCases = _currentTestCases.asInstanceOf[js.Any], _currentTests = _currentTests.asInstanceOf[js.Any], _debouncedEmit = _debouncedEmit.asInstanceOf[js.Any], _done = _done.asInstanceOf[js.Any], _emit = _emit.asInstanceOf[js.Any], _emitScheduled = _emitScheduled.asInstanceOf[js.Any], _estimatedTime = _estimatedTime.asInstanceOf[js.Any], _interval = _interval.asInstanceOf[js.Any], _showStatus = _showStatus.asInstanceOf[js.Any], _tick = _tick.asInstanceOf[js.Any], addTestCaseResult = js.Any.fromFunction2(addTestCaseResult), get = js.Any.fromFunction0(get), onChange = js.Any.fromFunction1(onChange), runFinished = js.Any.fromFunction0(runFinished), runStarted = js.Any.fromFunction2(runStarted), testFinished = js.Any.fromFunction3(testFinished), testStarted = js.Any.fromFunction2(testStarted))
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_aggregatedResults(value: js.Any): Self = this.set("_aggregatedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cache(value: js.Any): Self = this.set("_cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_callback(value: js.Any): Self = this.set("_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentTestCases(value: js.Any): Self = this.set("_currentTestCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentTests(value: js.Any): Self = this.set("_currentTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debouncedEmit(value: js.Any): Self = this.set("_debouncedEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_done(value: js.Any): Self = this.set("_done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_emit(value: js.Any): Self = this.set("_emit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_emitScheduled(value: js.Any): Self = this.set("_emitScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_estimatedTime(value: js.Any): Self = this.set("_estimatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_interval(value: js.Any): Self = this.set("_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_showStatus(value: js.Any): Self = this.set("_showStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tick(value: js.Any): Self = this.set("_tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTestCaseResult(
      value: (Test, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any) => Unit
    ): Self = this.set("addTestCaseResult", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: () => Cache): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: js.Function0[Unit] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunFinished(value: () => Unit): Self = this.set("runFinished", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunStarted(value: (AggregatedResult, ReporterOnStartOptions) => Unit): Self = this.set("runStarted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTestFinished(value: (ProjectConfig, TestResult, AggregatedResult) => Unit): Self = this.set("testFinished", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTestStarted(value: (Path, ProjectConfig) => Unit): Self = this.set("testStarted", js.Any.fromFunction2(value))
  }
}
