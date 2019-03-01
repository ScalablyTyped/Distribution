package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failures extends js.Object {
  var failures: scala.Double
  var passes: scala.Double
  var pending: scala.Double
  var suites: scala.Double
  var tests: scala.Double
}

object Anon_Failures {
  @scala.inline
  def apply(
    failures: scala.Double,
    passes: scala.Double,
    pending: scala.Double,
    suites: scala.Double,
    tests: scala.Double
  ): Anon_Failures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failures")(failures)
    __obj.updateDynamic("passes")(passes)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("suites")(suites)
    __obj.updateDynamic("tests")(tests)
    __obj.asInstanceOf[Anon_Failures]
  }
}

