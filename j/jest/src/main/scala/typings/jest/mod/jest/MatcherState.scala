package typings.jest.mod.jest

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherState extends js.Object {
  var assertionCalls: Double = js.native
  var currentTestName: String = js.native
  var expand: Boolean = js.native
  var expectedAssertionsNumber: Double = js.native
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  var suppressedErrors: js.Array[Error] = js.native
  var testPath: String = js.native
}

object MatcherState {
  @scala.inline
  def apply(
    assertionCalls: Double,
    currentTestName: String,
    expand: Boolean,
    expectedAssertionsNumber: Double,
    suppressedErrors: js.Array[Error],
    testPath: String
  ): MatcherState = {
    val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], expectedAssertionsNumber = expectedAssertionsNumber.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherState]
  }
  @scala.inline
  implicit class MatcherStateOps[Self <: MatcherState] (val x: Self) extends AnyVal {
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
    def setAssertionCalls(value: Double): Self = this.set("assertionCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTestName(value: String): Self = this.set("currentTestName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedAssertionsNumber(value: Double): Self = this.set("expectedAssertionsNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressedErrorsVarargs(value: Error*): Self = this.set("suppressedErrors", js.Array(value :_*))
    @scala.inline
    def setSuppressedErrors(value: js.Array[Error]): Self = this.set("suppressedErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPath(value: String): Self = this.set("testPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpectingAssertions(value: Boolean): Self = this.set("isExpectingAssertions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpectingAssertions: Self = this.set("isExpectingAssertions", js.undefined)
  }
  
}

