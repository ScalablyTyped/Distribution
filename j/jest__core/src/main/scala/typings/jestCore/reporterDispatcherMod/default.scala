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
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/ReporterDispatcher", JSImport.Default)
@js.native
class default () extends ReporterDispatcher {
  /* CompleteClass */
  override var _reporters: js.Any = js.native
  /* CompleteClass */
  override def getErrors(): js.Array[Error] = js.native
  /* CompleteClass */
  override def hasErrors(): Boolean = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, results: AggregatedResult): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def register(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def unregister(ReporterClass: js.Function): Unit = js.native
}

