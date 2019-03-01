package typings
package heremapsLib.HNs.uiNs.ZoomControlNs

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
  var alignment: js.UndefOr[heremapsLib.HNs.uiNs.LayoutAlignment] = js.undefined
  var slider: js.UndefOr[scala.Boolean] = js.undefined
  var sliderSnaps: js.UndefOr[scala.Boolean] = js.undefined
  var zoomSpeed: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alignment: heremapsLib.HNs.uiNs.LayoutAlignment = null,
    slider: js.UndefOr[scala.Boolean] = js.undefined,
    sliderSnaps: js.UndefOr[scala.Boolean] = js.undefined,
    zoomSpeed: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider)
    if (!js.isUndefined(sliderSnaps)) __obj.updateDynamic("sliderSnaps")(sliderSnaps)
    if (zoomSpeed != null) __obj.updateDynamic("zoomSpeed")(zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

