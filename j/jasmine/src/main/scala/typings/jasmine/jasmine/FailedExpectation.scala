package typings.jasmine.jasmine

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
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FailedExpectation]
  }
}

