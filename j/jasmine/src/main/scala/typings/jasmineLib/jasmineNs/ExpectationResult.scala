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
    passed: () => scala.Boolean,
    trace: Trace,
    `type`: java.lang.String
  ): ExpectationResult = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, matcherName = matcherName, message = message, passed = js.Any.fromFunction0(passed), trace = trace)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExpectationResult]
  }
}

