package typings.jest.mod.jest

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherState extends js.Object {
  var assertionCalls: Double
  var currentTestName: String
  var expand: Boolean
  var expectedAssertionsNumber: Double
  var isExpectingAssertions: js.UndefOr[Boolean] = js.undefined
  var suppressedErrors: js.Array[Error]
  var testPath: String
}

object MatcherState {
  @scala.inline
  def apply(
    assertionCalls: Double,
    currentTestName: String,
    expand: Boolean,
    expectedAssertionsNumber: Double,
    suppressedErrors: js.Array[Error],
    testPath: String,
    isExpectingAssertions: js.UndefOr[Boolean] = js.undefined
  ): MatcherState = {
    val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], currentTestName = currentTestName.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], expectedAssertionsNumber = expectedAssertionsNumber.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpectingAssertions)) __obj.updateDynamic("isExpectingAssertions")(isExpectingAssertions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherState]
  }
}

