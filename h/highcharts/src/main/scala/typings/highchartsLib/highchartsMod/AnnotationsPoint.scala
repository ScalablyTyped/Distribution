package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsPoint extends js.Object {
  /**
    * The x position of the point. Units can be either in axis or chart pixel coordinates.
    * @default undefined
    * @since 6.0.0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * This number defines which xAxis the point is connected to.
    * It refers to either the axis id or the index of the axis in the xAxis array.
    * If the option is not configured or the axis is not found the point's x coordinate refers to the chart pixels.
    * @default undefined
    * @since 6.0.0
    */
  var xAxis: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The y position of the point. Units can be either in axis or chart pixel coordinates.
    * @default undefined
    * @since 6.0.0
    */
  var y: js.UndefOr[scala.Double] = js.undefined
  /**
    * This number defines which yAxis the point is connected to.
    * It refers to either the axis id or the index of the axis in the yAxis array.
    * If the option is not configured or the axis is not found the point's y coordinate refers to the chart pixels.
    * @default undefined
    * @since 6.0.0
    */
  var yAxis: js.UndefOr[scala.Double] = js.undefined
}

object AnnotationsPoint {
  @scala.inline
  def apply(
    x: scala.Int | scala.Double = null,
    xAxis: scala.Double | java.lang.String = null,
    y: scala.Int | scala.Double = null,
    yAxis: scala.Int | scala.Double = null
  ): AnnotationsPoint = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsPoint]
  }
}

