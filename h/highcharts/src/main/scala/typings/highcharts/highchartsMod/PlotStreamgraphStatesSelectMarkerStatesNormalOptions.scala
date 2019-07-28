package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStreamgraphStatesSelectMarkerStatesNormalOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation when returning to normal state after
    * hovering.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
}

object PlotStreamgraphStatesSelectMarkerStatesNormalOptions {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null): PlotStreamgraphStatesSelectMarkerStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotStreamgraphStatesSelectMarkerStatesNormalOptions]
  }
}

