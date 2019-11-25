package typings.jestDashJasmine2.buildJasmineJsApiReporterMod

import typings.jestDashJasmine2.buildJasmineSpecMod.SpecResult
import typings.jestDashJasmine2.buildJasmineSuiteMod.SuiteResult
import typings.jestDashJasmine2.buildTypesMod.Reporter
import typings.jestDashJasmine2.buildTypesMod.RunDetails
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsApiReporter extends Reporter {
  var finished: Boolean
  var runDetails: RunDetails
  var started: Boolean
  def executionTime(): js.Any
  def specResults(index: Double, length: Double): js.Array[SpecResult]
  def specs(): js.Array[SpecResult]
  def status(): js.Any
  def suiteResults(index: Double, length: Double): js.Array[SuiteResult]
  def suites(): Record[String, SuiteResult]
}

object JsApiReporter {
  @scala.inline
  def apply(
    executionTime: () => js.Any,
    finished: Boolean,
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    runDetails: RunDetails,
    specDone: SpecResult => Unit,
    specResults: (Double, Double) => js.Array[SpecResult],
    specStarted: SpecResult => Unit,
    specs: () => js.Array[SpecResult],
    started: Boolean,
    status: () => js.Any,
    suiteDone: SuiteResult => Unit,
    suiteResults: (Double, Double) => js.Array[SuiteResult],
    suiteStarted: SuiteResult => Unit,
    suites: () => Record[String, SuiteResult]
  ): JsApiReporter = {
    val __obj = js.Dynamic.literal(executionTime = js.Any.fromFunction0(executionTime), finished = finished.asInstanceOf[js.Any], jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), runDetails = runDetails.asInstanceOf[js.Any], specDone = js.Any.fromFunction1(specDone), specResults = js.Any.fromFunction2(specResults), specStarted = js.Any.fromFunction1(specStarted), specs = js.Any.fromFunction0(specs), started = started.asInstanceOf[js.Any], status = js.Any.fromFunction0(status), suiteDone = js.Any.fromFunction1(suiteDone), suiteResults = js.Any.fromFunction2(suiteResults), suiteStarted = js.Any.fromFunction1(suiteStarted), suites = js.Any.fromFunction0(suites))
  
    __obj.asInstanceOf[JsApiReporter]
  }
}

