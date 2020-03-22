package typings.materializeCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.SliderOptions> */
trait PartialSliderOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var indicators: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
}

object PartialSliderOptions {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    height: Int | Double = null,
    indicators: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null
  ): PartialSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderOptions]
  }
}

