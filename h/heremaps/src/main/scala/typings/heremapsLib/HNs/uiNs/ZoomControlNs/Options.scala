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

