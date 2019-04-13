package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarStates extends js.Object {
  /**
    * A specific border color for the hovered point. Defaults to inherit the normal state border color.
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * How much to brighten the point on interaction. Requires the main color to be defined in hex or rgb(a) format.
    * @default 0.1
    */
  var brightness: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the
    * legend.
    * @default true
    * @since 1.2
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice
    * in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The
    * halo can be disabled by setting the halo option to false.
    * @since 4.0
    */
  var halo: js.UndefOr[scala.Boolean | Halo] = js.undefined
}

object BarStates {
  @scala.inline
  def apply(
    borderColor: java.lang.String | Gradient = null,
    brightness: scala.Int | scala.Double = null,
    color: java.lang.String | Gradient = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    halo: scala.Boolean | Halo = null
  ): BarStates = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (halo != null) __obj.updateDynamic("halo")(halo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarStates]
  }
}

