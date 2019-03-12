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
    log: java.lang.String => scala.Unit,
    reportRunnerResults: Runner => scala.Unit,
    reportRunnerStarting: Runner => scala.Unit,
    reportSpecResults: Spec => scala.Unit,
    reportSpecStarting: Spec => scala.Unit,
    reportSuiteResults: Suite => scala.Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), reportRunnerResults = js.Any.fromFunction1(reportRunnerResults), reportRunnerStarting = js.Any.fromFunction1(reportRunnerStarting), reportSpecResults = js.Any.fromFunction1(reportSpecResults), reportSpecStarting = js.Any.fromFunction1(reportSpecStarting), reportSuiteResults = js.Any.fromFunction1(reportSuiteResults))
  
    __obj.asInstanceOf[Reporter]
  }
}

