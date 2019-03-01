package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X
  * and Y axes set. Each xAxis or yAxis can reference the pane by index.
  */
trait PaneOptions extends js.Object {
  /**
    * An object, or array of objects, for backgrounds. Sub options include backgroundColor (can be solid or gradient),
    * shape ('solid', 'arc' or 'circle'), innerWidth, outerWidth, borderWidth, borderColor.
    * @since 2.3.0
    */
  var background: js.UndefOr[PaneBackground | js.Array[PaneBackground]] = js.undefined
  /**
    * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as
    * integers that transform to pixels, or as percentages of the plot area size.
    * @default ['50%', '50%']
    * @since 2.3.0
    */
  var center: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  /**
    * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north.
    * @default startAngle + 360
    * @since 2.3.0
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
    * @default '85%'
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are
    * @since 2.3.0
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
}

object PaneOptions {
  @scala.inline
  def apply(
    background: PaneBackground | js.Array[PaneBackground] = null,
    center: js.Array[scala.Double | java.lang.String] = null,
    endAngle: scala.Int | scala.Double = null,
    size: scala.Double | java.lang.String = null,
    startAngle: scala.Int | scala.Double = null
  ): PaneOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneOptions]
  }
}

