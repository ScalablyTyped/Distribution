package typings.materializeCss.anon

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
    duration: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    indicators: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined
  ): PartialSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderOptions]
  }
}

