package typings.jestTestResult.typesMod

import typings.jestTestResult.jestTestResultStrings.failed
import typings.jestTestResult.jestTestResultStrings.passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedTestResult extends js.Object {
  var assertionResults: js.Array[FormattedAssertionResult]
  var coverage: js.Any
  var endTime: Double
  var message: String
  var name: String
  var startTime: Double
  var status: failed | passed
  var summary: String
}

object FormattedTestResult {
  @scala.inline
  def apply(
    assertionResults: js.Array[FormattedAssertionResult],
    coverage: js.Any,
    endTime: Double,
    message: String,
    name: String,
    startTime: Double,
    status: failed | passed,
    summary: String
  ): FormattedTestResult = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], coverage = coverage.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedTestResult]
  }
}

