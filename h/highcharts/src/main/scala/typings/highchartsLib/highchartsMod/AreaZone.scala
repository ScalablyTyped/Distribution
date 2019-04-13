package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaZone extends js.Object {
  /**
    * Styled mode only. A custom class name for the zone.
    * @since 5.0.0
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the color of the series.
    * @since 4.1.0
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * A name for the dash style to use for the graph.
    * @since 4.1.0
    */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the fill color for the series (in area type series)
    * @since 4.1.0
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value up to where the zone extends, if undefined the zones stretches to the last value in the series.
    * @default undefined
    * @since 4.1.0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object AreaZone {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    dashStyle: java.lang.String = null,
    fillColor: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): AreaZone = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaZone]
  }
}

