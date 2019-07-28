package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart3dOptions extends js.Object {
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Set it to `"auto"` to automatically move the labels to the
    * best edge.
    */
  var axisLabelPosition: js.UndefOr[auto | Null] = js.undefined
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var beta: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The total depth of the chart.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Wether to render the chart using the 3D functionality.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether the 3d box should automatically adjust to the chart
    * plot area.
    */
  var fitToPlot: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Provides the option to draw a frame around the charts by
    * defining a bottom, front and back panel.
    */
  var frame: js.UndefOr[Chart3dFrameOptions] = js.undefined
  /**
    * (Highcharts) Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective effect in
    * column and scatter charts. It is not used for 3D pie charts.
    */
  var viewDistance: js.UndefOr[Double] = js.undefined
}

object Chart3dOptions {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    axisLabelPosition: auto = null,
    beta: Int | Double = null,
    depth: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fitToPlot: js.UndefOr[Boolean] = js.undefined,
    frame: Chart3dFrameOptions = null,
    viewDistance: Int | Double = null
  ): Chart3dOptions = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (axisLabelPosition != null) __obj.updateDynamic("axisLabelPosition")(axisLabelPosition)
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(fitToPlot)) __obj.updateDynamic("fitToPlot")(fitToPlot)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (viewDistance != null) __obj.updateDynamic("viewDistance")(viewDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart3dOptions]
  }
}

