package typings
package jestDashMatcherDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDirectExpectCall extends js.Object {
  var isDirectExpectCall: js.UndefOr[scala.Boolean] = js.undefined
  var secondArgument: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IsDirectExpectCall {
  @scala.inline
  def apply(
    isDirectExpectCall: js.UndefOr[scala.Boolean] = js.undefined,
    secondArgument: java.lang.String = null
  ): Anon_IsDirectExpectCall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectExpectCall)) __obj.updateDynamic("isDirectExpectCall")(isDirectExpectCall)
    if (secondArgument != null) __obj.updateDynamic("secondArgument")(secondArgument)
    __obj.asInstanceOf[Anon_IsDirectExpectCall]
  }
}

