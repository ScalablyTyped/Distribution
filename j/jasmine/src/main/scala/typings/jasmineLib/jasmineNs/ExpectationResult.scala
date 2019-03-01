package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectationResult extends Result {
  var actual: js.Any
  var expected: js.Any
  var matcherName: java.lang.String
  var message: java.lang.String
  var trace: Trace
  def passed(): scala.Boolean
}

object ExpectationResult {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    matcherName: java.lang.String,
    message: java.lang.String,
    passed: js.Function0[scala.Boolean],
    trace: Trace,
    `type`: java.lang.String
  ): ExpectationResult = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("actual")(actual)
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("matcherName")(matcherName)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("passed")(passed)
    __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[ExpectationResult]
  }
}

