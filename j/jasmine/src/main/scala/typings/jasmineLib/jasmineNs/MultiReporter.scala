package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiReporter extends Reporter {
  def addReporter(reporter: Reporter): scala.Unit
}

object MultiReporter {
  @scala.inline
  def apply(
    addReporter: js.Function1[Reporter, scala.Unit],
    log: js.Function1[java.lang.String, scala.Unit],
    reportRunnerResults: js.Function1[Runner, scala.Unit],
    reportRunnerStarting: js.Function1[Runner, scala.Unit],
    reportSpecResults: js.Function1[Spec, scala.Unit],
    reportSpecStarting: js.Function1[Spec, scala.Unit],
    reportSuiteResults: js.Function1[Suite, scala.Unit]
  ): MultiReporter = {
    val __obj = js.Dynamic.literal(addReporter = addReporter, log = log, reportRunnerResults = reportRunnerResults, reportRunnerStarting = reportRunnerStarting, reportSpecResults = reportSpecResults, reportSpecStarting = reportSpecStarting, reportSuiteResults = reportSuiteResults)
  
    __obj.asInstanceOf[MultiReporter]
  }
}

