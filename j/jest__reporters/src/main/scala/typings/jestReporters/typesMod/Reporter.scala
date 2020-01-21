package typings.jestReporters.typesMod

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def getLastError(): Error | Unit
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit
  def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit
  def onTestStart(test: Test): js.Promise[Unit] | Unit
}

object Reporter {
  @scala.inline
  def apply(
    getLastError: () => Error | Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(getLastError = js.Any.fromFunction0(getLastError), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
  
    __obj.asInstanceOf[Reporter]
  }
}

