package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBellcurveStatesHoverMarkerStatesNormalOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation when returning to normal state after
    * hovering.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
}

object PlotBellcurveStatesHoverMarkerStatesNormalOptions {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null): PlotBellcurveStatesHoverMarkerStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBellcurveStatesHoverMarkerStatesNormalOptions]
  }
}

