package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognizerOptions extends js.Object {
  var direction: js.UndefOr[Double] = js.undefined
  var enable: js.UndefOr[
    Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean])
  ] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var pointers: js.UndefOr[Double] = js.undefined
  var posThreshold: js.UndefOr[Double] = js.undefined
  var taps: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object RecognizerOptions {
  @scala.inline
  def apply(
    direction: js.UndefOr[Double] = js.undefined,
    enable: Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean]) = null,
    event: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    pointers: js.UndefOr[Double] = js.undefined,
    posThreshold: js.UndefOr[Double] = js.undefined,
    taps: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): RecognizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointers)) __obj.updateDynamic("pointers")(pointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posThreshold)) __obj.updateDynamic("posThreshold")(posThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(taps)) __obj.updateDynamic("taps")(taps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizerOptions]
  }
}

