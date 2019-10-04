package typings.hark.harkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var history: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var play: js.UndefOr[Boolean] = js.undefined
  var smoothing: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    history: Int | Double = null,
    interval: Int | Double = null,
    play: js.UndefOr[Boolean] = js.undefined,
    smoothing: Int | Double = null,
    threshold: Int | Double = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play)
    if (smoothing != null) __obj.updateDynamic("smoothing")(smoothing.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

