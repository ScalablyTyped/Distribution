package typings.jasmine.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedExpectation extends CustomReportExpectation {
  var actual: String
  var expected: String
}

object FailedExpectation {
  @scala.inline
  def apply(
    actual: String,
    expected: String,
    matcherName: String,
    message: String,
    passed: Boolean,
    stack: String
  ): FailedExpectation = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, matcherName = matcherName, message = message, passed = passed, stack = stack)
  
    __obj.asInstanceOf[FailedExpectation]
  }
}

