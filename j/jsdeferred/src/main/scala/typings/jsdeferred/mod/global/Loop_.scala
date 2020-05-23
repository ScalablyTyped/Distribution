package typings.jsdeferred.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loop_ extends js.Object {
  var begin: js.UndefOr[Double] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Loop_ {
  @scala.inline
  def apply(
    begin: js.UndefOr[Double] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): Loop_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(begin)) __obj.updateDynamic("begin")(begin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop_]
  }
}

