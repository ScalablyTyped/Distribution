package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- highchartsLib.highchartsMod.HighchartsNs.LineStates because var conflicts: enabled, halo. Inlined animation, lineWidth, lineWidthPlus, marker */ trait PieStates extends BarStates {
  /**
    * Animation setting for hovering the graph in line-type series.
    * @default { "duration": 50 }
    * @since 5.0.8
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * Pixel with of the graph line.
    * @default 2
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The additional line width for the graph of a hovered series.
    * @default 1
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[scala.Double] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
}

object PieStates {
  @scala.inline
  def apply(
    animation: scala.Boolean | Animation = null,
    borderColor: java.lang.String | Gradient = null,
    brightness: scala.Int | scala.Double = null,
    color: java.lang.String | Gradient = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    halo: scala.Boolean | Halo = null,
    lineWidth: scala.Int | scala.Double = null,
    lineWidthPlus: scala.Int | scala.Double = null,
    marker: Marker = null
  ): PieStates = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (halo != null) __obj.updateDynamic("halo")(halo.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[PieStates]
  }
}

