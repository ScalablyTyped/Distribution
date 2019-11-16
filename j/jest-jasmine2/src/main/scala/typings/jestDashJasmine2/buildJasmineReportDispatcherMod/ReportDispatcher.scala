package typings.jestDashJasmine2.buildJasmineReportDispatcherMod

import typings.jestDashJasmine2.buildJasmineSpecMod.SpecResult
import typings.jestDashJasmine2.buildJasmineSuiteMod.SuiteResult
import typings.jestDashJasmine2.buildTypesMod.Reporter
import typings.jestDashJasmine2.buildTypesMod.RunDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDispatcher extends Reporter {
  def addReporter(reporter: Reporter): Unit
  def clearReporters(): Unit
  def provideFallbackReporter(reporter: Reporter): Unit
}

object ReportDispatcher {
  @scala.inline
  def apply(
    addReporter: Reporter => Unit,
    clearReporters: () => Unit,
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    provideFallbackReporter: Reporter => Unit,
    specDone: SpecResult => Unit,
    specStarted: SpecResult => Unit,
    suiteDone: SuiteResult => Unit,
    suiteStarted: SuiteResult => Unit
  ): ReportDispatcher = {
    val __obj = js.Dynamic.literal(addReporter = js.Any.fromFunction1(addReporter), clearReporters = js.Any.fromFunction0(clearReporters), jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), provideFallbackReporter = js.Any.fromFunction1(provideFallbackReporter), specDone = js.Any.fromFunction1(specDone), specStarted = js.Any.fromFunction1(specStarted), suiteDone = js.Any.fromFunction1(suiteDone), suiteStarted = js.Any.fromFunction1(suiteStarted))
  
    __obj.asInstanceOf[ReportDispatcher]
  }
}

