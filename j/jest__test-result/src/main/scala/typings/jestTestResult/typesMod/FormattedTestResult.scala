package typings.jestTestResult.typesMod

import typings.jestTestResult.jestTestResultStrings.failed
import typings.jestTestResult.jestTestResultStrings.passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedTestResult extends js.Object {
  var assertionResults: js.Array[FormattedAssertionResult] = js.native
  var coverage: js.Any = js.native
  var endTime: Double = js.native
  var message: String = js.native
  var name: String = js.native
  var startTime: Double = js.native
  var status: failed | passed = js.native
  var summary: String = js.native
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
  @scala.inline
  implicit class FormattedTestResultOps[Self <: FormattedTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssertionResultsVarargs(value: FormattedAssertionResult*): Self = this.set("assertionResults", js.Array(value :_*))
    @scala.inline
    def setAssertionResults(value: js.Array[FormattedAssertionResult]): Self = this.set("assertionResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoverage(value: js.Any): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: failed | passed): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

