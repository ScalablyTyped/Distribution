package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailAfter extends js.Object {
  var failAfter: js.UndefOr[Double] = js.undefined
  var initialDelay: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
}

object FailAfter {
  @scala.inline
  def apply(
    failAfter: js.UndefOr[Double] = js.undefined,
    initialDelay: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined
  ): FailAfter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failAfter)) __obj.updateDynamic("failAfter")(failAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailAfter]
  }
}

