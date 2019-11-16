package typings.jestDashJasmine2.buildJasmineReportDispatcherMod

import typings.jestDashJasmine2.buildJasmineSpecMod.SpecResult
import typings.jestDashJasmine2.buildJasmineSuiteMod.SuiteResult
import typings.jestDashJasmine2.buildTypesMod.Reporter
import typings.jestDashJasmine2.buildTypesMod.RunDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/ReportDispatcher", JSImport.Default)
@js.native
class default protected () extends ReportDispatcher {
  def this(methods: js.Array[String]) = this()
  /* CompleteClass */
  override def addReporter(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def clearReporters(): Unit = js.native
  /* CompleteClass */
  override def jasmineDone(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def jasmineStarted(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def provideFallbackReporter(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def specDone(result: SpecResult): Unit = js.native
  /* CompleteClass */
  override def specStarted(spec: SpecResult): Unit = js.native
  /* CompleteClass */
  override def suiteDone(result: SuiteResult): Unit = js.native
  /* CompleteClass */
  override def suiteStarted(result: SuiteResult): Unit = js.native
}

