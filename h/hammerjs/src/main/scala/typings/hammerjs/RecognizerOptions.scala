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
    direction: Int | Double = null,
    enable: Boolean | (js.Function2[/* recognizer */ Recognizer, /* inputData */ HammerInput, Boolean]) = null,
    event: String = null,
    interval: Int | Double = null,
    pointers: Int | Double = null,
    posThreshold: Int | Double = null,
    taps: Int | Double = null,
    threshold: Int | Double = null,
    time: Int | Double = null,
    velocity: Int | Double = null
  ): RecognizerOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (pointers != null) __obj.updateDynamic("pointers")(pointers.asInstanceOf[js.Any])
    if (posThreshold != null) __obj.updateDynamic("posThreshold")(posThreshold.asInstanceOf[js.Any])
    if (taps != null) __obj.updateDynamic("taps")(taps.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizerOptions]
  }
}

