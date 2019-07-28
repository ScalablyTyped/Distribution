package typings.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDirectExpectCall extends js.Object {
  var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
  var secondArgument: js.UndefOr[String] = js.undefined
}

object Anon_IsDirectExpectCall {
  @scala.inline
  def apply(isDirectExpectCall: js.UndefOr[Boolean] = js.undefined, secondArgument: String = null): Anon_IsDirectExpectCall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectExpectCall)) __obj.updateDynamic("isDirectExpectCall")(isDirectExpectCall)
    if (secondArgument != null) __obj.updateDynamic("secondArgument")(secondArgument)
    __obj.asInstanceOf[Anon_IsDirectExpectCall]
  }
}

