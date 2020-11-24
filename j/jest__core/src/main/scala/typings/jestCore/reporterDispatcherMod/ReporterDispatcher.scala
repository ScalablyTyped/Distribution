package typings.jestCore.reporterDispatcherMod

import typings.jestReporters.typesMod.Reporter
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestRunner.mod.Test
import typings.jestRuntime.mod.Context
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReporterDispatcher extends js.Object {
  
  var _reporters: js.Any = js.native
  
  def getErrors(): js.Array[Error] = js.native
  
  def hasErrors(): Boolean = js.native
  
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] = js.native
  
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] = js.native
  
  def onTestCaseResult(
    test: Test,
    testCaseResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any
  ): js.Promise[Unit] = js.native
  
  def onTestFileResult(test: Test, testResult: TestResult, results: AggregatedResult): js.Promise[Unit] = js.native
  
  def onTestFileStart(test: Test): js.Promise[Unit] = js.native
  
  def register(reporter: Reporter): Unit = js.native
  
  def unregister(ReporterClass: js.Function): Unit = js.native
}
object ReporterDispatcher {
  
  @scala.inline
  def apply(
    _reporters: js.Any,
    getErrors: () => js.Array[Error],
    hasErrors: () => Boolean,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit],
    onTestCaseResult: (Test, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any) => js.Promise[Unit],
    onTestFileResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit],
    onTestFileStart: Test => js.Promise[Unit],
    register: Reporter => Unit,
    unregister: js.Function => Unit
  ): ReporterDispatcher = {
    val __obj = js.Dynamic.literal(_reporters = _reporters.asInstanceOf[js.Any], getErrors = js.Any.fromFunction0(getErrors), hasErrors = js.Any.fromFunction0(hasErrors), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestCaseResult = js.Any.fromFunction2(onTestCaseResult), onTestFileResult = js.Any.fromFunction3(onTestFileResult), onTestFileStart = js.Any.fromFunction1(onTestFileStart), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[ReporterDispatcher]
  }
  
  @scala.inline
  implicit class ReporterDispatcherOps[Self <: ReporterDispatcher] (val x: Self) extends AnyVal {
    
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
    def set_reporters(value: js.Any): Self = this.set("_reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetErrors(value: () => js.Array[Error]): Self = this.set("getErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasErrors(value: () => Boolean): Self = this.set("hasErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRunComplete(value: (Set[Context], AggregatedResult) => js.Promise[Unit]): Self = this.set("onRunComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRunStart(value: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit]): Self = this.set("onRunStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTestCaseResult(
      value: (Test, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any) => js.Promise[Unit]
    ): Self = this.set("onTestCaseResult", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTestFileResult(value: (Test, TestResult, AggregatedResult) => js.Promise[Unit]): Self = this.set("onTestFileResult", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTestFileStart(value: Test => js.Promise[Unit]): Self = this.set("onTestFileStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegister(value: Reporter => Unit): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: js.Function => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
}
