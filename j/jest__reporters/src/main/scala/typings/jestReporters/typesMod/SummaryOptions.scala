package typings.jestReporters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryOptions extends js.Object {
  var estimatedTime: js.UndefOr[Double] = js.undefined
  var roundTime: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SummaryOptions {
  @scala.inline
  def apply(
    estimatedTime: js.UndefOr[Double] = js.undefined,
    roundTime: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SummaryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(estimatedTime)) __obj.updateDynamic("estimatedTime")(estimatedTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundTime)) __obj.updateDynamic("roundTime")(roundTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryOptions]
  }
}

