package typings.hark.mod

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
    history: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    play: js.UndefOr[Boolean] = js.undefined,
    smoothing: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothing)) __obj.updateDynamic("smoothing")(smoothing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

