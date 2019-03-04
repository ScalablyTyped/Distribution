package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedExpectation extends CustomReportExpectation {
  var actual: java.lang.String
  var expected: java.lang.String
}

object FailedExpectation {
  @scala.inline
  def apply(
    actual: java.lang.String,
    expected: java.lang.String,
    matcherName: java.lang.String,
    message: java.lang.String,
    passed: scala.Boolean,
    stack: java.lang.String
  ): FailedExpectation = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, matcherName = matcherName, message = message, passed = passed, stack = stack)
  
    __obj.asInstanceOf[FailedExpectation]
  }
}

