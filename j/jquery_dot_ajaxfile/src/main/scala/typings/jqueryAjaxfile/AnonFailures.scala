package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailures extends js.Object {
  var failures: Double
  var passes: Double
  var pending: Double
  var suites: Double
  var tests: Double
}

object AnonFailures {
  @scala.inline
  def apply(failures: Double, passes: Double, pending: Double, suites: Double, tests: Double): AnonFailures = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailures]
  }
}

