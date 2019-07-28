package typings.jasmine.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectationResult extends Result {
  var actual: js.Any
  var expected: js.Any
  var matcherName: String
  var message: String
  var trace: Trace
  def passed(): Boolean
}

object ExpectationResult {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    matcherName: String,
    message: String,
    passed: () => Boolean,
    trace: Trace,
    `type`: String
  ): ExpectationResult = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, matcherName = matcherName, message = message, passed = js.Any.fromFunction0(passed), trace = trace)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExpectationResult]
  }
}

