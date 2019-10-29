package typings.atJestTestDashResult.buildTypesMod

import typings.atJestTestDashResult.atJestTestDashResultStrings.failed
import typings.atJestTestDashResult.atJestTestDashResultStrings.passed
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
    val __obj = js.Dynamic.literal(assertionResults = assertionResults, coverage = coverage, endTime = endTime, message = message, name = name, startTime = startTime, status = status.asInstanceOf[js.Any], summary = summary)
  
    __obj.asInstanceOf[FormattedTestResult]
  }
}

