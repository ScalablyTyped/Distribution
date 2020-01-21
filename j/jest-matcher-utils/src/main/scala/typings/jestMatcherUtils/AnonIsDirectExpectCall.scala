package typings.jestMatcherUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsDirectExpectCall extends js.Object {
  var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
  var secondArgument: js.UndefOr[String] = js.undefined
}

object AnonIsDirectExpectCall {
  @scala.inline
  def apply(isDirectExpectCall: js.UndefOr[Boolean] = js.undefined, secondArgument: String = null): AnonIsDirectExpectCall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectExpectCall)) __obj.updateDynamic("isDirectExpectCall")(isDirectExpectCall.asInstanceOf[js.Any])
    if (secondArgument != null) __obj.updateDynamic("secondArgument")(secondArgument.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsDirectExpectCall]
  }
}

