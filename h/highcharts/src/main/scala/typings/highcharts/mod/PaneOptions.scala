package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneOptions extends js.Object {
  /**
    * (Highcharts) An array of background items for the pane.
    */
  var background: js.UndefOr[js.Array[PaneBackgroundOptions]] = js.undefined
  /**
    * (Highcharts) The center of a polar chart or angular gauge, given as an
    * array of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.
    */
  var center: js.UndefOr[js.Array[String | Double]] = js.undefined
  /**
    * (Highcharts) The end angle of the polar X axis or gauge value axis, given
    * in degrees where 0 is north. Defaults to startAngle
    *
    * + 360.
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The inner size of the pane, either as a number defining
    * pixels, or a percentage defining a percentage of the pane's size.
    */
  var innerSize: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) The size of the pane, either as a number defining pixels, or
    * a percentage defining a percentage of the available plot area (the
    * smallest of the plot height or plot width).
    */
  var size: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) The start angle of the polar X axis or gauge axis, given in
    * degrees where 0 is north. Defaults to 0.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}

object PaneOptions {
  @scala.inline
  def apply(
    background: js.Array[PaneBackgroundOptions] = null,
    center: js.Array[String | Double] = null,
    endAngle: Int | Double = null,
    innerSize: Double | String = null,
    size: Double | String = null,
    startAngle: Int | Double = null
  ): PaneOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneOptions]
  }
}

