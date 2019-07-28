package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleMarkerStatesNormalOptions extends js.Object {
  /**
    * (Highmaps) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
}

object PlotMapbubbleMarkerStatesNormalOptions {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null): PlotMapbubbleMarkerStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleMarkerStatesNormalOptions]
  }
}

