package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherHintOptions extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var expectedColor: js.UndefOr[MatcherHintColor] = js.undefined
  var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
  var isNot: js.UndefOr[Boolean] = js.undefined
  var promise: js.UndefOr[String] = js.undefined
  var receivedColor: js.UndefOr[MatcherHintColor] = js.undefined
  var secondArgument: js.UndefOr[String] = js.undefined
  var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.undefined
}

object MatcherHintOptions {
  @scala.inline
  def apply(
    comment: String = null,
    expectedColor: /* arg */ String => String = null,
    isDirectExpectCall: js.UndefOr[Boolean] = js.undefined,
    isNot: js.UndefOr[Boolean] = js.undefined,
    promise: String = null,
    receivedColor: /* arg */ String => String = null,
    secondArgument: String = null,
    secondArgumentColor: /* arg */ String => String = null
  ): MatcherHintOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (expectedColor != null) __obj.updateDynamic("expectedColor")(js.Any.fromFunction1(expectedColor))
    if (!js.isUndefined(isDirectExpectCall)) __obj.updateDynamic("isDirectExpectCall")(isDirectExpectCall)
    if (!js.isUndefined(isNot)) __obj.updateDynamic("isNot")(isNot)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (receivedColor != null) __obj.updateDynamic("receivedColor")(js.Any.fromFunction1(receivedColor))
    if (secondArgument != null) __obj.updateDynamic("secondArgument")(secondArgument)
    if (secondArgumentColor != null) __obj.updateDynamic("secondArgumentColor")(js.Any.fromFunction1(secondArgumentColor))
    __obj.asInstanceOf[MatcherHintOptions]
  }
}

