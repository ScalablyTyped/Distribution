package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAxisMarkerOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Animation for the marker as it moves between
    * values. Set to `false` to disable animation. Defaults to `{ duration: 50
    * }`.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highmaps) The color of the marker.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
}

object ColorAxisMarkerOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    color: ColorString | GradientColorObject | PatternObject = null
  ): ColorAxisMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAxisMarkerOptions]
  }
}

