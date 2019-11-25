package typings.atJestReporters.buildTypesMod

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
    estimatedTime: Int | Double = null,
    roundTime: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): SummaryOptions = {
    val __obj = js.Dynamic.literal()
    if (estimatedTime != null) __obj.updateDynamic("estimatedTime")(estimatedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(roundTime)) __obj.updateDynamic("roundTime")(roundTime.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryOptions]
  }
}

