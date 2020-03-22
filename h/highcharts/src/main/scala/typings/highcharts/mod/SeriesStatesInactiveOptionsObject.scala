package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesStatesInactiveOptionsObject extends js.Object {
  /**
    * (Highstock) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram in
    * inactive mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Opacity of series elements (dataLabels, line, area). Set to 1
    * to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SeriesStatesInactiveOptionsObject {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    linkOpacity: Int | Double = null,
    opacity: Int | Double = null
  ): SeriesStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesStatesInactiveOptionsObject]
  }
}

