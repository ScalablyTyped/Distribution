package typings.heremaps.H.ui.ZoomControl

import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property zoomSpeed {number=} - the speed if zooming in and out in levels per millisecond, defaults to 0.05
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, defaults to H.ui.LayoutAlignment.RIGHT_MIDDLE
  * @property slider {boolean=} - flag whether to show the slider (true) or not, defaults to false
  * @property sliderSnaps {boolean=} - flag whether slider should snap to the integer values or not, defaults to false. This option has effect only if slider is enabled.
  */
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.undefined
  var slider: js.UndefOr[Boolean] = js.undefined
  var sliderSnaps: js.UndefOr[Boolean] = js.undefined
  var zoomSpeed: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alignment: LayoutAlignment = null,
    slider: js.UndefOr[Boolean] = js.undefined,
    sliderSnaps: js.UndefOr[Boolean] = js.undefined,
    zoomSpeed: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliderSnaps)) __obj.updateDynamic("sliderSnaps")(sliderSnaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomSpeed)) __obj.updateDynamic("zoomSpeed")(zoomSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

