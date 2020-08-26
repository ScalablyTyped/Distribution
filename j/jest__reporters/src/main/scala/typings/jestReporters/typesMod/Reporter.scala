package typings.jestReporters.typesMod

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  val onTestCaseResult: js.UndefOr[
    js.Function2[
      /* test */ Test, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ /* testCaseResult */ js.Any, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  val onTestFileResult: js.UndefOr[
    js.Function3[
      /* test */ Test, 
      /* testResult */ TestResult, 
      /* aggregatedResult */ AggregatedResult, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  val onTestFileStart: js.UndefOr[js.Function1[/* test */ Test, js.Promise[Unit] | Unit]] = js.native
  val onTestResult: js.UndefOr[
    js.Function3[
      /* test */ Test, 
      /* testResult */ TestResult, 
      /* aggregatedResult */ AggregatedResult, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  val onTestStart: js.UndefOr[js.Function1[/* test */ Test, js.Promise[Unit] | Unit]] = js.native
  def getLastError(): Error | Unit = js.native
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
}

object Reporter {
  @scala.inline
  def apply(
    getLastError: () => Error | Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(getLastError = js.Any.fromFunction0(getLastError), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart))
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
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
    def setGetLastError(value: () => Error | Unit): Self = this.set("getLastError", js.Any.fromFunction0(value))
    @scala.inline
    def setOnRunComplete(value: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit): Self = this.set("onRunComplete", js.Any.fromFunction2(value))
    @scala.inline
    def setOnRunStart(value: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit): Self = this.set("onRunStart", js.Any.fromFunction2(value))
    @scala.inline
    def setOnTestCaseResult(
      value: (/* test */ Test, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ /* testCaseResult */ js.Any) => js.Promise[Unit] | Unit
    ): Self = this.set("onTestCaseResult", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTestCaseResult: Self = this.set("onTestCaseResult", js.undefined)
    @scala.inline
    def setOnTestFileResult(
      value: (/* test */ Test, /* testResult */ TestResult, /* aggregatedResult */ AggregatedResult) => js.Promise[Unit] | Unit
    ): Self = this.set("onTestFileResult", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnTestFileResult: Self = this.set("onTestFileResult", js.undefined)
    @scala.inline
    def setOnTestFileStart(value: /* test */ Test => js.Promise[Unit] | Unit): Self = this.set("onTestFileStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTestFileStart: Self = this.set("onTestFileStart", js.undefined)
    @scala.inline
    def setOnTestResult(
      value: (/* test */ Test, /* testResult */ TestResult, /* aggregatedResult */ AggregatedResult) => js.Promise[Unit] | Unit
    ): Self = this.set("onTestResult", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnTestResult: Self = this.set("onTestResult", js.undefined)
    @scala.inline
    def setOnTestStart(value: /* test */ Test => js.Promise[Unit] | Unit): Self = this.set("onTestStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTestStart: Self = this.set("onTestStart", js.undefined)
  }
  
}

