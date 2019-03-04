package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def log(str: java.lang.String): scala.Unit
  def reportRunnerResults(runner: Runner): scala.Unit
  def reportRunnerStarting(runner: Runner): scala.Unit
  def reportSpecResults(spec: Spec): scala.Unit
  def reportSpecStarting(spec: Spec): scala.Unit
  def reportSuiteResults(suite: Suite): scala.Unit
}

object Reporter {
  @scala.inline
  def apply(
    log: js.Function1[java.lang.String, scala.Unit],
    reportRunnerResults: js.Function1[Runner, scala.Unit],
    reportRunnerStarting: js.Function1[Runner, scala.Unit],
    reportSpecResults: js.Function1[Spec, scala.Unit],
    reportSpecStarting: js.Function1[Spec, scala.Unit],
    reportSuiteResults: js.Function1[Suite, scala.Unit]
  ): Reporter = {
    val __obj = js.Dynamic.literal(log = log, reportRunnerResults = reportRunnerResults, reportRunnerStarting = reportRunnerStarting, reportSpecResults = reportSpecResults, reportSpecStarting = reportSpecStarting, reportSuiteResults = reportSuiteResults)
  
    __obj.asInstanceOf[Reporter]
  }
}

