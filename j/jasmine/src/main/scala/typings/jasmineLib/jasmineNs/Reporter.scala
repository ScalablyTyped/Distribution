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

